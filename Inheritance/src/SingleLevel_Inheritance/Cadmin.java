package SingleLevel_Inheritance;

public class Cadmin {
	
	public Customer setData(int ccid, String ccname, int cid, String cname)
	{
		Customer c=new Customer();
		c.ccid=ccid;
		c.ccname=ccname;
		c.cid=cid;
		c.cname=cname;
		return c;
	}
	
	public void getDisplay(Customer c)
	{
		System.out.println("Customer Name:- "+c.ccname);
		System.out.println("Customer Id:- "+c.ccid);
		System.out.println("Company Name:- "+c.cname);
		System.out.println("Company Id:- "+c.cid);
	}
	
	public static void main(String[] args) {
		
		Cadmin ca=new Cadmin();
		Customer c1= ca.setData(101, "Manik", 1, "Alstom");
		ca.getDisplay(c1);
		Customer c2=ca.setData(102, "Sajnik", 2, "Alstom pvt.ltd");
		ca.getDisplay(c2);
		
				
	}

}
