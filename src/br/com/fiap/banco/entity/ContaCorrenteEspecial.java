package br.com.fiap.banco.entity;

import br.com.fiap.excecao.SaldoInsuficienteException;

public class ContaCorrenteEspecial extends ContaCorrente implements Transferivel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double limite;

	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		if (valor > getSaldo() + limite) {
			throw new SaldoInsuficienteException();
		}
		super.retirar(valor);
	}

	@Override
	public double verificarSaldo() {
		return 0;
	}

	@Override
	public boolean realizarDoc(int nrBanc, int nrAgencia, int nrConta, double valor) {
		return false;
	}

	@Override
	public boolean realizarTec(int nrBanc, int nrAgencia, int nrConta, double valor) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
