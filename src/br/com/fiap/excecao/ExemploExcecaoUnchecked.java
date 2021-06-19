package br.com.fiap.excecao;

import java.text.ParseException;

public class ExemploExcecaoUnchecked {

	public static void main(String[] args) {
		
		try {
			int val = 10 / 0;
			
			int[] valores = new int[3];
			System.out.println(valores[4]);
			
			String nome = null;
			System.out.println(nome.length());
			
			int numero = Integer.parseInt("zero");
			
//		} catch (ArithmeticException e) {
//			System.err.println("Não é possóvel realizar uma divisão por zero!");
//			// Mensagem com a lista de erros
//			System.err.println(e.getMessage());
//			//Imprime a pilha de erro da exceção
//			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Não é possível acessar a posição 4 do array!");
			// Mensagem com a lista de erros
			System.err.println(e.getMessage());
			//Imprime a pilha de erro da exceção
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.err.println("Não foi possível retornar o length, variável nome não instanciada!");
			// Mensagem com a lista de erros
			System.err.println(e.getMessage());
			//Imprime a pilha de erro da exceção
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println("Não foi possível realizar a conversão!");
		}catch (Exception e) {
			System.err.println("Erro na execução do programa!");
		}finally {
			System.out.println("Sempre vai passar aqui!");
		}
	}
}
