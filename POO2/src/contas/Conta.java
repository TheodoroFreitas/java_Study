/*
 * POO2 ENCAPSULAMENTO
 * @author teodoro freitas pontes da mota
 */

package contas;

public class Conta {
	
	private double saldo;
	
	private String cliente;
	
	/*
	 * obter o saldo
	 * @return saldo 
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/*
	 * atribuir um valor a variavel saldo
	 * @param saldo 
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/*
	 * obter o nome do cliente
	 * @return cliente
	 */

	public String getCliente() {
		return cliente;
	}
	
	/*
	 * atribuir um valor a variavel cliente
	 * @param saldo 
	 */

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Conta() {
		System.out.println("Agência 0261");
		
	}
	
	/*
	 * exibir saldo da conta
	 */
	
	protected void exibirSaldo() {
		
	System.out.println("saldo: R$ " + saldo);
	
	}
	
	/*
	 * debitar um valor da conta
	 * @param valor
	 */
	protected void sacar(double valor) {
		saldo -= valor;
		System.out.println("Débito: R$ " + valor);
	}
	
	/*
	 * creditar um valor na conta
	 * @param valor
	 */
	
	protected void depositar(double valor) {
		saldo += valor;
		System.out.println("Credito: R$ " + valor);
	}
	
	protected void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Tranferencia: R$ " + valor);
	}
	
}
