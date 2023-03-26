package Constructor;

public class Test {
	public static void main(String[] args) {
		
		Address ad= new Address(" Pune ", "Karvenagar");
		Student s= new Student (1, " XYZ ", ad);
		
		System.out.println(s.rollno);
		System.out.println(s.name);
		System.out.println(s.addr.cityname);
		System.out.println(s.addr.areaname);
	}

}
