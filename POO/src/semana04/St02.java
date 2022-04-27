package semana04;

public class St02 {
	public static void main(String[] args) throws InterruptedException {

		String s= "Hoje é quinta-feira";
		int t = s.length();
		for(int a =1; a <=5;a++){
			for(int i =0; i<t; i ++) {
				System.out.print(s.charAt(i));
				Thread.sleep(100);
			}
			System.out.println();
		}
	}
}
