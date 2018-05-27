package com.test.movieportal.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.movieportal.entity.Actors;

@Repository
public class ActorsPortalDaoImpl implements ActorsPortalDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public List<Actors> ListAllActors() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Movie");
		List<Actors> movie = query.list();
		session.close();
		return movie;
	}
	
	
	public void updateActor(Actors actor) {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
		transaction = session.beginTransaction();
		String hql = "update Actors set dob = :dob, sex = :sex, bio = :bio,  where name = :name";
		Query query = session.createQuery(hql);
		//query.setInteger("", movie.getId());
		query.setString("name", actor.getName());
		query.setString("sex", actor.getSex());
		query.setString("bio", actor.getBio());
		query.setDate("dob", actor.getDob());
		query.executeUpdate();
		transaction.commit();
		}
		catch(HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
		}	
	}
	
	public void deleteActor(String name) {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
		transaction = session.beginTransaction();
		String hql = "delete from Actors where name = :name";
		Query query = session.createQuery(hql);
		query.setString("name",name);
		query.executeUpdate();
		
		//Alternate
		/*String hql = "from Employee where ID = :ID";
		Query query = session.createQuery(hql);
		Employee employee = (Employee)query.uniqueResult();
		session.delete(employee);*/
		
		transaction.commit();
		}
		catch(HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}
	
	
	public Actors getActorbyName(String name) {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		Actors actor = new Actors();
		try {
		transaction = session.beginTransaction();	
		Query query = session.createQuery("from Actors where name="+name);
		actor = (Actors)query.uniqueResult();
		transaction.commit();
		
		}
		catch(HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return actor;
	}
}
	

	

