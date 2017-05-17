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
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class EspacioMunicipal1 extends JFrame implements Vista {

	private ControladorImpl controlador=new ControladorImpl();
	private ModeloImpl modelo=new ModeloImpl();

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_9;

	/**ctyr
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public EspacioMunicipal1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(136, 159, 360, 316);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
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
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Id", "Asociaciones", "Espacio solicitado", "Fecha solicitud"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(28);
		table.getColumnModel().getColumn(1).setPreferredWidth(117);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(92);
		scrollPane.setViewportView(table);
		
		table_1 = new JTable();
		scrollPane.setColumnHeaderView(table_1);
		
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
		label_5.setBounds(529, 168, 65, 14);
		contentPane.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(612, 165, 105, 20);
		contentPane.add(textField_3);
		
		JLabel label_6 = new JLabel("Tel\u00E9fono");
		label_6.setBounds(529, 193, 92, 14);
		contentPane.add(label_6);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(612, 190, 105, 20);
		contentPane.add(textField_4);
		
		JLabel lblEspacioSolicitado = new JLabel("Fecha solicitud");
		lblEspacioSolicitado.setBounds(529, 221, 86, 14);
		contentPane.add(lblEspacioSolicitado);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(612, 218, 105, 20);
		contentPane.add(textField_5);
		
		JLabel lblEspacioSolicitado_1 = new JLabel("Espacio solicitado");
		lblEspacioSolicitado_1.setBounds(529, 246, 90, 14);
		contentPane.add(lblEspacioSolicitado_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(612, 243, 105, 20);
		contentPane.add(textField_6);
		
		JLabel label_9 = new JLabel("E-mail");
		label_9.setBounds(529, 271, 56, 14);
		contentPane.add(label_9);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(529, 296, 188, 20);
		contentPane.add(textField_7);
		
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
		
		JLabel label_4 = new JLabel("Fecha:");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JButton button_5 = new JButton("Buscar");
		
		JButton button_6 = new JButton("Modificar");
		
		JButton button_9 = new JButton("Eliminar");
		
		JLabel lblEspaciosMunicipales = new JLabel("Espacios Municipales");
		lblEspaciosMunicipales.setForeground(Color.WHITE);
		lblEspaciosMunicipales.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(25)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(43)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_4))
							.addGap(40)
							.addComponent(button_5)
							.addGap(28)
							.addComponent(button_9))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
							.addGap(25)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEspaciosMunicipales, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(label_3)
									.addGap(18)
									.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
									.addComponent(button_6)))))
					.addGap(65))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap(12, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(label)
							.addGap(11))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(lblEspaciosMunicipales, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(18)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(4)
							.addComponent(label_1))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_3)
								.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
						.addComponent(button_6))
					.addGap(10)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(button_5))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(button_9)))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		JButton button_7 = new JButton("A\u00F1adir/Modificar");
		button_7.setBounds(529, 384, 177, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("Hist\u00F3rico");
		button_8.setBounds(529, 418, 177, 23);
		contentPane.add(button_8);
		
		JButton button_10 = new JButton("Eliminar");
		button_10.setBounds(529, 452, 177, 23);
		contentPane.add(button_10);
		
		
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
