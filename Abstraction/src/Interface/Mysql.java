package Interface;

public class Mysql implements Connection {

	@Override
	public void commit() 
	{
		System.out.println("Commit--Mysql");
	}

	@Override
	public void rollback() {
		System.out.println("Rollback--Mysql");
		
	}

}
