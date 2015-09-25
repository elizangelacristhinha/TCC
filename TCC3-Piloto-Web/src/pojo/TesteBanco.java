package pojo;

import java.util.ArrayList;
import java.util.List; 

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.SessionFactory; 
import org.hibernate.cfg.Configuration; 


public class TesteBanco { 
	public TesteBanco() { } 
	
	public void teste() { 
		ArrayList<Professor> list= null; 
		SessionFactory sessions = new Configuration().configure().buildSessionFactory(); 
		Session session = sessions.openSession();
		
			try { 
				
				session.beginTransaction(); 
				list = (ArrayList<Professor>) session.createQuery("select prof.nome, prof.sobrenome from Professor prof").list(); 
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
