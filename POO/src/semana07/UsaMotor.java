package semana07;

public class UsaMotor {

	public static void main(String[] args) {
		
		Motor motor = new Motor();
		//motor.fabricante="Toyota";
		
		motor.acelerar();
		motor.acelerar();
		System.out.println(motor.pegaVelocidade());
	}

}
