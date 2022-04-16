package mundo;

import java.util.Arrays;
import java.util.Random;

public class MenorArray {

    public static void main(String[] args) {
        Random ale = new Random();
        int[] vector = new int[10];
        int numero_menor = 0;

        for (int i = 0; i < 10; i++) {
            vector[i] = ale.nextInt(100) + 1;
        }

        for (int i = 0; i < 9; i++) {
            if (vector[i] < vector[i + 1]) {
                numero_menor = vector[i];
            }
        }
        System.out.println("Arreglo aleatorio: " + Arrays.toString(vector) + "\n"
                + "El número menor es: " + numero_menor);
    }
}