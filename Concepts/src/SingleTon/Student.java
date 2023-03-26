package SingleTon;

public class Student {
	int rollno;
	String name;
	
	static Student stu=new Student();
	
	private Student() {
	
	}
	public static Student getInstance() {
		
		if(stu==null)
		{
			stu= new Student();
			return stu;
		}
		return stu;
		
	}

}
