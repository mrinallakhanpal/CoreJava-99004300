package com.movie.moviemain;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.movie.moviedao.MovieDao;
import com.movie.moviedetails.Movie;

public class MovieMain {

	public static void main(String[] args) throws SQLException {
		Scanner s=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.Insert");
			System.out.println("2.ViewAll");
			System.out.println("3.Delete");
			System.out.println("4.Update");
			System.out.println("5.ViewById");
			System.out.println("6.Exit");
			
			int data=s.nextInt();
			switch(data)
			{
			case 1:
				System.out.println("Enter Movie ID");
				int id=s.nextInt();
				System.out.println("Enter Movie Name");
				String mname=s.next();
				System.out.println("Enter Hero Name");
				String hname=s.next();
				System.out.println("Enter Heroine Name");
				String hnname=s.next();
				System.out.println("Enter Release Date");
				String date=s.next();
				System.out.println("Enter Language");
				String lan=s.next();
				
				System.out.println("Enter Length");
				int len=s.nextInt();
				
				System.out.println("Enter Movie Type");
				String mtype=s.next();
				
				System.out.println("Enter ProductionId");
				int pid=s.nextInt();
				
				Movie m=new Movie(id,mname,hname,hnname,date,lan,len,mtype,pid);
				
				MovieDao md=new MovieDao();
				md.InsertMovie(m);
				
			break;
			case 2:
				MovieDao mdd=new MovieDao();
				List<Movie>mi=mdd.getAllDetails();
				for(Movie pi:mi)
				{
					System.out.println(pi);
				}
				break;
			case 3:
				System.out.println("Enter Movie ID No to delete");
				int val=s.nextInt();
				MovieDao po=new MovieDao();
				po.delete(val);
				break;
			case 4:
				System.out.println("Enter Deatils to update");
				System.out.println("1.Movieid,2.Moviename,3.Heroname,4.Heroine,5.Releasedate,6.Language,7.Length,8.Movietype,9.Productionid");
				String dataa=s.next();
				MovieDao po1=new MovieDao();
				po1.update(dataa);
				
				break;
			case 5:
				System.out.println("Enter MovieId No");
				int val1=s.nextInt();
				MovieDao poo=new MovieDao();
				poo.view(val1);
				break;
			case 6:
				System.exit(1);;
			}
		}

	}

}
