package semana04;

import javax.swing.JOptionPane;

public class St04 {

	public static void main(String[] args) {
		String palavra= JOptionPane.showInputDialog("Buscar?").toLowerCase();
		String frase = "Hoje � quinta-feira".toLowerCase();

		int pos =frase.indexOf(palavra);	// retorna -1 caso n�o encontra	palavra
		if(pos >=0) {
			System.out.println("Palavra encontrada na posi��o " +pos);

		}else {
			System.out.println("Palavra n�o encontrada");
		}


	}
}

