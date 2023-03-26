package Interface;

public abstract class CBI implements RBI {

//	@Override
//	public void btob() 
//	{
//		System.out.println("Bank to Bank loan at 2.5% pa ---CBI");
//	}
//
//	@Override
//	public void btop() 
//	{
//		System.out.println("Bank to Person loan at 6% pa ---CBI");
//		
//	}

	@Override
	public void btocar() 
	{
		
		System.out.println("Bank car loan at 10.5% pa ---CBI");
	}

	@Override
	public void btohome() 
	{
		System.out.println("Bank Home loan at 5.5% pa ---CBI");
		
	}
	

}
