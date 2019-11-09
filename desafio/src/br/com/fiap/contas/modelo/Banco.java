package br.com.fiap.contas.modelo;

public class Banco {
	private String nome;
	private int numero;
	private Conta[] contas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new Conta[10];
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void adiciona(Conta c) {
		for (int i = 0; i < this.contas.length; i++) {
			if (contas[i] == null) {
				contas[i] = c;
				break;
			}
		}
	}

	public void mostraContas() {
		for (int i = 0; i < this.contas.length; i++) {
			if (contas[i] != null) {
			System.out.print("Conta na posição " + i);
			System.out.print(" - " + contas[i].toString());
			System.out.print(" - " + contas[i].getTipo());
			System.out.println(" - Saldo: " + contas[i].getSaldo());
			}
		}
	}

}
