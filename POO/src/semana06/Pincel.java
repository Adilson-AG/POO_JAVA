package semana06;

public class Pincel {
	
	//atributos ( definem oque o objeto é ( caracteristicas))
	//definem o estado de um objeto
	public String cor;
	public double preco;
	public int comprimento;
	public boolean carregado;
	
	//métodos (definem o que pode ser feito)
	// definem o comportamento dos objetos
	public void abrir() {
		System.out.println("A TAMPA FOI ABERTA");
	}
	public void fechar() {
		System.out.println("A TAMPA FOI FECHADA");
	}
	public void escrever() {
		System.out.println("ESCREVENDO...");
	}
public void mostrar() {
	System.out.println(cor);
	System.out.println(preco);
	System.out.println(comprimento);
	System.out.println(carregado);
}
	
	
}
