package exerciciosMetoosJava;

import java.util.Random;

public class Exerc7 {
	
	public static int GerarNumeroAleatorio() {
		
	    // M�todo que gera um n�mero aleat�rio entre 1 e 100
		Random random = new Random();
		
		return random.nextInt(100) + 1; // Gera um valor entre 0 e 99 e soma 1 para garantir que fique entre 1 e 100
	}

	public static void main(String[] args) {
		
		int numeroAleatorio = GerarNumeroAleatorio();
		System.out.println("N�mero aleat�rio gerado: " + numeroAleatorio);
	
	}

}
