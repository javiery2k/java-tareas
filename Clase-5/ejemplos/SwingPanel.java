import java.awt.*;
import javax.swing.*;

class XSwingPanel extends JFrame {
	private JPanel panelBotones;
	private JPanel panelEtiquetas;
	private JButton botones[];
	private JLabel etiquetas[];

	void mostrar() {
		setTitle("Demostraci�n JPanel");
		botones = new JButton[5];
		etiquetas = new JLabel[4];
		panelEtiquetas = new JPanel();
		panelEtiquetas.setLayout(new FlowLayout());
		panelBotones = new JPanel();
		panelBotones.setLayout(new GridLayout(1, botones.length));
		for (int cuenta = 0; cuenta < botones.length; cuenta++) {
			botones[cuenta] = new JButton("Bot�n " + (cuenta + 1));
			panelBotones.add(botones[cuenta]);
		}
		for (int cuenta = 0; cuenta < etiquetas.length; cuenta++) {
			etiquetas[cuenta] = new JLabel("Etiqueta " + (cuenta + 1));
			panelEtiquetas.add(etiquetas[cuenta]);
		}
		getContentPane().add(panelBotones, BorderLayout.SOUTH);
		getContentPane().add(panelEtiquetas, BorderLayout.NORTH);
		setSize(425, 150);
		setVisible(true);
	}
}

public class SwingPanel {
	public static void main(String args[]) {
		XSwingPanel ap = new XSwingPanel();
		ap.mostrar();
		ap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}