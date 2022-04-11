package mundo;

import java.util.Arrays;

public  class TresItemsPorArray {

    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] b = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
        int[] c = new int[24];
        int i = 1, x = 0, m = 0, n = 0;

        while (i <= 4) {
            for (int j = 0; j < 3; j++) {//j=2
                c[x] = a[m];
                m++;
                x++;
            }

            for (int k = 0; k < 3; k++) {
                c[x] = b[n];
                n++;
                x++;
            }
            i++;
        }
        System.out.println("El arreglo queda así: " + Arrays.toString(c));
    }
}