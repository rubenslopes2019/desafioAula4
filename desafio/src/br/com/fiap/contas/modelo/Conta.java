package br.com.fiap.contas.modelo;

public abstract class Conta {

	public double saldo;

	public abstract String getTipo();
	// {return "Conta";}

	public void saca(double valor) {
		this.saldo -= (0.10);

	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
