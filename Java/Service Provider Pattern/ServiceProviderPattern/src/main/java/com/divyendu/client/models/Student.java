package com.divyendu.client.models;


/**
 * Student model class - to be used in StudentService
 * 
 * @author divyendu
 *
 */
public class Student {
	private int studentID;
	private String studentName;
	private double overAllMarks;
	public Student() {}
	
	public Student(int studentID, String studentName, double overAllMarks) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.overAllMarks = overAllMarks;
	}
	
	
	public boolean compare(Student student2) {
		if(this.studentID == student2.studentID && 
				this.overAllMarks == student2.overAllMarks &&
				this.studentName.equals(student2.studentName)) {
			return true;
		}
		else {
			return false;
		}
	}


	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getOverAllMarks() {
		return overAllMarks;
	}

	public void setOverAllMarks(double overAllMarks) {
		this.overAllMarks = overAllMarks;
	}
}
