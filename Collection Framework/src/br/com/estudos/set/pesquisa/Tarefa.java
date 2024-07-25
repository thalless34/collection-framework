package br.com.estudos.set.pesquisa;

public class Tarefa {

	private String descricao;
	private boolean concluida;
	
	public Tarefa(String descrica, boolean concluida) {
		super();
		this.descricao = descricao;
		this.concluida = concluida;
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean isConcluida() {
		return concluida;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

	@Override
	public String toString() {
		return "Tarefa [descricao=" + descricao + ", concluida=" + concluida + "]";
	}
	
	
	
	
}
