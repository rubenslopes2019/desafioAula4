package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.ContaPoupanca;
import br.com.fiap.contas.modelo.Tributavel;

public class TestaConta {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(330);
		System.out.println(cc.getTipo());
		System.out.println(cc.getSaldo());
		cc.saca(10);
		System.out.println(cc.getSaldo());
		//cc.saca(1000);
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.deposita(200);
		System.out.println(cp.getTipo());
		System.out.println(cp.getSaldo());
		cp.saca(10);
		System.out.println(cp.getSaldo());
		//cc.saca(1000);
		cp.transfere(50, cc);
		System.out.println(cp.getSaldo());
		System.out.println(cc.getSaldo());
		
	}
}
