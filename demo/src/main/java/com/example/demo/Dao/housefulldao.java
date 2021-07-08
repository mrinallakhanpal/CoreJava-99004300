package com.example.demo.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.housefull;
@Service
public class housefulldao {
	 @Autowired
     private SessionFactory sf;
	 
	 public boolean inserthousefullmovie(housefull m) {
     	boolean b=false;
     	Session s=null;
     	try {
     		s=sf.openSession();
     		s.beginTransaction();
     		s.save(m);
     	s.getTransaction().commit();
     	}
     	catch (Exception e) {
     		System.out.println("error" +e);
     		b=true;
     	}
     	finally {
     		//sf.close();
     	}
     	
     	return b;
     }
	 
	 public List<housefull> getAllMovies(){
	    	Session session=sf.openSession();
	    	session.beginTransaction();
	    	Query query= session.createQuery("from housefull");
	    	@SuppressWarnings("unchecked")
			List<housefull> li= query.getResultList();
	    	session.getTransaction().commit();
	    	//sf.close();
	    	return  li;
	    }
		
}
