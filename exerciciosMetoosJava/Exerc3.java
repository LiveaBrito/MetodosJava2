package exerciciosMetoosJava;

public class Exerc3 {
	
	public static double CalcularAreaRetangulo(double largura, double altura) {
		return largura * altura;
	}

	public static void main(String[] args) {
		
		double largura = 6.0;
		double altura = 15.0;
		
		double area = CalcularAreaRetangulo(largura, altura);
		System.out.println("A área do retângulo com largura:"+ " " + largura + " " + "e altura:" + " " + altura + " é: " + area);

	}

}
