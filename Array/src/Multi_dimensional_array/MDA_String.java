package Multi_dimensional_array;

public class MDA_String {
	public static void main(String[] args) {
		
		String [][]s=new String[2][3];
		
		s[0][0]="A";
		s[0][1]="B";
		s[0][2]="C";
		s[1][0]="D";
		s[1][1]="E";
		s[1][2]="F";
		
		for(int i=0; i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++ )
			{
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		String [][]q= {{"a","b","c"},{"d","e","f"}};
		for(int i=0; i<q.length;i++)
		{
			for(int j=0;j<q[i].length;j++ )
			{
				System.out.print(q[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
