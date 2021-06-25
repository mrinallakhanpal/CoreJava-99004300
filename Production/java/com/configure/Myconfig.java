package com.configure;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Myconfig {
	public static Connection getConnection() throws SQLException, IOException, ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Properties p=new Properties();
		InputStream data=new FileInputStream("C:\\Users\\Mrinal Lakhanpal\\OneDrive\\Desktop\\Production\\data.properties");
		p.load(data);
		Connection c=DriverManager.getConnection(p.get("url").toString(),p.get("uname").toString(),p.get("passwd").toString());
		
		return c;
	}
}


