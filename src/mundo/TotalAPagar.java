package mundo;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;
import java.text.Format;

/**
  *@author Josué Romero
  *@date 11/abril/2022 - 11:37 COL
*/
public class TotalAPagar {
    static int cantidad_piezas = 0;
    static int precio_piezas = 0;

    public static void main(String[] args) {
        TotalAPagar cliente = new TotalAPagar();
        cantidad_piezas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de piezas compradas:"));
        precio_piezas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de una pieza:"));

        cliente.totalAPagar();
    }

    public void totalAPagar() {
        DecimalFormat df = new DecimalFormat("###,###");
        double total = 0;

        if (cantidad_piezas >= 100) {
            total = (double) (cantidad_piezas * precio_piezas) - (precio_piezas * 0.20 * cantidad_piezas);
            JOptionPane.showMessageDialog(null, "Obtuvo 20% de descuento por pieza, el total a pagar es = $" + df.format(total));
        } else {
            total = (cantidad_piezas * precio_piezas);
            JOptionPane.showMessageDialog(null, "Usted no obtuvo descuento, el total a pagar es = $" + df.format(total));
        }
    }
}
