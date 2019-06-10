package br.com.zup.modelo;

import java.util.List;

public class VagaDeficiente extends Vaga {
	
	// Atributos
	private int quantidadeVagasDeficiente;

	// Construtor
	public VagaDeficiente(String tipoDeVaga, boolean disponibilidade,
			int quantidadeVagasDeficiente) {
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
	
	// Método de calculo para vagas deficiente
	public int quantidadeVagasDeficiente (int quantidadeTotal) {
		
		int vagasDeficiente = 0;
		
		// Calculo
		vagasDeficiente = (quantidadeTotal * 2) / 100;
		System.out.println("A quantidade de vagas para deficientes é de: " + vagasDeficiente);
		
		return vagasDeficiente;
	}

}
