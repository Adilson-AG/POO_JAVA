package semana04;

import java.util.Arrays;

public class Vetor02 {

	public static void main(String[] args) {
		double[] precos = {3.0,4.5,6.8};
		System.out.println(precos);//identificador
		//System.out.println(precos[0]);
		//System.out.println(Arrays.toString(precos));
		
		double[] novoPreco= precos;//copia por referencia (apelido)
		//System.out.println(Arrays.toString(novoPreco));
		novoPreco[0]=10;
		//System.out.println(Arrays.toString(precos));
		
		//copia por valor
		
		double[] precos2 =new double[3];
		for(int i=0; i<precos.length;i++) {
			precos2[i]=precos[i];
		}
		System.out.println(Arrays.toString(precos2));
	}

}
