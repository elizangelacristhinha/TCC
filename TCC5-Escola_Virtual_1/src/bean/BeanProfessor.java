package bean;
import java.io.Serializable;

import dao.GenericoDAO;
import model.*;
import java.util.*;

public class BeanProfessor implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Professor professor;
    private GenericoDAO dao;
    
    private ArrayList<Materia> materias;
    private ArrayList<Materia> materiasSelecionadas;
    private Materia materia;
    
	public BeanProfessor() {
		setProfessor(new Professor());
		dao = new GenericoDAO();
		materias = new ArrayList<Materia>();
		materia = new Materia();
		materiasSelecionadas = new ArrayList<Materia>();
		
		this.list();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Materia> getMateriasSelecionadas() {
		return materiasSelecionadas;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public void setMateriasSelecionadas(ArrayList<Materia> materiasSelecionadas) {
		this.materiasSelecionadas = materiasSelecionadas;
	}

	public void salvarProfessor(){
		System.out.println("nome: " + professor.getNome());
		System.out.println("Sobrenome: " + professor.getSobrenome());
		System.out.println("Usuário: " + professor.getUsuario());
		System.out.println("Senha: " + professor.getSenha());
		try {
			dao.saveOrUpdate(professor);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		professor = new Professor();
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
    public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;
	}

	public void list(){
		Materia mat = new Materia();
		materias = (ArrayList<Materia>) GenericoDAO.findAll(mat.getClass());
		return;
    }

	public void adicionarMateriaSelecionada(Materia materia){
		this.materiasSelecionadas.add(materia);
	}
	
	public void adicionarMateria(){
		System.out.println("entrou");

		materiasSelecionadas.add(this.materia);
		for(int x=0; x<materiasSelecionadas.size(); x++){
			System.out.println(x + "mat sel: "+materiasSelecionadas.get(x).getNome());
		}
		return;
	}
}
