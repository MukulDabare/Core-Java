package Static;

public class TestS  {
	
	static Student stu;
	
	static 
	{
		Student s=new Student();
	 s.age=24;
	 s.name="Manik";
	 s.rollno=524;
	 stu=s;
	}
	{
		Student s2=new Student();
		 s2.age=23;
		 s2.name="Kinam";
		 s2.rollno=425;
		 stu =s2;
	}
	

	{
		System.out.println(stu.name);
		System.out.println(stu.age);
		System.out.println(stu.rollno);
	}
	
	public static void main(String[] args) {
		
		TestS t=new TestS();
	
	}

}
