package exerciciosMetoosJava;

public class Exerc5 {
	
	public static int ObterMenorNumero(int numero1, int numero2, int numero3) {
		int menorNumeros = Math.min(numero1,numero2);
		return Math.min(menorNumeros, numero3);
	}

	public static void main(String[] args) {
		
		int n1 = 25;
		int n2 = 56;
		int n3 = 2;
		
		int menor = ObterMenorNumero(n1, n2, n3);
		System.out.println("O menor numero é " + menor);

	}

}
