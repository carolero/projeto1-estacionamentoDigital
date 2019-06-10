package br.com.zup.modelo;

import java.util.List;

public class VagaDeficiente extends Vaga {
	
	// Atributos
	private int quantidadeVagasDeficiente;

	// Construtor
	public VagaDeficiente(String tipoDeVaga, boolean disponibilidade, List<Vaga> vagas, List<Vaga> carros,
			List<Vaga> motos, int quantidadeVagasDeficiente) {
		super(tipoDeVaga, disponibilidade, vagas, carros, motos);
		this.quantidadeVagasDeficiente = quantidadeVagasDeficiente;
	}

	// Getters & Setters
	public int getQuantidadeVagasDeficiente() {
		return quantidadeVagasDeficiente;
	}

	public void setQuantidadeVagasDeficiente(int quantidadeVagasDeficiente) {
		this.quantidadeVagasDeficiente = quantidadeVagasDeficiente;
	}

}
