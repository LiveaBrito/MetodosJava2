package exerciciosMetoosJava;

public class Exerc10 {

	  public static double CalcularHipotenusa(double cateto1, double cateto2) {
	        // Usando o Teorema de Pitágoras para calcular a hipotenusa
	        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
	    }

	    public static void main(String[] args) {

	    	double cateto1 = 3.0;
	        double cateto2 = 4.0;

	        double hipotenusa = CalcularHipotenusa(cateto1, cateto2);
	        System.out.println("A hipotenusa é: " + hipotenusa);
	    }
}
