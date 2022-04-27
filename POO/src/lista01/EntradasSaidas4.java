package lista01;

import javax.swing.JOptionPane;


//4. Faça uma classe que peça o raio de um círculo, calcule e mostre sua área



public class EntradasSaidas4 {

	public static void main(String[] args) {

		String raio;
		float r;

		raio= JOptionPane.showInputDialog("Digite o valor do raio:");
	
		if(raio!= null && !raio.equals("")) {
			r= Float.parseFloat(raio);
			JOptionPane.showMessageDialog(null, 3.1416*r*r );
			
		}else {
			JOptionPane.showMessageDialog(null, "Operação cancelada" );
		}
			//System.out.println("Area do circulo corresponde á: "+ 3.1416*(raio*raio));

			

	}

}
