package exerciciosMetoosJava;

import java.util.Random;

public class Exerc7 {
	
	public static int GerarNumeroAleatorio() {
		
	    // Método que gera um número aleatório entre 1 e 100
		Random random = new Random();
		
		return random.nextInt(100) + 1; // Gera um valor entre 0 e 99 e soma 1 para garantir que fique entre 1 e 100
	}

	public static void main(String[] args) {
		
		int numeroAleatorio = GerarNumeroAleatorio();
		System.out.println("Número aleatório gerado: " + numeroAleatorio);
	
	}

}
