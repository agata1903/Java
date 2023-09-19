package exercicios.contrutores.entidades;

public class Conta {

	private int conta;
	private String titular;
	private double saldo;
	
	public Conta() {	
	}
	public Conta(int conta, String titular, double depositoInicial) {
		this.conta = conta;
		this.titular = titular;
		deposito(depositoInicial);
	}
	public Conta(int conta, String titular) {
		this.conta = conta;
		this.titular = titular;	
	}
	public int getConta() {
		return conta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public double depositoInicial() {
		return saldo += saldo;
	}
	public void deposito(double quantia) {
		saldo += quantia;
	}
	public void saque(double quantia) {
		saldo -= quantia + 5.0;
	}
	public String toString() {
		return "Conta: " + conta + ", Titular: "
				+ titular + ", Saldo: R$" 
				+ String.format("%.2f%n", saldo);
	}
	
}


