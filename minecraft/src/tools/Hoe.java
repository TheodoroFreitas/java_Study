package tools;

import mundo.blocos;

public class Hoe extends blocos {

	public boolean conquest;

	public boolean blockdirt;
	
	/*
	 * ADD NEW MINE
	 * */
	public void mine() {
		System.out.println("damage block.....................");
	}
	
	/*
	 * ADD ARAR
	 * */
	public void arar() {
		System.out.println("Plowing Dirt......");
		conquest = true;
		System.out.println("Farmer Conquers  ('o')");
	}
}

