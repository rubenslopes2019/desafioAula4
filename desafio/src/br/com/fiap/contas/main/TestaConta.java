package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.Tributavel;

public class TestaConta {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(330);
		System.out.println(cc.getTipo());
		System.out.println(cc.getSaldo());
		cc.saca(10);
		System.out.println(cc.getSaldo());
		cc.saca(1000);
		
	
		
	}
}
