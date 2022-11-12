import java.util.Scanner;

public class Calculadora {
    public Calculadora() {
    }

    public static void main(String[] args) {
        double valorUm;
        double valorDois;
        double resultado = 0;
        Scanner scann = new Scanner(System.in);

        System.out.println("Escolha uma das operações");
        int indexOp;
        do {
            System.out.println("Escolha uma das operações");
            System.out.println("0 - Soma");
            System.out.println("1 - Subtração");
            System.out.println("2 - Multiplicação");
            System.out.println("3 - Divisão");
            indexOp = scann.nextInt();
            if (indexOp < 0 || indexOp > 3) {
                System.out.println("Operação inexistente\n");
            }
        } while (indexOp < 0 || indexOp > 3);

        System.out.println("Insira o primeiro número: ");
        valorUm = scann.nextDouble();
        System.out.println("Insira o segundo número: ");
        valorDois = scann.nextDouble();
        switch (indexOp) {
            case 0:
                resultado = valorUm + valorDois;
                break;
            case 1:
                resultado = valorUm - valorDois;
                break;
            case 2:
                resultado = valorUm * valorDois;
                break;
            case 3:
                resultado = valorUm / valorDois;
        }

        System.out.println("Resultado da operação " + valorUm + " e " + valorDois + " = " + resultado);
        scann.close();
    }
}

