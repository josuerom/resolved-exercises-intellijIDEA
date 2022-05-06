package mundo;

//import java libraries

/**
  *@author Josué Romero
  *@param  6/mayo/2022 - 12:06 COL
*/
public class DistanciaDeHamming {
    
    public static void main(String[] args) {
        String ca1 = "patitosw";
        String ca2 = "PARATOSA";
        String[] texto1 = ca1.split("");
        String[] texto2 = ca2.split("");
        int distancia = 0;

        if (texto1.length != texto2.length) {
            System.out.println("Longitudes distintas");
        } else {
            for (int i = 0; i < texto1.length; i++) {
                if (texto1[i].equalsIgnoreCase(texto2[i])) {
                } else {
                    distancia++;
                }
            }
            System.out.println("La distancia o diferencia de caracteres es " + distancia);
        }
    }
}
