package com.movie.config;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Myconfig {
	public static Connection getConnection() throws SQLException
	{
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/genesissql","root","Mrinal@9902");
		return c;
	}
}
