package br.com.zup.modelo;

import java.util.List;

public class VagaIdoso extends Vaga {
	
	// Atributos
	private int quantidadeVagasIdosos;
	
	// Construtor
	public VagaIdoso(String tipoDeVaga, boolean disponibilidade, List<Vaga> vagas, List<Vaga> carros, List<Vaga> motos,
			int quantidadeVagasIdosos) {
		super(tipoDeVaga, disponibilidade, vagas, carros, motos);
		this.quantidadeVagasIdosos = quantidadeVagasIdosos;
	}

	// Getters & Setters
	public int getQuantidadeVagasIdosos() {
		return quantidadeVagasIdosos;
	}

	public void setQuantidadeVagasIdosos(int quantidadeVagasIdosos) {
		this.quantidadeVagasIdosos = quantidadeVagasIdosos;
	}
	

}
