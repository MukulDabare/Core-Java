package Interface;

public class Oracle implements Connection {

	@Override
	public void commit()
	{
		System.out.println("Commit--Oracle");
	}

	@Override
	public void rollback() 
	{
		System.out.println("Rollback--Oracle");
	}

}
