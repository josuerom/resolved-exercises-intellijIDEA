package mundo;

public class PositivosNegativosYCeros {

    public static void main(String[] args) {
        int[] numbers = new int[] {0, 4, -1, 90, -54, 0, 345, 67, -987, -56, 67, -8, 0, 890};
        int acc_positivos = 0, acc_negativos = 0, acc_ceros = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                acc_positivos++;
            } else if (numbers[i] < 0) {
                acc_negativos++;
            } else if (numbers[i] == 0) {
                acc_ceros++;
            }
        }
        System.out.println("La cantidad de números positivos es = " + acc_positivos
                + "\nLa cantidad de números negativos es = "+ acc_negativos
                + "\nLa cantidad de ceros es = " + acc_ceros);
    }
}