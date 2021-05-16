
/**
 * @author Javier Moran - 8-757-1938
 * @description: Calcular el salario de un empleado a partir de los siguientes 
 *               datos: nombre del empleado, horas trabajadas, tarifa por hora,
 *               total de deducciones.
 * 
 */
import java.io.IOException;
import java.util.Scanner;

public class SalarioEmpleado {
	String nombre;
	int horas, tarifa;
	float deducciones, salario, salarioTotal;

	void init() throws IOException {
		try (Scanner obj = new Scanner(System.in)) {
			System.out.print("Nombre del Empleado: ");
			nombre = obj.nextLine();

			System.out.print("Horas Trabajadas: ");
			horas = obj.nextInt();

			System.out.print("Tarifa por Hora: ");
			tarifa = (int) obj.nextInt();

			System.out.print("Total deducciones: ");
			deducciones = obj.nextFloat();

			salario = (horas * tarifa);
			salarioTotal = salario - deducciones;

			System.out.print("\nEl salario para " + nombre + " es de: $" + salario);
			System.out.print("\nDeducciones: $" + deducciones);
			System.out.print("\nEl salario real despues de las deducciones es de: $" + salarioTotal);

		} catch (Exception e) {
			System.out.print("ERROR - Introduzca un valor valido.");
		}
	}

	public static void main(String[] args) throws IOException {
		SalarioEmpleado obj = new SalarioEmpleado();
		obj.init();
	}
}
