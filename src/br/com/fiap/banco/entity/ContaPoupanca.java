package br.com.fiap.banco.entity;

public class ContaPoupanca extends Conta {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public double verificarSaldo() {
		return getSaldo();
	}

}
