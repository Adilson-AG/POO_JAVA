package semana02;

import javax.swing.JOptionPane;

public class Condicoes {

	public static void main(String[] args) {

		String n = JOptionPane.showInputDialog("Numero do mês?");


		int mes = Integer.parseInt(n);// conversão de "1" para 1;
		String s = " ";
		switch(mes){

		case 1 : s ="jan";
		break;
		case 2 : s ="fev";
		break;
		case 3 : s ="mar";
		break;
		case 4 : s ="abr";
		break;
		case 5 : s ="mai";
		break;
		case 6 : s ="jun";
		break;
		default: s ="/////";
	

		}





	}

}
