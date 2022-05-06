package mundo;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
  *@author Josué Romero
  *@param  6/mayo/2022 - 4:33 COL
*/
public class ContadorDePalabras {
    
    public static void main(String[] args) {
        String cuento = "   Había  una ves   una niña   llamada   Julieth que le    gustaba su bicicleta    ";
        int  acc = 0, i = 0, j = 1;
        String repetida = "";
        System.out.println("Cadena a modificar: " + cuento);
        
        // Con el método trim() se eliminan los espacios iniciales y finales del String cuento
        cuento = cuento.trim();
        
        // Expresión regular
        // Pattern.compile fija el patron: si hay más de un espacio seguido
        Pattern exp = Pattern.compile("[  ]+");
        // Matcher evalua, ¿la cadena CUENTO contiene más de un espacio seguido?
        Matcher mat = exp.matcher(cuento);
        // A aquellos caracteres que tengan más de un espacio, reemplacelas por solo un espacio
        String resultado = mat.replaceAll(" ");
        // Imprimo la cadena reemplazada 
        System.out.println("Cadena reemplazada: " + resultado);
        // Imprimo la cantidad de palabras que contiene la cadena  reemplazada
        String[] str = resultado.split(" ");
        System.out.println("La cantidad de palabras son: " + str.length);
        
        while (i < str.length-2) {
            while (j < str.length-1) {
                if (str[i].equals(str[j])) {
                    repetida = str[i];
                    acc++;
                }
                j++;
            }
            i++;
        }
        System.out.println("La palabra [" + repetida + "] se repite " + acc + " veces.");
    }
}
