package SingleLevel_Inheritance;

public class Badmin {
	
	public Employee setData(int bid, String bname, int eid, String ename)
	{
		Employee e=new Employee();
		e.setBid(bid);
		e.setBname(bname);
		e.setEid(eid);
		e.setEname(ename);
		return e;
	}
	public void getDisplay(Employee e)
	{
		System.out.println("Employee Name:- "+e.getEname());
		System.out.println("Employee Id:- "+e.getEid());
		System.out.println("Bank Name:- "+e.getBname());
		System.out.println("Bank ID:- "+e.getBid());
		
		
	}
	
	public static void main(String[] args) {
		
		Badmin ba=new Badmin();
		Employee e1=ba.setData(101, "CBI", 1, "Money");
		ba.getDisplay(e1);
		Employee e2= ba.setData(102, "CCI", 2, "Gold");
		ba.getDisplay(e2);
	}

}
