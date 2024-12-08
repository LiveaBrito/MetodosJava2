package exerciciosMetoosJava;

public class Exerc9 {

	public static String InverterString(String str) {
        // Utiliza StringBuilder para inverter a string
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        // Exemplo de string para inverter
        String original = "Exemplo";

        // Chama o método InverterString e imprime o resultado
        String invertida = InverterString(original);
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }

}
