package aeroporto;

import avioes.Aviao;

public class Hangar {
	public static void main(String[] args) {
		Aviao boeing777 = new Aviao();
		boeing777.ano = 2016;
		boeing777.cor = "branco";
		boeing777.envergadura = 64.8;
		boeing777.tremPouso = false;
		System.out.println("Avião: boeing 777");
		System.out.println("Ano: " + boeing777.ano);
		System.out.println("Cor: " + boeing777.cor);
		System.out.println("Envergadura: " + boeing777.envergadura);
		boeing777.ligar();
		boeing777.acelerar();
		if (boeing777.tremPouso == true) {
			boeing777.aterrizar();
		} else {
			System.out.println("ARREMETER!");
		}		
		System.out.println("__________________________________");		
		Aviao AirbusA380 = new Aviao();
		AirbusA380.ano = 2018;
		AirbusA380.cor = "amarelo";
		AirbusA380.envergadura = 79.2;
		boeing777.tremPouso = true;
		System.out.println("Avião: AirbusA380");
		System.out.println("Ano: " + AirbusA380.ano);
		System.out.println("Cor: " + AirbusA380.cor);
		System.out.println("Envergadura: " + AirbusA380.envergadura);
		AirbusA380.ligar();
		AirbusA380.acelerar();
		AirbusA380.acelerar();
		if (boeing777.tremPouso == true) {
			boeing777.aterrizar();
		} else {
			System.out.println("ARREMETER!");
		}
	}
}
