/**
 * @author Javier Moran - 8-757-1938
 * 
 */
import java.io.*;

class XValidaWhile2 {
	private int num;

	XValidaWhile2() {
		num = 0;
	}

	void desplegar() {

		System.out.println("Despliega digitos del 0 al 9");

		while (num <= 9) {
			System.out.println("Numero: " + num);
			num++;
		}
		System.out.println("Sali del Ciclo");
	}
}

public class ValidaWhile2 {
	public static void main(String[] args) throws IOException {
		XValidaWhile2 p = new XValidaWhile2();
		p.desplegar();
	}
}