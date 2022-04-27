package semana06;

public class Windows {

	public static void main(String[] args) {
		//Impressora.imprimir("Hoje é sexta-feira");
		
		Word01 w01= new Word01();
		Word02 w02= new Word02();
		
		w01.start();// inicia a thread Word01
		w02.start();// inicia a thread Word02
	}

}
