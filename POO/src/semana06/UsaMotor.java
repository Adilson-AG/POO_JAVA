package semana06;

public class UsaMotor {

	public static void main(String[] args) {
	Motor m1 =new Motor();
	m1.ligar(); m1.ligado=true;
	for(int i=0;i<1000;i++) {
	m1.acelerar();
	}
	m1.mostrar();
	for(int i=0;i<1000;i++) {
		m1.frear();
		}
		m1.mostrar();
	
	//m1.desligar();m1.ligado=false;
	//m1.mostrar(); // impressão ocorre na classe Motor
	
	System.out.println(m1);// impressão ocorre aqui
	
	}

}
