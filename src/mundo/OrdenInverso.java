package mundo;

import java.util.Scanner;

public class OrdenInverso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];
        
        for (int j = 0; j < 5; j++) {
          System.out.print((j+1) + ". Ingrese un número: ");
          numbers[j] = sc.nextInt();
        }

        System.out.print("\nEl array inverso es = [");

        for (int i = (numbers.length - 1); i >= 0; i--) {
            //int  = numbers[i];
            if (i > 0) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i] + "]");
            }
        }
    }
}