package br.com.fiap.banco.entity;

import br.com.fiap.excecao.SaldoInsuficienteException;

public class ContaCorrente extends Conta {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String tipo;
	private double chequeEspecial;
	private double limite;

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
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		valor += 10;
		super.retirar(valor);
	}

	@Override
	public double verificarSaldo() {
		return super.getSaldo() + limite;
	}

	
}
