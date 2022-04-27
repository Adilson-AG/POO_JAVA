package semana04;

import javax.swing.JOptionPane;

public class St03 {

	public static void main(String[] args) {
		
		String s = "Hoje é quinta-feira";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s);
		s= s.toUpperCase();
		System.out.println("Final: " + s);
		
		String a = JOptionPane.showInputDialog("Gosta de calor? (s|n)").toLowerCase();
		
		String b="hoje";
		if(b=="hoje")   // quando atribuir string literalmente sem usar joptiopane pode se comparar com ==
			System.out.println("OK");
		
		if(a.equals("s") ){
			System.out.println("sim");
		}
		else {
			if(a.equals("n")) {
				System.out.println("não");
			}
		}
	}

}
