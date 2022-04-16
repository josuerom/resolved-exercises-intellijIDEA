package mundo;

import java.util.Arrays;

public class MatrizChar {

    public static void main(String[] args) {
        char matriz[][] = new char[3][5];
        char a = 'A';

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = a;
                a++;
            }
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}