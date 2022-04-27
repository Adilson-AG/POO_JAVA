package lista02;

import javax.swing.JOptionPane;

/*
 * Faça uma aplicação que receba a nota de duas provas (a nota deve ser um valor entre 0 e
 *10). A seguir, apresente a média e o resultado final, conforme a tabela abaixo:
 */

public class Exercicio05 {

	public static void main(String[] args) {
		
		int num1,num2;
		
		num1= Integer.parseInt(JOptionPane.showInputDialog("Digite a nota1:"));
		while(num1<0 ||num1> 10) {
			JOptionPane.showMessageDialog(null,"As notas variam de 0 a 10, insira novamente:");
			num1= Integer.parseInt(JOptionPane.showInputDialog("Digite a nota1:"));
		}
		num2= Integer.parseInt(JOptionPane.showInputDialog("Digite a nota2:"));
		while(num2<0 || num2> 10) {
			JOptionPane.showMessageDialog(null,"As notas variam de 0 a 10, insira novamente:");
			num2= Integer.parseInt(JOptionPane.showInputDialog("Digite a nota2:"));
		}
		
		int media = (num1+num2)/2;
		System.out.println(media);
		
		if(media <=5) {
			JOptionPane.showMessageDialog(null,"Média= "+media+" REPROVADO");
		}else if( media <7) {
			JOptionPane.showMessageDialog(null,"Média= "+media+" RECUPERAÇÃO");
		
		}else {
			JOptionPane.showMessageDialog(null,"Média= "+media+" APROVADO");
		}
	
	}

}
