import modelo.Disciplina;
import modelo.Professor;
import modelo.Turma;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//**cadastro de professor
		Professor professor = new Professor();
		Disciplina disciplina = new Disciplina();
		Turma turma = new Turma();
		
		professor.setNome("Elizafngela C. Silva");
		disciplina.setNome("L�gica");
		//turma.setId(1);
		turma.setNome("1");
		turma.setSituacao("Aberta");	
		professor.setDisciplinas(disciplina);
		professor.setTurma(turma);
			
		System.out.println("----------Dados Escola ----------");
		
		System.out.println("Nome Professor:     " + professor.getNome());
		System.out.println("Disciplina:         " + professor.getDisciplinas().getNome());
		System.out.println("Nome turma:         " + professor.getTurma().getNome());
		System.out.println("Turma Situa��o:     " + professor.getTurma().getSituacao());
	}

}
