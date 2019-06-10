package br.com.zup.teste;

import java.beans.FeatureDescriptor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.zup.modelo.EstacionamentoDois;
import br.com.zup.modelo.Vaga;

public class TesteVaga {

	public static void main(String[] args) {

		List<Vaga> estacionamentoVagas = new ArrayList<Vaga>();
		
		Scanner scan = scanner();

		int vagasCarro;
		int vagasMoto;
		int vagasIdoso;
		int vagasDeficiente;
		int vagasComum = 0;
		int totalVagas;

		// Perguntar ao usuário a quantidade de vagas para carro
		System.out.println("Quantas vagas para carro terão seu estacionamento?");
		vagasCarro = scan.nextInt();

		System.out.println("Quantas vagas para moto terão seu estacionamento?");
		vagasMoto = scan.nextInt();

		// Total de vagas no geral
		totalVagas = vagasCarro + vagasMoto;

		// Calculo para vagas de idoso
		vagasIdoso = (vagasCarro * 5) / 100;

		// Calculo para vagas de deficiente
		vagasDeficiente = (vagasCarro * 2) / 100;
		
		int vagasEspeciais = vagasIdoso + vagasDeficiente;
		
		// Calculo para vagas comuns
		vagasComum = vagasCarro - vagasEspeciais;

		System.out.println(vagasIdoso);
		System.out.println(vagasDeficiente);
		System.out.println(vagasComum);

		for (int i = 1; i <= vagasIdoso; i++) {
			
			estacionamentoVagas.add(new Vaga("I" + i, true));
			
		}
		
		for (int j = 1; j <= vagasDeficiente; j++) {
			
			estacionamentoVagas.add(new Vaga("D" + j, true));
			
		}
		
		for (int k = 1; k <= vagasComum; k++) {
			
			estacionamentoVagas.add(new Vaga("C" + k, true));
			
		}
		
		System.out.println(estacionamentoVagas);
		
	}

	// Método Scanner
	public static Scanner scanner() {

		Scanner scan = new Scanner(System.in);
		return scan;

	}

}
