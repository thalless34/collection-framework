package br.com.estudos.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

	private Map<String, String> dicionarioMap;

	public Dicionario() {
		super();
		this.dicionarioMap = new HashMap<>();
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		dicionarioMap.put(palavra, definicao);
	}
	
	public void removerPalavra(String palavra) {
		if(!dicionarioMap.isEmpty()) {
			dicionarioMap.remove(palavra);
		}
	}
	
	public void exibirPalavra() {
		System.out.println(dicionarioMap);
	}
	
	public String pesquisarPorPalavra(String palavra) {
		String pesquisa = null;
		if(!dicionarioMap.isEmpty()) {
			pesquisa = dicionarioMap.get(palavra);
		}
		return pesquisa;
	}
	
	public static void main(String[] args) {
		
		Dicionario dicionario = new Dicionario();
		
		dicionario.adicionarPalavra("tesao", "safadeza");
		dicionario.adicionarPalavra("riqueza", "dinheiro");
		dicionario.adicionarPalavra("maconha", "erva");
		dicionario.adicionarPalavra("porra", "palavrao");
		dicionario.adicionarPalavra("tesao", "putaria");
		
		dicionario.exibirPalavra();
		dicionario.removerPalavra("porra");
		dicionario.exibirPalavra();
		System.out.println("a definicao é: " + dicionario.pesquisarPorPalavra("maconha"));
		
	}
	
}












