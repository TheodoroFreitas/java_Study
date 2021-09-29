/**
 * MINECRAFT - ABSTRACTION INHERITANCE AND POLYMORPHISM
 * */

package mundo;

public class blocos {

	public String texture;
	public int IDnum;
	public double toughness;
	
	/*
	 * ADD BLOCK
	 * */
	public blocos() {
		System.out.println("==========================================");
	}
	/*
	 * ADD BUILD
	 * */
	public void build() {
		System.out.println("building......");
	}
	
	/*
	 * ADD MINE
	 * */
	public void mine() {
		System.out.println("Mining.....................");
	}
	
	/*
	 * ADD CRAFT
	 * */
	public void craft() {
		System.out.println("crafting.....................");
	}
}
