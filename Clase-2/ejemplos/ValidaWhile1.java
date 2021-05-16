/**
 * @author Javier Moran - 8-757-1938
 * 
 */
import java.io.*;

class XValidaWhile1 {
	void desplegar() throws IOException {
		int num;
		System.out.println("Introduzca un numero: ");

		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(entrada.readLine());
		while (num <= 100) {
			System.out.println("Introduzca un numero: ");
			num = Integer.parseInt(entrada.readLine());
		}
		System.out.println("Sali del Ciclo");
	}
}

public class ValidaWhile1 {
	public static void main(String[] args) throws IOException {
		XValidaWhile1 v = new XValidaWhile1();
		v.desplegar();
	}
}