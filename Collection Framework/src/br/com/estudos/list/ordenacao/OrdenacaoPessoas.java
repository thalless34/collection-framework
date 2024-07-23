package br.com.estudos.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

	private List<Pessoa> pessoaList;

	public OrdenacaoPessoas() {
		this.pessoaList = new ArrayList<>();
	}

	public void adicionarPessoas(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		return pessoasPorAltura;
	}

	public static void main(String[] args) {
		
		OrdenacaoPessoas ordenacaoPessoa = new OrdenacaoPessoas();
		ordenacaoPessoa.adicionarPessoas("tas", 26, 1.86);
		ordenacaoPessoa.adicionarPessoas("shaq", 46, 2.13);
		ordenacaoPessoa.adicionarPessoas("bam", 27, 2.06);
		ordenacaoPessoa.adicionarPessoas("jimmy", 34, 2.01);
		
		System.out.println(ordenacaoPessoa.ordenarPorIdade());
		System.out.println("\n" + ordenacaoPessoa.ordenarPorAltura());
		
	}
	
	
}








