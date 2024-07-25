package br.com.estudos.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

	private Map<String, Integer> contagemMap;

	public ContagemPalavras() {
		super();
		this.contagemMap = new HashMap<>();
	}

	public void adicionarPalavra(String palavra, Integer contagem) {
		contagemMap.put(palavra, contagem);
	}

	public void removerPalavra(String palavra) {
		if (!contagemMap.isEmpty()) {
			contagemMap.remove(palavra);
		}
	}

	public int exibirContagem() {
		int contagemTotal = 0;
		for(int contagem : contagemMap.values()) {
			contagemTotal += contagem;
		}
		return contagemTotal;
	}

	public String palavraMaisFrequente() {
		String frequencia = null;
		int maiorFrequencia = 0;
		for (Map.Entry<String, Integer> entry : contagemMap.entrySet()) {
			if (entry.getValue() > maiorFrequencia) {
				maiorFrequencia = entry.getValue();
				frequencia = entry.getKey();
			}
		}
		return frequencia;
	}

	public static void main(String[] args) {

		ContagemPalavras contagemLinguagens = new ContagemPalavras();

		// Adiciona linguagens e suas contagens
		contagemLinguagens.adicionarPalavra("Java", 2);
		contagemLinguagens.adicionarPalavra("Python", 8);
		contagemLinguagens.adicionarPalavra("JavaScript", 1);
		contagemLinguagens.adicionarPalavra("C#", 6);

		// Exibe a contagem total de linguagens
		System.out.println("Existem " + contagemLinguagens.exibirContagem() + " palavras.");

		// Encontra e exibe a linguagem mais frequente
		String linguagemMaisFrequente = contagemLinguagens.palavraMaisFrequente();
		System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);

	}

}
