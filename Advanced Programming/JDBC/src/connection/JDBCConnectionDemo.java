package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionDemo {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/university";
		String user_name = "root";
		String password = "Bhavana@21";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,user_name,password);
			System.out.println("Connection established successfully "+con);
			
		} catch (ClassNotFoundException e) {
			System.out.println("----->Driver Not Found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("----->Failed to Establish Connection");
			e.printStackTrace();
		}
	}
}
