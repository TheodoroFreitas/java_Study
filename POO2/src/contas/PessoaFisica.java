/*
 * POO2 ENCAPSULAMENTO
 * @author teodoro freitas pontes da mota
 */

package contas;

public class PessoaFisica {

	public static void main(String[] args) {

		Conta cc1 = new Conta();
		cc1.setCliente("Leandro Ramos");
		cc1.setSaldo(10000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(1000);
		cc1.exibirSaldo();
		cc1.depositar(5000);
		System.out.println("-----------------------------------");
		cc1.exibirSaldo();
		System.out.println("-----------------------------------");


		Conta cc2 = new Conta();
		cc2.setCliente("Teodoro");
		cc2.setSaldo(50000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc2.exibirSaldo();
		cc2.sacar(500);
		cc2.exibirSaldo();
		cc2.depositar(2000);
		System.out.println("-----------------------------------");
		cc2.exibirSaldo();
		System.out.println("-----------------------------------");
		
		
		System.out.println("Transferência");
		System.out.println("");
		cc1.transferir(cc2, 2000);
		System.out.println("leandro para Teodoro");
		System.out.println("cliente: " + cc1.getCliente());
		System.out.println("valor retirado da conta do leandro");
		cc1.exibirSaldo();
		System.out.println("favorecido: " + cc2.getCliente());
		System.out.println("-----------------------------------");
		System.out.println("cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		
		
	}

}
