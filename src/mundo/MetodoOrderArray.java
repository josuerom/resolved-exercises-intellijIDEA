package mundo;

import java.util.Arrays;
import java.util.Scanner;

public class MetodoOrderArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.print((i+1) + ". Ingrese un número: ");
            arreglo[i] = sc.nextInt();
        }
        System.out.println("\nArreglo Original: " + Arrays.toString(arreglo));
        orderArray(arreglo);
    }

    public static void orderArray(int[] arr) {
        int el = 0;

        for (int i = 0; i < arr.length-1; i++) {//i=0
            for (int j = 0; j < arr.length-1; j++) {//j=0
                if (arr[j] > arr[j+1]) {
                    el = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = el;
                }
            }
        }
        System.out.println("Arreglo Ordenado: " + Arrays.toString(arr));
    }
}