import javax.swing.*;

class XSwingExample {
	static final long serialVersionUID = 0L;
	JLabel label;
	JFrame fra = new JFrame();

	XSwingExample() {
		fra.setTitle(" USO DE SWING ");
		label = new JLabel("Bienvenidos Todos");
	}

	void crear() {
		fra.getContentPane().add(label);
		fra.pack();
		fra.setVisible(true);
		fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class SwingExample {
	public static void main(String[] args) {
		XSwingExample obj = new XSwingExample();
		obj.crear();
	}
}
