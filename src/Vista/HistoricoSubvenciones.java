package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controlador.Controlador;
import Controlador.ControladorImpl;
import Modelo.Modelo;
import Modelo.ModeloImpl;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class HistoricoSubvenciones extends JFrame implements Vista{
	
	private ModeloImpl modelo=new ModeloImpl();
	private ControladorImpl controlador=new ControladorImpl();

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HistoricoSubvenciones frame = new HistoricoSubvenciones();
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
	public HistoricoSubvenciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 790);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 479, 164);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(10, 14, 65, 14);
		panel.add(lblNombre);
		
		JLabel lblCif = new JLabel("CIF: ");
		lblCif.setBounds(10, 39, 73, 14);
		panel.add(lblCif);
		
		JLabel lblCp = new JLabel("CP:");
		lblCp.setBounds(10, 67, 86, 14);
		panel.add(lblCp);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setBounds(222, 39, 92, 14);
		panel.add(lblTelfono);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setBounds(10, 92, 92, 14);
		panel.add(lblDireccin);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(222, 67, 56, 14);
		panel.add(lblEmail);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(222, 14, 65, 14);
		panel.add(lblTipo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(67, 14, 125, 14);
		panel.add(lblNewLabel);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setBounds(67, 39, 125, 14);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setBounds(67, 64, 125, 14);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("New label");
		label_9.setBounds(67, 92, 125, 14);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("New label");
		label_10.setBounds(285, 14, 125, 14);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("New label");
		label_11.setBounds(285, 39, 125, 14);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("New label");
		label_12.setBounds(285, 67, 125, 14);
		panel.add(label_12);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(10, 182, 479, 179);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 41, 459, 127);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblSubvenciones = new JLabel("Subvenciones");
		lblSubvenciones.setBounds(10, 16, 75, 14);
		panel_1.add(lblSubvenciones);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(10, 372, 479, 179);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 37, 459, 131);
		panel_2.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblNewLabel_1 = new JLabel("Actividades");
		lblNewLabel_1.setBounds(10, 12, 103, 14);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(10, 562, 479, 178);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 38, 459, 129);
		panel_3.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		scrollPane_2.setViewportView(table_2);
		
		JLabel lblEspaciosMunicipales = new JLabel("Espacios Municipales");
		lblEspaciosMunicipales.setBounds(10, 13, 137, 14);
		panel_3.add(lblEspaciosMunicipales);
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
