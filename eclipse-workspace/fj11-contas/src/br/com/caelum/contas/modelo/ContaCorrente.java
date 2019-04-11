package br.com.caelum.contas.modelo;

import br.com.caelum.javafx.api.util.Evento;

public class ContaCorrente extends Conta implements Tributavel {
	
	public String getTipo() {
		return "Conta Corrente";
	}


	public void saca(double valor) {
		this.saldo=this.saldo-(valor+0.10);
	}


	public double getValorImposto() {
		return this.getSaldo()*0.01;
	}
	
	
}
