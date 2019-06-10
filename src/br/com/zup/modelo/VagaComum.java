package br.com.zup.modelo;

import java.util.List;

public class VagaComum extends Vaga {

	// Atributos
	private int quantidadeVagasComuns;

	// Construtor
	public VagaComum(String tipoDeVaga, boolean disponibilidade, int quantidadeVagasComuns) {
		super(tipoDeVaga, disponibilidade);
		this.quantidadeVagasComuns = quantidadeVagasComuns;
	}
	
	// Getters & Setters
	public int getQuantidadeVagasComuns() {
		return quantidadeVagasComuns;
	}

	public void setQuantidadeVagasComuns(int quantidadeVagasComuns) {
		this.quantidadeVagasComuns = quantidadeVagasComuns;
	}
	
}
