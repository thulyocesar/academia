package br.academia;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class SistemaAcademia {
	
	private List<Aluno> alunos;
	
	public SistemaAcademia(){
		this.alunos = new ArrayList<Aluno>();
	}
	
	public void cadastrarAluno(String nome, String sexo, String matricula)throws AlunoInexistenteException {
		for(Aluno a:this.alunos){
			if(a.getMatricula().equals(matricula)){
				throw new AlunoInexistenteException("Já existe aluno com essa matricula: "+matricula);
			}
		}
		Aluno a = new Aluno(nome, sexo, matricula);
		this.alunos.add(a);
		
	}
	
	public void alunosMatriculados(){
		JOptionPane.showMessageDialog(null, this.alunos.toString());
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}
