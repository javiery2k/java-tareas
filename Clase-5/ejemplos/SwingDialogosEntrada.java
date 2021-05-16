import javax.swing.JOptionPane;

public class SwingDialogosEntrada {
	public static void main(String args[]) {
		String nombre, apellido, nombre_completo;
		nombre = JOptionPane.showInputDialog(null, "Escribe tu Nombre:", "Muestra de Dialogo de Entrada",
				JOptionPane.INFORMATION_MESSAGE);
		apellido = JOptionPane.showInputDialog(null, "Escribe tu Apellido:", "Muestra de Dialogo de Entrada",
				JOptionPane.INFORMATION_MESSAGE);
		nombre_completo = nombre + " " + apellido;
		JOptionPane.showMessageDialog(null, nombre_completo, "Tu Nombre Completo es:", JOptionPane.INFORMATION_MESSAGE);
	}
}