package carros;

public class Salao {
	
	public static void main(String[] args) {
		Carro ferrari = new Carro();
		ferrari.ano = 2012;
		ferrari.cor = "Vermelho";
		System.out.println("Carro: Ferrari");
		System.out.println("Ano: " + ferrari.ano);
		System.out.println("Cor: " + ferrari.cor);
		ferrari.ligar();
		ferrari.acelerar();		
		System.out.println("__________________________________");
		
		Carro fusca = new Carro();
		fusca.ano = 1967;
		fusca.cor = "Azul";
		System.out.println("Carro: Fusca");
		System.out.println("Ano: " + fusca.ano);
		System.out.println("Cor: " + fusca.cor);
		fusca.ligar();
		fusca.acelerar();
		fusca.acelerar();
		fusca.desligar();		
		System.out.println("__________________________________");
		
		Carro bmw = new Carro();
		bmw.ano = 2021;
		bmw.cor = "Branco";
		System.out.println("Carro: bmw");
		System.out.println("Ano: " + bmw.ano);
		System.out.println("Cor: " + bmw.cor);
		bmw.ligar();
		bmw.acelerar();
		bmw.acelerar();
		bmw.desligar();
	}

}
