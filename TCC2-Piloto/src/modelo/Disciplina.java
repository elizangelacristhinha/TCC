package modelo;

public class Disciplina {
     private String nome;  
     private Professor professores;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Professor getProfessores() {
		return professores;
	}
	public void setProfessores(Professor professores) {
		this.professores = professores;
	}
     
}
