package br.com.estudos.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

	private Map<String, Integer> agendaContatoMap;

	public AgendaContatos() {
		super();
		this.agendaContatoMap = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	public void exibirContato() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome =  null;
		if(!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}
	
	public static void main(String[] args) {
		
		AgendaContatos contatos = new AgendaContatos();
		
		contatos.adicionarContato("camila", 123456);
		contatos.adicionarContato("camila", 4456);
		contatos.adicionarContato("camila caval", 6666666);
		contatos.adicionarContato("camila dio", 345325436);
		contatos.adicionarContato("josefa", 324324236);
		contatos.adicionarContato("camila", 12121212);
		
		contatos.exibirContato();
		contatos.removerContato("camila dio");
		contatos.exibirContato();
		
		System.out.println("o numero é: " + contatos.pesquisarPorNome("josefa"));
		
		
	}
	
	
}








