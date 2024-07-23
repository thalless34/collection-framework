package br.com.estudos.list.operacoesBasicas;

public class Item {

	private String nome;
	private double preco;
	private int qntd;
	
	public Item(String nome, double preco, int qntd) {
		this.nome = nome;
		this.preco = preco;
		this.qntd = qntd;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQntd() {
		return qntd;
	}

	@Override
	public String toString() {
		return nome + ", R$" + preco + ", qntd " + qntd;
	}
	
	
	
	
}
