package atividade_aula_3;

public class atividade2 {
    public static void main(String[] args) {
        
        double[] notas = {7.5, 8.0, 6.5};

        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println("Media da turma: " + media);
    }
}
