
/**
 * @author Javier Moran - 8-757-1938
 * @description: Haga un programa que lea dos cadenas, por teclado, determine si son iguales.
 *
 */
import java.io.IOException;
import java.util.*;

public class ValidarCadenasIguales {
	private String cadena1, cadena2;

	public void init() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Cadena 1:");
			cadena1 = scan.nextLine();

			System.out.print("Cadena 2:");
			cadena2 = scan.nextLine();
			scan.close();

			if (cadena1.equals(cadena2)) {
				System.out.println("Las cadenas son iguales.");
			} else {
				System.out.println("Las cadenas son distintas.");
			}
		}
	}

	public static void main(String[] args) throws IOException {
		ValidarCadenasIguales obj = new ValidarCadenasIguales();
		obj.init();
	}
}
