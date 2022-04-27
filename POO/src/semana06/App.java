package semana06;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Adilson");
		nomes.add("Alexandre");
		nomes.add("Abner");
		nomes.add("Antonio");
	
		Metodos.listaNome(nomes);
		
		
		/*int [] vetor = {1,2,3,5,89,34,43};
		int r= Metodos.somar(vetor);
		System.out.println(r);
		
		double ret = Metodos.somar(4);
		System.out.println(ret);*/
		
	int retr = Metodos.somatorio2(3);
	     System.out.println(retr);
	}
}
