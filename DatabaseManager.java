package Dining;
import java.sql.*;

public class DatabaseManager {
	public static void main(String[] args) {
		//load driver
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Driver not found");
			System.exit(0);
		};
		
		//Set up connection
		Connection conn = null;
		//cp MySQL url
		String url = "jdbc:mysql@csc-db0.csc.calpoly.edu/";
		//username and password need to be updated
		String user ="ST44";
		String password="foobar";
		
		//connect to database
		try {
			conn = DriverManager.getConnection(url+"user"+"?user="+user+"&password="+password);
		}
		catch (Exception ex) {
			System.out.println("Could not open connection");
			System.exit(0);
		};
		
		//Start setting up local database
	}
}
