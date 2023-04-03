package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQuery {

	public static void main(String[] args) throws SQLException {
		
		//1. Register driver to java
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		//2. Establishing connection to your database
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/automation", "root", "root");
		//3. Creating a statement
		Statement statement = connection.createStatement();
		//4. Writing a Query
		ResultSet result= statement.executeQuery("select * from project");
		while(result.next())
		{
			System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3));
			
		}
		
		// we need to close the data base to prevent the data leakage 
		connection.close();	
	}

}
