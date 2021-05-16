/**
 * @author Javier Moran - 8-757-1938
 * 
 */
import java.io.*;

class XValidaDo2 {
	private int valida, clave;

	XValidaDo2() {
		valida = 711;
		clave = 0;
	}

	void validar() throws IOException {
		do {
			System.out.println("Introduzca su clave numerica:");
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			clave = Integer.parseInt(entrada.readLine());
			if (clave != valida) {
				System.out.println("Clave no valida!");
			}
		} while (clave != valida);
		System.out.println("Sali del Ciclo");
	}
}

public class ValidaDo2 {
	public static void main(String[] args) throws IOException {
		XValidaDo2 vd2 = new XValidaDo2();
		vd2.validar();
	}
}