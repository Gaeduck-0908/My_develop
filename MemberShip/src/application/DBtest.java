package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBtest 
{
	public static String driver = "oracle.jdbc.driver.OracleDriver";
	public static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	public static String user = "System";
	public static String password = "1234";
	public static Connection dbConn;
	
	public static Connection dbconnect()
	{	
		try 
		{
			Class.forName(driver);
			System.out.println("jdbc driver �ε� ����");
			dbConn = DriverManager.getConnection(url, user, password);
			System.out.println("����Ŭ ���� ����");
		} 
		
		catch (ClassNotFoundException e) 
		{
			System.out.println("jdbc driver �ε� ����");
		} 
		
		catch (SQLException e) 
		{
			System.out.println("����Ŭ ���� ����");
		}
		
		return dbConn;
	}
}
