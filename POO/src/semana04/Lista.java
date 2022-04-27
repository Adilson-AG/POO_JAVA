package semana04;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		
		lista.add("Adilson");
		lista.add("Antonio");
		lista.add("genari");
		
		for( String s :lista) {
			System.out.print(s +" ");
		}

	}

}
