package Com;

public class Test {
	public static void main(String args[])
	{
		Address ad=new Address();
		ad.cityname="Pune";
		ad.areaname="Karvenagar";
		
		Student s=new Student();
		s.rollno=1;
		s.name="XYZ";
		s.addr=ad;
		
		System.out.println(s.rollno);
		System.out.println(s.name);
		System.out.println(s.addr.cityname);
		System.out.println(s.addr.areaname);
	}

}
