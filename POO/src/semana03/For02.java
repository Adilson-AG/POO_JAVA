package semana03;

import javax.swing.JOptionPane;

public class For02 {

	public static void main(String[] args) throws InterruptedException {

		/* for(int a=0; a <=50 ; a+=5) {

			System.out.print(a + " ");

		} 
		System.out.println();

		 for(int a=0; a <=10 ; a++) {

			System.out.println("5 x " + a + " = " + 5*a);


		} */
		int n=Integer.parseInt(JOptionPane.showInputDialog("Tabuada?"));
		for(int i=0; i<=10;i++) {
			for(int a=0; a <=10 ; a++) {

				System.out.println(n + " x " + a + " = " + 5*a);
				Thread.sleep(500);

			} 
		}
	}
}