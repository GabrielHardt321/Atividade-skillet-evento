public class Main {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Gabriel";
        aluno1.peso =  80;

        Treino treino1 = new Treino();
        treino1.tipo = "Costas";
        treino1.duracao = 60;

        Instrutor instrutor1 = new Instrutor();
        instrutor1.nome = "Carlos";
        instrutor1.cref = "12345";

        instrutor1.montarTreino();
        treino1.iniciarTreino();
        aluno1.realizarTreino();
    }
}
