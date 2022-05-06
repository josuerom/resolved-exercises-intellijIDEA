package mundo;

/*
 * Saber cuántas veces se repite un caracter
 */
public class CaracterRepetido {

    public static void main(String[] args) {
        String cadena = "Neovim pa MI es un BuenEdItor de interfaz grafIca";
        String[] text = cadena.split("");
        int n = 0;
        
        for (int i = 0; i < text.length; i++) {
            if (text[i].equalsIgnoreCase("I")) {
                n++;
            }
        }
        System.out.println("El caracter I se repite " + n + " veces.");
    }
}
