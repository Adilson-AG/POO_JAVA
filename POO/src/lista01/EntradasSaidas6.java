package lista01;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

//6. Fa�a uma classe que pergunte quanto voc� ganha por hora e o n�mero de horas 
//trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s.

public class EntradasSaidas6 {

	public static void main(String[] args) {
		
		float salario,valorHora,quantidadeHora;
		
		System.out.println("Entre com o valor que voc� ganha por hora: ");
		Scanner valorReais= new Scanner(System.in);
		valorHora = valorReais.nextFloat();
		
		System.out.println("Entre com a quantidade de horas tralhadas no m�s: ");
		Scanner horasMes= new Scanner(System.in);
		quantidadeHora = horasMes.nextFloat();
		
		salario=valorHora*quantidadeHora;
		
		System.out.println("O sal�rio a receber neste m�s � de:  R$"+salario);
		
		
	}

}
