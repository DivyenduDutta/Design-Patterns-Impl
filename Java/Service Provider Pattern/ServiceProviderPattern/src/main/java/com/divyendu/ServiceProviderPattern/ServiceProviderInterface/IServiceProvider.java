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
	
	// Have all providers provide an implementation of newService() to get an 
	// instance of the corresponding service
	// Making the method default scope by choice. Should only be accessible from within the service access API
	IService newService();
}
