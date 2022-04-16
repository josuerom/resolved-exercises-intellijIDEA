package mundo;

import java.util.Arrays;
import java.util.Scanner;

public class EliminarPosicionArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Arreglo Original: " + Arrays.toString(arreglo));
        System.out.print("\nIngrese la posición del item del arreglo que desea eliminar [0-9] -> ");
        int posicion = sc.nextInt();

        for (int i = posicion; i < 9; i++) {
            arreglo[i] = arreglo[i+1];
        }
        arreglo[9] = 0;
        System.out.println("Nuevo Arreglo: " + Arrays.toString(arreglo));
    }
}