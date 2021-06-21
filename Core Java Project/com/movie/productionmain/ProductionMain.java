package com.movie.productionmain;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.movie.moviedao.MovieDao;
import com.movie.moviedetails.Movie;
import com.movie.productiondao.ProductionDao;
import com.movieproduction.details.Production;

public class ProductionMain {

	public static void main(String[] args) throws SQLException, Exception {
		// TODO Auto-generated method stub
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
				System.out.println("Enter Production ID No");
				int pids=s.nextInt();
				ProductionDao obj=new ProductionDao();
				boolean check=obj.presetnornot(pids);
				
				if(check)
				{
					System.out.println("Enter Production ID No");
					int id=s.nextInt();
					System.out.println("Enter Production Name");
					String pname=s.next();
					System.out.println("Enter Address");
					String address=s.next();
					System.out.println("Enter Date Of Staretd YYYY");
					int years=s.nextInt();
					System.out.println("Enter Owner Name");
					String oname=s.next();
					
					Production p = new Production(id,pname,address,years,oname);
					ProductionDao pd=new ProductionDao();
					pd.Insertproduction(p);
				}
				else
				{
					System.out.println("Production ID is Already Present--Try with Different ID");
				}
				break;
			case 2:
				ProductionDao pdd=new ProductionDao();
				List<Production>pi=pdd.getAlldetails();
				for(Production p1:pi)
				{
					System.out.println(p1);
				}
				break;
			case 3:
				System.out.println("Enter Production ID No to delete");
				int val=s.nextInt();
				ProductionDao po=new ProductionDao();
				po.delete(val);
				break;
			case 4:
				System.out.println("Enter Production ID No");
				int pidss=s.nextInt();
				ProductionDao obj1=new ProductionDao();
				boolean check1=obj1.presetnornotU(pidss);
				if(check1)
				{
					System.out.println("Enter Deatils to update");
					System.out.println("1.Productionid,2.Productionname,3.Adress,4.DateofStarted,5.Ownername");
					String dataa=s.next();
					ProductionDao po1=new ProductionDao();
					po1.update(dataa);
				}
				else
				{
					System.out.println("Enter Valid Production ID No");
				}
				
				break;
			case 5:
				System.out.println("Enter ProductionID No");
				int val1=s.nextInt();
				ProductionDao poo=new ProductionDao();
				poo.view(val1);
				break;
			case 6:
				System.exit(1);
			}
		}

	}

}
