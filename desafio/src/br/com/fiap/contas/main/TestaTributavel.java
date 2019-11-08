package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.Tributavel;

public class TestaTributavel {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(-330);
		System.out.println(cc.getValorImposto());
		// testando polimorfismo:
		Tributavel t = cc;
		System.out.println(t.getValorImposto());
	}
}
