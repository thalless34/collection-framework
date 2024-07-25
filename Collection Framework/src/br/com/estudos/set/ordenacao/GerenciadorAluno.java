package br.com.estudos.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAluno {

	private Set<Aluno> alunoSet;

	public GerenciadorAluno() {
		super();
		this.alunoSet = new HashSet<>();
	}
	
	public void adicionarAluno(String nome, long matricula, double nota) {
		alunoSet.add(new Aluno(nome, matricula, nota));
	}
	
	public void removerAluno(long matricula) {
		Aluno expulsarAluno = null;
		for(Aluno a : alunoSet) {
			if(a.getMatricula() == matricula) {
				expulsarAluno = a;
				break;
			}
		}
		alunoSet.remove(expulsarAluno);
	}
	
	public Set<Aluno> exibirPorNome(){
		Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
		return alunosPorNome;
	}
	
	public Set<Aluno> exibirPorNota(){
		Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
		alunosPorNota.addAll(alunoSet);
		return alunosPorNota;
	}
	
	public void exibirAlunos() {
		System.out.println(alunoSet);
	}
	
	public static void main(String[] args) {
		GerenciadorAluno aluno = new GerenciadorAluno();
		
		aluno.adicionarAluno("tas", 123, 4);
		aluno.adicionarAluno("cami", 124, 0);
		aluno.adicionarAluno("ana", 125, 7);
		aluno.adicionarAluno("joyce", 126, 5.1);
		aluno.adicionarAluno("zebra", 127, 10);
		
		System.out.println(aluno.exibirPorNota());
		aluno.removerAluno(126);
		aluno.exibirAlunos();
		
	}
	
}
















