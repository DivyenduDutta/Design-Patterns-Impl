package com.divyendu.client.interfaces;

import java.util.List;

import com.divyendu.ServiceProviderPattern.ServiceInterface.IService;
import com.divyendu.client.models.Student;

/**
 * Student Service Interface 
 * Needs to extend IService interface provided by the Service Provider Pattern API
 * Specify all methods that the Student Service needs to have in here
 * 
 * @author divyendu
 *
 */
public interface IStudentService extends IService{
	public Student getBestStudentAsPerMarks() throws IllegalAccessException;
	public Student getStudentDetailsAsPerID(int myStudentID) throws IllegalAccessException;
	public List<Student> retrieveStudentList();
}
