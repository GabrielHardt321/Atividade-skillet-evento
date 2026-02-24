package Atividade_Aula_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.US);

        System.out.print("Digite sua altura: ");
        double altura = leitor.nextDouble();

        System.out.print("Digite seu peso: ");
        double peso = leitor.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Voce esta no peso ideal.");
        } else {
            System.out.println("Voce nao esta no peso ideal.");
        }

        leitor.close();
    }
}