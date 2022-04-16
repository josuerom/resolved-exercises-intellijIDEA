package mundo;

import java.util.Arrays;

public class EspacioParaRepetidos {

    public static void main(String[] args) {
        char[] cadena = new char[] {'a', 'b', 'c', 'c', 'd', 'e', 'e', 'f', 'f', 'g'};
        System.out.println("Arreglo: " + Arrays.toString(cadena));

        for (int i = 0; i < cadena.length-1; i++) {
            if (cadena[i] == cadena[i+1]) {
                cadena[i+1] = ' ';
            }
        }
        System.out.println("Nuevo Arreglo: " + Arrays.toString(cadena));
    }
}