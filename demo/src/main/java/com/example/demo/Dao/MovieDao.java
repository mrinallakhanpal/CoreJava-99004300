package com.example.demo.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Conjunction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Movie;
import com.example.demo.model.Productions;



@Service
public class MovieDao {
	 @Autowired
     private SessionFactory sf;
	 
	 public boolean insertmovie(Movie m) {
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
	public Movie getMovieById(int id) {
		
	        	Session sess=sf.openSession();
	        	sess.beginTransaction();
	        	Movie m=sess.get(Movie.class, id);
	        	sess.getTransaction().commit();
	        	return m;
	        	
	        
	}
	@SuppressWarnings("deprecation")
	@Transactional
	public void deletemoviebyId(int id) {
		boolean b=true;
		try {
			String hql = "DELETE  Movie "  + 
	             "WHERE Movieid = :id";
		Session sess=sf.openSession();
	Query query = sess.createQuery(hql);
	query.setParameter("id", id);
	 int i=query.executeUpdate();
	 if(i>0) {
		 System.out.println("Expensive products was removed");
	 }
	
	}
		catch(Exception e) {
			System.out.println(e);
			b=true;
		}
		finally {
			
		}
		//return b;
	}
	
	public Movie getMovieByName(String name) {
		System.out.println("inside");
    	Session sess=sf.openSession();
    	System.out.println("open");
    	sess.beginTransaction();
    	//Movie m=sess.get(Movie.class, name);
    	Movie m1=(Movie) sess.getEnabledFilter(name);
    	System.out.println("tran"+m1);
    	sess.getTransaction().commit();
    	return m1;
    	
    
}
	public List<Movie> getAllMovies(){
    	Session session=sf.openSession();
    	session.beginTransaction();
    	Query query= session.createQuery("from Movie");
    	@SuppressWarnings("unchecked")
		List<Movie> li= query.getResultList();
    	session.getTransaction().commit();
    	//sf.close();
    	return  li;
    }
	
	public boolean updatemovie(Movie m) {
     	boolean b=false;
     	Session s=null;
     	try {
     		s=sf.openSession();
     		s.beginTransaction();
     		s.update(m);
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
	
	public List<Movie> getAllmoviebymid(int mid,String Lang){
		List<Movie> ml=null;
		Session sess=sf.openSession();
		sess.beginTransaction();
		Criteria c=sess.createCriteria(Movie.class);
		Criterion movieid=Restrictions.eq("movieid", mid);
		//Criterion lang=Restrictions.eq("lang", lang);
		Conjunction le=Restrictions.and(movieid);
		c.add(le);
		ml=c.list();
		return ml;
	}

	
}

