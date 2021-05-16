/**
 * @author Javier Moran - 8-757-1938
 * 
 */
import javax.swing.JOptionPane;

class XLeeData {
	String nombre, apellido;

	XLeeData() {
		nombre = JOptionPane.showInputDialog(null, "Escribe tu Nombre:", "Muestra de Dialogo de Entrada",
				JOptionPane.INFORMATION_MESSAGE);
		apellido = JOptionPane.showInputDialog(null, "Escribe tu Apellido:", "Muestra de Dialogo de Entrada",
				JOptionPane.INFORMATION_MESSAGE);
	}

	void desplegar() {
		String nombre_completo;
		nombre_completo = nombre + " " + apellido;
		JOptionPane.showMessageDialog(null, nombre_completo, "Tu Nombre Completo es:", JOptionPane.INFORMATION_MESSAGE);
	}
}

public class LeeData {
	public static void main(String args[]) {
		XLeeData ld = new XLeeData();
		ld.desplegar();
	}
}