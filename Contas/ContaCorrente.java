package Contas;

public class ContaCorrente {
	private double saldo;
	private int conta;
	private int acesso = 0;
	
	public ContaCorrente(int c) {
		conta = c;
	}
	
	public void deposito (double d) {
		saldo += d;
	}
	
	public void retirada (double r) {
		saldo -= r;
	}
	
	public double getSaldo () {
		return saldo;
	}
	
	public void setSaldo(double s) {
		saldo = s;
	}
	
	public int getNumeroDaconta() {
		return conta;
	}
	
	public int getAcesso() {
		return acesso;
	}
	
	public void incrementAcesso() {
		acesso++;
	}
}