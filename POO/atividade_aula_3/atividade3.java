package atividade_aula_3;

public class atividade3 {
    public static void main(String[] args) {
        
        int[] numeros = {1, 2, 3, 9, 12, 88, 114, 1001, 1002, 57};

        int pares = 0;
        int impares = 0;

        for(int i = 0; i < numeros.length; i++) {
            
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de impares: " + impares);
    }
}
