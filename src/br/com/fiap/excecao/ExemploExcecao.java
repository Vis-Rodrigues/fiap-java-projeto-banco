package br.com.fiap.excecao;

import java.util.Scanner;

public class ExemploExcecao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Lê dois números
		System.out.println("Informe o numero: ");
		int numero1 = sc.nextInt();
		System.out.println("Informe o numero: ");
		int numero2 = sc.nextInt();
		
		try {
			//define trecho onde a exceção pode ocorrer
			//Realiza a divisão
			int divisao = numero1/numero2;
			System.out.println("O resultado é: "+divisao);
		} catch (ArithmeticException e) { //captura da exceção
			//tratamento da excecao
			System.err.println("Erro ao dividir!");
			e.printStackTrace();
		}
		
		sc.close();
	}
}
