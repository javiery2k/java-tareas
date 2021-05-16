
/**
 * @author Javier Moran - 8-757-1938
 * @description: Ingrese una cadena por teclado valide su longitud, si tiene menos de 5 caracteres, rellene hasta 10 con una X.
 *
 */

import java.io.IOException;
import java.util.*;

public class ValidarCadena {
	private String cadena1;
	private Integer pending, longitud;

	public void init() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Ingrese la cadena:");
			cadena1 = scan.nextLine();
			scan.close();

			longitud = cadena1.length();
			System.out.printf("\nLongitud de la cadena: %s caracteres", longitud);
			if (longitud < 5) {
				pending = 10 - longitud;
				for (int x = 0; x < pending; x++) {
					cadena1 = cadena1 + "X";
				}

				System.out.printf("\nNueva cadena generada: %s", cadena1);
			} else {
				System.out.printf("\nLa cadena tiene mas de 5 caracteres");
			}
		}
	}

	public static void main(String[] args) throws IOException {
		ValidarCadena obj = new ValidarCadena();
		obj.init();
	}
}
