package semana04;

public class St06 {

	public static void main(String[] args) {
		String caracteres = "ABCabc0123456789!@#$%&*()";//para gerar uma senha alfa-num�rica
		int t = caracteres.length();//comprimento
		for(int a =1; a<=10;a++) {


			int n =(int)(Math.random()*t);//n�mero aleatorio
			System.out.print( caracteres.charAt(n));
		}
	}

}
