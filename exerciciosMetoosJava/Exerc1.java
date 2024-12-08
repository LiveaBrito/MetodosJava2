package exerciciosMetoosJava;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exerc1 {
	
	public static void ExibirHoraAtual() {
		LocalTime horaAtual = LocalTime.now();
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
		
		System.out.println(horaAtual.format(formato));
	}

	public static void main(String[] args) {
		
		ExibirHoraAtual();
	}

}
