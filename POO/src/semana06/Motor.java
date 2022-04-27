package semana06;

public class Motor {
	
	private int velocidade;
	public boolean ligado;
	
	public void ligar() {
		ligado=true;
	}
	public void desligar() {
		ligado=false;
	}
	public void acelerar() {
		if(velocidade<Config.VELOCIDADE_MAXIMA)// CRIAR CONSTANTE PARA VALORES DENTRO DE METODO
		velocidade++;
	}
	public void frear() {
		if(velocidade >Config.VELOCIDADE_MINIMA)
		velocidade--;
	}
	
	public void mostrar() {
		System.out.println("Status: "+ligado);
		System.out.println("Velocidade: "+velocidade);
	}
	public String toString() {
		return "["+velocidade+","+ligado+"]";
	}


}
