package lista01;
import java.util.Scanner;
/*. Faça uma classe que calcule a área de um quadrado, em seguida mostre o dobro 
desta área para o usuário. */

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
		
		System.out.println("O dobro da area dos valores calculados é: "+ areaQuadrado*2);
		
		
	}

}
