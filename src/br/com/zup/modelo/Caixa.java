package br.com.zup.modelo;

import java.util.Date;

public class Caixa {
	
	// Método para calcular o tempo de permanência no estacionamento
	public double calcularHoras (Date dataEntrada, Date dataSaida) {
		
		double minutos = 0;
		
		long miliSegundo = dataSaida.getTime() - dataEntrada.getTime();
		
		double segundos = miliSegundo / 1000;
		minutos = segundos / 60;
		
		return minutos;
		
	}
	
	// Método para transformar os minutos em horas
	public long minutosEmHoras (double minutos) {
		
		double horas = minutos / 60;
		return (long) horas;
		
	}
	
	// Método para calcular o preço final a ser pago
	public double valorFinal (double minutos) {
		
		double valorFinal = 0.0;
		
		if (minutos <= 15) {
			
			valorFinal = 0.0;
			
		} else if (minutos > 15 && minutos <= 60) {
			
			valorFinal = 10.0;
			
		} else {
			
			valorFinal = 10;
			double horas = minutosEmHoras(minutos);
			horas = horas - 1;
			valorFinal = valorFinal + horas * 5;
			
		}
		
		return valorFinal;
	}
	
	

}
