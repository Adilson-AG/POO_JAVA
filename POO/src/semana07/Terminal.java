package semana07;

public class Terminal {

	public static void main(String[] args) {
		
		ContaBancaria c1 =new ContaBancaria();
		ContaBancaria c2 =new ContaBancaria();
		c1.depositar(1000);
		c2.depositar(500);
		
		ContaBancaria.transferir(c1,c2,100);		
		System.out.println(c1.pegaSaldo());
		System.out.println(c2.pegaSaldo());
		
		
		/*ContaBancaria conta =new ContaBancaria();
		conta.depositar(1000);
		conta.depositar(500); //teste para saber se deposito 
		System.out.println("Seu saldo é de:"+ conta.pegaSaldo());
		
		System.out.println(conta.sacar(1200));
		System.out.println("Seu saldo é de:"+conta.pegaSaldo());
	*/
	}
}
