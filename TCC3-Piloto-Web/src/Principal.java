import pojo.Disciplina;
import pojo.Professor;
import pojo.TesteBanco;
import pojo.Turma;

public class Principal {

	public static void main(String[] args) {
		
		TesteBanco teste = new TesteBanco();
		
		teste.teste();
		
		// TODO Auto-generated method stub
		//**cadastro de professor
		Professor professor = new Professor();
		Disciplina disciplina = new Disciplina();
		Turma turma = new Turma();
		
		professor.setNome("Elizangela C. Silva");
		disciplina.setNome("Lógica");
		turma.setId(1);
		turma.setNome("1");
		turma.setSituacao("Aberta");	
		professor.setDisciplinas(disciplina);
		professor.setTurma(turma);
			
		System.out.println("----------Dados Escola ----------");
		
		System.out.println("Nome Professor:     " + professor.getNome());
		System.out.println("Disciplina:         " + professor.getDisciplinas().getNome());
		System.out.println("Nome turma:         " + professor.getTurma().getNome());
		System.out.println("Turma Situação:     " + professor.getTurma().getSituacao());
	}

}
