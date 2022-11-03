package aula_teste;

import java.util.Date;


public class main {

	public static void main(String[] args) {
		
		
		//Classe instanciada

		Carro meuCarro = new Carro("Honda", "HR-V", "vermelho", 0156);
		
		//Mudou a marca do carr
		
		
		System.out.println(meuCarro.getMarca());
		
		meuCarro.setMarcaModelo("Fiat", "uno");
		
		System.out.println(meuCarro.getMarca());
		Date date = new Date();
		
		Professor novaPessoa = new Professor("SAmuel", "Mobile", date, 0, "Matematica");
		
		System.out.println(novaPessoa.disciplina);
		
		Televisao tv = new Televisao("Brast", "Samsung");
		
		tv.desligar();
		tv.ligar();
		
		Geladeira gela = new Geladeira("Nova" , "Brastemp");
		
		gela.ligar();
		gela.desligar();

		
	}

}


