package orientacaoObjeto;

public abstract class Animal implements Palatavel, Respiravel, Vivente{
	protected Float altura;
	protected Float tamanho;
	protected String peso;
	protected Integer idade;
	protected String especie;
	protected String cor;
	
	public Float getAltura() {
		if(altura ==null){
			setAltura(1f);
		}
		return altura;
	}
	public Float getAltura(Float f) {
		if(altura ==null){
			setAltura(1f);
		}
		return altura;
	}
	public Float getAltura(Double f) {
		if(altura ==null){
			setAltura(1f);
		}
		return altura;
	}
	public void getAlt(String f, Integer i){
		
	}	
	public void setAltura(Float altura) {
		this.altura = altura;
	}
	public Float getTamanho() {
		if(tamanho ==null){
			setTamanho(1f);
		}
		return tamanho;
	}
	public void setTamanho(Float tamanho) {
		this.tamanho = tamanho;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

}
