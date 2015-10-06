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
		List<Professor> list= null; 
		list = new ArrayList<Professor>();
		
		SessionFactory sessions = new Configuration().configure().buildSessionFactory(); 
		Session session = sessions.openSession();
		
			try { 
				session.beginTransaction(); 
				list = (ArrayList<Professor>) session.createQuery("from Professor prof").list();
				session.getTransaction().commit();
				for (Professor msg : list) { 
					System.out.println("id " + msg.getId() + "| prof " + msg.getIdProfessor()+"|sobre " + msg.getSobrenome() +"|end " + msg.getEndereco()+"|nome" + msg.getNome());
					System.out.println("---------------------");
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
