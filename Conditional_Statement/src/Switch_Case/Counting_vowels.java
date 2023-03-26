package Switch_Case;

public class Counting_vowels {
	
	public static void main(String[] args) {
		
		int count= 0;
		
		String s="aeiou aeiou";
		
		for (int i=0; i<s.length(); i++)
		{
		 char c=s.charAt(i);
		 switch (c)
		 {
		 case 'a':
				count ++;
				break;
			case 'e':
				count ++;
				break;
			case 'i':
				count ++;
				break;
			case 'o':
				count ++;
				break;
			case 'u':
				count ++;
				break;
			case 'A':
				count ++;
					break;
			case 'E':
				count ++;
					break;
			case 'I':
				count ++;
					break;
			case 'O':
				count ++;
					break;
			case 'U':
				count ++;
					break;
					
			default:
				
		}
		 
		}
		System.out.println("Total vowel count:- "+count);
		System.out.println("Total consonants including space:- "+(s.length()-count));
	}

}
