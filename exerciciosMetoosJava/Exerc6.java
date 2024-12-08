package exerciciosMetoosJava;

import java.util.Scanner;

public class Exerc6 {
	
	public static boolean EhPrimo(int numero) {
		if(numero <= 1) return false;
		if(numero == 2) return true;
		for(int i = 2; i*i <=numero; i++) {
			if(numero % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = scan.nextInt();
		
		System.out.println(EhPrimo(numero)? numero + " é primo " : numero + " não é primo");
		
		scan.close();

	}

}
