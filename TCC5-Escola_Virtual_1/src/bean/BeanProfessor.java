package bean;
import java.io.Serializable;

import javax.faces.event.ActionEvent;

import dao.GenericoDAO;
import model.*;

public class BeanProfessor implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Professor professor;
    private GenericoDAO dao;
	public BeanProfessor() {
		setProfessor(new Professor());
		dao = new GenericoDAO();
		// TODO Auto-generated constructor stub
	}

	public void salvar(){
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
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
