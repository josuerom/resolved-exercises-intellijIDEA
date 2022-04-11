 package mundo;

import java.util.Arrays;
import java.util.Scanner;

public class InsertarNumerosOrdenados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];
        int nuevo_numero, posicion = 0;

        System.out.println("Por favor, ingrese 5 números de forma creciente y ordenados.");
        for (int i = 0; i < 5; i++) {
            System.out.print("Arreglo numbers[" + (i) + "]: ");
            numbers[i] = sc.nextInt();
        }

        System.out.print("\nIngrese un número más: ");
        nuevo_numero = sc.nextInt();
        System.out.println("\nArreglo Original: " + Arrays.toString(numbers));

        /* Conozco la posición en la que debe ir, si los números son crecientes */
        for (int i = 0; i < 5; i++) {
            if (nuevo_numero > numbers[i]) {
                posicion++;
            }
        }

        /* Corro las posicones a los números mayores al insertado */
        int x = posicion, y = 4;
        while ((x+1) < 6) {
            numbers[y+1] = numbers[y];
            x++;
            y--;
        }

        numbers[posicion] = nuevo_numero;
        System.out.println("Arreglo Ordenado: " + Arrays.toString(numbers));
    }
}