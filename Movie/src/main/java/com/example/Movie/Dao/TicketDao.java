package com.example.Movie.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Movie.Ticket.Ticket;

@Repository
public class TicketDao {
	
	@Autowired
	private SessionFactory sf;
	
	public boolean insertdata(Ticket m) {
		// TODO Auto-generated method stub
		boolean b=false;
		Session s=null;
		try {
			s=sf.openSession();
			s.beginTransaction();
			
			s.save(m);
			//System.out.println(st);
			s.getTransaction().commit();
			
		}
		catch(Exception e) {
			System.out.println("Exception "+e);
			b=true;
		}
		finally {
			//sf.close();
		}
		
		return b;
	}

	public List<Ticket> getAllPlayers() {
		Session session=sf.openSession();
        session.beginTransaction();
        
        List<Ticket> li=sf.openSession().createCriteria(Ticket.class).list();
        //List<ProductsModel> product=sessionFactory.openSession().createCriteria(ProductsModel.class).list();
        
        session.getTransaction().commit();
     
		return li;
	}

}
