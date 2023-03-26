package December;

public class Test {
	
	public static void main(String[] args) {
		
		Bank ba=new Bank();
		ba.setBid(101);
		ba.setBname("CBI");
		
		Branch br=new Branch();
		br.setBrid(102);
		br.setBrname("Nagpur");
		br.setBank(ba);
		
		Customer cus=new Customer();
		cus.setCid(103);
		cus.setCname("Bambani");
		cus.setBranch(br);
		
		System.out.println("Customer Name:- "+cus.getCname());
		System.out.println("Customer Id:- "+cus.getCid());
		System.out.println("Branch Name:- "+cus.getBranch().getBrname());
		System.out.println("Branch Id:- "+cus.getBranch().getBrid());
		System.out.println("Bank Name:- "+cus.getBranch().getBank().getBname());
		System.out.println("Bank Id:- "+cus.getBranch().getBank().getBid());
		
	}

}
