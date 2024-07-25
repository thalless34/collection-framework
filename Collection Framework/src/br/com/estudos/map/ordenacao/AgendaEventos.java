package br.com.estudos.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {

	private Map<LocalDate, Evento> eventosMap;

	public AgendaEventos() {
		super();
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
//		Evento evento = new Evento(nome, atracao);
		eventosMap.put(data, new Evento(nome, atracao));
	}
	
//	eventos em ordem cronologica
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				System.out.println(" proximo evento " + entry.getValue() + " será: " + entry.getKey());
				break;
			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		AgendaEventos agendaEventos = new AgendaEventos();
		agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 25), "evento 0", "atracao 0");
		agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "evento 1", "atracao 1");
		agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "evento 2", "atracao 2");
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 10), "evento 3", "atracao 3");
		agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 25), "evento 5", "atracao 5");
		
		agendaEventos.exibirAgenda();
		
		agendaEventos.obterProximoEvento();
		
	}
	
}












