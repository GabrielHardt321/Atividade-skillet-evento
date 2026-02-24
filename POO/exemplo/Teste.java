public class Teste {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        //  0 1 2
        // 0[][][]
        // 1[][][]
        // 2[][][]

        matriz[1][2] = 1000;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");    
            }
            System.out.println();
        }

    }
}