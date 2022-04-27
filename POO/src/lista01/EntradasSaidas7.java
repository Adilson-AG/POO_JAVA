package lista01;

import java.util.Scanner;

/*Faça uma classe que peça a temperatura em graus Farenheit, transforme e mostre a 
 *temperatura em graus Celsius. 
 *o C = (5 * (F-32) / 9).  
 */

public class EntradasSaidas7 {

	public static void main(String[] args) {
		
		float grauFarenheit, grauCelsius=.2f;
		
		System.out.println("Insira o valor em graus Farenheit para fazer a conversão em graus Celsius.");
		Scanner lerGrauFarenheit= new Scanner(System.in);
		grauFarenheit= lerGrauFarenheit.nextFloat();
		
		grauCelsius=(5*(grauFarenheit-32)/9);
		
		System.out.println("O valor "+grauFarenheit+" em graus Celsius: "+grauCelsius);
	
	}

}
