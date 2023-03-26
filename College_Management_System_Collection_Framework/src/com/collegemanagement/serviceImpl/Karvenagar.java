package com.collegemanagement.serviceImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.collegemanagement.model.Batch;
import com.collegemanagement.model.Course;
import com.collegemanagement.model.Faculty;
import com.collegemanagement.model.Student;
import com.collegemanagement.service.Cjc;
import com.collegemanagement.service.*;

public class Karvenagar implements Cjc {

	List<Course> clist = new ArrayList<Course>();
	List<Faculty> flist = new ArrayList<>();
	List<Batch> blist = new ArrayList<>();
	List<Student> slist = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addCourse() {
		Course c = new Course();
		System.out.println("Enter Course Name");
		c.setCname(sc.next());
		System.out.println("Enter Course Id");
		c.setCid(sc.nextInt());
		System.out.println("Enter Course duration in months");
		c.setDuration(sc.nextInt());
		clist.add(c);

	}

	@Override
	public void viewCourse() {
		
		if (clist.isEmpty()) {
			System.out.println("Courses Not Found. Enter Course to begin.");
		} else {
			System.out.println("Courses Detail:-");
			Collections.sort(clist);
//List<Course> clistsorted = clist.stream().sorted(Comparator.comparingInt(Course::getCid)).collect(Collectors.toList());

			clist.forEach((cou) -> {
				System.out.println("Course Name: " + cou.getCname());
				System.out.println("Course Id: " + cou.getCid());
				System.out.println("Course Duration (Months): " + cou.getDuration());
			});
		}

	}

	@Override
	public void addFaculty() throws CourseInvalidException {
		Faculty f = new Faculty();
		System.out.println("Enter Faculty Name");
		f.setFname(sc.next());
		System.out.println("Enter Faculty Id");
		f.setFid(sc.nextInt());
		System.out.println("Enter Course Id you want to assignee to the faculty form the " + "following courses");
		clist.forEach((cou) -> {
			System.out.println("Course Id " + cou.getCid() + " for " + cou.getCname());

		});
		int id = sc.nextInt();

		clist.forEach((cou) -> {
			if (id == cou.getCid()) {
				f.setCourse(cou);
			}
		});

		if (f.getCourse() == null) {
			throw new CourseInvalidException("Course Not Found");
		}
		flist.add(f);
	}

	@Override
	public void viewFaculty() {
		if (flist.isEmpty()) {
			System.out.println("Faculties Not Found. Enter Faculty to begin. ");
		} else {
			System.out.println("Faculties Detail:-");
			flist.forEach((fac) -> {
				System.out.println("Faculty Name: " + fac.getFname());
				System.out.println("Faculty Id: " + fac.getFid());
				System.out.println("Faculty assignee to Course " + fac.getCourse().getCname());
			});
		}

	}

	@Override
	public void addBatch() throws FacultyInvalidException {
		Batch b = new Batch();
		System.out.println("Enter Batch Name");
		b.setBname(sc.next());
		System.out.println("Enter Batch Id");
		b.setBid(sc.nextInt());
		System.out.println("Enter Batch timing");
		b.setTiming(sc.nextFloat());
		System.out.println("Enter Fauclty Id you want to assignee to the Batch form the " + "following faculties");
		flist.forEach((fac) -> {
			System.out.println("Faculty Id " + fac.getFid() + " for " + fac.getFname());
		});
		int id = sc.nextInt();
		flist.forEach((fac) -> {
			if (id == fac.getFid()) {
				b.setFaculty(fac);
			}
		});

		if (b.getFaculty() == null) {
			throw new FacultyInvalidException("Faculty Not Found");
		}

		blist.add(b);

	}

	@Override
	public void viewBatch() {
		if (blist.isEmpty()) {
			System.out.println("Batches Not Found. Enter Batch to begin.");
		} else {
			System.out.println("Batches Detail:- ");
			blist.forEach((bat) -> {
				System.out.println("Batch Name: " + bat.getBname());
				System.out.println("Batch Id: " + bat.getBid());
				System.out.println("Batch Timing: " + bat.getTiming());
				System.out.println("Batch assignee to " + bat.getFaculty().getFname());
			});
		}

	}

	@Override
	public void addStudent() throws BatchInvalidException {
		Student s = new Student();
		System.out.println("Enter Student Name");
		s.setSname(sc.next());
		System.out.println("Enter Student Id");
		s.setSid(sc.nextInt());
		System.out.println("Enter Batch Id you want to assignee to the Student form the " + "following batches");
		blist.forEach((bat) -> {
			System.out.println("Batch Id " + bat.getBid() + " for " + bat.getBname());
		});
		int id = sc.nextInt();
		blist.forEach((bat) -> {
			if (id == bat.getBid()) {
				s.setBatch(bat);
			}
		});

		if (s.getBatch() == null) {
			throw new BatchInvalidException("Batch Not Found");
		}

		slist.add(s);
	}

	@Override
	public void viewStudent() {
		if (slist.isEmpty()) {
			System.out.println("Students Not Found. Enter Student to begin.");
		} else {
			System.out.println("Students Detail:- ");
            Collections.sort(slist);
			slist.forEach((stu) -> {
				System.out.println("Student Name: " + stu.getSname());
				System.out.println("Student Id: " + stu.getSid());
				System.out.println("Student assignee to Batch: " + stu.getBatch().getBname());
				System.out.println("Faculty Name: "+stu.getBatch().getFaculty().getFname());
				System.out.println("Course Name: "+stu.getBatch().getFaculty().getCourse().getCname());
			});
		}

	}


}
