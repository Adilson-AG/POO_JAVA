package semana06;

import java.util.List;

public class Metodos {
/**
 * Recebe um vetor de numeros inteiros e retorna a soma entre eles
 * @param n- vetor de inteiros
 * @return a - soma dos valores
 */
	public static int somar(int[] n) {
		int somar =0;
		for(int i=0; i<n.length;i++) {
			somar+= n[i];
		}
		
		return somar;
	}
	public static double somar(double... n) {
		double somar =0;
		for(int i=0; i<n.length;i++) {
			somar+= n[i];
		}
		
		return somar;
	}
	//recursividade
	
	/*public static int somatorio(int n) {
		int soma =0;
		for( int i=1;i<=n;i++){  
			soma +=i;
			return soma;
		}
		
	}*/
	public static int somatorio2(int n) {
		if(n==1)
			return 1;
		else
			return n + somatorio2(--n);
	}
	
	public static void listaNome(List<String> nomes) {
		for(String s:nomes) {
			System.out.println(s);
		}
		
	}
}
