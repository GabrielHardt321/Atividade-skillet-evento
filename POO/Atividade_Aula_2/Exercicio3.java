package Atividade_Aula_2;

import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = leitor.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero e Par.");
        } else {
            System.out.println("O numero e Impar");
        }

        leitor.close();
    }
}
