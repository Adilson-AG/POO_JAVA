package lista01;

import javax.swing.JOptionPane;

//2. Faça uma classe que peça as 3 notas bimestrais e mostre a média. 


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
		System.out.println("Média da soma dos numeros é: "+ soma/3);
	}

}
