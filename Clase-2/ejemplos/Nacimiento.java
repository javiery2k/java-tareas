/**
 * @author Javier Moran - 8-757-1938
 * 
 */
import java.io.*;

class Fecha {
	private String nombre;
	private int edad;

	Fecha(String xnom, int xedad) {
		nombre = xnom;
		edad = xedad;
	}

	void desplegar() {
		System.out.println(nombre + " Tu tienes " + edad + " anios ahora ");
		int anio = 2020 - edad;
		System.out.println("Probablemente naciste en " + anio);
	}
}

public class Nacimiento {
	public static void main(String[] args) throws IOException {
		InputStreamReader lector = new InputStreamReader(System.in);
		BufferedReader entrada = new BufferedReader(lector);
		System.out.println("Escribe tu Nombre: ");
		String nombre = entrada.readLine();
		System.out.println("Escribe tu edad: ");
		int edad = Integer.parseInt(entrada.readLine());

		Fecha fec = new Fecha(nombre, edad);
		fec.desplegar();
	}
}
