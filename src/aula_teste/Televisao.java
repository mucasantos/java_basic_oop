package aula_teste;

public class Televisao extends Eletrodomestico{
	
	Televisao(String _nome, String _modelo){
		super(_nome, _modelo);
	}
		@Override
		public void ligar() {
			System.out.println("Aparelho ligado com o controle remoto!");
		
	}
}

