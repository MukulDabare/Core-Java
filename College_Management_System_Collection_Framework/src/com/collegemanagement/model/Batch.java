package com.collegemanagement.model;

public class Batch {

	private int bid;
	private String bname;
	private Faculty faculty;
	private float timing;
	public float getTiming() {
		return timing;
	}
	public void setTiming(float timing) {
		this.timing = timing;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
}
