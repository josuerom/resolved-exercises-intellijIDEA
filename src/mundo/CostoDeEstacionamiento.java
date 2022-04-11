package mundo;

import javax.swing.JOptionPane;

public class CostoDeEstacionamiento {

    public static void main(String[] args) {
        calcularPago();
    }

    public static void calcularPago() {
        int cantidad_horas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas horas mantuvo el vehiculo en el parqueadero?"));
        int pago_total = 0, dias = 0, horas = 0;

        dias = (cantidad_horas / 24);
        horas = cantidad_horas - (24 * dias);

        if (cantidad_horas >= 1 && cantidad_horas <= 3 ) {
            pago_total = (cantidad_horas * 20);
        }
        if (cantidad_horas > 3 && cantidad_horas < 24) {
            pago_total = (3 * 20) + (cantidad_horas-3) * 15;
        }
        if (cantidad_horas == 24) {
            pago_total = 250;
        }
        if (cantidad_horas > 24) {
            pago_total = (dias * 250) + (horas * 15);
        }
        if (cantidad_horas <= 0) {
            JOptionPane.showMessageDialog(null, "ERROR. Debes ingresar un número de hora válido.");
        } else {
            JOptionPane.showMessageDialog(null, "El vehiculo estuvo estacionado: " + dias + " días y " + (horas) + " horas," + " el" +
                    " total a pagar es = $" + pago_total);
        }
    }
}