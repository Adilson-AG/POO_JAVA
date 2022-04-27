
package semana05;

public class Exercicios {
	/**
	 * Gerar uma senha alfanumerica cntendo n digitos
	 * @param quantDigitos-a quantidade de digitos
	 * @return-senha alfanumerica
	 */
	
	public static String gerarSenha(int quantDigitos) {
		
		String s= "1234567890abcABC!@#";
		int t= s.length();
		String senha="";
		for(int i =1; i<=quantDigitos;i++) {
			int n = (int)(Math.random()*t);
			char c =s.charAt(n);
			senha +=c;
		}
		
		return senha;
	}
	/**
	 * Realiza a contagem das vogais existentes na frase
	 * @param frase-frase fornecida
	 * @return a quantidade de vogais
	 */
	public static int contarVogais(String frase) {
		
		int quant =0;
		frase= frase.toLowerCase();
		int t = frase.length();
		for(int i=0;i<t;i++) {
			char c =frase.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				quant++;
			}
		}
		return quant;
		
	}
	/**
	 * Escreve por extenso numeros gerados aleatoriamente
	 * @param quantDigitos-quantidade de digitos
	 * @return-retorna numero por extenso
	 */
public static String gerarNumeroExtenso(int quantDigitos) {
		String retorno="";
		for(int i =1; i<=quantDigitos;i++) {
			int n = (int)(Math.random()*10);
			switch(n) {
			case 0: retorno +="zero,";break;
			case 1: retorno +="um,";break;
			case 2: retorno +="dois,";break;
			case 3: retorno +="três,";break;
			case 4: retorno +="quatro,";break;
			case 5: retorno +="cinco,";break;
			case 6: retorno +="seis,";break;
			case 7: retorno +="sete,";break;
			case 8: retorno +="oito,";break;
			case 9: retorno +="nove,";break;
			}
			
		}
		
		return retorno;
	}

/**
 * Verifica se numero de entrada é par ou impar 
 * @param numero
 * @return
 */
 
	public static String verificarParImpar(int numero) {
		if(numero%2 ==0) {
			return "par";
		}
		return "impar";
	}

}
