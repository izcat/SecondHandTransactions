package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import view.Login;
import view.MainFrom;
import view.RegisterUser;

public class Dbutil {
	private String dbUrl="jdbc:mysql://localhost:3306/secondhandtransactions?serverTimezone=Asia/Shanghai";
	private String dbusername="root";
	private String dbpassword="root";
	private String jdbcNameString="com.mysql.cj.jdbc.Driver";
	public Connection getCon() throws Exception{
		Class.forName(jdbcNameString);
		Connection con=DriverManager.getConnection(dbUrl, dbusername, dbpassword);
		return con;
	}
	public void closeCon(Connection con) throws SQLException
	{
		if(con!=null)
			con.close();
	}
	public static void main(String []args) 
	{
		Dbutil dbutil = new Dbutil();
		try {
			Connection connection = dbutil.getCon();
			System.out.println("成功连接");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
