package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Professor;

public class GenericoDAO {

	public void saveOrUpdate(Object object) throws Exception {
		SessionFactory sessions = new Configuration().configure().buildSessionFactory(); 
		Session session = sessions.openSession();
		Object idProfessor = new Object();
		Professor professor = new Professor();
		/*Regra de negócio
		 * Quando for professor: ver se o campo cpf é diferente se for acrescentar 1 do último
		 * id do professor * 
		 * */	
		try {
			session.beginTransaction();
			idProfessor = session.createSQLQuery("select max(idProfessor) from Professor professor").uniqueResult();
			/*
			professor = (Professor) object;
			if(idProfessor.equals(professor.getIdProfessor())){
				System.out.println("igual");
			}
			else
			{
				System.out.println("diferente");
			}
			System.out.println("idProfessor: " + idProfessor);
			*/
			session.merge(object);
			session.getTransaction().commit();
		} catch ( HibernateException e ) { 
			if ( session.getTransaction() != null ) 
				 session.getTransaction().rollback();
			e.printStackTrace();
		} finally { 
			session.close(); 
			} 
	}

	public void saveOrUpdateAll(ArrayList<Object> list) throws Exception {
		SessionFactory sessions = new Configuration().configure().buildSessionFactory(); 
		Session session = sessions.openSession();
	
		try {
			session.beginTransaction();
			 for (Object o : list) {
				 session.merge(o);
				   }
			session.getTransaction().commit();
		} catch ( HibernateException e ) { 
			if ( session.getTransaction() != null ) 
				 session.getTransaction().rollback();
			e.printStackTrace();
		} finally { 
			session.close(); 
			} 
	}
	
	public void remove(Object object) throws Exception {

		SessionFactory sessions = new Configuration().configure().buildSessionFactory(); 
		Session session = sessions.openSession();
		
		try {
			session.beginTransaction();
			session.delete(object);
			session.getTransaction().commit();
		} catch ( HibernateException e ) { 
			if ( session.getTransaction() != null ) 
				 session.getTransaction().rollback();
			e.printStackTrace();
		} finally { 
			session.close(); 
			} 
 }	
	
	public void removeOrUpdateAll(ArrayList<Object> list) throws Exception {
		SessionFactory sessions = new Configuration().configure().buildSessionFactory(); 
		Session session = sessions.openSession();
	
		try {
			session.beginTransaction();
			 for (Object o : list) {
				 session.delete(o);
				   }
			session.getTransaction().commit();
		} catch ( HibernateException e ) { 
			if ( session.getTransaction() != null ) 
				 session.getTransaction().rollback();
			e.printStackTrace();
		} finally { 
			session.close(); 
			} 
	}
	
	@SuppressWarnings("unchecked")
	public static List findAll(Class classe) {
	  SessionFactory sessions = new Configuration().configure().buildSessionFactory(); 
	  Session session = sessions.openSession();


	  Query query = session.createQuery("Select a from " + classe.getName() + " a");
	  System.out.println(query.getQueryString());
	  
	  return query.list();
	 }

	 
}
	