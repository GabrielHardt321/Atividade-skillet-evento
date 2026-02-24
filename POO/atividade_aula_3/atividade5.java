package atividade_aula_3;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println(); 
        }

        sc.close();
    }
}