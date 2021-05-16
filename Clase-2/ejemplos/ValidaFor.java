/**
 * @author Javier Moran - 8-757-1938
 * 
 */
import java.io.*;

class XValidaFor {
	private int num;

	void mostrar() {
		System.out.println("Digitos del 0 al 9");
		for (num = 0; num <= 9; num++) {
			System.out.println("Numero: " + num);
		}
		System.out.println("Sali del Ciclo");
	}
}

public class ValidaFor {
	public static void main(String[] args) throws IOException {
		XValidaFor vf = new XValidaFor();
		vf.mostrar();
	}
}