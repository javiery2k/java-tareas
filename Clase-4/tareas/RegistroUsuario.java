/**
 * @author Javier Moran - 8-757-1938
 * @description: Registro de Usuario - Usando Java Swing
 *
 */

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class RegistroUsuario extends JFrame {

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
					RegistroUsuario frame = new RegistroUsuario();
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
	public RegistroUsuario() {
		setTitle("Registro Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 671);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 640, 611);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Add Studen Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setToolTipText("");
		tabbedPane.addTab("ADD STUDENT DETAILS", null, panel, null);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Modify Student Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		tabbedPane.addTab("MODIFY/DELETE STUDENT DETAILS", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student name");
		lblNewLabel.setBounds(83, 43, 120, 14);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(234, 40, 146, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(234, 71, 146, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(234, 102, 146, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Student address");
		lblNewLabel_1.setBounds(83, 74, 120, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Father's name");
		lblNewLabel_2.setBounds(83, 105, 120, 14);
		panel_1.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"nancy", "javier", "marta"}));
		comboBox.setBounds(441, 39, 146, 22);
		panel_1.add(comboBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(234, 140, 111, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBounds(441, 140, 111, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Class");
		lblNewLabel_3.setBounds(83, 174, 49, 14);
		panel_1.add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"2nd FUC"}));
		comboBox_1.setBounds(234, 170, 146, 22);
		panel_1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Section A", "Section B"}));
		comboBox_2.setBounds(441, 170, 146, 22);
		panel_1.add(comboBox_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("SSLC Marks card");
		chckbxNewCheckBox.setBounds(234, 199, 146, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Character certificate");
		chckbxNewCheckBox_1.setBounds(441, 199, 176, 23);
		panel_1.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("NCC Certificate given");
		chckbxNewCheckBox_2.setBounds(234, 227, 165, 23);
		panel_1.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Photo (passport size)");
		chckbxNewCheckBox_3.setBounds(441, 225, 176, 23);
		panel_1.add(chckbxNewCheckBox_3);
		
		JButton btnNewButton = new JButton("MODIFY RECORD");
		btnNewButton.setBounds(234, 257, 146, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DELETE RECORD");
		btnNewButton_1.setBounds(441, 257, 146, 23);
		panel_1.add(btnNewButton_1);		
		
		//Agregar imagen usando icon
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon(RegistroUsuario.class.getResource("/images/male-icon.png")));
		lblNewLabel_4.setBounds(213, 307, 250, 250);
		panel_1.add(lblNewLabel_4);
	}
}
