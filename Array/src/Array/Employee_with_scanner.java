package Array;

import java.util.Scanner;

public class Employee_with_scanner {

	public static void main(String[] args) {
		
		System.out.println("Enter No.of Employee ");
		Scanner sc=new Scanner(System.in);
		
		 Employee emp[]=new Employee[sc.nextInt()];
		 
		for(int i=0; i<emp.length; i++)
		{
			Employee e=new Employee();
			System.out.println("Enter Employee Name and Id resp.");
			e.setEname(sc.next());
			e.setEid(sc.nextInt());
			emp[i]=e;
		}
		
		for(int i=0; i<emp.length; i++)
		{
			System.out.println("Employee Name:- "+emp[i].getEname());
			System.out.println("Employee Id:- "+emp[i].getEid());
		}
		
		
	}
}
