package semana02;

import javax.swing.JOptionPane;

public class MinhaAplicacao {

	public static void main(String[] args) {

		String n1 =JOptionPane.showInputDialog("Nota1");
		if(n1!=null && !n1.equals("") )//usuario cancelou entrada;
		{
			String n2 =JOptionPane.showInputDialog("Nota2");
			if(n2!=null&& !n2.equals("")) {//usuario cancelou entrada;
				String[] notas = {n1,n2};
				//notas[0] =n1;
				//notas[1] =n2;
				Calculadora.main(notas);
			}
		}

	}

}
