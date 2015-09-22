package pojo;

import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.Table;

@Entity
@Table(name="msgteste", schema="public")
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="\"id\"")
	private Integer id;
	
	@Column(name="\"nome\"")
	private String nome;
	
	private Disciplina disciplinas;
	
	@Column(name="\"idProfessor\"")
	private Integer idProfessor;

	private Turma turma;
	public String getNome() {
		return nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
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
