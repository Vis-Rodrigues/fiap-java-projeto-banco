package br.com.fiap.caixa;

import br.com.fiap.caixa.entity.Produto;

public class Caixa {

	public static void main(String[] args) {
		
//		Estruturas
		System.out.println("===== ESTTRUTURAS =====\n Estruturas de Repetição");
		int qtdProdutos = 5;
		int registro = 0;
		
		while (registro < qtdProdutos) {
			registro++;
			System.out.println(String.format("O produto número %d foi registrado.", registro));
		}
		registro = 0;
		do {
			registro++;
			System.out.println(String.format("O produto número %d foi registrado.", registro));
		}while(registro < qtdProdutos);
		
		for (int i = 1; i <= qtdProdutos; i++) {
			System.out.println(String.format("O caixa registrou o produto %d", i));
		}
		
//		Array
		System.out.println("\"Array\"");
		Produto[] produtos = new Produto[2];
		
		Produto produto = new Produto();
		produto.setNome("Limão");
		produto.setDescricao("Galego");
		produto.setValor(4);
		
		Produto produto2 = new Produto();
		produto2.setNome("Maça");
		produto2.setDescricao("Galã");
		produto2.setValor(5);
		
		produtos[0] = produto;
		produtos[1] = produto2;
		
		for (Produto prod : produtos) {
			System.out.println(prod.toString());
		}
		// 10 corredores com três prateleiras cada
		Produto[][] localizacaoProduto = new Produto[10][3];
		
		localizacaoProduto[0][1] = produto;
		localizacaoProduto[1][1] = produto2;
		
		System.out.println(localizacaoProduto[0][1].getNome());
		
		float exaemploValores[] = {10,20,30,40, 50};
		float exaemploValores2[] = new float[]{10,20,30,40, 50};
		float valores[] = new float[5];
		
		valores[0] = 10;
		valores[1] = 20;
		valores[2] = 30;
		valores[3] = 40;
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println(String.format("%d-do vetor exaemploValores com valor %.2f", i, exaemploValores[i]));
			System.out.println(String.format("%d-do vetor exaemploValores2 com valor %.2f", i, exaemploValores2[i]));
			System.out.println(String.format("%d-do vetor valores com valor %.2f", i, valores[i]));
		}
		
//		Strings
		System.out.println("String");
		String nome;
		nome = new String();
		nome = "Maçã";
		System.out.println(nome);
		
		String nome2 = new String("Maçã");
		System.out.println(nome2);
		
//		Pool de String / cache do Java
		String nome3 = "Maçã";
		System.out.println(nome3);
		
//		concatenar
		String descricao = new String();
		descricao = "tipo Gala, a maçã mais doce do mercado"; 
		
		String propaganda = nome + " " + descricao;
		System.out.println(propaganda);
		
		propaganda = nome.concat(" ").concat(descricao);
		System.out.println(propaganda);
		
		propaganda += "!";
		System.out.println(propaganda);
	}
}
