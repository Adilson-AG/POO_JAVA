package lista01;

import javax.swing.JOptionPane;

//3. Fa�a uma classe que converta metros para cent�metros.

public class EntradasSaidas3 {

	public static void main(String[] args) {
		
		float metros,centimetros=0.f;
		
	metros=Float.parseFloat(JOptionPane.showInputDialog("Entre com um valor em metros para converter em centimetros"));
    centimetros=100*metros;
    System.out.println(metros +" Metros "+ "= "+ centimetros+ "cm");
	}

}
