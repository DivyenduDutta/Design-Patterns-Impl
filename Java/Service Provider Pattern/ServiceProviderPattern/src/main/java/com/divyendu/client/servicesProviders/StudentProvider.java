package com.divyendu.client.servicesProviders;

import java.util.List;

import com.divyendu.ServiceProviderPattern.ServiceInterface.IService;
import com.divyendu.ServiceProviderPattern.ServiceProviderInterface.IServiceProvider;
import com.divyendu.client.interfaces.IStudentProvider;
import com.divyendu.client.interfaces.IStudentService;
import com.divyendu.client.models.Student;

/**
 * Student Provider for Student service
 * 
 * @author divyendu
 *
 */
public class StudentProvider implements IStudentProvider {
	
	private StudentService studentService;
	private List<Student> studentList;
	
	/**
	 * Parameterized constructor to initialize student list
	 * 
	 * @param myStudentList
	 */
	public StudentProvider(List<Student> myStudentList) {
		this.studentList = myStudentList;
	}
	
	/**
	 * Defines custom logic to compare two providers - Checks whether the Student List in both providers have the
	 * same students in them
	 * 
	 * @param myStudentProvider
	 * @return boolean - same or not
	 */
	@Override
	public boolean compareProvider(IServiceProvider myStudentProvider) {
		boolean result = true;
		List<Student> otherStudentList = ((IStudentProvider)myStudentProvider).retrieveStudentList();
		
		if(this.studentList.size() != otherStudentList.size()) {
			result = false;
		} else {
			for(int i=0,j=0; i<this.studentList.size(); i++,j++) {
				result &= this.studentList.get(i).compare(otherStudentList.get(j));
				
			}
		}
		return result;
	}
	
	/**
	 * Creates the student service instance which the student provider has(composition)
	 * Also initializes the student list
	 */
	@Override
	public void createService() {
		studentService = new StudentService();
		System.out.println("Initializing the student service with "+studentList.size()+" students");
		studentService.initialize(this.studentList);
	}
	
	@Override
	public IService retrieveService() {
		return this.studentService;
	}
	
	@Override
	public List<Student> retrieveStudentList(){
		return this.studentList;
	}

}
