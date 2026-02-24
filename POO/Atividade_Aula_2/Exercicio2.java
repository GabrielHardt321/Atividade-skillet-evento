package Atividade_Aula_2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = leitor.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = leitor.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = leitor.next().charAt(0);

        switch (operacao) {
            case '+':
                System.err.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.err.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.err.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Nao pode dividir por zero");
                }
                break;
            default:
                System.out.println("Operacao invalida.");
        }

        leitor.close();
    }
    
}