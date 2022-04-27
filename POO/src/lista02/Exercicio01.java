package lista02;

import javax.swing.JOptionPane;

/*
 * 1. Faça uma aplicação para receber um número qualquer e informar na tela se é par ou ímpar
 */

public class Exercicio01 {

	public static void main(String[] args) {

		String numero;
		int num;


		numero =JOptionPane.showInputDialog("Entre com um número inteiro qualquer para conferir se ele é par ou ímpar:");
		if(numero!= null && !numero.equals("")) {
			num= Integer.parseInt(numero);
			if (num % 2 == 0) {
				JOptionPane.showMessageDialog(null, "O numero digitado é PAR");
				//System.out.println("O numero é Par !!");
			}
			else {
				JOptionPane.showMessageDialog(null, "O numero digitado é IMPAR !!");
				//System.out.println("O numero é impar!!");
			}
		}
		
		else {
		
			JOptionPane.showMessageDialog(null,"Valor invalido!!");
		}
	}
}


