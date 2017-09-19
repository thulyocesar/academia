package br.academia;

import javax.swing.JOptionPane;

public class TestaAcademia {

	public static void main(String[] args) {
		
		SistemaAcademia sistema = new SistemaAcademia();
		
		boolean sair = false;
		
		while(!sair){
			String opcao = JOptionPane.showInputDialog("1.Cadastrar aluno\n2.Listar alunos matriculados\n3.Sair");
			if(opcao.equals("1")){
				String nome = JOptionPane.showInputDialog("Digite o nome do aluno.");
				String sexo = JOptionPane.showInputDialog("Digite o sexo do aluno.");
				String matricula = JOptionPane.showInputDialog("Digite a matricula do aluno.");
				try {
					sistema.cadastrarAluno(nome, sexo, matricula);
				} catch (AlunoInexistenteException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
			}else if(opcao.equals("2")){
				sistema.alunosMatriculados();
			}else{
				sair = true;
			}
		}

	}

}
