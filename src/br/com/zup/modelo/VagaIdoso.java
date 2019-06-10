package br.com.zup.modelo;

import java.util.List;

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
	
	// Método para calcular vagas de idoso
	public int quantidadeVagasIdoso(int quantidadeTotal) {
		
		int vagasIdoso = 0;
		
		// Calculo
		vagasIdoso = (quantidadeTotal * 5) / 100;
		System.out.println("A quantidade de vagas para idoso é de: " + vagasIdoso);
		
		return vagasIdoso;
		
	}
	

}
