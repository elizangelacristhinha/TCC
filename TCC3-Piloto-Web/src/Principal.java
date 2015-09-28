import dao.GenericoDAO;
import pojo.Disciplina;
import pojo.Professor;
import pojo.TesteBanco;
import pojo.Turma;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("----------Teste com DAO----------");
		Professor professor = new Professor();
		professor.setId(6);
		professor.setNome("Márcio");
		professor.setSobrenome("Renan");
		professor.setEndereco("Rua: kkkk numero 100");
		professor.setIdProfessor(0);
		
		GenericoDAO dao=new GenericoDAO();
		
		try {
			dao.remove(professor);
			//dao.saveOrUpdate(professor);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-------------OK-------------------");
	}

}
