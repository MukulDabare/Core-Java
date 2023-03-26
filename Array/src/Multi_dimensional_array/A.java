package Multi_dimensional_array;

public class A {
public static void main(String[] args) {
	

	int [] []a=new int [2][3];
	
	a[0][0]=10;
	a[0][1]=20;
	a[0][2]=30;
	a[1][0]=40;
	a[1][1]=50;
	a[1][2]=60;
	
	for(int i=0; i<a.length;i++)
	{
		for(int j=0; j<a[i].length; j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	System.out.println();
	
	int [][]b= {{1,2},{111,22,33},{44}};
	
	for(int i=0; i<b.length;i++)
	{
		for(int j=0; j<b[i].length; j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
	
	
}
}
