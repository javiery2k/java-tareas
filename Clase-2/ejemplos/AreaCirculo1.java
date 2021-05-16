/**
 * @author Javier Moran - 8-757-1938
 * 
 */
import javax.swing.*;

class XAreaCirculo1 {
	private float radio;

	XAreaCirculo1() {
		radio = 0;
	}

	void calcular() {
		String str_radio;

		str_radio = JOptionPane.showInputDialog("Escribe el Radio:");

		radio = Float.parseFloat(str_radio);

		System.out.print("El area del circulo de radio " + radio);
		double area = Math.PI * radio * radio;
		System.out.println(" es " + area);

	}
}

public class AreaCirculo1 {
	public static void main(String[] args) {
		XAreaCirculo1 ar = new XAreaCirculo1();
		ar.calcular();
	}
}
