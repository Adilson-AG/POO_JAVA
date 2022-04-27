package lista01;
 /*8. Faça uma classe que peça a temperatura em graus Celsius, transforme e mostre em 
graus Farenheit.*/

import java.util.Scanner;

public class EntradasSaidas8 {

	public static void main(String[] args) {
float grauFarenheit, grauCelsius;
		
		System.out.println("Insira o valor em graus Celsius para fazer a conversão em graus Farenheit.");
		Scanner lerGrauCelsius= new Scanner(System.in);
		grauCelsius= lerGrauCelsius.nextFloat();
		
		grauFarenheit= (grauCelsius*1.8f)+32;
		
		System.out.println("O valor "+grauCelsius+" em graus Farenheit: "+grauFarenheit);
	

	}

}
