package testes;

import org.junit.Test;

import dao.GenericoDAO;
import pojo.Professor;

public class TestCaseDAO {
	private GenericoDAO dao = new GenericoDAO();
	
	@Test
	public void test() {
		System.out.println("ok");
	}
	
	@Test
	public void saveOrUpdate() {
		System.out.println("----------Professor----------");
		Professor professor = new Professor();
		professor.setId(6);
		professor.setNome("Márcio");
		professor.setSobrenome("Renan");
		professor.setEndereco("Rua: kkkk numero 100");
		professor.setIdProfessor(3);
		professor.setCpf("44236572877");
		try {
			dao.saveOrUpdate(professor);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("---UPDATE OK-------------------");
	}

	@Test
	public void remove() {
		System.out.println("----------Professor----------");
		Professor professor = new Professor();
		professor.setId(7);
		professor.setNome("Márcio");
		professor.setSobrenome("Renan");
		professor.setEndereco("Rua: kkkk numero 100");
		professor.setIdProfessor(3);
		professor.setCpf("44236572877");
		try {
			dao.remove(professor);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("---DELETE OK-------------------");
	}

}
