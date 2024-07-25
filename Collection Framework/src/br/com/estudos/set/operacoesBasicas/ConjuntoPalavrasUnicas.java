package br.com.estudos.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

	private Set<String> palavraSet;

	public ConjuntoPalavrasUnicas() {
		super();
		this.palavraSet = new HashSet<>();
	}

	public void adicionarPalavra(String palavra) {
		this.palavraSet.add(palavra);
	}

	public void removerPalavra(String palavra) {
		if (palavraSet.contains(palavra)) {
			palavraSet.remove(palavra);
		} else {
			System.out.println("palavra nao encontrada");
		}
	}

	public boolean verificarPalavra(String palavra) {
		return palavraSet.contains(palavra);
	}

	public void exibirPalavra() {
		System.out.println(palavraSet);
	}

	public static void main(String[] args) {

		ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

		// Adicionando linguagens únicas ao conjunto
		conjuntoLinguagens.adicionarPalavra("Java");
		conjuntoLinguagens.adicionarPalavra("Python");
		conjuntoLinguagens.adicionarPalavra("JavaScript");
		conjuntoLinguagens.adicionarPalavra("Python");
		conjuntoLinguagens.adicionarPalavra("C++");
		conjuntoLinguagens.adicionarPalavra("Ruby");

		// Exibindo as linguagens únicas no conjunto
		conjuntoLinguagens.exibirPalavra();

		// Removendo uma linguagem do conjunto
		conjuntoLinguagens.removerPalavra("Python");
		conjuntoLinguagens.exibirPalavra();

		// Removendo uma linguagem inexistente
		conjuntoLinguagens.removerPalavra("Swift");

		// Verificando se uma linguagem está no conjunto
		System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
		System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

		// Exibindo as linguagens únicas atualizadas no conjunto
		conjuntoLinguagens.exibirPalavra();
	}

}
