package mundo.VentaDeAzucar;

import java.util.Scanner;

public class VentaDeAzucar {
	
		public static void main (String[] args) {
			int kilos[] = new int[5];
			int codigo = 1, pague = 0, accPague = 0, accFacturas = 0, accKilos = 0;

			Scanner sc = new Scanner(System.in);
			
			for (int i = 0, j = 0; i < 5; i++, j++) {
				System.out.println("*-------- Cliente No. " + (i+1) + " --------*");
				System.out.print("Inserte el código del producto: ");
				codigo = sc.nextInt();
				System.out.print("Inserte la cantidad de kilos vendidos: ");
				kilos[i] = sc.nextInt();
				
				pague = (kilos[i] * 1900);
				accPague += pague;
				System.out.print("El total a pagar por esos " + kilos[i] + " kg es = " + pague + "\n\n");

				if (pague > 10000) {
					accFacturas++;
				}
			}
			
			System.out.println("\nFacturación total = " + accPague);
			for (int i : kilos) {
					accKilos += i;
			}
			System.out.println("Cantidad de kilos vendidos = " + accKilos);
			System.out.println("Cantidad de facturas emitidas por más de $10.000 pesos = " + accFacturas);
		}
}
