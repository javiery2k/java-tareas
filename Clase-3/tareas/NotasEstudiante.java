import java.io.IOException;
import java.util.Scanner;

/**
 * @author Javier Moran - 8-757-1938
 * @description: Dadas N notas de un estudiante calcular: - Cuantas notas tiene
 *               desaprobados. - Cuantos aprobados. - El promedio de notas. - El
 *               promedio de notas aprobadas y desaprobadas.
 *
 */

public class NotasEstudiante {
	String nombre;
	int totalEvaluar, i, sumatoria, sumatoria_aprobadas, sumatoria_desaprobadas, aprobadas, desaprobadas;

	public NotasEstudiante() {
		i = 1;
		sumatoria = 0;
		aprobadas = 0;
		desaprobadas = 0;
		sumatoria_aprobadas = 0;
		sumatoria_desaprobadas = 0;
	}

	public void init() {

		try (Scanner obj = new Scanner(System.in)) {
			System.out.print("Nombre del Estudiante: ");
			nombre = obj.nextLine();

			System.out.print("Cuantas notas desea capturar: ");
			totalEvaluar = obj.nextInt();

			for (i = 1; i <= totalEvaluar; i++) {
				System.out.print("Ingrese la calificacion2: ");
				int nota = (int) obj.nextInt();
				sumatoria += nota;

				if (nota >= 71) {
					aprobadas++;
					sumatoria_aprobadas += nota;
				} else {
					desaprobadas++;
					sumatoria_desaprobadas += nota;
				}
			}
			float promedio, promedio_aprobadas, promedio_desaprobadas;
			promedio = sumatoria / totalEvaluar;
			promedio_aprobadas = (aprobadas > 0) ? (sumatoria_aprobadas / aprobadas) : 0;
			promedio_desaprobadas = (desaprobadas > 0) ? (sumatoria_desaprobadas / desaprobadas) : 0;
			System.out.println("\n-------------------------------");
			System.out.println("Estadistica");
			System.out.println("-------------------------------");
			System.out.println("El estudiante " + nombre + " tiene un promedio: " + promedio);
			System.out.println("Aprobadas: " + aprobadas);
			System.out.println("Desaprobadas: " + desaprobadas);
			System.out.println("Promedio de Aprobadas: " + promedio_aprobadas);
			System.out.println("Promedio de Desaprobadas: " + promedio_desaprobadas);

		} catch (Exception e) {
			System.out.println("ERROR - Introduzca un valor valido.");
		}
	}

	public static void main(String[] args) throws IOException {
		NotasEstudiante obj = new NotasEstudiante();
		obj.init();
	}

}
