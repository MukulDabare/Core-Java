package Setter_Getter;

public class Test {
 public static void main(String[] args) {
	 
	Address ad=new Address();
	ad.setCityname("Pune");
	ad.setAreaname("Karvenagar");
	
	Student s=new Student();
	s.setRollno(1);
	s.setName("Xyz");
	s.setAddr(ad);
	
	System.out.println(s.getRollno());
	System.out.println(s.getName());
	System.out.println(s.getAddr().getCityname());
	System.out.println(s.getAddr().getAreaname());
}
}
