package br.com.fiap.banco;

import br.com.fiap.excecao.SaldoInsuficienteException;

public class ContaCorrente extends Conta {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String tipo;
	private double chequeEspecial;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	public double getSaldoDisponivel() {
		return super.getSaldo() + this.chequeEspecial;
	}
	
	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		valor += 10;
		super.retirar(valor);
	}
	
}
