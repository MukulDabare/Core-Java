package December;

public class Demo {

	public Bank setBank(int bid, String bname)
	{
		Bank ba=new Bank();
		ba.setBid(bid);
		ba.setBname(bname);
		return ba;
	}
	public Branch setBranch(int brid, String brname, Bank bank)
	{
		Branch br=new Branch();
		br.setBrid(brid);
		br.setBrname(brname);
		br.setBank(bank);
		return br;
	}
	public Customer setCustomer(int cid, String cname, Branch branch)
	{
		Customer cus=new Customer();
		cus.setCid(cid);
		cus.setCname(cname);
		cus.setBranch(branch);
		return cus;
	}
	public void getDisplay(Customer c)
	{
		System.out.println(c.getCname());
		System.out.println(c.getCid());
		System.out.println(c.getBranch().getBrname());
		System.out.println(c.getBranch().getBrid());
		System.out.println(c.getBranch().getBank().getBname());
		System.out.println(c.getBranch().getBank().getBid());
	}
	
	public static void main(String[] args) {
		
		Demo d=new Demo();
		Bank b1 = d.setBank(101, "CBI");
		Branch b2 = d.setBranch(102, "Nagpur", b1);
		Customer c1=d.setCustomer(103, "Bambani", b2);
		d.getDisplay(c1);
	}
}
