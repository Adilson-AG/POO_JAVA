package lista02;

import javax.swing.JOptionPane;

/*
 * 1. Fa�a uma aplica��o para receber um n�mero qualquer e informar na tela se � par ou �mpar
 */

public class Exercicio01 {

	public static void main(String[] args) {

		String numero;
		int num;


		numero =JOptionPane.showInputDialog("Entre com um n�mero inteiro qualquer para conferir se ele � par ou �mpar:");
		if(numero!= null && !numero.equals("")) {
			num= Integer.parseInt(numero);
			if (num % 2 == 0) {
				JOptionPane.showMessageDialog(null, "O numero digitado � PAR");
				//System.out.println("O numero � Par !!");
			}
			else {
				JOptionPane.showMessageDialog(null, "O numero digitado � IMPAR !!");
				//System.out.println("O numero � impar!!");
			}
		}
		
		else {
		
			JOptionPane.showMessageDialog(null,"Valor invalido!!");
		}
	}
}


