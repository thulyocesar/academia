import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class SistemaAcademia {

	private static List<Aluno> alunos = new ArrayList<Aluno>();;
	private Object nome;
	private Object matricula;
	

	public SistemaAcademia() {
		
	}
			
	public void cadastrarAluno(String nome, int matricula, String TipoDeExercicio)
			throws AlunoInexistenteException {
	
		for (Aluno a : this.alunos) {
			if (a.getMatricula() == (matricula)) {
				throw new AlunoInexistenteException("J� existe aluno com essa matricula: " + matricula);
			}
		}
		Aluno a = new Aluno(nome, matricula, TipoDeExercicio);
		this.alunos.add(a);

	}

	public String alunosMatriculados() {
		String alunos = "";
		if (this.alunos.size() == 0) {
			return null;
		} else {

			for (Aluno a : this.alunos) {
				alunos += a.toString() + "\n";
			}
		}
		return alunos;

	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}


}