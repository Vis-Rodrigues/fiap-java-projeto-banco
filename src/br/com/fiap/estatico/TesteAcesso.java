package br.com.fiap.estatico;

public class TesteAcesso {

	public static void main(String[] args) {
		
		AcessoCatraca a1 = new AcessoCatraca();
		a1.entrar("Vivi");
		
		AcessoCatraca a2 = new AcessoCatraca();
		a2.entrar("Vi");

		int total = AcessoCatraca.recuperarTotal();
		System.out.println("Total: "+total);
		
		long numero = Math.round(2.0);
		System.out.println("Número arredondado: "+numero);
	}

}
