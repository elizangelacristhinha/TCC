package pojo;

import java.util.List; 

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.SessionFactory; 
import org.hibernate.cfg.Configuration; 


public class TesteBanco { 
	public TesteBanco() { } 
	
	public void teste() { 
		List<Professor> list= null; 
		SessionFactory sessions = new Configuration().configure().buildSessionFactory(); 
		Session session = sessions.openSession();
		
			try { 
				
				session.beginTransaction(); 
				list = session.createQuery("select prf from Professor msg").list(); 
				session.getTransaction().commit();
				System.out.println("aki"); 
				for (Professor msg : list) { 
					System.out.println(msg.getNome()); 
					} 
				} catch ( HibernateException e ) { 
					if ( session.getTransaction() != null ) 
						 session.getTransaction().rollback();
					e.printStackTrace();
				} finally { 
					session.close(); 
					} 
			} 
}
