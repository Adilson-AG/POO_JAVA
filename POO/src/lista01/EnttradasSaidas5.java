package lista01;
import java.util.Scanner;
/*. Fa�a uma classe que calcule a �rea de um quadrado, em seguida mostre o dobro 
desta �rea para o usu�rio. */

public class EnttradasSaidas5 {

	public static void main(String[] args) {
		
		float valor1, valor2, areaQuadrado;
		System.out.println("Entre com primeiro valor para calcular a area do quadrado:");
		Scanner readVal1= new Scanner(System.in);
		valor1=readVal1.nextFloat();
		System.out.println("Entre com o segundo valor: ");
		Scanner readVal2= new Scanner(System.in);
		
		valor2= readVal2.nextFloat();
		areaQuadrado=valor1*valor2;
		
		System.out.println("O dobro da area dos valores calculados �: "+ areaQuadrado*2);
		
		
	}

}
