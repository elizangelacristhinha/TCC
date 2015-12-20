package testes;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;

import dao.GenericoDAO;
import model.Materia;
import model.Professor;

public class TestCaseDAO {
	private GenericoDAO dao = new GenericoDAO();
	
	@Test
	public void test() {
		System.out.println("ok");
	}
	
	
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

	@Test
	public void listAll() {
		ArrayList<Materia> res = new ArrayList<Materia>();
		Materia mat = new Materia();
		
		res = (ArrayList<Materia>) GenericoDAO.findAll(mat.getClass());
		for(int x=0; x<res.size(); x++){
			System.out.println(x + ": "+res.get(x).getNome());
		}
		
		System.out.println("---List ALL OK-------------------"+res.size());
	}
	
	
	
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
