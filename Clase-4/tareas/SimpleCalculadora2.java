
/**
 * @author Javier Moran - 8-757-1938
 * @description: Calculadora Basica 2 - Java Swing
 *
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleCalculadora2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculadora2 frame = new SimpleCalculadora2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SimpleCalculadora2() {
		setTitle("Simple Calculadora 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Programa");
		menuBar.add(mnNewMenu);

		JMenu mnNewMenu_1 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(22, 141, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(180, 141, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(326, 141, 96, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel = new JLabel("Tipo de operacion a realizar");
		lblNewLabel.setBounds(22, 50, 172, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Escribe el operador y el operando para realizar la operacion");
		lblNewLabel_1.setBounds(22, 100, 334, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("+");
		lblNewLabel_2.setBounds(139, 143, 31, 17);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("=");
		lblNewLabel_3.setBounds(294, 144, 22, 14);
		contentPane.add(lblNewLabel_3);

		JComboBox<Object> comboBox = new JComboBox<Object>();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (comboBox.getSelectedItem().toString()) {
				case "Suma":
					lblNewLabel_2.setText("+");
					break;
				case "Resta":
					lblNewLabel_2.setText("-");
					break;
				case "Division":
					lblNewLabel_2.setText("/");
					break;
				case "Multiplicacion":
					lblNewLabel_2.setText("*");
					break;
				default:
					break;
				}
			}
		});
		comboBox.setModel(
				new DefaultComboBoxModel<Object>(new String[] { "Suma", "Resta", "Multiplicacion", "Division" }));
		comboBox.setBounds(305, 46, 117, 22);
		contentPane.add(comboBox);

		JButton btnNewButton = new JButton("Realizar Operacion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1 = Integer.parseInt(textField.getText());
					int num2 = Integer.parseInt(textField_1.getText());
					double operacion;

					switch (comboBox.getSelectedItem().toString()) {
					case "Suma":
						operacion = num1 + num2;
						textField_2.setText(Double.toString(operacion));
						break;
					case "Resta":
						operacion = num1 - num2;
						textField_2.setText(Double.toString(operacion));
						break;
					case "Division":
						try {
							operacion = num1 / num2;
							textField_2.setText(Double.toString(operacion));
						} catch (Exception e1) {
							JOptionPane.showMessageDialog(null, "La operacion no puede ser realizada");
						}
						break;
					case "Multiplicacion":
						operacion = num1 * num2;
						textField_2.setText(Double.toString(operacion));
						break;
					default:
						break;
					}
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "La operacion no puede ser realizada");
				}
			}
		});
		btnNewButton.setBounds(152, 192, 147, 23);
		contentPane.add(btnNewButton);
	}
}