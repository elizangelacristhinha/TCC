package testes;

import java.awt.List;
import java.util.ArrayList;

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
		professor.setNome("M�rcio");
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
		professor.setNome("M�rcio");
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

	@Test
	public void listAll() {
		ArrayList<Professor> res = new ArrayList<Professor>();
		Professor prof = new Professor();
		
		res = (ArrayList<Professor>) GenericoDAO.findAll(prof.getClass());
		for(int x=0; x<res.size(); x++){
			System.out.println(x + ": "+res.get(x).getNome());
		}
		System.out.println("---List ALL OK-------------------");
	}
	
	
	@Test
	public void saveOrUpdateAll() {
		ArrayList<Object> res = new ArrayList<Object>();

		System.out.println("----------Professor----------");
		Professor professor = new Professor();
		professor.setId(9);
		professor.setNome("AAAAA");
		professor.setSobrenome("Renan");
		professor.setEndereco("Rua: kkkk numero 100");
		professor.setIdProfessor(3);
		professor.setCpf("44236572878");
	
		res.add(professor);
		try {
			dao.saveOrUpdateAll(res);
		} catch (Exception e) {
			System.out.println("---Save or Update All OK-------------------");
			e.printStackTrace();
		}
	}
	
	@Test
	public void removeOrUpdateAll() {
		ArrayList<Object> res = new ArrayList<Object>();

		System.out.println("----------Professor----------");
		Professor professor = new Professor();
		professor.setId(2);
		professor.setNome("AAAAA");
		professor.setSobrenome("Renan");
		professor.setEndereco("Rua: kkkk numero 100");
		professor.setIdProfessor(3);
		professor.setCpf("44236572878");
	
		res.add(professor);
		try {
			dao.removeOrUpdateAll(res);
		} catch (Exception e) {
			System.out.println("---Save or Remove All OK-------------------");
			e.printStackTrace();
		}
	}
}
