package br.com.estudos.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> itemList;
	
	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int qntd) {
		itemList.add(new Item(nome, preco, qntd));
	}
	
	public void removerItem(String nome) {
		List<Item> itemParaRemover = new ArrayList<>();
		for(Item i : itemList) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				itemParaRemover.add(i);
			}
		}
		itemList.removeAll(itemParaRemover);
	}
	public void exibirItens() {
		System.out.println(itemList);
	}
	public double calcularValorTotal() {
	    double valorTotal = 0d;
	    if (!itemList.isEmpty()) {
	      for (Item item : itemList) {
	        double valorItem = item.getPreco() * item.getQntd();
	        valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
	      }
	      return valorTotal;
	    } else {
	      throw new RuntimeException("A lista está vazia!");
	    }
	  }
	
	public static void main(String[] args) {
		CarrinhoDeCompras cdc = new CarrinhoDeCompras();
		cdc.adicionarItem("tenis", 249.99, 1);
		cdc.adicionarItem("tenis", 249.99, 1);
		cdc.adicionarItem("bola", 249.99, 2);
		System.out.println("valor total: " + cdc.calcularValorTotal());
		cdc.removerItem("tenis");
		cdc.exibirItens();
		
	}
}





