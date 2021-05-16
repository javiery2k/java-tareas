
/**
 * @author Javier Moran - 8-757-1938
 * @description: Cuente la cantidad de vocales que contiene una frase cuyo final este dado por un punto.
 *
 */

import java.io.IOException;
import java.util.Scanner;

public class ContarVocales {
	private String cadena;

	private static boolean esVocal(char letra) {
		return "aeiou".contains(String.valueOf(letra).toLowerCase());
	}

	private void cuenta_vocales() {
		int vocales = 0;
		String[] arreglo = cadena.split("\\.");
		cadena = arreglo[0];

		for (int x = 0; x < cadena.length(); x++) {
			char letraActual = cadena.charAt(x);
			if (esVocal(letraActual))
				vocales++;
		}
		System.out.printf("\nCadena: " + cadena);
		System.out.printf("\nCantidad de vocales: %d", vocales);
	}

	public void init() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Ingrese la cadena a evaluar: ");
			cadena = scan.nextLine();
			scan.close();
			this.cuenta_vocales();
		}
	}

	public static void main(String[] args) throws IOException {
		ContarVocales ref = new ContarVocales();
		ref.init();
	}
}
