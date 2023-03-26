package Final;

public class TestC {
	
	public Company setData(int eid, int cid)
	{
		Employee e=new Employee();
		e.eid=eid;
		e.cid=cid;
		return e;
	}
	
	public void getDisplay(Employee emp)
	{
		 System.out.println("Employee Name:- "+emp.ename);
		 System.out.println("Employee Id:- "+emp.eid);
		 System.out.println("Company Name:- "+emp.cname);
	     System.out.println("Company Id:- "+emp.cid);
	}
	
	public static void main(String[] args) {
		
		TestC c=new TestC();
		Employee c1=(Employee) c.setData(101, 111);
		c.getDisplay(c1);
	}

}
