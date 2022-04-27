package semana03;

import javax.swing.JOptionPane;

public class DoWhile01 {

	public static void main(String[] args) {
		float nota1=0;

		do {
			nota1 = Float.parseFloat(JOptionPane.showInputDialog("nota1"));

		}
		while(nota1<0 || nota1>10);
		System.out.println(nota1);
	}

}
