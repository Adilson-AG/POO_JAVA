package semana03;

public class For01 {

	public static void main(String[] args) throws InterruptedException {
		int a=1;
		for(a=1; a <=10 ; a++) {
			
			System.out.print(a + " ");
			Thread.sleep(500);
		}
		System.out.print(a + " ");
for(a=10; a >=1 ; a--) {
			
			System.out.print(a + " ");
			Thread.sleep(500);
		}
		//System.out.print(a + " ");
	}

}
