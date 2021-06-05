package br.com.fiap.banco;

/**
 * Classe que abstrai uma Conta Bancária
 * 
 * @author inmetrics
 * @version 1.0
 */
public class Conta {

	/**
	 * Número da COnta
	 */
	private int numero;
	/**
	 * Número da Agencia
	 */
	private int agencia;
	/**
	 * Saldo da conta
	 */
	private double saldo;
	/**
	 * Cliente dono da conta
	 * @see Cliente
	 */
	private Cliente cliente;

	public Conta() {
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
	 * 
	 * @param valor
	 *            Valor a ser depositado
	 */
	public void depositar(double valor) {
		this.saldo += valor;
	}

	/**
	 * Retira um valor do saldo da conta
	 * 
	 * @param valor
	 *            Valor a ser retirado
	 */
	public void retirar(double valor) {
		this.saldo -= valor;
	}

}
