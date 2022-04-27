package semana08;

import javax.swing.JOptionPane;

public abstract class Pessoa {
	private int codigo;
	private String nome;
	
	
	public void digitar() {
		
		codigo=Integer.parseInt(JOptionPane.showInputDialog("codigo?"));
		nome = JOptionPane.showInputDialog("nome");
		
	}
	public void mostrar(){
	System.out.println(codigo);
	System.out.println(nome);
}
}
