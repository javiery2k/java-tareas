
/**
 * @author Javier Moran - 8-757-1938
 * @description: Haga un programa que genere la serie de FIBONACCI. 0 1 1 2 3 5 8 13 21 .......
 *
 */
import java.io.IOException;

public class Fibonacci {
	int serie, num1, num2, suma;

	/**
	 * Inicializamos valores
	 */
	public Fibonacci() {
		serie = 20;
		num1 = 0;
		num2 = 1;
		suma = 1;
	}

	public void init() {
		System.out.println("Generamos la serio de Fibonacci para " + serie + " numeros\n");
		System.out.println(num1);

		for (int i = 1; i < serie; i++) {
			System.out.println(suma);

			suma = num1 + num2;
			num1 = num2;
			num2 = suma;
		}
	}

	public static void main(String[] args) throws IOException {
		Fibonacci obj = new Fibonacci();
		obj.init();
	}
}
