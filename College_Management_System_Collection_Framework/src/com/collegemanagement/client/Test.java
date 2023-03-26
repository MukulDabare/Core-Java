package com.collegemanagement.client;

import java.util.Scanner;

import com.collegemanagement.service.*;
import com.collegemanagement.serviceImpl.Karvenagar;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Karvenagar k = new Karvenagar();
		
		
		while (true) {
			System.out.println("Enter choice " + "\n1.Add Course" + "\n2.View Courses" + "\n3.Add Faculty"
					+ "\n4.View Faculties" + "\n5.Add Batch" + "\n6.View Batches" + "\n7.Add Student"
					+ "\n8.View Students" + "\n9.To exit");
			int ch = sc.nextInt();
			try {
				switch (ch) {
				case (1):
					System.out.println("Enter Course Details");
					k.addCourse();
					break;
				case (2):
					
					k.viewCourse();
					break;
				case (3):
					System.out.println("Enter Faculty Details");
					k.addFaculty();
					break;
				case (4):
					k.viewFaculty();
					break;
				case (5):
					System.out.println("Enter Batch Details");
					k.addBatch();
					break;
				case (6):
					k.viewBatch();
					break;
				case (7):
					System.out.println("Enter Student Details");
					k.addStudent();
					break;
				case (8):
					k.viewStudent();
					break;

				case (9):
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Choice");
					break;

				}
			} catch (CourseInvalidException e) {
				System.out.println(e.getMessage());
			}catch(FacultyInvalidException e) {
				System.out.println(e.getMessage());
			}catch(BatchInvalidException e)
			{
				System.out.println(e.getMessage());
			}
			catch(Exception e)
			{
				System.out.println("Invalid Entry");
			}
			System.out.println("```````````````````````````````````````````````````");
		}

	}

}
