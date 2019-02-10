package com.divyendu.client.interfaces;

import java.util.List;

import com.divyendu.ServiceProviderPattern.ServiceProviderInterface.IServiceProvider;
import com.divyendu.client.models.Student;

/**
 * Provider Interface for Student Provider
 * Needs to extend the IServiceProvider interface provided by Service Provider Pattern API
 * 
 * @author divyendu
 *
 */
public interface IStudentProvider extends IServiceProvider {
	
	List<Student> retrieveStudentList();

}
