
/**
 * @author Javier Moran - 8-757-1938
 * @description: Leer el nombre del estudiante y tres notas, calcular e imprimir la nota promedio.
 *
 */
import java.io.IOException;
import java.util.Scanner;

public class NotaPromedio {
	String nombre;
	int nota1, nota2, nota3;
	float promedio;

	void init() throws IOException {
		try (Scanner obj = new Scanner(System.in)) {
			System.out.print("Nombre del Estudiante: ");
			nombre = obj.nextLine();

			System.out.print("Nota 1: ");
			nota1 = obj.nextInt();

			System.out.print("Nota 2: ");
			nota2 = obj.nextInt();

			System.out.print("Nota 3: ");
			nota3 = obj.nextInt();

			promedio = (nota1 + nota2 + nota3) / 3;

			System.out.print("El estudiante " + nombre + " tiene un promedio: " + promedio);
		} catch (Exception e) {
			System.out.print("ERROR - Introduzca un valor valido.");
		}
	}

	public static void main(String[] args) throws IOException {
		NotaPromedio obj = new NotaPromedio();
		obj.init();
	}
}
