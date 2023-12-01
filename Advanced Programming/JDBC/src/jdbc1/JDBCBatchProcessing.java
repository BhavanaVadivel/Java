package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCBatchProcessing {
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String username = "root";
	private static final String password = "Bhavana@21";
	private static final String query1 = "update trainer set gender = 'Male' where id!=4;";
	private static final String query2 = "update trainer set gender = 'Female' where id=4;";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		try {
			//load and register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection with database
			con = DriverManager.getConnection(URL,username,password);
			Statement stmt = con.createStatement();
			
			//Batch processing execi=uting multiple queries at one time
			//1.Set autocommit as false
			con.setAutoCommit(false);
			//2.Add tasks to batch
			stmt.addBatch(query1);
			stmt.addBatch(query2);
			//3.Get count of records affected
			int[] counts = stmt.executeBatch();
			for (int i : counts) {
				System.out.println(i+" rows affected");
			}
			con.commit();

		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
