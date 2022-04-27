package semana05;
/**
 * Classe realiza diversos cálculos matemáticos.
 * @author 1050482113042
 *
 */
public class Calculos {
	/**
	 * Recebe dois valores do tipo double e imprime a sua soma em tela. 
	 * @param a - primeiro valor
	 * @param b - segundo valor
	 */
	
	public static void somar(double a, double b) {
		System.out.println(a+b);
	}
	/**
	Recebe dois valores do tipo double e imprime a subtração em tela. 
	 * @param a - primeiro valor
	 * @param b - segundo valor
	 */
	public static void subtrair(double a, double b) {
		System.out.println(a-b);
	}
	/**
	 Recebe dois valores do tipo double e imprime a multiplicação em tela. 
	 * @param a - primeiro valor
	 * @param b - segundo valor
	 */
	public static void multiplicar(double a, double b) {
		System.out.println(a*b);
	}
	/**
	 Recebe dois valores do tipo double e imprime a divisão em tela. 
	 * @param a - primeiro valor
	 * @param b - segundo valor
	 */
	public static void dividir(double a, double b) {
		System.out.println("double");
		System.out.println(a/b);
	}
	public static void dividir(int a, int b) throws ArithmeticException{
		System.out.println("int");
		System.out.println(a/b);
	}
	/**
	 * Apresenta em tela os números inteiros do inicio ao fim com incremento de 1, pausadamente.
	 * @param inicio- valor inicial da contagem
	 * @param fim-valor final da contagem
	 * @throws InterruptedException 
	 */
	
	public static void contar(int inicio, int fim) throws InterruptedException {
		for(int i=inicio; i<=fim;i++) {
			System.out.println(i);
			Thread.sleep(500);
		
		}
		
	}
	
	
}
