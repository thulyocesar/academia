public class Aluno extends Pessoa{
	
	private String nome;
	private String sexo;
	private int matricula;
	private String TipoDeExercicio;

	public Aluno(String nome, String sexo, int matricula, String TipoDeExercicio){
		this.setNome(nome);
		this.setSexo(sexo);
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String toString(){
		return "Aluno: "+this.nome+ "\nSexo: "+this.sexo+ "\nMatricula: "+this.matricula+ "\nTipo de Exercicio: "+this.TipoDeExercicio;
}
}