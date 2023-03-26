package Display;

public class Test {

	public Address setAdderess(String cn,String an) {
		
		Address ad=new Address();
		ad.setCityname(cn);
		ad.setAreaname(an);
		return ad;
		
		
	}
	
	public Student setData(int rollno, String name, Address addr) {
		Student s1=new Student();
		s1.setRollno(rollno);
		s1.setName(name);
		s1.setAddr(addr);
		return s1;
	
	}
	
	public void getDisplay(Student s)
	{
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getAddr().getCityname());
		System.out.println(s.getAddr().getAreaname());
		
	}
	public static void main(String[] args) {
		Test t=new Test();
		Address a=t.setAdderess("Pune","Karve");
		Student s=t.setData(11, "Mukul", a);
		t.getDisplay(s);
		
				  
		       
		     
	}
	
}
