package demo123.myProjectdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AximsoftDemo {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/dreamaxim";
		String username = "root";
		String password = "";
		Connection connection = DriverManager.getConnection(url, username, password);
		
		
		String taskname = "Webapp";
		String  timetaken = "1 day";
		String comments = "Did well";
		String query = "INSERT INTO dailytask (taskname, timetaken, comments) VALUES (?, ?, ?)";

	
		PreparedStatement statement = connection.prepareStatement(query);{
		statement.setString(1, taskname);
		statement.setString(2, timetaken);
		statement.setString(3, comments);
		int rowsInserted = statement.executeUpdate();


		if (rowsInserted > 0) {
			System.out.println("My task successfully completed!");
		}
		}
	}

}
