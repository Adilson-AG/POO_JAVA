package lista01;

import javax.swing.JOptionPane;

//2. Fa�a uma classe que pe�a as 3 notas bimestrais e mostre a m�dia. 


public class EntradasSaidas2 {

	public static void main(String[] args) {

		float[]notas = new float[3];

		for(int i=0; i<notas.length;i ++) {

			notas[i]=Float.parseFloat(JOptionPane.showInputDialog("Entre com notas"));
		}
		  float soma=0;
		for(int a=0; a<notas.length;a++) {
		 soma +=notas[a];
		}
		System.out.println("M�dia da soma dos numeros �: "+ soma/3);
	}

}
