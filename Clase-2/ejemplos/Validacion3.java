/**
 * @author Javier Moran - 8-757-1938
 * 
 */
import javax.swing.*;

class XValidacion3 {
	private int puntuacion;

	XValidacion3() {
		puntuacion = Integer.parseInt(JOptionPane.showInputDialog("Escribe la notade un examen:"));
	}

	void validar() {
		if (puntuacion >= 90) {
			System.out.print("Sobresaliente");
		} else if (puntuacion >= 80) {
			System.out.print("Notable");
		} else if (puntuacion >= 70) {
			System.out.print("Bien");
		} else if (puntuacion >= 60) {
			System.out.print("Sufienciente");
		} else {
			System.out.print("Insufienciente");
		}
	}
}

public class Validacion3 {
	public static void main(String[] args) {
		XValidacion3 val = new XValidacion3();
		val.validar();
	}
}