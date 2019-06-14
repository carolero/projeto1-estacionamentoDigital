package br.com.zup.teste;

import java.util.Calendar;
import java.util.Date;

public class HorasTeste {
	
	public static void main(String[] args) {
		// Classe para testar as horas (entrada e saída)
		
		Calendar calendario = Calendar.getInstance();
		
		calendario.set(Calendar.DAY_OF_MONTH, 0);
		calendario.set(Calendar.MONTH, 0);
		calendario.set(Calendar.YEAR, 0);
		calendario.set(Calendar.HOUR_OF_DAY, 0);
		calendario.set(Calendar.MINUTE, 0);
		calendario.set(Calendar.SECOND, 0);
		calendario.set(Calendar.MILLISECOND, 0);
		
		
		Calendar calendario1 = Calendar.getInstance();
		
		calendario1.set(Calendar.DAY_OF_MONTH, 0);
		calendario1.set(Calendar.MONTH, 0);
		calendario1.set(Calendar.YEAR, 0);
		calendario1.set(Calendar.HOUR_OF_DAY, 0);
		calendario1.set(Calendar.MINUTE, 0); //15
		calendario1.set(Calendar.SECOND, 0);
		calendario1.set(Calendar.MILLISECOND, 0);
		
		Date d = calendario.getTime();
		Date d1 = calendario1.getTime();
		
		System.out.println(d.getTime());
		System.out.println(d1.getTime());
		
		long milseg = d1.getTime() - d.getTime();
		long seg   = milseg/1000;
		double min   = seg/60;
		double hora  = min/60;
		@SuppressWarnings("unused")
		double dias  = hora/24;
		
		System.out.println(min);
	}

}
