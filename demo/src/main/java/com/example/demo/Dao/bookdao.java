package com.example.demo.Dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Movie;
import com.example.demo.model.book;




@Service
public class bookdao {
	 @Autowired
     private SessionFactory sf;
	 
	 public boolean insertbooking(book bo) {
		 System.out.println("entered insert");
     	boolean b=false;
     	Session s=null;
     	try {
     		 System.out.println("entered try");
     		s=sf.openSession();
     		s.beginTransaction();
     		s.save(bo);
     	s.getTransaction().commit();
     	 System.out.println("commit done");
     	}
     	catch (Exception e) {
     		 System.out.println("exception block");
     		System.out.println("error" +e);
     		b=true;
     	}
     	finally {
     		//sf.close();
     		 System.out.println("finally block");
     	}
     	
     	return b;
     }
	 
	 
	 public List<book> getAllbookedMovies(){
	    	Session session=sf.openSession();
	    	session.beginTransaction();
	    	Query query= session.createQuery("from book");
	    	@SuppressWarnings("unchecked")
			List<book> li= query.getResultList();
	    	session.getTransaction().commit();
	    	//sf.close();
	    	return  li;
	    }
	 
	
	public List<book> getcondition(book b){
		 Session session =sf.openSession();
		 session.beginTransaction();
		// Query query=session.createQuery(" from book where date=\""+b.getDate()+"\" and showtype=\""+b.getShow() +"\";");
		 //Query  (value = "SELECT * FROM todos t WHERE t.title = 'title'",
		           // nativeQuery=true
		    //)
		 Query q=session.createSQLQuery("select * from book where date=\"" +b.getDate()+ "\"  and showtype=\"" + b.getShow() + "\";" );
		 List<book> li=q.getResultList();
		 session.getTransaction().commit();
		 return li;
		 
		 
	 }
	 
}

