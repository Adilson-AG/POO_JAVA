package semana08;

import javax.swing.JOptionPane;

public class Funcionario extends PessoaFisica {
	
	private double salario;
	public void digitar() {
		super.digitar();
		salario=Double.parseDouble(JOptionPane.showInputDialog("Salario"));
		

	}
	public void mostrar(){
		super.mostrar();
		System.out.println(salario);
		
	}	

}
