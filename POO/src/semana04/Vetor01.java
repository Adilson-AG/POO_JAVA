package semana04;

public class Vetor01 {

	public static void main(String[] args) {
		String[] meses = {"jan","fev","Mar","abr"};

		float[] notas = new float[4];
		notas[0]=3.5f;
		notas[1]=8.2f;
		notas[2]=8.5f;
		notas[3]=9.2f;

		//System.out.println(meses[1]);
		//System.out.println(notas[1]);
		/*for(int i=0; i<meses.length;i++) {
			System.out.println(meses[i]);
			System.out.println(notas[i]);
		}*/
		//itaretor
		for(String s: meses){
		System.out.println(s);
		}
	}
}
