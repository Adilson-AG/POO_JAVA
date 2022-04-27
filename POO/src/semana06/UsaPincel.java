package semana06;

public class UsaPincel {

	public static void main(String[] args) {
		Pincel p1 = new Pincel();// criando um objeto --- instanciando
		//p1.abrir();
		//p1.escrever();
		//p1.mostrar();
		p1.cor="azul";
		p1.preco=10;
		p1.comprimento=10;
		p1.carregado=true;
		p1.mostrar();
		
		Pincel p2 = new Pincel();
		p2.cor="preto";
		p2.preco=10;
		p2.comprimento=10;
		p2.carregado=false;
		p2.mostrar();
		
		Pincel p3; //declaração
		p3= new Pincel(); // criação ou instanciação de objeto.
		
				
		
	
	
	}

}
