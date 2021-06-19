package br.com.fiap.banco.entity;

public interface Transferivel {
	boolean realizarDoc (int nrBanc, int nrAgencia, int nrConta, double valor);
	boolean realizarTec (int nrBanc, int nrAgencia, int nrConta, double valor);
	default boolean realizarTransferenciaInterna(int nrAgencia, int nrConta, double valor) {
		// regra de negócio
		return true;
	}
	
}
