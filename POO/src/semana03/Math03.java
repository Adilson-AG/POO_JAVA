package semana03;

public class Math03 {
	public static void main(String[] args) {
		//cartão da mega sena
		for(int a =1; a<=6; a++) {
			int n = 1 +(int) ( Math.random()*60);
			System.out.println(n + "");
		}
	}

}
