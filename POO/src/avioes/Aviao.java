package avioes;

import carros.Carro;

public class Aviao extends Carro {
	public double envergadura;
	public boolean tremPouso;
	
	/**
	 * LAND
	 */
	public void aterrizar() {
		System.out.println("Avi�o pousou ^^^^-----_________");
	}
	
	/**
	 * ACCELERATE 
	 */
	
	public void acelerar() {
		System.out.println("Avi�o Decolando_________-------^^^^^^^");
	}
}
