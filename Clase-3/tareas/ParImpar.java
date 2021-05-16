
/**
 * @author Javier Moran - 8-757-1938
 * @description: Escriba un programa que determine si un n�mero le�do es par o impar. Envi� un mensaje correspondiente.
 *
 */

import java.io.IOException;
import java.util.*;

public class ParImpar {
	private int numero;

	public void init() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Ingrese un numero entero: ");
			numero = scan.nextInt();
			scan.close();

			if (numero % 2 == 0) {
				System.out.println(numero + " es un n�mero par.");
			} else {
				System.out.println(numero + " no es un n�mero par.");
			}

		} catch (Exception e) {
			System.out.println("Error: el valor introducido no es numero entero.\n");
		}
	}

	public static void main(String[] args) throws IOException {
		ParImpar obj = new ParImpar();
		obj.init();
	}
}
