package br.com.estudos.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for(Convidado c : convidadoSet) {
			if(c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	public static void main(String[] args) {
		
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		System.out.println("existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set Convidados\n");
		

		conjuntoConvidados.adicionarConvidado("convidado 0", 1234);
		conjuntoConvidados.adicionarConvidado("convidado 1", 1235);
		conjuntoConvidados.adicionarConvidado("convidado 2", 1235);
		conjuntoConvidados.adicionarConvidado("convidado 3", 1236);
		
		System.out.println("existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set Convidados\n");

		conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
		System.out.println("existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set Convidados\n");
		
		conjuntoConvidados.exibirConvidados();
		
	}
	
}








