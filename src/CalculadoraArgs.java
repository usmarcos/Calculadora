public class CalculadoraArgs {
    public static void main(String[] args) {
        double valor1 = Double.valueOf(args[0]);
        double valor2 = Double.valueOf(args[1]);
        double resultado = valor1 + valor2;
        System.out.println("Resultado da soma de " + valor1 + " e " + valor2 + " = " + resultado);
    }
}