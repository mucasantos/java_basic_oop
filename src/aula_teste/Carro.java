package aula_teste;

public class Carro {

	// Atributos

	private String marca;
	private String modelo;
	String cor;
	int anoFabricacao;
	

	Carro(String marca, String modelo, String cor, int anoFabricacao) {
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
		this.modelo = modelo;
		this.marca = marca;
		
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarcaModelo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	// Métodos

	public void acelerar() {
		// Código para acelerar
	}

	public void frear() {
	}

	public void marchaRe() {
		// Códigos

	}

	public void andar() {
		// Códigos
	}
}
