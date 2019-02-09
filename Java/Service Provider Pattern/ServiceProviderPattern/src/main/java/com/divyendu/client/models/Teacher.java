package com.divyendu.models;

/**
 * Teacher model class - to be used in TeacherService
 * 
 * @author divyendu
 *
 */
public class Teacher {

	private int teacherID;
	private String teacherName;
	private String departmentName;
	
	public Teacher() {}
	
	public Teacher(int teacherID, String teacherName, String departmentName) {
		super();
		this.teacherID = teacherID;
		this.teacherName = teacherName;
		this.departmentName = departmentName;
	}

	public int getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
}
