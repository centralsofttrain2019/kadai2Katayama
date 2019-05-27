package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeesDao
{
	public static Connection getConnection()
			throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = null;
		con = DriverManager.getConnection(
					"jdbc:mysql://"
					+ "localhost"
					+ "/"
					+ "sqat_schema"
					+ "?serverTimezone=JST",
					"root",
					"root"
					);
		return con;
	}

}
