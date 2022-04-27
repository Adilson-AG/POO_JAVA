package semana03;

import javax.swing.JOptionPane;

public class Excecao02 {

	public static void main(String[] args) {
		
			int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
			int conta =10/a;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
			System.out.println(a); 
			

		}

}
