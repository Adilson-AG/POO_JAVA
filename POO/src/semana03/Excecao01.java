package semana03;

import javax.swing.JOptionPane;

public class Excecao01 {

	public static void main(String[] args) {

		String[] meses = {"jan", "fev"};
		try {
			int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro"));

			System.out.println(meses[a]); 
			int conta =10/a;
		}
		/*catch(NumberFormatException e) {
			System.out.println(e);	
		}*/
		/*catch(ArithmeticException e) {
			System.out.println("O valor n�o pode ser zero");
		}*/
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("O valor do indice n�o existe ");
		}
		catch(NumberFormatException |ArithmeticException e) {
			System.out.println(e);	
		}
		finally {
			System.out.println("Fim");
		}

	}
}
