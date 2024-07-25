package br.com.estudos.set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

	private long cod;
	private String nome;
	private double preco;
	private int qntd;

	public Produto(long cod, String nome, double preco, int qntd) {
		super();
		this.cod = cod;
		this.nome = nome;
		this.preco = preco;
		this.qntd = qntd;
	}

	@Override
	public int compareTo(Produto p) {
		// TODO Auto-generated method stub
		return nome.compareToIgnoreCase(p.getNome());
	}
	public long getCod() {
		return cod;
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return cod == other.cod;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod);
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + cod + ", nome=" + nome + ", preco=" + preco + ", qntd=" + qntd + "]";
	}


}


class ComparatorPorPreco implements Comparator<Produto>{

	@Override
	public int compare(Produto p1, Produto p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
	
	
	
}







