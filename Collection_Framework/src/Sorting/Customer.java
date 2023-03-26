package Sorting;

public class Customer implements Comparable<Customer>{
	private int cid;
	private String cname;
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
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.cname.compareTo(o.cname);
	}
	

}
