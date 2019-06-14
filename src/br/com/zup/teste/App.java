package br.com.zup.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import br.com.zup.modelo.Vaga;

public class App {

	public static void main(String[] args) {
		
		Calendar calendario = Calendar.getInstance();
		
		// Criando lista estacionamento
		List<Vaga> estacionamentoVagas = new ArrayList<Vaga>();

		int vagasCarro;
		int vagasMoto;
		int vagasIdoso;
		int vagasDeficiente;
		int vagasComum = 0;
		int totalVagas;
		
		// Inicializando scanner
		Scanner scan = scanner();
		
		// Perguntar ao usuário a quantidade de vagas para carro
		System.out.println("Quantas vagas para carro terão seu estacionamento?");
		vagasCarro = scan.nextInt();
		
		// Perguntar ao usuário a quantidade de vagas para moto
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

		System.out.println("Vagas idoso: " + vagasIdoso);
		System.out.println("Vagas deficiente: " + vagasDeficiente);
		System.out.println("Vagas comuns: " + vagasComum);
		
		// Gerando as vagas e adicionando à lista
		for (int i = 1; i <= vagasIdoso; i++) {
			estacionamentoVagas.add(new Vaga("I" + i, true));
		}
		
		for (int j = 1; j <= vagasDeficiente; j++) {
			estacionamentoVagas.add(new Vaga("D" + j, true));
		}
		
		for (int k = 1; k <= vagasComum; k++) {
			estacionamentoVagas.add(new Vaga("C" + k, true));
		}
		
		//System.out.println(estacionamentoVagas);
		
		// Váriavel para controle do while
		int controle = 1;
		
		// While para escolha de opções
		while (controle == 1) {
			
			// Inicializando Scanner
			Scanner scanWhile = scanner();
			
			 int opcao;
			
			System.out.println("Escolha uma das opções à seguir:\n"
					+ "1- Para entrada no estacionamento;\n"
					+ "2- Para saida no estacionamento;");
			opcao = scanWhile.nextInt();
			
			// Condições para validação de escolha
			if (opcao == 1) {
				
				
				
				System.out.println("Se quiser continuar digite 1, para parar digite 0.");
				controle = scanWhile.nextInt();
				
			} else if (opcao == 2) {
				
				System.out.println("Se quiser continuar digite 1, para parar digite 0.");
				controle = scanWhile.nextInt();
				
			} else {
				
				System.err.println("Opção inválida.");
				
			}
			
		}

	}
	
	// Método Scanner
	public static Scanner scanner() {

		Scanner scan = new Scanner(System.in);
		return scan;

	}

}
