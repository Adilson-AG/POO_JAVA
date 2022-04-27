package lista01;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

//6. Faça uma classe que pergunte quanto você ganha por hora e o número de horas 
//trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

public class EntradasSaidas6 {

	public static void main(String[] args) {
		
		float salario,valorHora,quantidadeHora;
		
		System.out.println("Entre com o valor que você ganha por hora: ");
		Scanner valorReais= new Scanner(System.in);
		valorHora = valorReais.nextFloat();
		
		System.out.println("Entre com a quantidade de horas tralhadas no mês: ");
		Scanner horasMes= new Scanner(System.in);
		quantidadeHora = horasMes.nextFloat();
		
		salario=valorHora*quantidadeHora;
		
		System.out.println("O salário a receber neste mês é de:  R$"+salario);
		
		
	}

}
