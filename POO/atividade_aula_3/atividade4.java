package atividade_aula_3;

import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = {5, 8, 12, 20, 30};

        System.out.print("Digite um numero: ");
        int numeroProcurado = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroProcurado) {
                encontrado = true;
                break; 
            }
        }

        if (encontrado) {
            System.out.println("Encontrado");
        } else {
            System.out.println("Nao encontrado");
        }

        sc.close();
    }
}