package semana02;

import javax.swing.JOptionPane;

public class ExercicioSemana02 {

	public static void main(String[] args) {
		
		int n1= Integer.parseInt(JOptionPane.showInputDialog("N1"));
		int n2= Integer.parseInt(JOptionPane.showInputDialog("N2"));
		int n3= Integer.parseInt(JOptionPane.showInputDialog("N3"));
		
		int maior = n1;
		if(n2>maior) maior =n2;
		if(n3>maior) maior =n3;
		JOptionPane.showMessageDialog(null,"O maior valor é ; \n"+ maior);
			 
		}
		

	}


