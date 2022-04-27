package semana02;

import javax.swing.JOptionPane;

public class Condicoes2 {

	public static void main(String[] args) {
		
		String n = JOptionPane.showInputDialog("Numero do mês?");
		
		
		int mes = Integer.parseInt(n);// conversão de "1" para 1;
		
		/*if(mes==1) System.out.println("jan");
		else if(mes==2) System.out.println("fev");
		else if(mes==3) System.out.println("mar");
		else System.out.println("Mês desconhecido");
		*/
		
		String r = (mes ==1?"jan":mes==2?"fev":"mar"); // operador tenario no lugar de if;
		System.out.println(r);	
		
		
				
		

	}

}
