package com.divyendu.client.servicesProviders;
	
import java.util.Comparator;
import java.util.List;

import com.divyendu.client.interfaces.IStudentService;
import com.divyendu.client.models.Student;

/**
 * Student service class - Access modifier is default - No access outside current package
 * Provides 3 SERVICES:
 * 		1. initialize(List<Student> myStudentList)    - used to initialize the student list to operate on. Mandatorily
 * 				is the first call otherwise throws IllegalAccessException
 * 		2. getBestStudentAsPerMarks()                 - used to get the Student with the highest overall marks
 * 		3. getStudentDetailsAsPerID(int myStudentID)  - used to get the Student instance matching the input student 
 * 				ID 
 * @author divyendu
 *
 */
class StudentService implements IStudentService {
	
	private List<Student> studentList;
	
	/**
	 * Used to initialize the student list maintained by the service
	 * 
	 * @param myStudentList
	 */
	public void initialize(List<Student> myStudentList) {
		studentList = myStudentList;
	}
	
	/**
	 * Finds and returns the Student having the highest overall marks
	 * 
	 * @return Student - having the highest overall marks
	 * @throws IllegalAccessException
	 */
	public Student getBestStudentAsPerMarks() throws IllegalAccessException{
		Student bestStudent = null;
		if(this.studentList == null) {
			throw new IllegalAccessException("Student list not initilaized. Use initialize()");
		}
		bestStudent = studentList.stream().max(Comparator.comparing(Student::getOverAllMarks)).get();
		return bestStudent;
	}
	
	/**
	 * Returns the Student matching the input student ID
	 * 
	 * @param myStudentID
	 * @return Student - Matching the input myStudentID
	 * @throws IllegalAccessException
	 */
	public Student getStudentDetailsAsPerID(int myStudentID) throws IllegalAccessException {
		Student relevantStudent = null;
		if(this.studentList == null) {
			throw new IllegalAccessException("Student list not initilaized. Use initialize()");
		}
		
		relevantStudent = studentList.stream().filter(student -> student.getStudentID() == myStudentID).findFirst().get();
		return relevantStudent;
	}

	@Override
	public void display() {
		String details = "Student list has"+this.studentList.size()+" students";
		System.out.println(details);
	}
	
	

}
