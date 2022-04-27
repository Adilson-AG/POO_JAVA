package lista02;

import javax.swing.JOptionPane;

/*
 * 3. Encontrar o dobro de um número caso ele seja positivo e o seu triplo caso seja negativo, 
 *imprimindo o resultado.
 */
public class Exercicio03 {

	public static void main(String[] args) {
		
		int dobro, triplo;
		
		 int num=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor !!"));
		 
		 if(num >=0) {
			 dobro= num*2;
			 JOptionPane.showMessageDialog(null,"Imprimindo resultado...  "+ "dobro= "+dobro);
			 
		 } else if(num<0) {
			 triplo= num*3;
			JOptionPane.showMessageDialog(null,"Imprimindo resultado...  "+triplo);
		 } else {
			 JOptionPane.showMessageDialog(null,"Finalizando..."); 
		 }
		

	}

}
