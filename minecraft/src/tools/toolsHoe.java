package tools;

public class toolsHoe {

	public static void main(String[] args) {

		Hoe Hoe = new Hoe();
		Hoe.texture = " Hoe";
		Hoe.toughness = 5;
		Hoe.IDnum = 100;
		Hoe.blockdirt = true;
		System.out.println("\r\n" + "        .__                                   _____  __   \r\n"
				+ "  _____ |__| ____   ____   ________________ _/ ____\\/  |_ \r\n"
				+ " /     \\|  |/    \\_/ __ \\_/ ___\\_  __ \\__  \\\\   __\\\\   __\\\r\n"
				+ "|  Y Y  \\  |   |  \\  ___/\\  \\___|  | \\// __ \\|  |   |  |  \r\n"
				+ "|__|_|  /__|___|  /\\___  >\\___  >__|  (____  /__|   |__|  \r\n"
				+ "      \\/        \\/     \\/     \\/           \\/             ");
		System.out.println("================================================");
		System.out.println("Texture:" + Hoe.texture);
		System.out.println("toughness:" + Hoe.toughness);
		System.out.println("IDnum:" + Hoe.IDnum);
		if (Hoe.blockdirt == true) {
			Hoe.arar();
		} else {
			Hoe.mine();
		}

	}

}
