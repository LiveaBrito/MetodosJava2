package exerciciosMetoosJava;

public class Exerc4 {
	
	public static double CalcularPerimetroCirculo(double raio) {
		return 2 * Math.PI * raio;
	}

	public static void main(String[] args) {
		double raio = 9.0;
		
		double perimetro = CalcularPerimetroCirculo(raio);
		System.out.println("O per�metro do circulo com raio de " + " " + raio + " �: " + perimetro);

	}

}
