package mundo;

import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Scanner;

public class MatrizCuadrada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        boolean positivo = true;

        System.out.println("Por favor, dígite solo números positivos.");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();

                if (matriz[i][j] <= 0) {
                    System.err.println("ERROR. Usted ha ingresado un número negativo, intente ejecutar de nuevo.");
                    positivo = false;
                    break;
                }
            }
            if (positivo == false) {
                break;
            }
        }

        if (positivo == true) {
            System.out.println("");
            for (int l = 0; l < 3; l++) {
                for (int i = 0; i < 3; i++) {
                    System.out.print(matriz[l][i] + " ");
                }
                System.out.println("");
            }
        }
    }
}