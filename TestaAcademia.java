import javax.swing.JOptionPane;

public class TestaAcademia {

	public static void main(String[] args) {
		
		SistemaAcademia sistema = new SistemaAcademia();
		
		boolean sair = false;
		
		while(!sair){
			String opcao = JOptionPane.showInputDialog("1.Cadastrar aluno\n2.Listar alunos matriculados\n3.Cadastrar Instrutor\n4.Exame Físico\n5.Turmas\n6.Sair");
			if(opcao.equals("1")){
				String nome = JOptionPane.showInputDialog("Digite o nome do aluno.");
				String sexo = JOptionPane.showInputDialog("Digite o sexo do aluno.");
				int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula do aluno."));
				String TipoDeExercicio = JOptionPane.showInputDialog("Digite o tipo de exercicio pretendido pelo aluno.");
				try {
					sistema.cadastrarAluno(nome, sexo, matricula, TipoDeExercicio);
				} catch (AlunoInexistenteException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
			}else if(opcao.equals("2")){
				String encontrados = sistema.alunosMatriculados();
				JOptionPane.showMessageDialog(null, encontrados);
				}
			else if(opcao.equals("3")){
					String nome = JOptionPane.showInputDialog("Digite o nome do instrutor.");
					String formacao = JOptionPane.showInputDialog("Digite a formação.");
			}
			else if(opcao.equals("4")){
					String peso = JOptionPane.showInputDialog("Qual o peso do aluno.");
					String altura = JOptionPane.showInputDialog("Qual a altura do aluno.");
						
			}else{
				sair = true;
			}
		}

	}

}