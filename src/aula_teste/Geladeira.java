package aula_teste;


public class Geladeira extends Eletrodomestico{
	
	Geladeira(String _nome, String _modelo){
		super(_nome, _modelo);
	}
		@Override
		public void ligar() {
			System.out.println("Aparelho ligada na tomada direto!");
		
	}

}
