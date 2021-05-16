/**
 * @author Javier Moran - 8-757-1938
 * 
 */
import javax.swing.*;

class XValidacion1 {
	private int numero;

	XValidacion1() {
		String str;
		str = JOptionPane.showInputDialog("Escribe un Numero:");
		numero = Integer.parseInt(str);
	}

	void validar() {
		if (numero < 0) {
			System.out.println("El numero es negativo.");
		}
		if (numero == 0) {
			System.out.println("El numero es cero.");
		}
		if (numero > 0) {
			System.out.println("El numero es positivo.");
		}
	}
}

public class Validacion1 {
	public static void main(String[] args) {
		XValidacion1 val = new XValidacion1();
		val.validar();
	}
}