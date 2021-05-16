
/**
 * @author Javier Moran - 8-757-1938
 * @description: Calcular el área de un triangulo, imprimir los datos de entrada y el resultado.
 * @formula: ((base * altura) / 2)
 */
import java.io.IOException;
import java.util.*;

public class AreaTriangulo {
	double base, altura, resultado;

	/**
	 * Este es el constructor para definir variables, en nuestro caso las
	 * inicializamos en cero, esto puede ser removido
	 */
	public AreaTriangulo() {
		base = 0;
		altura = 0;
		resultado = 0;
	}

	void init() throws IOException {
		try (Scanner obj = new Scanner(System.in)) {
			System.out.print("Ingrese base: ");
			base = obj.nextDouble();

			System.out.print("Ingrese altura: ");
			altura = obj.nextDouble();
			resultado = ((base * altura) / 2);

			System.out.print("\nBase: " + base);
			System.out.print("\nAltura: " + altura);
			System.out.print("\nEl area del Triangulo es: " + resultado);
		} catch (Exception e) {
			System.out.print("ERROR - Introduzca un valor numerico.");
		}
	}

	public static void main(String[] args) throws IOException {
		AreaTriangulo obj = new AreaTriangulo();
		obj.init();
	}
}