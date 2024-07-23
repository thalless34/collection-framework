package br.com.estudos.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	// atributo
	private List<Tarefa> tarefaList;

	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}

	// laço de repeticação para remover items repetidos com base na descrição
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for (Tarefa t : tarefaList) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}

	
	public static void main(String[] args) {
		
		ListaTarefa listaTarefa = new ListaTarefa();
		
		System.out.println("numero total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
	}
}










