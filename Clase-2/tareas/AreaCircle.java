
/**
 * @author Javier Moran - 8-757-1938
 * @description: Calcular el área de un circulo
 * @formula: Math.PI * (radio * radio);
 */

import java.io.IOException;
import java.util.*;

public class AreaCircle {
	int radio;
	double area;

	/**
	 * Este es el constructor para definir variables, en nuestro caso las
	 * inicializamos en cero, esto puede ser removido
	 */
	public AreaCircle() {
		radio = 0;
		area = 0;
	}

	void init() throws IOException {
		try (Scanner obj = new Scanner(System.in)) {
			System.out.print("Ingrese radio: ");
			radio = obj.nextInt();
			area = Math.PI * (radio * radio);

			System.out.print("\nEl area del Circulo es: " + area);
		} catch (Exception e) {
			System.out.print("ERROR - Introduzca un valor numerico.");
		}
	}

	public static void main(String[] args) throws IOException {
		AreaCircle obj = new AreaCircle();
		obj.init();
	}
}
