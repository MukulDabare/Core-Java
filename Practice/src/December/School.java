package December;

public class School {
	
	public static void main(String[] args) {
		
		Address a=new Address();
		a.setCityname("Nagpur");
		a.setAreaname("STC");
		Student1 s=new Student1();
		s.setName("Ashish");
		s.setRollno(12);
		s.setAdd(a);
		System.out.println(s.getName());
		System.out.println(s.getRollno());
		System.out.println(s.getAdd().getAreaname());
		System.out.println(s.getAdd().getCityname());
	}

}
