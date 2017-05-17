package Vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.table.DefaultTableModel;

import Controlador.Controlador;
import Controlador.ControladorImpl;
import Modelo.Modelo;
import Modelo.ModeloImpl;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Subvenciones1 extends JFrame implements Vista {

	private ControladorImpl controlador=new ControladorImpl();
	private ModeloImpl modelo=new ModeloImpl();

	private JPanel contentPane;
	private JTable table;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**ce
	 * Launch the application.
	 */
	

	/**g
	 * Create the frame.
	 */
	public Subvenciones1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(132, 161, 354, 311);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Id", "Nombre", "Fecha solicitud"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(100, 149, 237));
		panel.setBounds(0, 0, 122, 502);
		contentPane.add(panel);
		
		JButton button = new JButton("Asociaciones");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Asociaciones1().setVisible(true);
				dispose();
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBackground(new Color(112, 128, 144));
		button.setBounds(0, 77, 122, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Esp Municipales");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.pasarEspacioMunicipal();
				dispose();
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBackground(new Color(119, 136, 153));
		button_1.setBounds(0, 145, 122, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Subvenciones");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.pasarSubvenciones();
				dispose();
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setBackground(new Color(119, 136, 153));
		button_2.setBounds(0, 179, 122, 23);
		panel.add(button_2);
		
		JButton button_3 = new JButton("Actividades");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.pasarActividad();
				dispose();
			}
		});
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_3.setBackground(new Color(119, 136, 153));
		button_3.setBounds(0, 111, 122, 23);
		panel.add(button_3);
		
		JButton button_4 = new JButton("Menu");
		button_4.setBounds(0, 450, 122, 23);
		panel.add(button_4);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.pasarMenuInicio();
				dispose();
			}
		});
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_4.setBackground(new Color(119, 136, 153));
		
		JLabel label_5 = new JLabel("Nombre");
		label_5.setBounds(517, 164, 65, 14);
		contentPane.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(605, 161, 112, 20);
		contentPane.add(textField_4);
		
		JLabel label_6 = new JLabel("Tel\u00E9fono");
		label_6.setBounds(517, 189, 92, 14);
		contentPane.add(label_6);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(605, 186, 112, 20);
		contentPane.add(textField_5);
		
		JLabel label_7 = new JLabel("Fecha solicitud");
		label_7.setBounds(517, 217, 86, 14);
		contentPane.add(label_7);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(605, 214, 112, 20);
		contentPane.add(textField_6);
		
		JLabel lblImporteSolicitado = new JLabel("Importe solicitado");
		lblImporteSolicitado.setBounds(517, 244, 90, 14);
		contentPane.add(lblImporteSolicitado);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(605, 242, 112, 20);
		contentPane.add(textField_7);
		
		JLabel label_9 = new JLabel("E-mail");
		label_9.setBounds(517, 268, 56, 14);
		contentPane.add(label_9);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(517, 284, 200, 20);
		contentPane.add(textField_8);
		
		JLabel label_4 = new JLabel("Justificacion subvenci\u00F3n");
		label_4.setBounds(516, 315, 153, 14);
		contentPane.add(label_4);
		
		JButton button_8 = new JButton("Imprimir");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_8.setBounds(517, 463, 92, 23);
		contentPane.add(button_8);
		
		JButton btnEnviarMail = new JButton("Enviar Mail");
		btnEnviarMail.setBounds(625, 463, 92, 23);
		contentPane.add(btnEnviarMail);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(517, 340, 200, 44);
		contentPane.add(textField_9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setBounds(127, 0, 600, 150);
		contentPane.add(panel_1);
		
		JLabel label = new JLabel("Busqueda:");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel label_1 = new JLabel("ID:");
		
		JLabel label_2 = new JLabel("Nombre:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel label_3 = new JLabel("Tipo:");
		
		JComboBox comboBox = new JComboBox();
		
		JLabel label_8 = new JLabel("Fecha:");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JButton button_5 = new JButton("Buscar");
		
		JButton button_6 = new JButton("Modificar");
		
		JButton button_10 = new JButton("Eliminar");
		
		JLabel lblSubvenciones = new JLabel("Subvenciones");
		lblSubvenciones.setForeground(Color.WHITE);
		lblSubvenciones.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 600, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(25)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_1.createSequentialGroup()
											.addGap(43)
											.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
										.addComponent(label_3))
									.addGap(155)
									.addComponent(button_6))
								.addComponent(lblSubvenciones, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(25)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(43)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_8))
							.addGap(40)
							.addComponent(button_5)
							.addGap(28)
							.addComponent(button_10)))
					.addContainerGap(67, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSubvenciones, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(11)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(4)
							.addComponent(label_1))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(3)
									.addComponent(label_3))))
						.addComponent(button_6))
					.addGap(10)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_8))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(button_5))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(button_10)))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		JButton button_11 = new JButton("A\u00F1adir/Modificar");
		button_11.setBounds(517, 395, 200, 23);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("Hist\u00F3rico");
		button_12.setBounds(517, 429, 92, 23);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("Eliminar");
		button_13.setBounds(625, 429, 92, 23);
		contentPane.add(button_13);
		
		
	}

	@Override
	public void setControlador(Controlador controlador) {
		this.controlador=(ControladorImpl)controlador;
	}


	@Override
	public void setModelo(Modelo modelo) {
		this.modelo=(ModeloImpl)modelo;
	}
}
