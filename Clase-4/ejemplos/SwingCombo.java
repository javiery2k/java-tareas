import javax.swing.*;
import java.awt.*;

class XSwingCombo extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JComboBox<Object> combo;

	XSwingCombo() {
		String facultad[] = { "CIVIL", "ELECTRICA", "SISTEMAS", "MECANICA" };
		setTitle("Creando un JComboBox ");
		setBounds(150, 150, 350, 350);
		getContentPane().setLayout(null);

		combo = new JComboBox<Object>(facultad);
		combo.setBounds(new Rectangle(50, 3, 230, 20));
		getContentPane().add(combo);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);
	}
}

public class SwingCombo {
	public static void main(String[] args) { 
		XSwingCombo b = new XSwingCombo();
	}
}