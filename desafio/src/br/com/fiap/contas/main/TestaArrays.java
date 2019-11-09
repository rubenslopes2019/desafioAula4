package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {

		Conta[] contas = new Conta[10];
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente("conta" + i, (double) i, "0001");
			conta.deposita(i * 100.0);
			contas[i] = conta;
		}

		for (int i = 0; i < contas.length; i++) {
			System.out.println(contas[i].toString() + "saldo: " + contas[i].getSaldo());
		}

	}

}
