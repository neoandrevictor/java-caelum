package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.contas.modelo.Data;

public class UsaConta {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();

		c1.setTitular("Hugo");
		c1.setNumero(123);
		c1.setAgencia("45678-9");

		c1.setSaldo(50.0);
		// c1.dataDeAbertura="04/06/2015";

		Data data = new Data();

		data.setDia(04);
		data.setMes(06);
		data.setAno(2015);

		c1.setDataDeAbertura(data);

		c1.deposita(100.0);
		c1.saca(100.0);
		System.out.println("Titular: " + c1.getTitular());
		System.out.println("Agência: " + c1.getAgencia());
		System.out.println("Número: " + c1.getNumero());
		System.out.println("Data de Abertura: " + c1.getDataDeAbertura().formatada());
		System.out.println("Saldo atual: " + c1.getSaldo());

		System.out.println("Rendimento mensal: " + c1.calculaRendimento());
		System.out.println(c1.recuperaDadosParaImpressao());

		Conta c2 = new ContaCorrente();
		c2.setTitular("Danilo");
		c2.setSaldo(100);

		if (c1 == c2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}

		c2 = c1;

		if (c1 == c2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}

		System.out.println(Conta.getIdentificador());

	}
}