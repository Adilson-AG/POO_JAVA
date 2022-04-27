package semana03;

public class While01 {

	public static void main(String[] args) throws InterruptedException {
		// inicialização da variavel de controle
		int a=0;

		while(a<=10) {
			System.out.println(a + " ");
			// incremeto da variavel
			a++;
			Thread.sleep(500);
		}
		a=10;
		while(a>=0) {
			System.out.println(a + " ");
			// incremeto da variavel
			a--;
			Thread.sleep(500);
		}

	}

}
