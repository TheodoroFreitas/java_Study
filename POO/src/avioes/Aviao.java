package avioes;

import carros.Carro;

public class Aviao extends Carro {
	public double envergadura;
	public boolean tremPouso;
	
	/**
	 * LAND
	 */
	public void aterrizar() {
		System.out.println("Avião pousou ^^^^-----_________");
	}
	
	/**
	 * ACCELERATE 
	 */
	
	public void acelerar() {
		System.out.println("Avião Decolando_________-------^^^^^^^");
	}
}
