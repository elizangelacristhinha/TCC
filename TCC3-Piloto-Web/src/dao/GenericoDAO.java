package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GenericoDAO {

	public void saveOrUpdate(Object object) throws Exception {
		SessionFactory sessions = new Configuration().configure().buildSessionFactory(); 
		Session session = sessions.openSession();
		/*Regra de negócio
		 * Quando for professor: ver se o campo cpf é diferente se for acrescentar 1 do último
		 * id do professor * 
		 * */	
		try {
			session.beginTransaction();
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
}
	