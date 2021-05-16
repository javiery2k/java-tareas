
/**
 * @author Javier Moran - 8-757-1938
 * @description: Realizar un programa que permita pedir 50 números enteros y determine e imprima cuantos son pares, impares, positivos y negativos.
 *
 */
import java.io.IOException;
import java.util.*;

public class NumerosEnteros {
	int i, totalEvaluar, valor, c_pares, c_impares, c_positivos, c_negativos, c_errores;

	/**
	 * Inicializamos valores
	 */
	public NumerosEnteros() {
		totalEvaluar = 50;
		c_pares = 0;
		c_impares = 0;
		c_errores = 0;
		c_positivos = 0;
		c_negativos = 0;
	}

	public void init() {

		for (i = 1; i <= totalEvaluar; i++) {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.print("Ingrese un numero: ");
				valor = scan.nextInt();
				if (valor % 2 == 0) {
					c_pares++;
				} else {
					c_impares++;
				}

				if (valor < 0) {
					c_negativos++;
				} else {
					c_positivos++;
				}

			} catch (Exception e) {
				System.out.println("\tERROR: El valor introducido no es numero entero.");
				System.out.println("\tERROR: Este valor no se contara en las estadisticas.\n");
				c_errores++;
			}
		}
		System.out.println("\n-------------------------------");
		System.out.println("Estadistica");
		System.out.println("-------------------------------");
		System.out.println("Pares: " + c_pares);
		System.out.println("Impares: " + c_impares);
		System.out.println("Positivos: " + c_positivos);
		System.out.println("Negativos: " + c_negativos);
		System.out.println("Valores no numericos introducidos: " + c_errores);
	}

	public static void main(String[] args) throws IOException {
		NumerosEnteros obj = new NumerosEnteros();
		obj.init();
	}
}
