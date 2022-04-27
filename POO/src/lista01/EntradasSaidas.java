package lista01;

import java.util.Scanner;

/**1. Fa�a uma classe que pe�a dois n�meros e imprima em tela o resultado das quatro 
opera��es matem�ticas (+, -, *, /) sobre esses dois n�meros.  */

public class EntradasSaidas {

	public static void main(String[] args) {
	
		float n1,n2;
		System.out.println("Entre com primeiro valor");
		Scanner ler =new Scanner(System.in);
		n1= ler.nextFloat();
		System.out.println("Entre com segundo valor");
		Scanner ler1 =new Scanner(System.in);
		n2= ler1.nextFloat();
		
		System.out.println("Resultado dos valores informados:\n" +"soma          "+(n1 + n2)+"\n"+
		                                                          "subtração     "+(n1 - n2)+"\n"+
				                                                  "multiplicação "+(n1 * n2)+"\n"+
		                                                          "Divisão       "+(n1 / n2) );

	}

}
