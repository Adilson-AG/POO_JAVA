package semana02;
import java.util.Scanner;
//import java.util.*; olha para todas classe da pasta java > util

public class EntradaDeDados {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Entre com um valor inteiro: ");
		int a = s1.nextInt();
		System.out.println("Entre com outro valor inteiro: ");
		int b = s1.nextInt();
		
		System.out.println("Soma de a+b: "+(a+b));
		System.out.println("Soma de a+b: "+(a-b));
		System.out.println("Soma de a+b: "+(a*b));
		System.out.println("Soma de a+b: "+(a/b));
		
		s1.close();
		
		
	}

}
