package com.spring.entity;

public class Student {

	private Integer studentId;
	private String studentName;

	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void displayInfo() {
		System.out.println("Student Info:-" + studentName + " " + studentId);
	}
}
