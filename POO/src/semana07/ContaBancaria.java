package semana07;

public class ContaBancaria {
private final int VALOR_MAX_SAQUE=1000;
	public String titular;
	private double saldo;
	/**
	 * Recebe um valor que será acrescentado ao saldo
	 * @param valor- o valor do depósito
	 */

	public void depositar(double valor) {
		if(valor >0) { // condição para não entrar valor negativo
			saldo+=valor;
		}
	}
	/**
	 * Recebe um valor a ser debitado do saldo
	 * @param valor- o valor para sacar
	 */
	public String sacar(double valor) {
		String men="";
		if ( valor <= saldo) {// conforme  RN01
			if (valor<= VALOR_MAX_SAQUE) {//conforme RN02
				saldo-=valor;
				men="Saque de "+valor+" realizado com sucesso!";
			}
			else {men="O valor maximo para saque é "+ VALOR_MAX_SAQUE;}
		}
		else {
			men="Saldo insuficiente!!";
		}
		return men;
	}
	/**
	 * Retorna o valor do saldo da conta
	 * @return valor do saldo
	 */
	public double pegaSaldo() {
		return saldo;
	}
	/**
	 * Transfere valor de uma conta bancaria para outra
	 * @param origem - conta de saida do valor
	 * @param destino - conta de entrada do valor
	 * @param valor - valor a ser transferido
	 * @return
	 */
	public static String transferir(ContaBancaria origem, ContaBancaria destino,  double valor) {
		
		String men ="";
		origem.saldo -= valor;
		destino.saldo += valor;
		
		// outra forma de fazer operação acima
		//origem.sacar(valor);
		//destino.depositar(valor)
		
		
		
		return men;
		
	}

}
