package br.com.fiap.banco.teste;

import br.com.fiap.banco.entity.Conta;
import br.com.fiap.banco.entity.ContaCorrente;
import br.com.fiap.banco.entity.ContaPoupanca;

public class TesteHeranca {
	
	public static void main(String[] args) {
//		Herança
//		Conta conta = new Conta();
		ContaCorrente corrente = new ContaCorrente();
		corrente.setAgencia(1111);
		corrente.setNumero(3222);
		corrente.setTipo("PF");
		corrente.setChequeEspecial(1000);
		
		System.out.println(corrente.getSaldoDisponivel());
		
		
//		Cast		
//		if(conta instanceof Conta)
//			System.out.println("o obejto cc é do tipo conta");
			
		Conta conta = new ContaCorrente();
		if(conta instanceof Conta)
			System.out.println("o obejto cc é do tipo conta");
		
		conta = new ContaPoupanca();
		if(conta instanceof ContaCorrente) {
			ContaCorrente cc = (ContaCorrente) conta;
			System.out.println(cc.getSaldoDisponivel());
			System.out.println("o obejto cc é do tipo conta");
		}else {
			System.out.println("o obejto cc não é do tipo conta");
		}

		try {
//			Cast
//			ContaCorrente c = (ContaCorrente) new Conta();
//			System.out.println(c.getAgencia());
		} catch (ClassCastException e) {
			System.out.println("lançou a exceção de ClassCastException");
			e.printStackTrace();
		}
	}
}
