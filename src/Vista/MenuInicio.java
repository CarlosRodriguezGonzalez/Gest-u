package Vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Container;

import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuItem;
import java.awt.Choice;
import javax.swing.JTree;
import javax.swing.Box;
import javax.swing.ScrollPaneConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import Controlador.Controlador;
import Controlador.ControladorImpl;
import Modelo.Modelo;
import Modelo.ModeloImpl;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.BoxLayout;
public class MenuInicio extends JFrame implements Vista {

	private ControladorImpl controlador=new ControladorImpl();
	private ModeloImpl modelo=new ModeloImpl();

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**c
	 * Launch the application.
	 */

	/**
	 * Create the frame.t
	 */
	public MenuInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(134, 185, 583, 238);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JPanel panel = new JPanel();
		panel.setBounds(889, 118, 602, 44);
		panel.setLayout(null);
		panel.setBackground(new Color(100, 149, 237));
		
		JButton button = new JButton("Salir");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setBackground(new Color(119, 136, 153));
		button.setBounds(466, 11, 107, 23);
		panel.add(button);
		
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
			},
			new String[] {
				"Id", "Asociaci\u00F3n", "Fecha"
			}
		));
		scrollPane.setViewportView(table);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(127, 0, 600, 150);
		panel_1.setBackground(new Color(100, 149, 237));
		
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
		
		JLabel label_4 = new JLabel("Fecha:");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JButton button_6 = new JButton("Buscar");
		
		JButton button_7 = new JButton("Modificar");
		
		JButton button_8 = new JButton("Eliminar");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
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
									.addGap(43)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
								.addComponent(label_3))
							.addGap(155)
							.addComponent(button_7))
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
							.addComponent(button_6)
							.addGap(28)
							.addComponent(button_8)))
					.addContainerGap(67, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(19)
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
						.addComponent(button_7))
					.addGap(10)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_4))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(button_6))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(button_8)))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.add(panel_1);
		contentPane.add(panel);
		contentPane.add(scrollPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(100, 149, 237));
		panel_2.setBounds(0, 0, 122, 502);
		contentPane.add(panel_2);
		
		JButton button_2 = new JButton("Asociaciones");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.pasarAsociaciones();
				dispose();
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setBackground(new Color(112, 128, 144));
		button_2.setBounds(0, 77, 122, 23);
		panel_2.add(button_2);
		
		JButton button_3 = new JButton("Esp Municipales");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.pasarEspacioMunicipal();
				dispose();
			}
		});
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_3.setBackground(new Color(119, 136, 153));
		button_3.setBounds(0, 145, 122, 23);
		panel_2.add(button_3);
		
		JButton button_4 = new JButton("Subvenciones");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.pasarSubvenciones();
				dispose();
			}
		});
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_4.setBackground(new Color(119, 136, 153));
		button_4.setBounds(0, 179, 122, 23);
		panel_2.add(button_4);
		
		JButton button_5 = new JButton("Actividades");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.pasarActividad();
				dispose();
			}
		});
		button_5.setForeground(Color.WHITE);
		button_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_5.setBackground(new Color(119, 136, 153));
		button_5.setBounds(0, 111, 122, 23);
		panel_2.add(button_5);
		
		JButton button_1 = new JButton("Salir");
		button_1.setBounds(0, 401, 122, 23);
		panel_2.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.pasarLogin();
				dispose();
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setBackground(new Color(119, 136, 153));
		
		table_1 = new JTable();
		table_1.setBounds(574, 89, 1, 1);
		contentPane.add(table_1);
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
