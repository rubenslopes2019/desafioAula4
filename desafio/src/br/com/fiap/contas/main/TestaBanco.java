package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Banco;
import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.ContaPoupanca;

public class TestaBanco {

	public static void main(String[] args) {
		Banco banco = new Banco( "CaelumBank" , 999 );
		
		ContaCorrente c1 = new ContaCorrente();
		c1.setTitular( "Batman" );
		c1.setNumero( 1.0 );
		c1.setAgencia( "1000" );
		c1.deposita( 100000 );
		banco.adiciona(c1);

		ContaPoupanca c2 = new ContaPoupanca();
		c2.setTitular( "Coringa" );
		c2.setNumero( 2.0 );
		c2.setAgencia( "1000" );
		c2.deposita( 890000 );
		banco.adiciona(c2);		
		
		
		for ( int i = 0 ; i < 5 ; i++) {
			ContaCorrente conta = new ContaCorrente();
			conta.setTitular( "Titular " + i);
			conta.setNumero((double) i);
			conta.setAgencia("1000");
			conta.deposita(i * 1000 );
			banco.adiciona(conta);
			}
		
		banco.mostraContas();

	}
	
	

}
