package mundo;

import java.util.Arrays;
import java.util.Random;

public class RellenarMatriz {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                Random ale = new Random();
                matriz[i][j] = ale.nextInt(50) + 1;
            }
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}