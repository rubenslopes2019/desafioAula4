package br.com.fiap.contas.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.ContaPoupanca;

public class TestaComparable {

	public static void main(String[] args) {
		
		ContaPoupanca c1 = new ContaPoupanca();
		c1.setTitular( "Robin" );
		c1.setNumero( 3.0 );
		c1.setAgencia( "1000" );
		c1.deposita( 250000 );
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setTitular( "Coringa" );
		c2.setNumero( 2.0 );
		c2.setAgencia( "1000" );
		c2.deposita( 890000 );
		
		ContaCorrente c3 = new ContaCorrente();
		c3.setTitular( "Batman" );
		c3.setNumero( 1.0 );
		c3.setAgencia( "1000" );
		c3.deposita( 100000 );



		
		List< Conta > contas = new ArrayList<>();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		Collections.sort(contas);
		
		System.out.println(contas);
		
		for (int i = 0; i < contas.size(); i++) {
			System.out.print(" - " + contas.get(i).toString());
			System.out.print(" - " + contas.get(i).getTipo());
			System.out.println(" - Saldo: " + contas.get(i).getSaldo());
		}
		
		

	}

}
