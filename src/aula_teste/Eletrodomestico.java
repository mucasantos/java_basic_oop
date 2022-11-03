package aula_teste;

public class Eletrodomestico {
	String nome;
	String modelo;
	
	Eletrodomestico(String nome, String modelo) {
		this.modelo = modelo;
		this.nome = nome;
	}
	
	public void ligar() {
		System.out.println("Aparelho ligado");
	}
	
	public void desligar() {
		System.out.println("Aparelho desligado");
	}

}


