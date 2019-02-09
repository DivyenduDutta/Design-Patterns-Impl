package com.divyendu.ServiceProviderPattern.API;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.divyendu.ServiceProviderPattern.ServiceInterface.IService;
import com.divyendu.ServiceProviderPattern.ServiceProviderInterface.IServiceProvider;

/**
 * Provides the service registration and service access methods - static methods
 * Non instantiable class
 * 
 * @author divyendu
 *
 */
public class Services {
	
	/**
	 * Make the constructor private to make Services.class non instantiable
	 */
	private Services() {}
	
	//holds the registered providers
	private static final Map<String, IServiceProvider> providers = 
			new ConcurrentHashMap<String, IServiceProvider>();
	
	public static final String DEFAULT_PROVIDER_NAME = "<def>";
	
	/**
	 * Default service registration API
	 * 
	 * @param provider - The actual provider to be registered
	 */
	public static void registerdefaultProvider(IServiceProvider provider) {
		registerProvider(DEFAULT_PROVIDER_NAME, provider);
	}
	
	/**
	 * Service Registration API
	 * 
	 * @param providerName - Name of the provider to be registered
	 * @param provider     - The actual provider to be registered
	 */
	public static void registerProvider(String providerName, IServiceProvider provider) {
		providers.put(providerName, provider);
	}
	
	/**
	 * Returns an instance of the Service associated with the default provider 
	 * 
	 * @return IService  - new instance of the service
	 */
	public static IService getDefaultProvider() {
		IServiceProvider provider = null;
		provider = providers.get(DEFAULT_PROVIDER_NAME);
		if(provider == null) {
			throw new IllegalArgumentException("No default provider registered");
		}
		return provider.newService();
	}
	
	/**
	 * Returns an instance of the Service associated with the named provider
	 * 
	 * @param providerName - Name of the provider corresponding to which the service is needed
	 * @return IService  - new instance of the service
	 */
	public static IService getProvider(String providerName) {
		IServiceProvider provider = null;
		IService service = null;
		if(!providerName.isEmpty()) {
			provider = providers.get(providerName);
			if(provider == null) {
				throw new IllegalArgumentException("No provider registered for "+providerName);
			}
			service = provider.newService();
		}
		return service;
	}
}
