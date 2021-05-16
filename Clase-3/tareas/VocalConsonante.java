
/**
 * @author Javier Moran - 8-757-1938
 * @description: Ingrese una cadena por teclado y determine si el primer caracter es una vocal o una consonante.
 *
 */
import java.io.IOException;
import java.util.*;

public class VocalConsonante {
	private String cadena;

	private static boolean esVocal(char letra) {
		return "aeiou".contains(String.valueOf(letra).toLowerCase());
	}

	public void init() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Ingrese la cadena a evaluar: ");
			cadena = scan.nextLine();
			scan.close();

			if (esVocal(cadena.charAt(0))) {
				System.out.printf("La primera letra es la vocal '%s'.", cadena.charAt(0));
			} else {
				System.out.printf("Esta cadena no tiene vocales al inicio.");
			}
		}
	}

	public static void main(String[] args) throws IOException {
		VocalConsonante obj = new VocalConsonante();
		obj.init();
	}
}
