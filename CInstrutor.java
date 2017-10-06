public class CInstrutor extends Pessoa{
	
	private String nome;
	private String formacao;
	
	public CInstrutor(String nome, String formacao){
		this.setNome(nome);
		this.setFormacao(formacao);
}
	public String toString(){
		return "Instrutor: "+this.nome+ "\nFormação: "+this.formacao;
}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
}