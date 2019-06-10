package br.com.zup.modelo;

public class Vaga {
	
	// Atributos de vaga
	private String tipoDeVaga;
	private boolean disponibilidade;

	// Construtor
	public Vaga(String tipoDeVaga, boolean disponibilidade) {
		super();
		this.tipoDeVaga = tipoDeVaga;
		this.disponibilidade = disponibilidade;
	}

	// Getters & Setters
	public String getTipoDeVaga() {
		return tipoDeVaga;
	}

	public void setTipoDeVaga(String tipoDeVaga) {
		this.tipoDeVaga = tipoDeVaga;
	}
	
	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	// Método to String
	@Override
	public String toString() {
		String modelo = "";
		
		
		modelo += "Tipo da vaga -> " + this.getTipoDeVaga() + "\n";
		modelo += "Disponibilidade da vaga -> " + this.getTipoDeVaga() + "\n";
		
		return modelo;
	}

}
