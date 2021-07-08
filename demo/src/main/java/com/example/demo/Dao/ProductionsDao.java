package com.example.demo.Dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Productions;

@Repository
public class ProductionsDao  {
        @Autowired
        private SessionFactory sf;
        
        public boolean insertProduction(Productions p) {
        	boolean b=false;
        	Session s=null;
        	try {
        		s=sf.openSession();
        		s.beginTransaction();
        		s.save(p);
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
   
		public List<Productions> getAllProduction(){
        	Session session=sf.openSession();
        	session.beginTransaction();
        	org.hibernate.Query query= session.createQuery("from Productions");
        	@SuppressWarnings("unchecked")
        	List<Productions> li=query.getResultList();
        	session.getTransaction().commit();
        	//sf.close();
        	return  li;
        }
        public Productions getProductionById(int id ) {
        	Session sess=sf.openSession();
        	sess.beginTransaction();
        	Productions p=sess.get(Productions.class, id);
        	sess.getTransaction().commit();
        	return p;
        	
        }
        public boolean updateProduction(Productions p) {
        	boolean b=false;
        	Session s=null;
        	try {
        		s=sf.openSession();
        		s.beginTransaction();
        		//s.saveOrUpdate(p);
        		s.update(p);
        		
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

	
}