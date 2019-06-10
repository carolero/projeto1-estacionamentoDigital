package br.com.zup.modelo;

import java.util.Calendar;
import java.util.Scanner;

public class Estacionamento {
	
	public static void main(String[] args) {
		
		// Criando carro
		Carro carro = new Carro();
		
		// Entrando no estacionamento
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.DAY_OF_MONTH, 1);
		calendario.set(Calendar.HOUR_OF_DAY, 10);
		calendario.set(Calendar.MINUTE, 20);
		
		// Registrar a hora de entrada
		carro.setDataEntrada(calendario.getTime());
		System.out.println("O carro entrou às: " + carro.getDataEntrada());
		
		// Saindo do estacionamento
		Calendar calendarioSaida = Calendar.getInstance();
		calendarioSaida.set(Calendar.DAY_OF_MONTH, 1);
		calendarioSaida.set(Calendar.HOUR_OF_DAY, 10);
		calendarioSaida.set(Calendar.MINUTE, 36);
		carro.setDataSaida(calendarioSaida.getTime());
		
		// Registra o horário de saída
		System.out.println("O carro saiu às: " + carro.getDataSaida());
		
		// Mostrando o tempo em que o carro permaneceu no estacionamento
		Caixa caixa = new Caixa();
		long tempoEstacionado = (long) caixa.calcularHoras(carro.getDataEntrada(), carro.getDataSaida());
		System.out.println("O carro ficou " + tempoEstacionado + " minutos estacionado.");
		
		// Custo
		double custo = caixa.valorFinal(tempoEstacionado);
		System.out.println("O preço total a ser pago é de: R$ " + custo);
		
		// ---------------------
		
		// Interação com o usuário
		// Criando moto
		Moto moto = new Moto();
		
		// Iniciando Scanner
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Que dia a moto está entrando no estacionamento?");
		byte dia = scan.nextByte();
		System.out.println("Que hora a moto está entrando?");
		byte hora = scan.nextByte();
		System.out.println("E em que minuto?");
		byte min = scan.nextByte();
		
		Calendar calendarioMoto = Calendar.getInstance();
		calendarioMoto.set(Calendar.DAY_OF_MONTH, dia);
		calendarioMoto.set(Calendar.HOUR_OF_DAY, hora);
		calendarioMoto.set(Calendar.MINUTE, min);
		
		moto.setDataEntrada(calendarioMoto.getTime());
		System.out.println("A moto entrou às " + moto.getDataEntrada());
		
		// Saída
		System.out.println("Que dia a moto saiu?");
		dia = scan.nextByte();
		System.out.println("Em que horas?");
		hora = scan.nextByte();
		System.out.println("E em que minuto?");
		min = scan.nextByte();
		
		calendarioMoto.set(Calendar.DAY_OF_MONTH, dia);
		calendarioMoto.set(Calendar.HOUR_OF_DAY, hora);
		calendarioMoto.set(Calendar.MINUTE, min);
		
		moto.setDataSaida(calendarioMoto.getTime());
		System.out.println("A moto saiu às " + moto.getDataSaida());
		
		tempoEstacionado = (long) caixa.calcularHoras(moto.getDataEntrada(), moto.getDataSaida());
		System.out.println("A moto ficou " + tempoEstacionado + " minutos estacionada.");
		
		custo = caixa.valorFinal(tempoEstacionado);
		System.out.println("O valor total a pagar é de: R$" + custo);
		
		scan.close();
						
	}
	
}
