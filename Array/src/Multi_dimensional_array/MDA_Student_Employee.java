package Multi_dimensional_array;

import java.util.Scanner;

public class MDA_Student_Employee {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of Categories");
		int x=sc.nextInt();
		System.out.println("Enter no.of Sub-Categories");
	    int y=sc.nextInt();
		
		Object [] [] obj=new Object[x][y];
		
		for(int i=0; i<obj.length; i++)
		{
			for(int j=0; j<obj[i].length; j++)
			{
				if(i==0)
				{
					Student s=new Student();
					System.out.println("Enter Student Name and Id resp.");
					System.out.println("Enter Student Name ");
					s.setName(sc.next());
					System.out.println("Enter Student Id ");
					s.setRollno(sc.nextInt());
					obj[i][j]=s;
				}
				
				if(i==1)
				{
					Employee e=new Employee();
					System.out.println("Now enter Employee Name and Id resp.");
					System.out.println("Enter Employee Name ");
					e.setEname(sc.next());
					System.out.println("Enter Employee Id");
					e.setEid(sc.nextInt());
					obj[i][j]=e;
					
				}
			}
		}
		
		
		for(int i=0; i<obj.length; i++)
		{
			for(int j=0; j<obj[i].length; j++)
			{
				Object o=obj[i][j];
				
				if(o instanceof Student)
				{
					System.out.print("Student Details: "); 
					
					Student stu=(Student)o;
					
					System.out.println(" Name:- "+stu.getName());	
					System.out.println("                  Rollno:- "+stu.getRollno());
					
				}
				
				System.out.println();
				
				if(o instanceof Employee)
				{
					System.out.print("Employee Details: ");
					
					Employee emp=(Employee)o;
					
				    System.out.println("Name:- "+emp.getEname());
					System.out.println("                  Id:- "+emp.getEid());
					
				}
			}
		}
		
		
	}

}
