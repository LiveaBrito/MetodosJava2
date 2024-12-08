package exerciciosMetoosJava;

import java.util.Scanner;

public class Exerc8 {
	
	public static double ConverterCelsiusParaFahrenheit(double celsius) {
		return (celsius * 9/5) + 32;
	}

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Digite a temperatura em fahrenheit: ");
		 double celsius = scan.nextInt();
		 
		 double fahrenheit = ConverterCelsiusParaFahrenheit(celsius);
		 System.out.println(celsius + " graus Celsius é igual a " + fahrenheit + " graus Fahrenheit.");
	}

}
