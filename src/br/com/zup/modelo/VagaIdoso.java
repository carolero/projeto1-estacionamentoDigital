package br.com.zup.modelo;

public class VagaIdoso extends Vaga {
	
	// Atributos
	private int quantidadeVagasIdosos;
	
	// Construtor
	public VagaIdoso(String tipoDeVaga, boolean disponibilidade, int quantidadeVagasIdosos) {
		super(tipoDeVaga, disponibilidade);
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
