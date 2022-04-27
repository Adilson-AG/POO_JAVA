package lista01;

public class ExercicioEscada {

	public static void main(String[] args) {

		int n =10,i;

		for( i =1; i<n;i++) {
			System.out.print(" ");
			
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
