package mundo.NotasAlumnos;

//import java.util.Scanner;
import javax.swing.JOptionPane;
//import java.text.DecimalFormat;

/**
 * @author Josué Romero
 * @date  6/abril/2022  8:13p.m COL
*/
public class NotasAlumnos {
    
    public static void main (String[] args) {
        float[] notas = new float[6];
        int accAprobados = 0, accReprobados = 0, accExelentes = 0;

        for (int i = 0; i < 6; i++) {
            notas[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del alumno " + (i+1) + ":"));

            if (notas[i] >= 9.5f && notas[i] <= 10) {
                accExelentes++;
            }
            if (notas[i] >= 5 && notas[i] <= 9.4f) {
                accAprobados++;
            }
            if (notas[i] <= 4.9f && notas[i] >= 0) {
                accReprobados++;
            } else {
                JOptionPane.showMessageDialog(null, "ERROR. Debe ingresar una nota valida entre [0-10].");
            }
        }
        JOptionPane.showMessageDialog(null, "Cantidad de alumnos exelentes: " + accExelentes
                + "\nCantidad de alumnos aprobados: " + (accAprobados+accExelentes)
                + "\nCantidad de alumnos reprobados: " + accReprobados);
    }
}
