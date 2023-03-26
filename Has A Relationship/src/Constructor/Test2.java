package Constructor;

public class Test2 {
	public static void main(String[] args) {
		
		Address ad=new Address("Pune", "Karvenagr");
		Student s1=new Student(1," Manik",ad);
		Parents p=new Parents("Female","Male",441802,s1);
		
		System.out.println(p.pmname);
		System.out.println(p.pfname);
		System.out.println(p.student.rollno);
		System.out.println(p.student.name);
		System.out.println(p.student.addr.cityname);
		System.out.println(p.student.addr.areaname);
		
	}

}
