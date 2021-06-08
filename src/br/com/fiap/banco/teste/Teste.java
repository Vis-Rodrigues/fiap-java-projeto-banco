package br.com.fiap.banco.teste;

import br.com.fiap.banco.Conta;

public class Teste {

	public static void main(String[] args) {
		Conta cc = new Conta();
		cc.depositar(50);
		cc.setAgencia(123);
		cc.setNumero(321);
		
		cc.depositar(100);
		if(cc!=null) {
			System.out.println(String.format("Saldo disponível na conta: %s", cc.getSaldo()));
		}
		
		Conta poupanca = new Conta(111,222,1000);
		poupanca.retirar(50);
		System.out.println(String.format("Saldo disponível na poupança: %s", poupanca.getSaldo()));
		
		// Foram criados dois construtores na classe, um recebe double e o outro int, o
		// q vai fazer com q o Java reconheça, que é o construtor double q queremos é o
		// ponto flutuante
		Conta consDouble = new Conta(50.0);
		System.out.println(String.format("Agência: %s e Saldo: %s", consDouble.getAgencia(), consDouble.getSaldo()));
		

	}

}
