package com.productiondao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.configure.Myconfig;
import com.production.Production;

public class ProductionDao {
	public boolean Insertproduction(Production p) throws SQLException, Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		boolean b=false;
		Connection con=Myconfig.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into production values(?,?,?,?,?)");
		ps.setInt(1, p.getProductionid());
		ps.setString(2, p.getProductionname());
		ps.setString(3, p.getAdress());
		ps.setInt(4, p.getDateofStarted());
		ps.setString(5, p.getOwnername());
		b=ps.execute();
		System.out.println("Value inserted");
		return b;
	}
	
	public List<Production> getAlldetails() throws SQLException, Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		List<Production>productions=new ArrayList<Production>();
		Connection con=Myconfig.getConnection();
		 Statement s=con.createStatement();
		 
		 ResultSet rs=s.executeQuery("select * from production");
		 
		 while(rs.next())
		 {
			 productions.add(new Production(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5)));
		 }

		 return productions;
	}
	
	
	public Production getPlayerbyId(int id) throws ClassNotFoundException, SQLException, IOException
	{
		 Connection con=Myconfig.getConnection();
		 Statement s=con.createStatement();
		 ResultSet rs=s.executeQuery("select * from production where productionid="+id);
		 Production p=null;
		 while(rs.next())
		 {
			 p=new Production(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5));
		 }
		return p;
		
	}

	public int update(int no, String name, String address, int dob, String oname) throws SQLException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		Connection con=Myconfig.getConnection();
		PreparedStatement stmt=con.prepareStatement("update production set productionid=?,productionname=?,address=?,dateofstarted=?,ownername=? where productionid=?");
		stmt.setInt(1,no);  
		stmt.setString(2, name);
		stmt.setString(3,address); 
		stmt.setInt(4, dob);
		stmt.setString(5, oname);
		stmt.setInt(6,no);
		int i=stmt.executeUpdate();  
		System.out.println("Records updated");  
		return i;
	}
	public int update(Production p) throws ClassNotFoundException, SQLException, IOException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=Myconfig.getConnection();
		PreparedStatement stmt=con.prepareStatement("update production set productionid=?,productionname=?,address=?,dateofstarted=?,ownername=? where productionid=?");
		stmt.setInt(1,p.getProductionid());  
		stmt.setString(2, p.getProductionname());
		stmt.setString(3,p.getAdress()); 
		stmt.setInt(4, p.getDateofStarted());
		stmt.setString(5, p.getOwnername());
		stmt.setInt(6,p.getProductionid());
		int i=stmt.executeUpdate();
		System.out.println("Records updated");  
		return i;
	}
}
