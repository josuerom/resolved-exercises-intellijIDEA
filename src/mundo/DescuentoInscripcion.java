package mundo;

import java.util.Scanner;

public class DescuentoInscripcion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] hermanos = new String[5];
        int[] edades = new int[5];
        int descuento = 0, costo_matricula = 1000;

        for (int i = 0; i < 5; i++) {
            System.out.print("\n" + (i+1) + ". Ingrese la edad del alumno -> ");
            edades[i] = sc.nextInt();
            System.out.print((i+1) + ". El alumno tiene hermanos en la institución -> ");
            hermanos[i] = sc.next();
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            if (edades[i] >= 8 && edades[i] <= 13) {
                if (hermanos[i].toLowerCase().equals("si")) {
                    descuento = (int) (costo_matricula * 0.50);
                    System.out.println("El alumno " + (i+1) + " obtuvo el descuento, costo de la matrícula = " + descuento);
                }
            }
        }
    }
}