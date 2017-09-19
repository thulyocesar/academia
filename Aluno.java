package br.academia;

public class Aluno extends Pessoa{
	
	private String nome;
	private String sexo;
	private String matricula;

	public Aluno(String nome, String sexo, String matricula){
		this.setNome(nome);
		this.setSexo(sexo);
		this.setMatricula(matricula);
		
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String toString(){
		return "Aluno: "+this.nome+"Sexo: "+this.sexo+"Matricula: "+this.matricula;
	}
}
