package br.com.fiap.contas.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String titular, Double numero, String agencia) {
		super(titular, numero, agencia);
	}

	public String getTipo() {
		return "Conta Poupança";
	}

}
