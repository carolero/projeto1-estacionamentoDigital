package br.com.zup.teste;

import java.util.Calendar;

import br.com.zup.modelo.Caixa;
import br.com.zup.modelo.Carro;

public class CaixaTeste {

	public static void main(String[] args) {
		// Classe para testar o Caixa
		
		Caixa caixa = new Caixa();
		Carro c  = new Carro();
		
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.DAY_OF_MONTH, 0);
		calendario.set(Calendar.MONTH, 0);
		calendario.set(Calendar.YEAR, 2019);
		calendario.set(Calendar.HOUR_OF_DAY, 0);
		calendario.set(Calendar.MINUTE, 0);
		calendario.set(Calendar.SECOND, 0);
		calendario.set(Calendar.MILLISECOND, 0);
		
	
		c.setDataEntrada(calendario.getTime());
		System.out.println("O Carro entrou: " + c.getDataEntrada());
		
		Calendar calendarioSaida = Calendar.getInstance();
		calendarioSaida.set(Calendar.DAY_OF_MONTH, 0);
		calendarioSaida.set(Calendar.MONTH, 0);
		calendarioSaida.set(Calendar.YEAR, 0);
		calendarioSaida.set(Calendar.HOUR_OF_DAY, 0);
		calendarioSaida.set(Calendar.MINUTE, 0);
		calendarioSaida.set(Calendar.SECOND, 0);
		calendarioSaida.set(Calendar.MILLISECOND, 0);
		c.setDataSaida(calendarioSaida.getTime());
		
		System.out.println("O Carro  saiu: " + c.getDataSaida());
		
		
		double quantosMinutosParado = caixa.calcularHoras(
				c.getDataEntrada(), c.getDataSaida());
		
		double quantasHorasParado = caixa.valorFinal(quantosMinutosParado);
		System.out.println("O carro ficou estacionado " + quantosMinutosParado + " Minutos");
		System.out.println("O carro ficou estacionado " + quantasHorasParado + " Horas");
		
		
		

	}

}
