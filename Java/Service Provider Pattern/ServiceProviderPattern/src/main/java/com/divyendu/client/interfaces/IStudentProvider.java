package com.divyendu.client.interfaces;

import java.util.List;

import com.divyendu.ServiceProviderPattern.ServiceProviderInterface.IServiceProvider;
import com.divyendu.client.models.Student;

public interface IStudentProvider extends IServiceProvider {
	
	List<Student> retrieveStudentList();

}
