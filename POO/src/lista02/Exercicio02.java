package lista02;

import javax.swing.JOptionPane;

/*
 * 2. Fa�a uma aplica��o que leia dois valores inteiros A e B se os valores forem iguais dever� 
   se somar os dois, caso contr�rio multiplique A por B. Ao final, mostrar seu conte�do na 
   tela.
 */
public class Exercicio02 {

	public static void main(String[] args) {

		String num01,num02;
		int num1,num2,resultado;



		num01=JOptionPane.showInputDialog("Insira um numero inteiro: ");
		if(num01 != null && !num01.equals("")) {
			num02=JOptionPane.showInputDialog("Insira outro numero inteiro:");

			if(num02 != null && !num02.equals("")) {

				num1=Integer.parseInt(num01);
				num2=Integer.parseInt(num02);

				if(num1==num2) {

					resultado=num1+num2;
					
					JOptionPane.showMessageDialog(null,"Os valores de entrada s�o iguais a soma �"+ resultado);

				}
				else {
					resultado=num1*num2;
					JOptionPane.showMessageDialog(null,"Os valores de entrada s�o diferentes o produto � "+ resultado);
				}


			}
			else {

				JOptionPane.showMessageDialog(null, "Valor invalido !!");
			}

		} else {
			JOptionPane.showMessageDialog(null, "Valor invalido !!");	
		}


	}

	



}


