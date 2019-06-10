package br.com.zup.modelo;

import java.util.List;

public class Vaga {
	
	// Atributos de vaga
	private String tipoDeVaga;
	private boolean disponibilidade;
	private List<Vaga> vagas;
	private List<Vaga> carros;
	private List<Vaga> motos;

	// Construtor
	public Vaga(String tipoDeVaga, boolean disponibilidade, List<Vaga> vagas, List<Vaga> carros, List<Vaga> motos) {
		super();
		this.tipoDeVaga = tipoDeVaga;
		this.disponibilidade = disponibilidade;
		this.vagas = vagas;
		this.carros = carros;
		this.motos = motos;
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
	
	public List<Vaga> getVagas() {
		return vagas;
	}

	public void setVagas(List<Vaga> vagas) {
		this.vagas = vagas;
	}

	public List<Vaga> getCarros() {
		return carros;
	}

	public void setCarros(List<Vaga> carros) {
		this.carros = carros;
	}

	public List<Vaga> getMotos() {
		return motos;
	}

	public void setMotos(List<Vaga> motos) {
		this.motos = motos;
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
