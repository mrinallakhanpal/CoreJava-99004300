package com.ltts.demoSpring.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltts.demoSpring.model.Production;


@Repository
public class ProductionDao{
	
	@Autowired
	 SessionFactory sf;
	
	public boolean insertPlayer(Production p) {
		//Hibernate based Code or Spring DataJPA
		//MyCodes are here
		boolean b=false;
		Session s=null;
		try {
			s=sf.openSession();
			s.beginTransaction();
			
			s.save(p);
			//s.persist(p);
			//System.out.println(st);
			s.getTransaction().commit();
			
		}
		catch(Exception e) {
			System.out.println("Exception "+e);
			b=true;
		}
		finally {
			
			sf.close();
		}
		
		return b;
	}
	
	public List<Production> getAllPlayers(){
		Session session=sf.openSession();
        session.beginTransaction();
        
       // List<Player> li=sf.openSession().createCriteria(Player.class).list();
       // List<Player> li=session.createCriteria(Player.class).list();
       // List<Player> li=session.
        Query<Production> query = session.createQuery("from Production");
        List<Production> li=query.getResultList();
        session.getTransaction().commit();
        //sf.close();
		return li;
	}
	
	public Production getPlayerById(int id) {
		Session sess=sf.openSession();
		sess.beginTransaction();
		Production p=sess.get(Production.class, id);
		System.out.println("Inside DAO: "+p);
		 sess.getTransaction().commit();
		 return p;
		 
		
	}
	
	public boolean updatePlayer(Production p) {
		//Hibernate based Code or Spring DataJPA
		//MyCodes are here
		boolean b=false;
		Session s=null;
		try {
			s=sf.openSession();
			s.beginTransaction();
			
			//s.saveOrUpdate(p);
			s.update(p);
			//s.merge(s);
			
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
	
	public List<Production> getAllPlayersByTeamAndRuns(int tno,int runs)
	{
		List<Production> li=null;
		Session sess=sf.openSession();
		sess.beginTransaction();
		Criteria c=sess.createCriteria(Production.class);
		
		Criterion teamno = Restrictions.eq("ProductionID", tno);
		Criterion run = Restrictions.gt("totalRuns",runs);
		LogicalExpression le=Restrictions.and(teamno, run);
		c.add(le);
		li=c.list();
		return li;
	}

}
