package br.com.zup.teste;

import java.util.Calendar;

import br.com.zup.modelo.Moto;

public class MotoTeste {

	public static void main(String[] args) {
		// Classe para testar a Moto
			
		
			Moto m = new Moto();
			System.out.println("Moto Entrada " + m.getDataEntrada());
			System.out.println("Moto Saida " + m.getDataSaida());
			
			m.setDataEntrada(Calendar.getInstance().getTime());
			m.setDataSaida(Calendar.getInstance().getTime());
			
			System.out.println("Moto Entrada " + m.getDataEntrada());
			System.out.println("Moto Saida " + m.getDataSaida());
	}

}
