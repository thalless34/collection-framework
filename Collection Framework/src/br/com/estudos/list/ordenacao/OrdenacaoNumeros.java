package br.com.estudos.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

	private List<Integer> numerosList;

	public OrdenacaoNumeros() {
		this.numerosList = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		this.numerosList.add(numero);
	}
	
	public List<Integer> ordenarAscendente() {
		List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
		Collections.sort(numerosAscendente);
		return numerosAscendente;
	}
	public List<Integer> ordenarDescendente() {
		List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
		numerosAscendente.sort(Collections.reverseOrder());
		return numerosAscendente;
	}
	
	public void exibirNumeros() {
		System.out.println(this.numerosList);
	}
	
	public static void main(String[] args) {
		
		OrdenacaoNumeros numeros = new OrdenacaoNumeros();
		
		numeros.adicionarNumero(2);
	    numeros.adicionarNumero(5);
	    numeros.adicionarNumero(4);
	    numeros.adicionarNumero(1);
	    numeros.adicionarNumero(99);
	    
	    numeros.exibirNumeros();
	    
	    System.out.println("\n" + numeros.ordenarAscendente());
	    numeros.exibirNumeros();
	    System.out.println("\n" + numeros.ordenarDescendente());
	    numeros.exibirNumeros();
	}
	
}
