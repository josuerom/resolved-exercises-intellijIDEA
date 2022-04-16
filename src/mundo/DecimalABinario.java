package mundo;

import java.util.Scanner;
public class DecimalABinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A qué número desea conocerle el binario -> ");
        int decimal = sc.nextInt();
        int acc = decimal, i = 1, el = 0;
        String invertida = "", binario = "";

        while (i <= acc) {
            if (acc % 2 == 0) {
                invertida += "0";
                el++;
            } else if (acc % 2 == 1) {
                invertida += "1";
                el++;

            }
            // Cada 4 items agrego añado un espacio
            if (el % 4 == 0) {
                invertida += " ";
            }
            acc = acc / 2;
        }
        // Invierto la cadena para que quede de la forma correcta
        for (int indice = invertida.length() - 1; indice >= 0; indice--) {
            binario += invertida.charAt(indice);
        }
        System.out.println(decimal + " en binario es -> " + binario);
    }
}