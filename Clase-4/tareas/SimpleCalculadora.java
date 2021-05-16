/**
 * @author Javier Moran - 8-757-1938
 * @description: Calculadora Basica con Java Swing
 *
 */
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleCalculadora extends JFrame {

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
					SimpleCalculadora frame = new SimpleCalculadora();
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
	public SimpleCalculadora() {
		setTitle("Simple Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		// Label 1
		JLabel lblNewLabel = new JLabel("Numero 1");
		lblNewLabel.setBounds(37, 82, 58, 14);
		contentPane.add(lblNewLabel);

		// Label 2
		JLabel lblNewLabel_1 = new JLabel("Numero 2");
		lblNewLabel_1.setBounds(244, 82, 58, 14);
		contentPane.add(lblNewLabel_1);
		
		//TextFields
		textField = new JTextField();
		textField.setBounds(104, 79, 96, 20);
		textField.setColumns(10);
		contentPane.add(textField);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(312, 79, 96, 20);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		
		textField_2 = new JTextField();
		textField_2.setBounds(92, 165, 274, 20);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
			
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(58, 120, 50, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				try {
					int num1 = Integer.parseInt(  textField.getText() );
					int num2 = Integer.parseInt(  textField_1.getText() );
					double operacion = num1 + num2;
					textField_2.setText( Double.toString(operacion) );
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "La operacion no puede ser realizada");
				}
			}
			
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1 = Integer.parseInt(  textField.getText() );
					int num2 = Integer.parseInt(  textField_1.getText() );
					double operacion = num1 - num2;
					textField_2.setText( Double.toString(operacion) );
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "La operacion no puede ser realizada");
				}
			}
		});
		btnNewButton_1.setBounds(114, 120, 50, 23);
		contentPane.add(btnNewButton_1);
		
		
		JButton btnNewButton_2 = new JButton("x");
		btnNewButton_2.setBounds(169, 120, 50, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1 = Integer.parseInt(  textField.getText() );
					int num2 = Integer.parseInt(  textField_1.getText() );
					double operacion = (double) num1 * num2;
					textField_2.setText( Double.toString(operacion) );
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "La operacion no puede ser realizada");
				}
			}
		});
		contentPane.add(btnNewButton_2);
		

		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.setBounds(225, 120, 50, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1 = Integer.parseInt(  textField.getText() );
					int num2 = Integer.parseInt(  textField_1.getText() );
					double operacion = (double) num1 / num2;
					textField_2.setText( Double.toString(operacion) );
					System.out.println(Double.toString(operacion));
				} catch (NumberFormatException e1) {
					JOptionPane.showMessageDialog(null, "La operacion no puede ser realizada");
				}
			}
		});		
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Limpiar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
			}
		});
		btnNewButton_4.setBounds(302, 120, 96, 23);
		contentPane.add(btnNewButton_4);		
	}
}
