package br.com.fiap.banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestCollection {

	public static void main(String[] args) {
		
		ArrayList carrinho = new ArrayList<>();
		Double valor = 100.55;
		int valor2 = 1;
		int valor3;
		
		carrinho.add(valor);
		carrinho.add("Uva");
		carrinho.add(valor2);
		
		System.out.println(carrinho.get(1));
		
		//Interface List e uso de Generics
		//Generics não permite tipos primitivos
		List<String> carrinho2 = new ArrayList<>();
		System.out.println(carrinho2.isEmpty());
		
		carrinho2.add("Maça");
		carrinho2.add("Morango");
		carrinho2.add("Maça");
		carrinho2.add("Maça");
		carrinho2.set(3, "Pera");

		System.out.println(carrinho2.isEmpty());
		System.out.println(carrinho2.size());
		System.out.println(carrinho2.contains("Maça"));
		System.out.println(carrinho2.indexOf("Maça"));
		System.out.println(carrinho2.get(carrinho2.indexOf("Maça")));
		System.out.println(carrinho2.lastIndexOf("Maça"));
		
		carrinho2.remove(carrinho2.indexOf("Maça"));
		System.out.println(carrinho2);
		
		carrinho2.clear();
		System.out.println(carrinho2.isEmpty());
		
//		Interface Set
		Set<String> cesta = new HashSet<String>();
		
		System.out.println(cesta.isEmpty());
		cesta.add("Maça");
		cesta.add("Maça");
		cesta.add("maça");
		System.out.println(cesta.isEmpty());
		System.out.println(cesta.size());
		System.out.println(cesta);
		
//		Interface Map
		Map<String, String> caixa = new HashMap<>();
		caixa.put("M2225", "Fernando");
		caixa.put("M2226", "Maria");
		caixa.put("M2227", "Soraya");
		
		System.out.println(caixa.isEmpty());
		System.out.println(caixa.size());
		System.out.println(caixa.containsKey("M2225"));
		System.out.println(caixa.containsValue("Maria"));
		System.out.println(caixa);
	}

}
