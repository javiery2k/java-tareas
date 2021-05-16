
/**
 * @author Javier Moran - 8-757-1938
 * @description: Calcular los grados Fahrenheit dados los grados centígrados, imprimir el resultado.
 * @formula: 32 + (9 * gradosC / 5)
 */
import java.io.IOException;
import java.util.Scanner;

public class Fahrenheit {
	double gradosC, gradosF;

	/**
	 * Este es el constructor para definir variables, en nuestro caso las
	 * inicializamos en cero, esto puede ser removido
	 */
	public Fahrenheit() {
		gradosC = 0;
		gradosF = 0;
	}

	void init() throws IOException {
		try (Scanner lector = new Scanner(System.in)) {
			System.out.print("Introduce ºC:");
			gradosC = lector.nextDouble();
			gradosF = 32 + (9 * gradosC / 5);
			System.out.println(gradosC + " ºC = " + gradosF + " ºF");
		} catch (Exception e) {
			System.out.println("ERROR - Introduzca un valor numerico.");
		}
	}

	public static void main(String[] args) throws IOException {
		Fahrenheit obj = new Fahrenheit();
		obj.init();
	}
}