package Array;

public class Employee_without_scanner {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.setEid(101);
		e1.setEname("Mr.X");
		
		Employee e2=new Employee();
		e2.setEid(102);
		e2.setEname("Mrs.Y");
		
		Employee e3=new Employee();
		e3.setEid(103);
		e3.setEname("Mr.Z");
		
		Employee emp[]= {e1, e2, e3};
		
		for(int i=0; i<emp.length; i++)
		{
			System.out.println("Employee Name:- "+emp[i].getEname());
			System.out.println("Employee Id:- "+emp[i].getEid());
		}
	}	

}
