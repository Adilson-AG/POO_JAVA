package semana04;

public class St05 {

	public static void main(String[] args) {
		String frase = "Hoje � quinta-feira";
		//System.out.println(frase.substring(0,4));// vai escrever hoje
		System.out.println(frase.substring(7,10));//qui
		System.out.println(frase.substring(7));//quinta-feira
		System.out.println(frase.substring(0,frase.indexOf(" ")));//hoje
		
		
	}

}
