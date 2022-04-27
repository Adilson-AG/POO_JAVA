package semana02;

public class Calculadora {

	public static void main(String[] args) {

		//System.out.println(args[0]);
		//System.out.println(args[1]);
		float n1 = Float.parseFloat(args[0]);
		float n2 = Float.parseFloat(args[1]);
		float media =(n1+n2)/2;
		System.out.println("A média = " +media);
	}

}
