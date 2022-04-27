package lista02;

import java.util.Scanner;

public class CalculaMinimo {

	public static void main(String[] args) {
		double comprimentoPista;
		int numVolta;
		int qtdVezesAbastecimento;
		double consumoKm;
		double minimoLitro;
		
		System.out.println("Entre com comprimento total da pista: ");
		Scanner percurso = new Scanner(System.in);
		comprimentoPista=percurso.nextInt();
		
		System.out.println("Entre com total de voltas: ");
		Scanner voltas= new Scanner(System.in);
		numVolta=voltas.nextInt();
		
		System.out.println("Entre com a quantidade de vezes que se deseja abastecer: ");
		Scanner  abastecer= new Scanner(System.in);
		qtdVezesAbastecimento=abastecer.nextInt();
		
		System.out.println("Qual consumo por KM? ");
		Scanner consumo = new Scanner(System.in);
		consumoKm=consumo.nextInt();
		
		
		
		
		
		

	}

}
