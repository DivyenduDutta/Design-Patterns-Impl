package com.divyendu.client.servicesProviders;

import com.divyendu.ServiceProviderPattern.ServiceProviderInterface.IServiceProvider;
import com.divyendu.client.interfaces.IStudentService;

/**
 * Student Provider for Student service
 * 
 * @author divyendu
 *
 */
public class StudentProvider implements IServiceProvider {

	@Override
	public IStudentService newService() {
		return new StudentService();
	}

}
