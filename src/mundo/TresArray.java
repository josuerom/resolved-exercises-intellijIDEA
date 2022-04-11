package mundo;

import java.util.Arrays;

public class TresArray {

    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = new int[] {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[] c = new int[20];

        for (int i = 0, j = 0, k = 0; i < 10; i++, j++, k++) {
            c[j] = a[k];
            j++;
            c[j] = b[k];
        }
        System.out.println("Nuevo Array = " + Arrays.toString(c));
    }
}