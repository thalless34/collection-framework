package br.com.estudos.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	private Set<Produto> produtosSet;

	public CadastroProdutos() {
		super();
		this.produtosSet = new HashSet<>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int qntd) {
		produtosSet.add(new Produto(cod, nome, preco, qntd));
	}
	
	public Set<Produto> exibirPorNome(){
		Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
			return produtosPorNome;
	}
	
	public Set<Produto> exibirPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtosSet);
		return produtosPorPreco;
	}
	
	public static void main(String[] args) {
		
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		cadastroProdutos.adicionarProduto(1L, "produto 5", 15d, 5);
		cadastroProdutos.adicionarProduto(2L, "produto 0", 20d, 10);
		cadastroProdutos.adicionarProduto(1L, "produto 3", 10d, 2);
		cadastroProdutos.adicionarProduto(9L, "produto 9", 2d, 2);
		
		System.out.println(cadastroProdutos.produtosSet);
		
		System.out.println(cadastroProdutos.exibirPorNome());
		
		System.out.println(cadastroProdutos.exibirPorPreco());
		
	}
	
}














