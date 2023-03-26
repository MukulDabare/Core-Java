package String;

public class Vowels_counting {
	public static void main(String[] args) {
		
		String s1="complete java classes";
		System.out.println("Total Charecters:- "+s1.length()+"(space including)");
		int count=0;
		int nos=0;
		int countc=0-nos;
		String s=s1.toLowerCase();
	
		
		 
		for(int i=0; i<s.length(); i++)
		{
			if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
			{
				count ++;
			}
			else if(s.charAt(i)==' ')
			
			   {
				nos ++;
				
			    }
			else
			{
				countc ++;
			}
			
		}
		System.out.println("Total vowels:- "+count);
		System.out.println("Total Consonants:- "+countc);
		
		
				
	}

}
