import javax.swing.*;

class XSwing1 extends JFrame {
	static final long serialVersionUID = 0L;
	JLabel label;

	XSwing1() {
		setTitle(" USO DE SWING ");
		label = new JLabel("Bienvenidos Todos");
	}

	void crear() {
		getContentPane().add(label);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Swing1 {
	public static void main(String[] args) {
		XSwing1 obj = new XSwing1();
		obj.crear();
	}
}