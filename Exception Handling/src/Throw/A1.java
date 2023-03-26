package Throw;

import java.util.Scanner;

public class A1 {
	public void m1(int age) throws AgeInvalideException {
		// System.out.println("m1--start");
		if (age >= 15 && age <= 17) {
			System.out.println("You can play whatever you want");
		}

		else {
			throw new AgeInvalideException("Age is not valid for sport.\nGo home your not a teenager.");
		}

	}

	public static void main(String[] args) {

		// System.out.println("main Start");
		A1 a = new A1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		try {
			a.m1(age);
		} catch (AgeInvalideException e) {
			System.out.println(e.getMessage());
		}
		// System.out.println("main-end");
	}

}
