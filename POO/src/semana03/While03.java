package semana03;

import javax.swing.JOptionPane;

public class While03 {

	public static void main(String[] args) {
		//nota entre 0 e 10

		float nota1 =11;

		while(nota1<0|| nota1>10) {

			nota1 =Float.parseFloat(JOptionPane.showInputDialog("Nota1"));

			}
		//System.out.println(nota1);
		float nota2 =-1;

		while(nota2<0|| nota2>10) {

			nota2 =Float.parseFloat(JOptionPane.showInputDialog("Nota2"));

			}
		float media =(nota1+nota2)/2;
		JOptionPane.showMessageDialog(null, "Nota 1: " + nota1+"\n" + "Nota 2: "+nota2+ "\n"+  "M�dia:" +media);
		
		
		}

	}
