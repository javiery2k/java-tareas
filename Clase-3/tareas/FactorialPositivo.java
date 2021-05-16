
/**
 * @author Javier Moran - 8-757-1938
 * @description: Diseñe un programa que permita calcular el factorial de un número positivo dado por el usuario.
 *
 */

import java.io.IOException;
import java.util.Scanner;

public class FactorialPositivo {
	int numero;

	public static double factorial(double numero) {
		if (numero == 0)
			return 1;
		else
			return numero * factorial(numero - 1);
	}

	public void init() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Introduzca un numero: ");
			numero = Integer.parseInt(scan.nextLine());
			System.out.println("\n" + numero + "! = " + factorial(numero));
		} catch (NumberFormatException e) {
			System.out.print("ERROR - Introduzca un valor numerico.");
		}
	}

	public static void main(String[] args) throws IOException {
		FactorialPositivo obj = new FactorialPositivo();
		obj.init();
	}
}
