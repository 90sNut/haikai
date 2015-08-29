package com.mkyong;

public class Item {

	String nome;
	int tempoUsandoEclipse;

	public Item(String nome, int tempoUsandoEclipse) {
		
		this.nome = nome;
		this.tempoUsandoEclipse = tempoUsandoEclipse;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTempoUsandoEclipse() {
		return tempoUsandoEclipse;
	}

	public void setTempoUsandoEclipse(int tempoUsandoEclipse) {
		this.tempoUsandoEclipse = tempoUsandoEclipse;
	}
	
}
