package com.collegemanagement.model;

public class Course implements Comparable<Course> {
	private int cid;
	private String cname;
	private int duration; 
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setDuration(int duration)
	{
		this.duration=duration;
	}
	public int getDuration()
	{
		return duration;
	}
	@Override
	public int compareTo(Course o) {
		
		return this.cid-o.cid;
	}
	
	

}
