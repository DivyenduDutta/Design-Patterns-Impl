package com.divyendu.externalclient;

import java.util.ArrayList;
import java.util.List;

import com.divyendu.ServiceProviderPattern.API.Services;
import com.divyendu.ServiceProviderPattern.ServiceInterface.IService;
import com.divyendu.client.interfaces.IStudentService;
import com.divyendu.client.models.Student;
import com.divyendu.client.servicesProviders.StudentProvider;

public class ServiceProviderClient {

	public static void main(String[] args) {
		//Create a list of students
		List<Student> myStudentList = new ArrayList<Student>();
		myStudentList.add(new Student(1, "Ramesh", 89.9));
		myStudentList.add(new Student(2, "Parrikar", 34.5));
		myStudentList.add(new Student(3, "Mohan", 99.9));
		myStudentList.add(new Student(4, "Donald", 67.0));
		
		//Create the Student Provider
		StudentProvider studentProvider1 = new StudentProvider();
		StudentProvider studentProvider2 = new StudentProvider();
		
		//Register Student Provider with the API
		Services.registerProvider("StudentProvider1", studentProvider1);
		Services.registerProvider("StudentProvider2", studentProvider2);
		
		//Retrieve the specific Student Provider via the access API
		IStudentService studentService1 = (IStudentService)Services.getService("StudentProvider1");
		
		//use created student list to initialize student service
		studentService1.initialize(myStudentList);
		try {
		//Use the returned Student Service to call services
		System.out.println(studentService1.getBestStudentAsPerMarks().getStudentName());
		System.out.println(studentService1.getStudentDetailsAsPerID(2).getStudentName());
		} catch(IllegalAccessException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
