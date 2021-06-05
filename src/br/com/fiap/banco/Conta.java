package br.com.fiap.banco;

/**
 * Classe que abstrai uma Conta Bancária
 * @author inmetrics
 * @version 1.0
 */
public class Conta {
	
	/**
	 * Número da COnta
	 */
	public int numero;
	/**
	 * Número da Agencia
	 */
	public int agencia;
	/**
	 * Saldo da conta
	 */
	public double saldo;
	public Cliente cliente;
	
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
	
	/**
	 * Depositar um valor ao saldo da conta
	 * @param valor Valor a ser depositado
	 */
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * Retira um valor do saldo da conta
	 * @param valor Valor a ser retirado
	 */
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	
	/**
	 * Verifica o saldo da conta
	 * @return Valor do saldo da conta
	 */
	public double verificarSaldo() {
		return this.saldo;
	}
	
}
