package com.collegemanagement.service;

public interface Cjc {
	
	public void addCourse();
	public void viewCourse();
	public void addFaculty() throws CourseInvalidException;
	public void viewFaculty();
	public void addBatch() throws FacultyInvalidException;
	public void viewBatch();
	public void addStudent() throws BatchInvalidException;
	public void viewStudent();
	
	

}
