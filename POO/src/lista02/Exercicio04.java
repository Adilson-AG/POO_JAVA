package lista02;

import javax.swing.JOptionPane;

/*
 * 4. Faça uma aplicação que leia três números e mostre a média entre eles somente se todos 
 *forem positivos. Caso haja algum número negativo apresente a mensagem “A média nãAo 
 *pode ser calculada”.
 */

public class Exercicio04 {

	public static void main(String[] args) {

		int total=0;;

		int[] num= new int[3];

		for(int i=0;i<num.length; i++) {

			num[i]=Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor: "));
			//System.out.println(num[i]);
			if(num[i] < 0) {
				JOptionPane.showMessageDialog(null,"Entre com valores positivos, insira novamente: ");
				num[i]=Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor: "));
			}
			
			total+=num[i];
		}
		JOptionPane.showMessageDialog(null,"A media da soma dos numeros informados é: "+total/num.length);
		
	}

}
