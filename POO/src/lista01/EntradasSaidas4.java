package lista01;

import javax.swing.JOptionPane;


//4. Fa�a uma classe que pe�a o raio de um c�rculo, calcule e mostre sua �rea



public class EntradasSaidas4 {

	public static void main(String[] args) {

		String raio;
		float r;

		raio= JOptionPane.showInputDialog("Digite o valor do raio:");
	
		if(raio!= null && !raio.equals("")) {
			r= Float.parseFloat(raio);
			JOptionPane.showMessageDialog(null, 3.1416*r*r );
			
		}else {
			JOptionPane.showMessageDialog(null, "Opera��o cancelada" );
		}
			//System.out.println("Area do circulo corresponde �: "+ 3.1416*(raio*raio));

			

	}

}
