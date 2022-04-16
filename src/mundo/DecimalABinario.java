package mundo;

import java.util.Scanner;

public class DecimalABinario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A qué número desea conocerle su binario -> ");
        int decimal = sc.nextInt();
        int acc = 0, el = 0;

        for (int i = 0; i < decimal; i++) {
            acc = decimal / 2;

            if (decimal % 2 == 0) {

            } else if (decimal %2 == 1) {

            }
        }
    }
}