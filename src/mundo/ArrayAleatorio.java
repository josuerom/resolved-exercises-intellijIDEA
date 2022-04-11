package mundo;

import java.util.Arrays;
import java.util.Random;

public class ArrayAleatorio {

    public static void main(String[] args) {
        getNumeroMayor();
    }

    public static void getNumeroMayor() {
        Random ale = new Random();
        int[] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = ale.nextInt(100);
        }

        System.out.println("Arreglo aleatorio: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("El número mayor es: " + array[array.length-1]);
    }
}