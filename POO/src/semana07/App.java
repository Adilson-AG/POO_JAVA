package semana07;

public class App {

	public static void main(String[] args) {
		
		Cliente cliente =new Cliente();
		cliente.setCodigo(1);
		cliente.setNome("Adilson");
		cliente.setEmail("adilson@gmail.com");
		
		cliente.mostrar();
		System.out.println(cliente);

	}

}
