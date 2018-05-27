package com.test.movieportal.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.movieportal.entity.Movie;

@Repository
public class MoviePortalDaoImpl implements MoviePortalDao{
	
	@Autowired
	SessionFactory sessionFactory;
	
	public List<Movie> ListAllMovies(){
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Movie");
		List<Movie> movie = query.list();
		session.close();
		return movie;
	}
	
	public void updateMovie(Movie movie) {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
		transaction = session.beginTransaction();
		String hql = "update Movie set year = :year, plot = :plot, image = :image,  where name = :name";
		Query query = session.createQuery(hql);
		//query.setInteger("", movie.getId());
		query.setString("name", movie.getName());
		query.setString("year", movie.getPlot());
		query.setString("plot", movie.getPlot());
		query.setString("image", movie.getImage());
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
	
	public void deleteMovie(String name) {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		try {
		transaction = session.beginTransaction();
		String hql = "delete from Movie where name = :name";
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
	
	public Movie getmoviebyName(String name) {
		Session session = sessionFactory.openSession();
		Transaction transaction = null;
		Movie movie = new Movie();
		try {
		transaction = session.beginTransaction();	
		Query query = session.createQuery("from Movie where name="+name);
		movie = (Movie)query.uniqueResult();
		transaction.commit();
		
		}
		catch(HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return movie;
	}
	
	}
	
	
	

