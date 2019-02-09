package com.divyendu.client.interfaces;

import java.util.List;

import com.divyendu.ServiceProviderPattern.ServiceInterface.IService;
import com.divyendu.client.models.Student;

public interface IStudentService extends IService{
	public void initialize(List<Student> myStudentList);
	public Student getBestStudentAsPerMarks() throws IllegalAccessException;
	public Student getStudentDetailsAsPerID(int myStudentID) throws IllegalAccessException;
}
