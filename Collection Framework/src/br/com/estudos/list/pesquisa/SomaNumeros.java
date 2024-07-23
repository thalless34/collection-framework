package br.com.estudos.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

	private List<Integer> somaList;
	
	public SomaNumeros() {
		this.somaList = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		this.somaList.add(numero);
	}
	
	public int calcularSoma() {
		int soma = 0;
		for(Integer numero : somaList) {
			soma += numero;
		
		}
		return soma;
	}
	
	public int encontrarMaiorNumero() {
		int maiorNumero = Integer.MIN_VALUE;
		if(!somaList.isEmpty()) {
			for(Integer numero : somaList) {
				if(numero >= maiorNumero) {
					maiorNumero = numero;
				}
			}
			return maiorNumero;
		}else {
			throw new RuntimeException("a lista esta vazia!");
		}
	}
	
	public int encontrarMenorNumero() {
		int menorNumero = Integer.MAX_VALUE;
		if(!somaList.isEmpty()) {
			for(Integer numero : somaList) {
				if(numero <= menorNumero) {
					menorNumero = numero;
				}
			}
			return menorNumero;
		}else {
			throw new RuntimeException("a lista esta vazia!");
		}
	}
	
	public void exibirNumeros() {
		if(!somaList.isEmpty()) {
			System.out.println(this.somaList);
		}else {
			throw new RuntimeException("a lista esta vazia!");
		}
	}
	
	public static void main(String[] args) {
		
		SomaNumeros soma = new SomaNumeros();
		
		soma.adicionarNumero(5);
	    soma.adicionarNumero(0);
	    soma.adicionarNumero(0);
	    soma.adicionarNumero(-2);
	    soma.adicionarNumero(10);
	    
	    System.out.println("numeros adicionados: ");
	    soma.exibirNumeros();
	    
	    System.out.println("\nsoma dos numeros = " + soma.calcularSoma());
	    
	    System.out.println("\nmaior numero = " + soma.encontrarMaiorNumero());
	    
	    System.out.println("\nmenor numero = " + soma.encontrarMenorNumero());
	}
	
}














