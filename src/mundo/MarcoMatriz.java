package mundo;

import java.util.Arrays;

public class MarcoMatriz {

    public static void main(String[] args) {
        int[][] matriz = new int[4][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == 0 || i == matriz.length - 1) {
                    matriz[i][j] = 1;
                }

                if (j == 0 || j == matriz.length - 1) {
                    matriz[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}