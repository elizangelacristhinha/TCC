package pojo;

public class Professor {
	private String nome;
	private Disciplina disciplinas;
	private Turma turma;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Disciplina getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(Disciplina disciplinas) {
		this.disciplinas = disciplinas;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
}
