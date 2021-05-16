import java.awt.*;
import javax.swing.*;

class XJButton extends JFrame {
	void mostrar() {
		setTitle("UTP-Java");
		setLayout(new FlowLayout());
		setVisible(true);
		pack();
		JButton b1 = new JButton();
		b1.setText("Procesar");
		b1.setBackground(Color.red);
		b1.setForeground(Color.blue);
		b1.setToolTipText("Activa el boton no.1");
		JButton b2 = new JButton("Cancelar");
		getContentPane().add(b1);
		getContentPane().add(b2);
	}
}

class Ex_JButton {
	public static void main(String[] args) {
		XJButton x = new XJButton();
		x.mostrar();
	}
}