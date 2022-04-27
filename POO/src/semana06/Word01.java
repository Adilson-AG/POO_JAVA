package semana06;

public class Word01 extends Thread {
	
	String texto = "Apostila de java";
	
	public void run() {
		Impressora.imprimir(texto);
	}

}
