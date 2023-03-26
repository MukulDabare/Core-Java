package Sorting;

public class Employee implements Comparable<Employee>{
	private int eid;
	private String name;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Employee o) {
		
		//return this.eid-o.eid;
		return this.name.compareTo(o.name);
	}
	

}
