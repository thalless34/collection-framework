package br.com.estudos.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

	private Map<Long, Produto> produtoMap;

	public EstoqueProduto() {
		super();
		this.produtoMap = new HashMap<>();
	}

	public void adicionarProduto(long cod, String nome, int qntd, double preco) {
		produtoMap.put(cod, new Produto(nome, preco, qntd));
	}

	public void exibirProduto() {
		System.out.println(produtoMap);
	}

	public double calcularValorTotalEstoque() {
		double valorTotalEstoque = 0d;
		if (!produtoMap.isEmpty()) {
			for (Produto p : produtoMap.values()) {
				valorTotalEstoque += p.getQntd() * p.getPreco();
			}
		}
		return valorTotalEstoque;
	}

	public Produto obterProdutoMaisCaro() {
		Produto maisCaro = null;
		double maiorPreco = Double.MIN_VALUE;
		if (!produtoMap.isEmpty())
			for (Produto p : produtoMap.values()) {
				if (p.getPreco() > maiorPreco) {
					maisCaro = p;
					maiorPreco = p.getPreco();
				}
			}
		return maisCaro;
	}

	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		double menorPreco = Double.MAX_VALUE;
		for (Produto p : produtoMap.values()) {
			if (p.getPreco() < menorPreco) {
				produtoMaisBarato = p;
				menorPreco = p.getPreco();
			}
		}
		return produtoMaisBarato;
	}

	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto produtoMaiorQuantidadeValorNoEstoque = null;
		double maiorValorTotalProdutoEstoque = 0d;
		if (!produtoMap.isEmpty()) {
			for (Map.Entry<Long, Produto> entry : produtoMap.entrySet()) {
				double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQntd();
				if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
					maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
					produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
				}
			}
		}
		return produtoMaiorQuantidadeValorNoEstoque;
	}

	public static void main(String[] args) {

		EstoqueProduto estoque = new EstoqueProduto();

		// Exibe o estoque vazio
		estoque.exibirProduto();

		// Adiciona produtos ao estoque
		estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
		estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
		estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
		estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

		// Exibe os produtos no estoque
		estoque.exibirProduto();

		// Calcula e exibe o valor total do estoque
		System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());


		// Obtém e exibe o produto mais caro
		Produto maisCaro = estoque.obterProdutoMaisCaro();
		System.out.println("Produto mais caro: " + maisCaro);

		// Obtém e exibe o produto mais barato
		Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
		System.out.println("Produto mais barato: " + produtoMaisBarato);

		// Obtém e exibe o produto com a maior quantidade em valor no estoque
		Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
		System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
	}
}
