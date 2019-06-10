package br.com.zup.teste;

import java.util.Calendar;

import br.com.zup.modelo.Carro;

public class CarroTeste {

	public static void main(String[] args) {
		// Classe para testar o Carro

		Carro c = new Carro();
		System.out.println("Carro Entrada " + c.getDataEntrada());
		System.out.println("Carro Saida " + c.getDataSaida());
		
		c.setDataEntrada(Calendar.getInstance().getTime());
		c.setDataSaida(Calendar.getInstance().getTime());
		
		System.out.println("Carro Entrada " + c.getDataEntrada());
		System.out.println("Carro Saida " + c.getDataSaida());
	}

}
