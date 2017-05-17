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
import javax.swing.ScrollPaneConstants;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Asociaciones1 extends JFrame implements Vista {

	private ControladorImpl controlador = new ControladorImpl();
	private ModeloImpl modelo=new ModeloImpl();

	private JPanel contentPane;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_8;
	private JTable table_1;
	private JTextField textField_7;

	/**
	 * ctt Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Asociaciones1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setBounds(0, 0, 122, 502);
		contentPane.add(panel_1);

		JButton button_1 = new JButton("Asociaciones");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.pasarAsociaciones();
				dispose();
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBackground(new Color(112, 128, 144));
		button_1.setBounds(0, 77, 122, 23);
		panel_1.add(button_1);

		JButton button_2 = new JButton("Esp Municipales");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.pasarEspacioMunicipal();
				dispose();
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setBackground(new Color(119, 136, 153));
		button_2.setBounds(0, 145, 122, 23);
		panel_1.add(button_2);

		JButton button_3 = new JButton("Subvenciones");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.pasarSubvenciones();
				dispose();
			}
		});
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_3.setBackground(new Color(119, 136, 153));
		button_3.setBounds(0, 179, 122, 23);
		panel_1.add(button_3);

		JButton button_4 = new JButton("Actividades");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.pasarActividad();
				dispose();
			}
		});
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_4.setBackground(new Color(119, 136, 153));
		button_4.setBounds(0, 111, 122, 23);
		panel_1.add(button_4);
		
				JButton btnMenu = new JButton("Menu");
				btnMenu.setBounds(0, 450, 122, 23);
				panel_1.add(btnMenu);
				btnMenu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						controlador.pasarMenuInicio();
						dispose();
					}
				});
				btnMenu.setForeground(Color.WHITE);
				btnMenu.setFont(new Font("Tahoma", Font.BOLD, 11));
				btnMenu.setBackground(new Color(119, 136, 153));

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(134, 157, 358, 317);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Id", "Nombre", "Fecha", "Tipo"
			}
		));
		scrollPane_1.setViewportView(table_1);

		JLabel label_1 = new JLabel("Nombre");
		label_1.setBounds(534, 166, 65, 14);
		contentPane.add(label_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(606, 163, 105, 20);
		contentPane.add(textField_1);

		JLabel label_2 = new JLabel("CIF");
		label_2.setBounds(534, 191, 73, 14);
		contentPane.add(label_2);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(606, 188, 105, 20);
		contentPane.add(textField_2);

		JLabel lblCpostal = new JLabel("CP");
		lblCpostal.setBounds(534, 219, 86, 14);
		contentPane.add(lblCpostal);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(606, 216, 105, 20);
		contentPane.add(textField_4);

		JLabel label_4 = new JLabel("Direcci\u00F3n");
		label_4.setBounds(534, 272, 92, 14);
		contentPane.add(label_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(534, 291, 177, 20);
		contentPane.add(textField_5);

		JLabel lblTelfono = new JLabel("Tel\u00E9fono");
		lblTelfono.setBounds(534, 247, 92, 14);
		contentPane.add(lblTelfono);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(606, 241, 105, 20);
		contentPane.add(textField_6);

		JLabel label_7 = new JLabel("E-mail");
		label_7.setBounds(534, 322, 56, 14);
		contentPane.add(label_7);

		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(534, 376, 65, 14);
		contentPane.add(lblTipo);

		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBounds(606, 373, 105, 20);
		contentPane.add(comboBox);
		
		table_1=controlador.datos();
		scrollPane_1.setViewportView(table_1);
		
				JPanel panel = new JPanel();
				panel.setBackground(new Color(100, 149, 237));
				panel.setBounds(127, 0, 600, 150);
				contentPane.add(panel);
				
				JLabel label = new JLabel("Busqueda:");
				label.setFont(new Font("Tahoma", Font.BOLD, 12));
				
				JLabel label_3 = new JLabel("ID:");
				
				JLabel label_5 = new JLabel("Nombre:");
				
				textField = new JTextField();
				textField.setColumns(10);
				
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				
				JLabel label_6 = new JLabel("Tipo:");
				
				JComboBox comboBox_1 = new JComboBox();
				
				JLabel lblCif = new JLabel("CIF:");
				
				textField_8 = new JTextField();
				textField_8.setColumns(10);
				
				JButton button = new JButton("Buscar");
				
				JButton button_6 = new JButton("Modificar");
				
				JButton button_7 = new JButton("Eliminar");
				
						JLabel lblAsociaciones = new JLabel("Asociaciones");
						lblAsociaciones.setFont(new Font("Times New Roman", Font.PLAIN, 32));
						lblAsociaciones.setForeground(new Color(255, 255, 255));
				GroupLayout gl_panel = new GroupLayout(panel);
				gl_panel.setHorizontalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGap(0, 600, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
									.addGap(25)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup()
													.addGap(43)
													.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
												.addComponent(label_6))
											.addGap(155)
											.addComponent(button_6))
										.addComponent(lblAsociaciones, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
									.addGap(25)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(43)
											.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblCif))
									.addGap(40)
									.addComponent(button)
									.addGap(28)
									.addComponent(button_7)))
							.addContainerGap(67, Short.MAX_VALUE))
				);
				gl_panel.setVerticalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblAsociaciones, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(label)
							.addGap(11)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(4)
									.addComponent(label_3))
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(1)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(3)
											.addComponent(label_6))))
								.addComponent(button_6))
							.addGap(10)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_5)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblCif))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(1)
									.addComponent(button))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(1)
									.addComponent(button_7)))
							.addContainerGap())
				);
				panel.setLayout(gl_panel);
				
				textField_7 = new JTextField();
				textField_7.setColumns(10);
				textField_7.setBounds(534, 345, 177, 20);
				contentPane.add(textField_7);
				
				JButton button_5 = new JButton("A\u00F1adir/Modificar");
				button_5.setBounds(534, 401, 177, 23);
				contentPane.add(button_5);
				
				JButton button_8 = new JButton("Hist\u00F3rico");
				button_8.setBounds(534, 435, 177, 23);
				contentPane.add(button_8);
				
				JButton button_9 = new JButton("Eliminar");
				button_9.setBounds(534, 469, 177, 23);
				contentPane.add(button_9);
	}

	@Override
	public void setControlador(Controlador controlador) {
		this.controlador=(ControladorImpl)controlador;
	}


	@Override
	public void setModelo(Modelo modelo) {
		this.modelo=(ModeloImpl)modelo;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}
}
