package br.com.zup.modelo;

import java.util.List;

public class Vaga {

	// Atributos de vaga
	private String tipoDeVaga;
	private boolean disponibilidade;
	private int vagasIdoso;
	private int vagasDeficiente;
	private int vagasComuns;
	
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

	public int getVagasIdoso() {
		return vagasIdoso;
	}

	public void setVagasIdoso(int vagasIdoso) {
		this.vagasIdoso = vagasIdoso;
	}

	public int getVagasDeficiente() {
		return vagasDeficiente;
	}

	public void setVagasDeficiente(int vagasDeficiente) {
		this.vagasDeficiente = vagasDeficiente;
	}

	public int getVagasComuns() {
		return vagasComuns;
	}

	public void setVagasComuns(int vagasComuns) {
		this.vagasComuns = vagasComuns;
	}

	// Método to String
	@Override
	public String toString() {
		String modelo = "";

		modelo += "Tipo da vaga -> " + this.getTipoDeVaga() + "\n";
		modelo += "Disponibilidade da vaga -> " + this.isDisponibilidade() + "\n";

		return modelo;
	}
	
	// Método para adicionar vagas de Idoso

	// Método para adicionar vagas de Deficiente
	
	// Método para adicionar vagas comuns

}
