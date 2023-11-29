package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCMethods {
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String username = "root";
	private static final String password = "Bhavana@21";
	private static final String insert_query = "insert into Student values(?,?,?);";
	private static final String select_query = "select * from Student;";
	private static final String update_query = "update Student set marks =( ?) where id =( ?)";
	private static final String delete_query = "delete from Student where id = (?);";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		try {
			//load and register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection with database
			con = DriverManager.getConnection(URL,username,password);

			while(true) {
			System.out.println("Choose from the options below to calculate");
			System.out.println("1 --> To insert the data");
			System.out.println("2 --> To read the data");
			System.out.println("3 --> To update the data");
			System.out.println("4 --> To delete the data");
			System.out.println("5 --> Quit");
			int option = sc.nextInt();
			switch(option) {
			case 1:{
				//To insert the data
				insertDataQuery(con,sc);
				break;
			}
			case 2:{
				//To read the data
				selectDataQuery(con,sc);
				break;
			}
			case 3:{
				//To update the data
				updateDataQuery(con,sc);
				break;
			}
			case 4:{
				//To delete the data
				deleteDataQuery(con,sc);
				break;
			}
			default:{
				//System.out.println("Invalid option");;
				System.exit(0);
			}
			}}

		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	private static void insertDataQuery(Connection con, Scanner sc) {
		System.out.println("Enter the ID ");
		int id = sc.nextInt();
		System.out.println("Enter the name ");
		String name = sc.next();
		System.out.println("Enter the Marks ");
		int marks = sc.nextInt();

		try {
			PreparedStatement pstmt = con.prepareStatement(insert_query);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, marks);
			pstmt.execute();
			
			System.out.println("The values are inserted");
			System.out.println("Data After Inserting");
			try {
				PreparedStatement stmt = con.prepareStatement(select_query);
				//Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery();
				while(rs.next()) {	
					System.out.println("Id = "+rs.getInt(1)+" | Name = "+rs.getString(2)+" | Marks = "+rs.getInt(3));
					}
				System.out.println();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private static void updateDataQuery(Connection con, Scanner sc) {
		
		try {
			PreparedStatement pstmt = con.prepareStatement(update_query);
			System.out.println("Enter id whose marks to be updated");
			int id = sc.nextInt();
			System.out.println("Enter the marks");
			int marks = sc.nextInt();
			pstmt.setInt(1, marks);
			pstmt.setInt(2,id);
			pstmt.execute();
			System.out.println("Marks of the id "+id+" has been updated");
			System.out.println("Data After Updating");
			try {
				PreparedStatement stmt = con.prepareStatement(select_query);
				//Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery();
				while(rs.next()) {	
					System.out.println("Id = "+rs.getInt(1)+" | Name = "+rs.getString(2)+" | Marks = "+rs.getInt(3));
					}
				System.out.println();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void selectDataQuery(Connection con,Scanner sc) {
		try {
			PreparedStatement pstmt = con.prepareStatement(select_query);
			//Statement stmt = con.createStatement();
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {	
				System.out.println("Id = "+rs.getInt(1)+" | Name = "+rs.getString(2)+" | Marks = "+rs.getInt(3));
				}
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void deleteDataQuery(Connection con, Scanner sc) {
		try {
			PreparedStatement pstmt = con.prepareStatement(delete_query);
			System.out.println("Enter id to be deleted");
			int id = sc.nextInt();
			pstmt.setInt(1,id);
			pstmt.execute();
			
			System.out.println("id "+id+" has been deleted");
			System.out.println("Data After Deleting");
			try {
				PreparedStatement stmt = con.prepareStatement(select_query);
				//Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery();
				while(rs.next()) {	
					System.out.println("Id = "+rs.getInt(1)+" | Name = "+rs.getString(2)+" | Marks = "+rs.getInt(3));
					}
				System.out.println();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
