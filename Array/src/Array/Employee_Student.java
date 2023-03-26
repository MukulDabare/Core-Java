package Array;

public class Employee_Student {
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setName("Mr.X");
		s1.setRollno(1);
		
		Student s2=new Student();
		s2.setName("Mrs.Y");
		s2.setRollno(2);
		
		Employee e1=new Employee();
		e1.setEname("Mr.E");
		e1.setEid(111);
		
		Employee e2=new Employee();
		e2.setEname("Mr.F");
		e2.setEid(222);
		
		Object obj[]= {s1, e1, s2, e2};
		
		for(int i=0; i<obj.length; i++)
		{
			Object o=obj[i];
			if(o instanceof Employee)
			{
				Employee emp=(Employee)o;
				System.out.println("Employee Name:- "+emp.getEname());
				System.out.println("Employee Id:- "+emp.getEid());
			}
			
			if(o instanceof Student)
			{
				Student stu=(Student) o;
				System.out.println("Student Name:- "+stu.getName());
				System.out.println("Student Id:- "+stu.getRollno());
			}
			
		}
	}

}
