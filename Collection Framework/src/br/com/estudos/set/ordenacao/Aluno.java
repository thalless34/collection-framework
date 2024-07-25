package br.com.estudos.set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {

	private String nome;
	private long matricula;
	private double nota;

	public Aluno(String nome, long matricula, double nota) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}

	@Override
	public int compareTo(Aluno a) {
		// TODO Auto-generated method stub
		return nome.compareToIgnoreCase(a.getNome());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	public String getNome() {
		return nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public double getNota() {
		return nota;
	}

	@Override
	public String toString() {
		return " [Aluno: " + nome + ", Matricula: " + matricula + ", Nota: " + nota + "]\n";
	}

}

class ComparatorPorNota implements Comparator<Aluno>{

	@Override
	public int compare(Aluno a1, Aluno a2) {
		// TODO Auto-generated method stub
		return Double.compare(a1.getNota(), a2.getNota());
	}
	
}
















