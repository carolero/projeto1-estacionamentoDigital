package br.com.zup.modelo;

public class Vaga {
	
	// Atributos de vaga
	private String tipoDeVaga;

	// Construtor
	public Vaga(String tipoDeVaga) {
		super();
		this.tipoDeVaga = tipoDeVaga;
	}

	// Getters & Setters
	public String getTipoDeVaga() {
		return tipoDeVaga;
	}

	public void setTipoDeVaga(String tipoDeVaga) {
		this.tipoDeVaga = tipoDeVaga;
	}
	
	// Método to String
	@Override
	public String toString() {
		String modelo = "";
		
		
		modelo += "Tipo da vaga -> " + this.getTipoDeVaga() + "\n";
		
		return modelo;
	}

}
