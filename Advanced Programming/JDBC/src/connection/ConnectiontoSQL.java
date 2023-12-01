package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectiontoSQL {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/university";
		String user_name = "root";
		String password = "Bhavana@21";
		String create_table = "create table trainers (ID int , NAME varchar(30) , Gender int);";
		String insert_values = "insert into trainers(id,name) values (1,'Mr.Punith'),(2,'Mr.Arun'),(3,'Mr.Sandesh'),(4,'Ms.Priya'),(2,'Mr.Deep');";//
		//String update_query = "update Student set NAME = 'Adhi' where NAME = 'Anu';";
		//String delete_query = "delete from Student where ID  = 1";
		
		try {
			//Load and Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//FQCN(Fully Qualified Class Name)-Canonical Name
			Connection con = DriverManager.getConnection(url,user_name,password);
			System.out.println("Connection established successfully "+con);
			
			//Create Statement Object
			Statement stmt = con.createStatement();
			
			//Send and Execute Query
			//stmt.execute(create_table);
			//System.out.println("Student table Created");
			int rowsAffected = stmt.executeUpdate(insert_values);
			System.out.println(rowsAffected+" rows affected");
			//stmt.execute(update_query);
			//stmt.execute(delete_query);
			
		} catch (ClassNotFoundException e) {
			System.out.println("----->Driver Not Found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("----->Failed to Establish Connection");
			e.printStackTrace();
		}
	}

}
