package com.movie.moviedao;

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
import com.movie.moviedetails.Movie;


public class MovieDao {
	public boolean InsertMovie(Movie m) throws SQLException
	{
		Connection con=Myconfig.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into movie values(?,?,?,?,?,?,?,?,?)");
		ps.setInt(1,m.getMovie_id());
		ps.setString(2,m.getMovie_name());
		ps.setString(3,m.getHero_name());
		ps.setString(4,m.getHeroine());
		ps.setString(5,m.getRelease_date());
		ps.setString(6,m.getLanguage());
		ps.setInt(7,m.getLength());
		ps.setString(8,m.getMovie_type());
		ps.setInt(9,m.getProduction_id());
		
		boolean b=ps.execute();
		System.out.println("Value inserted");
		return b;
	}
	
	public List<Movie>getAllDetails() throws SQLException
	{
		List<Movie>movies=new ArrayList<Movie>();
		Connection con=Myconfig.getConnection();
		 Statement s=con.createStatement();
		 ResultSet rs=s.executeQuery("select * from movie");
		 while(rs.next())
		 {
			 movies.add(new Movie(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getInt(9)));
		 }
		 return movies;
	}
	public void delete(int data) throws SQLException
	{
		Connection con=Myconfig.getConnection();
		 PreparedStatement stmt=con.prepareStatement("delete from movie where Movieid=?");
		 stmt.setInt(1,data);
		 int i=stmt.executeUpdate();  
		 if(i!=0) {
			 System.out.println("records deleted"); 
		 }
		 else
		 {
			 System.out.println("Enter Valid Movie ID");
		 }
	}
	public void view(int data) throws SQLException
	{
		Connection con=Myconfig.getConnection();
		 PreparedStatement stmt10=con.prepareStatement("select * from movie where Movieid=?");
		 stmt10.setInt(1, data);
		 ResultSet rs=stmt10.executeQuery();
		 if (rs.next()!=true)
			{
			 System.out.println("Enter Valid Movie ID");
			}
		 else {
				 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getDate(5)+" "+rs.getString(6)+" "+rs.getInt(7)+" "+rs.getString(8)+" "+rs.getInt(9));
		 }
	}
	public void update(String data) throws SQLException
	{
		//1.Movieid,2.Moviename,3.Heroname,4.Heroine,5.Releasedate,6.Language,7.Length,8.Movietype,9.Productionid
		String array[]=data.split(",");
		HashMap<Integer,String>hm=new HashMap<Integer,String>(){
			{
				put(1,"movieid");put(2,"moviename");put(3,"heroname");put(4,"heroine");
				put(5,"releasedate");put(6,"language");put(7,"length");put(8,"movietype");
				put(9,"productionid");
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
		System.out.println("Enter the MovieID No");
		int val=ob.nextInt();
		for(int i=0;i<array.length;i++)
		{
			//PreparedStatement stmt=con.prepareStatement("update movie set ?=? where Movieid=?");
			switch(array[i])
			{
			case "Movieid":
				PreparedStatement stmt9=con.prepareStatement("update movie set Movieid=? where Movieid=?");
				System.out.println("Enter the New MovieID");
				stmt9.setInt(1,ob.nextInt());
				//System.out.println("Enter the MovieID No");
				stmt9.setInt(2,val);
				stmt9.executeUpdate();  
				break;
			case "Moviename":
				PreparedStatement stmt1=con.prepareStatement("update movie set Moviename=? where Movieid=?");
				System.out.println("Enter the New MovieName");
				stmt1.setString(1,ob.next());
				//System.out.println("Enter the MovieID No");
				stmt1.setInt(2,val);
				stmt1.executeUpdate();
				break;
			case "Heroname":
				PreparedStatement stmt2=con.prepareStatement("update movie set Heroname=? where Movieid=?");
				System.out.println("Enter the New Heroname");
				stmt2.setString(1,ob.next());
				//System.out.println("Enter the MovieID No");
				stmt2.setInt(2,val);
				stmt2.executeUpdate();
				break;
			case "Heroine":
				PreparedStatement stmt3=con.prepareStatement("update movie set Heroine=? where Movieid=?");
				System.out.println("Enter the New Heroine name");
				stmt3.setString(1,ob.next());
				//System.out.println("Enter the MovieID No");
				stmt3.setInt(2,val);
				stmt3.executeUpdate();
				break;
			case "Releasedate":
				PreparedStatement stmt4=con.prepareStatement("update movie set Releasedate=? where Movieid=?");
				System.out.println("Enter the New ReleaseDate");
				stmt4.setString(1,ob.next());
				//System.out.println("Enter the MovieID No");
				stmt4.setInt(2,val);
				stmt4.executeUpdate();
				break;
			case "Language":
				PreparedStatement stmt5=con.prepareStatement("update movie set Language=? where Movieid=?");
				System.out.println("Enter the New Language");
				stmt5.setString(1,ob.next());
				//System.out.println("Enter the MovieID No");
				stmt5.setInt(2,val);
				stmt5.executeUpdate();
				break;
			case "Length":
				PreparedStatement stmt6=con.prepareStatement("update movie set Lenght=? where Movieid=?");
				System.out.println("Enter the New Length");
				stmt6.setInt(1,ob.nextInt());
				//System.out.println("Enter the MovieID No");
				stmt6.setInt(2,val);
				stmt6.executeUpdate();
				break;
			case "Movietype":
				PreparedStatement stmt7=con.prepareStatement("update movie set Movietype=? where Movieid=?");
				System.out.println("Enter the New Movietype");
				stmt7.setString(1,ob.next());
				//System.out.println("Enter the MovieID No");
				stmt7.setInt(2,val);
				stmt7.executeUpdate();
				break;
			case "Productionid":
				PreparedStatement stmt8=con.prepareStatement("update movie set Productionid=? where Movieid=?");
				System.out.println("Enter the New Productionid");
				stmt8.setString(1,ob.next());
				//System.out.println("Enter the MovieID No");
				stmt8.setInt(2,val);
				stmt8.executeUpdate();
				break;
			default:
				break;
			}
		}
		System.out.println("Records updated"); 
	}
}
