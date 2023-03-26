package Interface;

public class Test {
	
	public static void main(String[] args) {
		
		
		System.out.println("Oracle class implements  Connection interface");
		Connection con=new Oracle();
		con.commit();
		con.rollback();
		System.out.println("---------------------------");
		System.out.println("Mysql class implements Connection interface");
		Connection conn=new Mysql();
		conn.commit();
		conn.rollback();
	}

}
