package br.com.zup.modelo;

import java.util.List;

public class EstacionamentoDois {
	
	private List<Vaga> vagas;

	public List<Vaga> getVagas() {
		return vagas;
	}

	public void setVagas(List<Vaga> vagas) {
		this.vagas = vagas;
	}
	
	public void add(Vaga vaga) {
		this.vagas.add(vaga);
	}
	
}
