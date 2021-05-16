/**
 * @author Javier Moran - 8-757-1938
 * 
 */
import java.io.*;

class XAreaCirculo {
	private float radio;

	XAreaCirculo() {
		radio = 0;
	}

	void calcular() throws IOException {
		InputStreamReader lector = new InputStreamReader(System.in);
		BufferedReader entrada = new BufferedReader(lector);

		System.out.println("Escribe el radio : ");
		String cadena = entrada.readLine();
		radio = Float.parseFloat(cadena);
		System.out.print("El area del circulo de radio " + radio);
		double area = Math.PI * radio * radio;
		System.out.println(" es " + area);

	}
}

public class AreaCirculo {
	public static void main(String[] args) throws IOException {
		XAreaCirculo ar = new XAreaCirculo();
		ar.calcular();
	}
}