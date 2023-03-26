package Array;

public class Customer_without_scanner {

	public static void main(String[] args) {
		
		Customer c1=new Customer();
		c1.setCname("Mr.A");
		c1.setCid(101);
		
		Customer c2=new Customer();
		c2.setCname("Mr.B");
		c2.setCid(102);
		
		Customer c3=new Customer();
		c3.setCname("Mr.C");
		c3.setCid(103);
		
		Customer cus[]= {c1, c2, c3};
		
		for(int i=0; i<cus.length; i++)
		{
			System.out.println("Customer Name:- "+cus[i].getCname());
			System.out.println("Customer Id:- "+cus[i].getCid());
		}
		
	}
}
