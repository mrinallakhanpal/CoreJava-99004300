package com.example.demo.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Productions;
import com.example.demo.model.userdetails;



@Service
public class userdetailsdao {
	 @Autowired
     private SessionFactory sf;
	 
	 public boolean insertuser(userdetails bo) {
     	boolean b=false;
     	Session s=null;
     	try {
     		s=sf.openSession();
     		s.beginTransaction();
     		s.save(bo);
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
	 
	 public List<userdetails> getAlluser(){
     	Session session=sf.openSession();
     	session.beginTransaction();
     	org.hibernate.Query query= session.createQuery("from userdetails");
     	@SuppressWarnings("unchecked")
     	List<userdetails> li=query.getResultList();
     	session.getTransaction().commit();
     	//sf.close();
     	return  li;
     }
}
