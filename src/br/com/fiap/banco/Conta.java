package br.com.fiap.banco;

public class Conta {

	int numero;
	int agencia;
	double saldo;
	Cliente cliente;
	
	public Conta() {
	}

	public Conta(int numero, int agencia, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	public Conta(int agencia) {
		this.agencia = agencia;
	}
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public Conta(int agencia, double saldo) {
		// Usando o construtor da linha 13
		this(saldo);
		this.agencia = agencia;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	
	public double verificarSaldo() {
		return this.saldo;
	}
	
}
