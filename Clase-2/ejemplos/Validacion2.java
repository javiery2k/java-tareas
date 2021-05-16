/**
 * @author Javier Moran - 8-757-1938
 * 
 */
import javax.swing.*;

class XValidacion2 {
	private int numero;

	XValidacion2() {
		String str;
		str = JOptionPane.showInputDialog("Escribe un Numero:");
		numero = Integer.parseInt(str);
	}

	void validar() {
		if (numero < 0) {
			System.out.println("El numero es negativo.");
		} else {
			if (numero == 0) {
				System.out.println("El numero es cero.");
			} else {
				System.out.println("El numero es Positivo.");
			}

		}
	}
}

public class Validacion2 {
	public static void main(String[] args) {
		XValidacion2 val = new XValidacion2();
		val.validar();
	}
}