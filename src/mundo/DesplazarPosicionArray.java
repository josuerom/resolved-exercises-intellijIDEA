package mundo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DesplazarPosicionArray {

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ultimo_numero = numbers[9];

        for (int i = 8; i >= 0; i--) {
            numbers[i+1] = numbers[i];//2 -> 1
        }
        numbers[0] = ultimo_numero;
        System.out.println("El array queda así: " + Arrays.toString(numbers));
    }
}