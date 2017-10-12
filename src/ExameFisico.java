public class ExameFisico {
	
	private double peso, altura, imc, peito, cintura, panturrilhadireita, panturrilhaesquerda, coxadireita, coxaesquerda, bracodireito, bracoesquerdo, antebracodireito, antebracoesquerdo, gluteo;
	
	
	public ExameFisico(double peso, double altura, double imc, double peito, double cintura, double panturrilhadireita, double panturrilhaesquerda, double coxadireita, double coxaesquerda, double bracodireito, double bracoesquerdo, double antebracodireito, double antebracoesquerdo, double gluteo){
		this.peso = peso;
		this.altura = altura;
		this.imc = imc;
		this.peito = peito;
		this.cintura = cintura;
		this.panturrilhadireita = panturrilhadireita;
		this.panturrilhaesquerda = panturrilhaesquerda;
		this.coxadireita = coxadireita;
		this.coxaesquerda = coxaesquerda;
		this.bracodireito = bracodireito;
		this.bracoesquerdo = bracoesquerdo;
		this.antebracodireito = antebracodireito;
		this.antebracoesquerdo = antebracoesquerdo;
		this.gluteo = gluteo;
		
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getImc(double peso, double altura) {
		  double imc=peso / (altura*peso);
		  return imc;
	}


	public void setImc(double imc) {
		this.imc = imc;
	}


	public double getPeito() {
		return peito;
	}


	public void setPeito(double peito) {
		this.peito = peito;
	}


	public double getCintura() {
		return cintura;
	}


	public void setCintura(double cintura) {
		this.cintura = cintura;
	}


	public double getPanturrilhadireita() {
		return panturrilhadireita;
	}


	public void setPanturrilhadireita(double panturrilhadireita) {
		this.panturrilhadireita = panturrilhadireita;
	}


	public double getPanturrilhaesquerda() {
		return panturrilhaesquerda;
	}


	public void setPanturrilhaesquerda(double panturrilhaesquerda) {
		this.panturrilhaesquerda = panturrilhaesquerda;
	}


	public double getCoxadireita() {
		return coxadireita;
	}


	public void setCoxadireita(double coxadireita) {
		this.coxadireita = coxadireita;
	}


	public double getCoxaesquerda() {
		return coxaesquerda;
	}


	public void setCoxaesquerda(double coxaesquerda) {
		this.coxaesquerda = coxaesquerda;
	}


	public double getBracodireito() {
		return bracodireito;
	}


	public void setBracodireito(double bracodireito) {
		this.bracodireito = bracodireito;
	}


	public double getBracoesquerdo() {
		return bracoesquerdo;
	}


	public void setBracoesquerdo(double bracoesquerdo) {
		this.bracoesquerdo = bracoesquerdo;
	}


	public double getAntebracodireito() {
		return antebracodireito;
	}


	public void setAntebracodireito(double antebracodireito) {
		this.antebracodireito = antebracodireito;
	}


	public double getAntebracoesquerdo() {
		return antebracoesquerdo;
	}


	public void setAntebracoesquerdo(double antebracoesquerdo) {
		this.antebracoesquerdo = antebracoesquerdo;
	}


	public double getGluteo() {
		return gluteo;
	}


	public void setGluteo(double gluteo) {
		this.gluteo = gluteo;
	
	
	}

	public String ClassificacaoIMC()
	 {
	 double imc;
	 String classificacao;
	 imc = this.getImc(peso, altura);
	
	 if (imc <= 18.5){
		 classificacao = "Abaixo do Peso"; 
	 }
	 else
	 if (imc <= 25){
		 classificacao = "Peso Normal"; 
	 }
	 else
	 if (imc <= 30){
		 classificacao = "Peso ideal"; 
	 }
	 else
	 if (imc <= 35){
		 classificacao = "Obesidade Leve"; 
	 }
	 else
	 classificacao = "Obesidade";
	 
	 return classificacao;
	 }

	@Override
	public String toString() {
		return "ExameFisico [peso=" + peso + ", altura=" + altura + ", imc=" + imc + ", peito=" + peito + ", cintura="
				+ cintura + ", panturrilhadireita=" + panturrilhadireita + ", panturrilhaesquerda="
				+ panturrilhaesquerda + ", coxadireita=" + coxadireita + ", coxaesquerda=" + coxaesquerda
				+ ", bracodireito=" + bracodireito + ", bracoesquerdo=" + bracoesquerdo + ", antebracodireito="
				+ antebracodireito + ", antebracoesquerdo=" + antebracoesquerdo + ", gluteo=" + gluteo + "]";
	}
}