package semana06;

public class Word02 extends Thread {
String texto = "Apostila de python";
	
	public void run() {
		Impressora.imprimir(texto);
	}

}
