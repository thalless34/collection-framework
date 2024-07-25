package br.com.estudos.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	private Set<Contato> contatoSet;

	public AgendaContatos() {
		super();
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatosPorNome = new HashSet<>();
		for(Contato c : contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for(Contato c : contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	public static void main(String[] args) {
		
		AgendaContatos agendaContatos = new AgendaContatos();	
		
		agendaContatos.exibirContatos();
		
		agendaContatos.adicionarContato("camila", 123456);
		agendaContatos.adicionarContato("camila", 0);
		agendaContatos.adicionarContato("camila c", 11111);
		agendaContatos.adicionarContato("camila dio", 222);
		agendaContatos.adicionarContato("dj jones", 3334334);
		agendaContatos.adicionarContato("alisshow", 0);
		
		agendaContatos.exibirContatos();
		
		System.out.println(agendaContatos.pesquisarPorNome("\ncamila\n"));
		
		System.out.println("contato atualizado: " + agendaContatos.atualizarNumeroContato("alisshow", 25));
	}
	
}










