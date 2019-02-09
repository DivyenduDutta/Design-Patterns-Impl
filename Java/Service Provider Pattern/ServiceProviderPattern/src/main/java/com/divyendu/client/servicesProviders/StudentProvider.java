package com.divyendu.client.servicesProviders;

import com.divyendu.ServiceProviderPattern.ServiceInterface.IService;
import com.divyendu.ServiceProviderPattern.ServiceProviderInterface.IServiceProvider;

/**
 * Student Provider for Student service
 * 
 * @author divyendu
 *
 */
public class StudentProvider implements IServiceProvider {

	@Override
	public IService newService() {
		return new StudentService();
	}

}
