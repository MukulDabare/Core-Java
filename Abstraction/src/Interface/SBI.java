package Interface;

public abstract class SBI implements RBI {

	@Override
	public void btob() 
	{
		System.out.println("Bank to Bank loan at 2% pa ---SBI");
		
	}

	@Override
	public void btop()
	{
		System.out.println("Bank to Person loan at 6% pa ---SBI");
		
	}

//	@Override
//	public void btocar()
//	{
//		System.out.println("Bank car loan at 10% pa ---SBI");
//		
//	}
//
//	@Override
//	public void btohome()
//	{
//		System.out.println("Bank Home loan at 5% pa ---SBI");
//	}

}
