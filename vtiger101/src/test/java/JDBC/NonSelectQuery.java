package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NonSelectQuery {

	public static void main(String[] args) throws SQLException {
		//1. Register driver to java
				Driver driver = new Driver();
				DriverManager.registerDriver(driver);
				//2. Establishing connection to your database
				Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/automation", "root", "root");
				//3. Creating a statement
				Statement statement = connection.createStatement();
				int result=statement.executeUpdate("insert into project values(2, 'Amit', 977676);");
				if(result==1)
				{
					System.out.println("The database has been updated");
				}
				
				else
					{
					
					System.out.println("The dataabase hasn't been updated");
					
				}
				
				 connection.close();
				 
	}

}
