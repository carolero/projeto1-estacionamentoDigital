package br.com.zup.teste;

import java.util.Calendar;
import java.util.Scanner;

import br.com.zup.modelo.Carro;

public class VeiculoTeste {

	public static void main(String[] args) {
		// Classe para testar o Veiculo
		
		
         Carro c = new Carro();
		
		//Entrou com o Carro dia 12 de Janeiro de 2018 as 08:12:23
		
         Calendar calendario = Calendar.getInstance();
		
		calendario.set(Calendar.DAY_OF_MONTH, 0);
		calendario.set(Calendar.MONTH, 0);
		calendario.set(Calendar.YEAR, 0);
		calendario.set(Calendar.HOUR_OF_DAY, 0);
		calendario.set(Calendar.MINUTE, 0);
		calendario.set(Calendar.SECOND, 0);
		calendario.set(Calendar.MILLISECOND, 0);
		
		
		c.setDataEntrada(calendario.getTime());
		System.out.println(c.getDataEntrada());
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o dia");
		String line = sc.nextLine();
		calendario.set(Calendar.DAY_OF_MONTH, Integer.parseInt(line));

		System.out.println("Informe o mes");
		line = sc.nextLine();
		calendario.set(Calendar.MONTH, Integer.parseInt(line) - 1);
		
		System.out.println("Informe o ano");
		line = sc.nextLine();
		calendario.set(Calendar.YEAR, Integer.parseInt(line));
		sc.close();
		System.out.println(calendario.getTime());

	}
	
	

}
