package mundo;

import javax.swing.JOptionPane;

public class Practica01 {

    public static void main(String[] args) {
        int[] ventas = new int[10];
        int  acc = 0, el = 0;

        for (int i = 0; i < 10; i++) {
            el = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la venta del día " + (i+1)));
            ventas[i] = el;

            if (ventas[i] > 2000) {
                System.out.println(ventas[i]);
                acc++;
            }
        }
        System.out.println("Solo [" + acc + "] ventas superarón los $2000.");
    }
}
