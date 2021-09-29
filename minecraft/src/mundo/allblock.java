package mundo;

public class allblock {

	public static void main(String[] args) {

		blocos cobblestone = new blocos();
		cobblestone.texture = "gray";
		cobblestone.toughness = 2;
		cobblestone.IDnum = 4;
		System.out.println("Name: Cobblestone");
		System.out.println("Texture:" + cobblestone.texture);
		System.out.println("toughness:" + cobblestone.toughness);
		System.out.println("IDnum:" + cobblestone.IDnum);
		cobblestone.mine();
		cobblestone.build();
		blocos dirt = new blocos();
		dirt.texture = "Brown";
		dirt.toughness = 0.5;
		dirt.IDnum = 3;
		System.out.println("Name: Dirt");
		System.out.println("Texture:" + dirt.texture);
		System.out.println("toughness:" + dirt.toughness);
		System.out.println("IDnum:" + dirt.IDnum);
		dirt.mine();
		dirt.build();
		dirt.craft();

	}

}
