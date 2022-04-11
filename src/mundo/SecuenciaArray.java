package mundo;

public class SecuenciaArray {

    public static void main(String[] args) {
        int orden[] = new int[] {1, 3, 5, 7, 9, 10, 8, 6, 4, 2};

        System.out.print("La secuencia es = [");
        for (int i = 0, k = 9, j = 0; i < 5; i++, j++, k--) {
            System.out.print(orden[j] + ", ");
            if (i < 4) {
                System.out.print(orden[k] + ", ");
            } else {
                System.out.print(orden[k] + "]");
            }
        }
    }
}