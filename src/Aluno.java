public class Aluno extends Pessoa{
	
	private String nome;
	private int matricula;
	private String TipoDeExercicio;

	public Aluno(String nome, int matricula, String TipoDeExercicio){
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setTipoDeExercicio(TipoDeExercicio);

	}

	public String getTipoDeExercicio() {
		return TipoDeExercicio;
	}

	public void setTipoDeExercicio(String tipoDeExercicio) {
		TipoDeExercicio = tipoDeExercicio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String toString(){
		return "Aluno: "+this.nome+ " Matricula: "+this.matricula+ " Tipo de Exercicio: "+this.TipoDeExercicio;
}
}