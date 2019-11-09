package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.ContaPoupanca;
import br.com.fiap.contas.modelo.Tributavel;

public class TestaConta {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("paulo", 123.0, "0001");
		cc.deposita(330);
		System.out.println(cc.getTipo());
		System.out.println(cc.getSaldo());
		cc.saca(10);
		System.out.println(cc.getSaldo());
		// cc.saca(1000);

		ContaPoupanca cp = new ContaPoupanca("paulo", 123.0, "0001");
		cp.deposita(200);
		System.out.println(cp.getTipo());
		System.out.println(cp.getSaldo());
		cp.saca(10);
		System.out.println(cp.getSaldo());
		// cc.saca(1000);
		cp.transfere(50, cc);
		System.out.println(cp.getSaldo());
		System.out.println(cc.getSaldo());
		System.out.println(cc.toString());
		
		
		
		 Conta[] contas = new Conta[10];
		 for (int i = 0; i < contas.length; i++) {
		  Conta conta = new ContaCorrente("conta"+i, (double) i, "0001");
		  conta.deposita(i * 100.0);
		  
		  }

	}
}
