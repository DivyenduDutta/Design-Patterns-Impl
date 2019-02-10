package com.divyendu.ServiceProviderPattern.ServiceProviderInterface;

import com.divyendu.ServiceProviderPattern.ServiceInterface.IService;

/**
 * Service Provider Interface component of the Service Provider Pattern
 * Have all provider classes implement IServiceProvider
 * Used when registering providers
 * 
 * @author divyendu
 *
 */
public interface IServiceProvider {
	
	void createService();
	boolean compareProvider(IServiceProvider provider);
	IService retrieveService();
}
