package mundo.SueldoMayor;

import javax.swing.JOptionPane;
//import java.util.Scanner;
//import java.text.DecimalFormat;

/**
 * @author Josué Romero
 * @date  6/abril/2022 - 20:53 COL
*/
public class SueldoMayor {
    
    public static void main(String[] args) {
        int el = Integer.parseInt(JOptionPane.showInputDialog("¿Cantidad de sueldos que capturará?"));
        int sueldoMayor = 0;
        int[] sueldos = new int[el];
        
        for (int i = 0; i < el; i++) {
            sueldos[i] = Integer.parseInt(JOptionPane.showInputDialog("Intruduce el sueldo " + (i+1) + "."));
            
            if (i > 0) {
                if (sueldos[i-1] > sueldos[i]) {
                    sueldoMayor = sueldos[i-1];
                }
            }
        }
        JOptionPane.showMessageDialog(null, "El sueldo mayor es: $" + sueldoMayor);
    }
}
