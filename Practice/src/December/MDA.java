package December;

import java.util.Scanner;

public class MDA {
   

	int x ;
	int y ;
	Object[][] b = new Object[x][y];

	public void data() {
		System.out.println("Enter your data");
		 Scanner sc = new Scanner(System.in);
       for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				if (i == 0) {
					System.out.println("enter bank id");
					Bank1 bk = new Bank1();
					bk.setBid(sc.nextInt());
					System.out.println("enter bank name");
					bk.setBname(sc.next());
					b[i][j] = bk;

				}
				if (i == 1) {
					Customer1 cs = new Customer1();
					System.out.println("enter customer id");
					cs.setCid(sc.nextInt());
					System.out.println("enter customer name");
					cs.setCname(sc.next());
					b[i][j] = cs;

				}

			}

		}
		
	}

	public void getData() {

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {

				Object obj = b[i][j];
				if (obj instanceof Bank1) {
					System.out.println("Bank Details ");
					Bank1 ba = (Bank1) obj;
					System.out.println("Bank name:- " + ba.getBname());
					System.out.println("Bank id:- " + ba.getBid());
				}
				if (obj instanceof Customer1) {
					System.out.println("Customer Details");
					Customer1 ck = (Customer1) obj;
					System.out.println("Customer name:- " + ck.getCname());
					System.out.println("Customer Id:- " + ck.getCid());

				}

			}

		}

	}
	public MDA(int x, int y)
	{
		this.x=x;
		this.y=y;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No.of rows");
		int x = sc.nextInt();
		System.out.println("Enter no.of Columns ");
		int y = sc.nextInt();
		
		MDA m = new MDA(x,y);
		m.data();
		m.getData();
	}

}
