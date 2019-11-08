package br.com.fiap.contas.modelo;

public abstract class Conta {
		
	private double saldo;
	
		 public abstract String getTipo();
		 //{return "Conta";}

		public void saca(double valor) {
		}
		
		public void transfere(double valor, Conta conta) {
			 this.saca(valor);
			 conta.deposita(valor);
			 }

		private void deposita(double valor) {
			this.saldo += valor;
			
		}
		 


}
