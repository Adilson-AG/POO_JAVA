package semana02;
import java.util.Scanner;
//import java.util.*; olha para todas classe da pasta java > util

public class EntradaDeDados2 {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Entre com uma nota: ");
		float a = s1.nextFloat();
		System.out.println("Entre com outra nota: ");
		float b = s1.nextFloat();
		
		System.out.println("Soma de a+b: "+(a+b));
		System.out.println("Soma de a-b: "+(a-b));
		System.out.println("Soma de a*b: "+(a*b));
		System.out.println("Soma de a/b: "+(a/b));
		
		System.out.println("Média: "+(a+b)/2);
		
		s1.close();
		
		
	}

}
