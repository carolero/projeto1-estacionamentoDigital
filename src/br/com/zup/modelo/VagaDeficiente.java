package br.com.zup.modelo;

public class VagaDeficiente extends Vaga {
	
	// Atributos
	private int quantidadeVagasDeficiente;

	// Construtor
	public VagaDeficiente(String tipoDeVaga, boolean disponibilidade, int quantidadeVagasDeficiente) {
		super(tipoDeVaga, disponibilidade);
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
