package semana08;

public class AppProduto {

	public static void main(String[] args) {

		Produto p= new Produto(1,"Sabonete",-1.5);
		System.out.println(p.persistir());
		
		Produto p2 = p.recuperar();
		System.out.println(p2);
		p2.mostrar();
		
		
		/*Produto p2= new Produto(1,"Detergente",-1.5);
		Produto p3=new Produto();

		p.mostrar();
		p2.mostrar();
*/
	}

}
