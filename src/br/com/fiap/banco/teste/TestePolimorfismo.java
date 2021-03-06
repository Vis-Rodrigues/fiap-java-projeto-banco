package br.com.fiap.banco.teste;

import br.com.fiap.banco.entity.Conta;
import br.com.fiap.banco.entity.ContaCorrente;
import br.com.fiap.banco.entity.ContaPoupanca;

public class TestePolimorfismo {

	public static void main(String[] args) {
		
		Conta conta1 = new ContaPoupanca();
		conta1.depositar(1000);
		try {
			conta1.retirar(100);
		
		ContaCorrente conta2 = new ContaCorrente();
		conta2.depositar(1000);
		conta2.retirar(100);
		
		Conta conta3 = new ContaCorrente();
		conta3.depositar(1000);
		conta3.retirar(100);
		
		System.out.println("Conta1: "+ conta1.getSaldo());
		System.out.println("Conta2: "+ conta2.getSaldo());
		System.out.println("Conta3: "+ conta3.getSaldo());
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
