package Switch_Case;

import java.util.Scanner;

public class Vowel_check_switchcase {
	public static void main(String[] args) {
		
		System.out.println("Enter a letter to check Vowel or Constant");
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		
		
		switch(c)
		{
		case 'a':
			System.out.println("a is a Vowel");
			break;
		case 'e':
			System.out.println("e is a Vowel");
			break;
		case 'i':
			System.out.println("i is a Vowel");
			break;
		case 'o':
			System.out.println("o is a Vowel");
			break;
		case 'u':
			System.out.println("u is a Vowel");
			break;
		case 'A':
				System.out.println("A is a Vowel");
				break;
		case 'E':
				System.out.println("E is a Vowel");
				break;
		case 'I':
				System.out.println("I is a Vowel");
				break;
		case 'O':
				System.out.println("O is a Vowel");
				break;
		case 'U':
				System.out.println("U is a Vowel");
				break;
				
		default:
			System.out.println("You entered a Constant i.e "+c);
				
		}

	}

}
