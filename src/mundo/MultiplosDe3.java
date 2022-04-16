package mundo;

import java.util.Scanner;

public class MultiplosDe3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int el = 0;

        System.out.print("Cuántos múltiplos de 3 quieres ver? -> ");
        el = sc.nextInt();
        System.out.println("\nLos primeros " + el + " múltiplos de 3 son:");
        el = (el * 3);

        for (int i = 3; i <= el; i+=3) {
            if (i > 2 && i < el) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i + ".");
            }
        }
    }
}