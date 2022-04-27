package semana08;

import javax.swing.JOptionPane;

public class PessoaFisica  extends Pessoa{

	private String rg, cpf;

	public void digitar() {
		super.digitar();
		rg=JOptionPane.showInputDialog("rg?");
		cpf = JOptionPane.showInputDialog("cpf");

	}
	public void mostrar(){
		super.mostrar();
		System.out.println(rg);
		System.out.println(cpf);
	}	
}
