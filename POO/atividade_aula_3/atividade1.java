package atividade_aula_3;

public class atividade1 {
    public static void main(String[] args) {
        int [] numeros = {10, 25, 7, 40, 3};

        int soma = 0;
        int maior = numeros[0];

        for(int i = 0; i < numeros.length; i++) {
            soma += numeros[i];

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("Soma total: " + soma);
        System.out.println("Maior numero: " + maior);
    }
}
