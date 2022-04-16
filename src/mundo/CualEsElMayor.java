package mundo;

import javax.swing.*;

public class CualEsElMayor {

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b:"));

        JOptionPane.showMessageDialog(null, "El número mayor es: " + getMayor(a, b));
    }

    public static int getMayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return  b;
        }
    }
}