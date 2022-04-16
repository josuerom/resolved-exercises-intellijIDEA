package mundo;

import java.util.Arrays;
import java.util.Scanner;

public class ConocerOrdenArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acc_creciente = 0, acc_decreciente = 0;
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nArreglo: "+ Arrays.toString(arr));

        for (int i = 0; i < 9; i++) {
            if (arr[i] < arr[i+1]) {
                acc_creciente++;
            } else if (arr[i] > arr[i+1]) {
                acc_decreciente++;
            }
        }

        if (acc_creciente == 9) {
            System.out.println("El arreglo está en órden creciente.");
        }
        if (acc_decreciente == 9) {
            System.out.println("El arreglo está en órden decreciente.");
        }
        if (acc_creciente != 9 && acc_decreciente != 9) {
            System.out.println("El arreglo introducido está desordenado.");
        }
    }
}