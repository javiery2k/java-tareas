

/**
 * @author Javier Moran - 8-757-1938
 * @description: Diseñe un programa que calcule e imprima el cuadrado y el cubo de los primeros 25 números.
 *
 */

import java.io.IOException;
public class CuadradoCubo {
	public void init() {
		int longitud = 25;
		int[] numero = new int[longitud + 1];
		int[] cuadrado = new int[longitud + 1];
		int[] cubo = new int[longitud + 1];

		int i;
		System.out.printf("    #  |    n2     |    n3    \n");
		System.out.printf("------------------------------\n");
		for (i = 1; i <= longitud; i++) {
			numero[i] = (int) i;
			cuadrado[i] = numero[i] * numero[i];
			cubo[i] = cuadrado[i] * numero[i];
			System.out.printf("   %2d  |    %3d    |    %d    \n", numero[i], cuadrado[i], cubo[i]);
		}
	}

	public static void main(String[] args) throws IOException {
		CuadradoCubo obj = new CuadradoCubo();
		obj.init();
	}
}
