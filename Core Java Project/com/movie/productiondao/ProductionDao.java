package com.movie.productiondao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.movie.config.Myconfig;
import com.movieproduction.details.Production;

public class ProductionDao {

	public void Insertproduction(Production p) throws SQLException, Exception {
		// TODO Auto-generated method stub
		boolean b=false;
		Connection con=Myconfig.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into productions values(?,?,?,?,?)");
		ps.setInt(1, p.getProductionid());
		ps.setString(2, p.getProductionname());
		ps.setString(3, p.getAdress());
		ps.setInt(4, p.getDateofStarted());
		ps.setString(5, p.getOwnername());
		b=ps.execute();
		System.out.println("Value inserted");
	}

	public List<Production> getAlldetails() throws SQLException, Exception {
		List<Production>proudctions=new ArrayList<Production>();
		Connection con=Myconfig.getConnection();
		 Statement s=con.createStatement();
		 ResultSet rs=s.executeQuery("select * from productions");
		 while(rs.next())
		 {
			 proudctions.add(new Production(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5)));
		 }
		 return proudctions;
	}

	public void delete(int val) throws SQLException, Exception {
		Connection con=Myconfig.getConnection();
		 PreparedStatement stmt=con.prepareStatement("delete from productions where Productionid=?");
		 stmt.setInt(1,val);
		 int i=stmt.executeUpdate();  
		 if(i!=0) {
			 System.out.println("records deleted"); 
		 }
		 else
		 {
			 System.out.println("Enter Valid Production ID");
		 }
		
	}
	public void view(int data) throws SQLException, Exception
	{
		Connection con=Myconfig.getConnection();
		 PreparedStatement stmt10=con.prepareStatement("select * from productions where Productionid=?");
		 stmt10.setInt(1, data);
		 ResultSet rs=stmt10.executeQuery();
		 if (rs.next()!=true)
			{
			 System.out.println("Enter Valid Production ID");
			}
		 else {
				 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
		 }
	}

	public boolean presetnornot(int pids) throws SQLException, Exception {
		// TODO Auto-generated method stub
		Connection con=Myconfig.getConnection();
		PreparedStatement stmt=con.prepareStatement("select Productionid from productions where Productionid=?");
		stmt.setInt(1,pids);
		ResultSet i=stmt.executeQuery(); 
		while(i.next())
		{
			return false;
		}
		return true;
	}

	public boolean presetnornotU(int pidss) throws SQLException, Exception {
		Connection con=Myconfig.getConnection();
		PreparedStatement stmt=con.prepareStatement("select Productionid from productions where Productionid=?");
		stmt.setInt(1,pidss);
		ResultSet i=stmt.executeQuery(); 
		while(i.next())
		{
			return true;
		}
		return false;
	}

	public void update(String data) throws SQLException, Exception {
		String array[]=data.split(",");
		HashMap<Integer,String>hm=new HashMap<Integer,String>(){
			{
				//1.Productionid,2.Productionname,3.Adress,4.DateofStarted,5.Ownername
				put(1,"Productionid");put(2,"Productionname");put(3,"Address");put(4,"Dateofstarted");
				put(5,"Ownername");
			}
		};
		for(int i=0;i<array.length;i++)
		{
			if(hm.containsKey(Integer.parseInt(array[i])))
					{
				array[i]=hm.get(Integer.parseInt(array[i]));				
					}
		}
		Connection con=Myconfig.getConnection();
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the ProductionID No");
		int val=ob.nextInt();
		for(int i=0;i<array.length;i++)
		{
			switch(array[i])
			{
			case "Productionid":
				PreparedStatement stmt9=con.prepareStatement("update productions set Productionid=? where Productionid=?");
				System.out.println("Enter the New ProductionId");
				stmt9.setInt(1,ob.nextInt());
				stmt9.setInt(2,val);
				System.out.println("Do you want to update the data (Y/N)");
				String per=ob.next();
				if(per.equals("Y"))
				{
					stmt9.executeUpdate();
					System.out.println("Value updated"); 
				}
				else if(per.equals("N"))
				{
					System.out.println("Entered Data Is Not Updated.");
				}
				break;
			case "Productionname":
				PreparedStatement stmt1=con.prepareStatement("update productions set Productionname=? where Productionid=?");
				System.out.println("Enter the New ProductionName");
				stmt1.setString(1,ob.next());
				stmt1.setInt(2,val);
				System.out.println("Do you want to update the data (Y/N)");
				String per1=ob.next();
				if(per1.equals("Y"))
				{
					stmt1.executeUpdate(); 
					System.out.println("Value updated"); 
				}
				else if(per1.equals("N"))
				{
					System.out.println("Entered Data Is Not Updated.");
				}
				break;
			case "Adress":
				PreparedStatement stmt2=con.prepareStatement("update productions set Adress=? where Productionid=?");
				System.out.println("Enter the New Address");
				stmt2.setString(1,ob.next());
				stmt2.setInt(2,val);
				System.out.println("Do you want to update the data (Y/N)");
				String per2=ob.next();
				if(per2.equals("Y"))
				{
					stmt2.executeUpdate(); 
					System.out.println("Value updated"); 
				}
				else if(per2.equals("N"))
				{
					System.out.println("Entered Data Is Not Updated.");
				}
				break;
				
			case "DateofStarted":
				PreparedStatement stmt3=con.prepareStatement("update productions set DateofStarted=? where Productionid=?");
				System.out.println("Enter the New Date");
				stmt3.setInt(1,ob.nextInt());
				stmt3.setInt(2,val);
				System.out.println("Do you want to update the data (Y/N)");
				String per3=ob.next();
				if(per3.equals("Y"))
				{
					stmt3.executeUpdate();
					System.out.println("Value updated"); 
				}
				else if(per3.equals("N"))
				{
					System.out.println("Entered Data Is Not Updated.");
				}
				break;
				
			case "Ownername":
				PreparedStatement stmt4=con.prepareStatement("update productions set Ownername=? where Productionid=?");
				System.out.println("Enter the New OwnerName");
				stmt4.setString(1,ob.next());
				stmt4.setInt(2,val);
				System.out.println("Do you want to update the data (Y/N)");
				String per4=ob.next();
				if(per4.equals("Y"))
				{
					stmt4.executeUpdate(); 
					System.out.println("Value updated"); 
				}
				else if(per4.equals("N"))
				{
					System.out.println("Entered Data Is Not Updated.");
				}
				break;
			default:
				break;
			}
		}
	}
}
