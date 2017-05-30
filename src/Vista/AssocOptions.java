package Vista;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import ClasesTabla.Actividad;
import ClasesTabla.Espacio;
import ClasesTabla.Subvencion;
import Controlador.Controlador;
import Controlador.ControladorImpl;
import Modelo.Modelo;
import Modelo.ModeloImpl;

public class AssocOptions extends JFrame implements Vista{

	private ControladorImpl controlador;
	private ModeloImpl modelo;
	
	private JPanel contentPane;
	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDniniepasaporte;
	private JTextField txtCorreoElectrnico;
	private JTextField txtDireccin;
	private JTextField txtnombre;
	private JTextField txtSede;
	private JTextField txtFax_1;
	private JTextField txtEmail;
	private JTextField txtMunicipio;
	private JTextField txtCdigoPostal;
	private JTextField txtTelfono;
	private JTextField txtTelfonoMovil;
	private JTextField txtCif;
	private JTextField txtmunicipio;
	private JTextField txtcdigoPostal;
	private JTextField textField_5;
	private JTextField txttelfonoMovil;
	private JTextField txtFax;
	private JLabel lblLosCamposMarcados;
	private JComboBox comboBox;
	private JScrollPane scrollPane;
	private JPanel panel_3;
	private JScrollPane scrollPane_1;
	private JPanel panel_4;
	private JScrollPane scrollPane_2;
	private JLabel lblAsociacion;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public AssocOptions() {
		setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 910, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		panel.setBounds(0, 0, 637, 550);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_documentacion = new JLabel("Añadir");
		JLabel lbl_modify = new JLabel("Modificar");
		JLabel lbl_data = new JLabel("Histórico");
		lbl_modify.setForeground(java.awt.Color.lightGray);
		lbl_documentacion.setForeground(java.awt.Color.lightGray);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 58, 637, 492);
		panel.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel edit_panel1 = new JPanel();
		edit_panel1.setBackground(new Color(255, 255, 255));
		layeredPane.add(edit_panel1, "name_23340656493830");
		edit_panel1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Subvenciones asociadas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128,128)));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(17, 17, 602, 152);
		edit_panel1.add(panel_2);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(17, 25, 566, 104);
		panel_2.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Actividades asociadas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128,128)));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(17, 181, 602, 152);
		edit_panel1.add(panel_3);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(17, 25, 566, 104);
		panel_3.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Espacios asociados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128,128)));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(17, 334, 602, 152);
		edit_panel1.add(panel_4);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(17, 25, 566, 104);
		panel_4.add(scrollPane_2);
		
		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);
		
		
		
		JPanel edit_panel2 = new JPanel();
		edit_panel2.setBackground(new Color(100, 149, 237));
		layeredPane.add(edit_panel2, "name_23357301890851");
		
		JPanel edit_panel3 = new JPanel();
		edit_panel3.setBackground(Color.WHITE);
		layeredPane.add(edit_panel3, "name_23382852103736");
		edit_panel3.setLayout(null);
		txtNombre = new JTextField();
		txtNombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNombre.setText("");
			}
		});
		txtNombre.setForeground(UIManager.getColor("FormattedTextField.inactiveForeground"));
		txtNombre.setDisabledTextColor(new Color(255, 255, 255));
		txtNombre.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtNombre.setText("  *Nombre");
		txtNombre.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtNombre.setBounds(20, 62, 182, 33);
		edit_panel3.add(txtNombre);
		txtNombre.setColumns(10);
		txtNombre.setBorder(BorderFactory.createCompoundBorder(txtNombre.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		txtApellidos = new JTextField();
		txtApellidos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtApellidos.setText("");
			}
		});
		txtApellidos.setForeground(UIManager.getColor("FormattedTextField.inactiveForeground"));
		txtApellidos.setDisabledTextColor(new Color(255, 255, 255));
		txtApellidos.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtApellidos.setText("  Apellidos");
		txtApellidos.setColumns(10);
		txtApellidos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtApellidos.setBounds(224, 62, 237, 33);
		edit_panel3.add(txtApellidos);
		txtApellidos.setBorder(BorderFactory.createCompoundBorder(txtApellidos.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		txtDniniepasaporte = new JTextField();
		txtDniniepasaporte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtDniniepasaporte.setText("");
			}
		});
		txtDniniepasaporte.setForeground(UIManager.getColor("FormattedTextField.inactiveForeground"));
		txtDniniepasaporte.setDisabledTextColor(new Color(255, 255, 255));
		txtDniniepasaporte.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtDniniepasaporte.setText("  *DNI/NIE/Pasaporte");
		txtDniniepasaporte.setColumns(10);
		txtDniniepasaporte.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtDniniepasaporte.setBounds(483, 62, 130, 33);
		edit_panel3.add(txtDniniepasaporte);
		txtDniniepasaporte.setBorder(BorderFactory.createCompoundBorder(txtDniniepasaporte.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JLabel lblDatosDelRepresentante = new JLabel("Datos representante");
		lblDatosDelRepresentante.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblDatosDelRepresentante.setForeground(new Color(128, 128, 128));
		lblDatosDelRepresentante.setBounds(20, 20, 170, 30);
		edit_panel3.add(lblDatosDelRepresentante);
		
		txtCorreoElectrnico = new JTextField();
		txtCorreoElectrnico.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtCorreoElectrnico.setText("");
			}
		});
		txtCorreoElectrnico.setText("  *E-Mail");
		txtCorreoElectrnico.setForeground(Color.GRAY);
		txtCorreoElectrnico.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtCorreoElectrnico.setDisabledTextColor(Color.WHITE);
		txtCorreoElectrnico.setColumns(10);
		txtCorreoElectrnico.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtCorreoElectrnico.setBounds(20, 108, 274, 33);
		edit_panel3.add(txtCorreoElectrnico);
		txtCorreoElectrnico.setBorder(BorderFactory.createCompoundBorder(txtCorreoElectrnico.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		txtDireccin = new JTextField();
		txtDireccin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtDireccin.setText("");
			}
		});
		txtDireccin.setText("  Dirección");
		txtDireccin.setForeground(Color.GRAY);
		txtDireccin.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtDireccin.setDisabledTextColor(Color.WHITE);
		txtDireccin.setColumns(10);
		txtDireccin.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtDireccin.setBounds(318, 107, 295, 33);
		edit_panel3.add(txtDireccin);
		txtDireccin.setBorder(BorderFactory.createCompoundBorder(txtDireccin.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(UIManager.getColor("ComboBox.background"));
		separator_2.setBounds(6, 198, 637, 12);
		edit_panel3.add(separator_2);
		
		JLabel lblDatosAsociacin = new JLabel("Datos Asociación");
		lblDatosAsociacin.setForeground(Color.GRAY);
		lblDatosAsociacin.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblDatosAsociacin.setBounds(20, 203, 170, 30);
		edit_panel3.add(lblDatosAsociacin);
		
		txtnombre = new JTextField();
		txtnombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtnombre.setText("");
			}
		});
		txtnombre.setText("  *Nombre");
		txtnombre.setForeground(Color.GRAY);
		txtnombre.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtnombre.setDisabledTextColor(Color.WHITE);
		txtnombre.setColumns(10);
		txtnombre.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtnombre.setBounds(20, 240, 182, 33);
		edit_panel3.add(txtnombre);
		
		txtSede = new JTextField();
		txtSede.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtSede.setText("");
			}
		});
		txtSede.setText("  *Dirección de la sede");
		txtSede.setForeground(Color.GRAY);
		txtSede.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtSede.setDisabledTextColor(Color.WHITE);
		txtSede.setColumns(10);
		txtSede.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtSede.setBounds(224, 240, 237, 33);
		edit_panel3.add(txtSede);
		
		txtFax_1 = new JTextField();
		txtFax_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtFax_1.setText("");
			}
		});
		txtFax_1.setText("  Fax");
		txtFax_1.setForeground(Color.GRAY);
		txtFax_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtFax_1.setDisabledTextColor(Color.WHITE);
		txtFax_1.setColumns(10);
		txtFax_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtFax_1.setBounds(393, 337, 68, 33);
		edit_panel3.add(txtFax_1);
		
		txtEmail = new JTextField();
		txtEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEmail.setText("");
			}
		});
		txtEmail.setText("  *E-mail");
		txtEmail.setForeground(Color.GRAY);
		txtEmail.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtEmail.setDisabledTextColor(Color.WHITE);
		txtEmail.setColumns(10);
		txtEmail.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtEmail.setBounds(339, 288, 274, 33);
		edit_panel3.add(txtEmail);
		
		txtMunicipio = new JTextField();
		txtMunicipio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtMunicipio.setText("");
			}
		});
		txtMunicipio.setText("   *Municipio");
		txtMunicipio.setForeground(Color.GRAY);
		txtMunicipio.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtMunicipio.setDisabledTextColor(Color.WHITE);
		txtMunicipio.setColumns(10);
		txtMunicipio.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtMunicipio.setBounds(20, 153, 156, 33);
		edit_panel3.add(txtMunicipio);
		
		txtCdigoPostal = new JTextField();
		txtCdigoPostal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtCdigoPostal.setText("");
			}
		});
		txtCdigoPostal.setText("  *Código Postal");
		txtCdigoPostal.setForeground(Color.GRAY);
		txtCdigoPostal.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtCdigoPostal.setDisabledTextColor(Color.WHITE);
		txtCdigoPostal.setColumns(10);
		txtCdigoPostal.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtCdigoPostal.setBounds(195, 153, 99, 33);
		edit_panel3.add(txtCdigoPostal);
		
		txtTelfono = new JTextField();
		txtTelfono.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTelfono.setText("");
			}
		});
		txtTelfono.setText("  Teléfono fijo");
		txtTelfono.setForeground(Color.GRAY);
		txtTelfono.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtTelfono.setDisabledTextColor(Color.WHITE);
		txtTelfono.setColumns(10);
		txtTelfono.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtTelfono.setBounds(321, 153, 126, 33);
		edit_panel3.add(txtTelfono);
		
		txtTelfonoMovil = new JTextField();
		txtTelfonoMovil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtTelfonoMovil.setText("");
			}
		});
		txtTelfonoMovil.setText("  *Teléfono movil");
		txtTelfonoMovil.setForeground(Color.GRAY);
		txtTelfonoMovil.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtTelfonoMovil.setDisabledTextColor(Color.WHITE);
		txtTelfonoMovil.setColumns(10);
		txtTelfonoMovil.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtTelfonoMovil.setBounds(473, 152, 140, 34);
		edit_panel3.add(txtTelfonoMovil);
		
		txtCif = new JTextField();
		txtCif.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtCif.setText("");
			}
		});
		txtCif.setText("  *CIF");
		txtCif.setForeground(Color.GRAY);
		txtCif.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtCif.setDisabledTextColor(Color.WHITE);
		txtCif.setColumns(10);
		txtCif.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtCif.setBounds(483, 240, 130, 33);
		edit_panel3.add(txtCif);
		
		txtmunicipio = new JTextField();
		txtmunicipio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtmunicipio.setText("");
			}
		});
		txtmunicipio.setText("   *Municipio");
		txtmunicipio.setForeground(Color.GRAY);
		txtmunicipio.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtmunicipio.setDisabledTextColor(Color.WHITE);
		txtmunicipio.setColumns(10);
		txtmunicipio.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtmunicipio.setBounds(20, 337, 156, 33);
		edit_panel3.add(txtmunicipio);
		
		txtcdigoPostal = new JTextField();
		txtcdigoPostal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtcdigoPostal.setText("");
			}
		});
		txtcdigoPostal.setText("  *CP");
		txtcdigoPostal.setForeground(Color.GRAY);
		txtcdigoPostal.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtcdigoPostal.setDisabledTextColor(Color.WHITE);
		txtcdigoPostal.setColumns(10);
		txtcdigoPostal.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtcdigoPostal.setBounds(188, 337, 59, 33);
		edit_panel3.add(txtcdigoPostal);
		
		textField_5 = new JTextField();
		textField_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField_5.setText("");
			}
		});
		textField_5.setText("  Teléfono fijo");
		textField_5.setForeground(Color.GRAY);
		textField_5.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField_5.setDisabledTextColor(Color.WHITE);
		textField_5.setColumns(10);
		textField_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		textField_5.setBounds(259, 337, 126, 33);
		edit_panel3.add(textField_5);
		
		txttelfonoMovil = new JTextField();
		txttelfonoMovil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txttelfonoMovil.setText("");
			}
		});
		txttelfonoMovil.setText("  *Teléfono movil");
		txttelfonoMovil.setForeground(Color.GRAY);
		txttelfonoMovil.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txttelfonoMovil.setDisabledTextColor(Color.WHITE);
		txttelfonoMovil.setColumns(10);
		txttelfonoMovil.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txttelfonoMovil.setBounds(473, 336, 140, 34);
		edit_panel3.add(txttelfonoMovil);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(295, 288, 33, 33);
		edit_panel3.add(dateChooser);
		
		txtFax = new JTextField();
		txtFax.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtFax.setText("");
			}
		});
		txtFax.setText("  *Fecha solicitud");
		txtFax.setForeground(Color.GRAY);
		txtFax.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtFax.setDisabledTextColor(Color.WHITE);
		txtFax.setColumns(10);
		txtFax.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtFax.setBounds(164, 288, 130, 33);
		edit_panel3.add(txtFax);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("El cliente aporta la documentación necesaria para el registro de la nueva asociación");
		chckbxNewCheckBox.setForeground(new Color(128, 128, 128));
		chckbxNewCheckBox.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(22, 390, 443, 23);
		edit_panel3.add(chckbxNewCheckBox);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnRegistrar.setForeground(new Color(128, 128, 128));
		btnRegistrar.setBounds(20, 425, 140, 39);
		edit_panel3.add(btnRegistrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(new Color(128, 128, 128));
		btnCancelar.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnCancelar.setBounds(172, 425, 140, 39);
		edit_panel3.add(btnCancelar);
		
		lblLosCamposMarcados = new JLabel("Los campos marcados con * son obligatorios");
		lblLosCamposMarcados.setForeground(new Color(128, 128, 128));
		lblLosCamposMarcados.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblLosCamposMarcados.setBounds(387, 26, 226, 16);
		edit_panel3.add(lblLosCamposMarcados);
		
		comboBox = new JComboBox();
		comboBox.setForeground(Color.GRAY);
		comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		comboBox.setBorder(null);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"*Tipo", "Deporte", "Cultural", "Social", "Juvenil"}));
		comboBox.setBounds(20, 288, 140, 33);
		edit_panel3.add(comboBox);
		
		lbl_data.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_data.setForeground(java.awt.Color.black);
				lbl_modify.setForeground(java.awt.Color.lightGray);
				lbl_documentacion.setForeground(java.awt.Color.lightGray);
				edit_panel1.setVisible(true);
				edit_panel2.setVisible(false);
				edit_panel3.setVisible(false);
				panel_5.setVisible(true);
				panel_6.setVisible(false);
				panel_7.setVisible(false);
			}
		});
		lbl_data.setBounds(69, 27, 61, 22);
		lbl_data.setFont(new Font("Segoe UI", Font.BOLD, 16));
		panel.add(lbl_data);
		
		lbl_modify.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_modify.setForeground(java.awt.Color.black);
				lbl_documentacion.setForeground(java.awt.Color.lightGray);
				lbl_data.setForeground(java.awt.Color.lightGray);
				edit_panel1.setVisible(false);
				edit_panel2.setVisible(true);
				edit_panel3.setVisible(false);
			}
		});
		
		lbl_modify.setBounds(179, 30, 85, 16);
		lbl_modify.setFont(new Font("Segoe UI", Font.BOLD, 16));
		panel.add(lbl_modify);
		
		
		lbl_documentacion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_documentacion.setForeground(java.awt.Color.black);
				lbl_data.setForeground(java.awt.Color.lightGray);
				lbl_modify.setForeground(java.awt.Color.lightGray);
				edit_panel1.setVisible(false);
				edit_panel2.setVisible(false);
				edit_panel3.setVisible(true);
				panel_5.setVisible(false);
				panel_6.setVisible(false);
				panel_7.setVisible(true);
			}
		});
		lbl_documentacion.setBounds(310, 30, 73, 16);
		lbl_documentacion.setFont(new Font("Segoe UI", Font.BOLD, 16));
		panel.add(lbl_documentacion);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 53, 637, 12);
		panel.add(separator);
		separator.setForeground(new Color(128, 128, 128));
		
		lblAsociacion = new JLabel("Asociacion #001");
		lblAsociacion.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblAsociacion.setBounds(478, 24, 137, 22);
		panel.add(lblAsociacion);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(637, 0, 273, 550);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(0, 0, 273, 550);
		panel_1.add(layeredPane_1);
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
		panel_5 = new JPanel();
		panel_5.setBackground(new Color(32,47,90));
		layeredPane_1.add(panel_5, "name_40223813435417");
		panel_5.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Detalles completos");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblNewLabel.setBounds(17, 28, 111, 16);
		panel_5.add(lblNewLabel);
		
		panel_6 = new JPanel();
		panel_6.setBackground(Color.PINK);
		layeredPane_1.add(panel_6, "name_40282482298038");
		
		panel_7 = new JPanel();
		panel_7.setBackground(Color.MAGENTA);
		layeredPane_1.add(panel_7, "name_40289285423663");
		
		
		
		edit_panel1.setVisible(true);
		edit_panel2.setVisible(false);
		edit_panel3.setVisible(false);
	}
	
	public void actualizarTabla(){
		ArrayList<Subvencion> a=modelo.getB();
		DefaultTableModel model = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		System.out.println("hola Sergio!");
		model.addColumn("ID");
		model.addColumn("Fecha");
		model.addColumn("Importe");
		
		for (int i = 0; i < a.size(); i++) {
			model.addRow(new Object[] {a.get(i).getId(),a.get(i).getFecha(),a.get(i).getImporte()});
		}

		table.setModel(model);
		
		scrollPane.setViewportView(table);
	}
	
	public void actualizarTablaActividades(){
		ArrayList<Actividad> a=modelo.getC();
		DefaultTableModel model = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		System.out.println("hola Sergio!");
		model.addColumn("ID");
		model.addColumn("Fecha");
		model.addColumn("Tipo");
		model.addColumn("Nombre");
		model.addColumn("Lugar");
		model.addColumn("Descripcion");
		
		for (int i = 0; i < a.size(); i++) {
			model.addRow(new Object[] {a.get(i).getId(),a.get(i).getFecha(),a.get(i).getTipo(),a.get(i).getNombre(),a.get(i).getLugar(),a.get(i).getDescripcion()});
		}

		table_1.setModel(model);
		
		scrollPane_1.setViewportView(table_1);
	}
	public void actualizarTablaEspacios(){
		ArrayList<Espacio> a=modelo.getD();
		DefaultTableModel model = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		System.out.println("hola Sergio!");
		model.addColumn("ID");
		model.addColumn("Direccion");
		model.addColumn("Caracteristicas");
		model.addColumn("Fecha Solicitud");
		model.addColumn("Fecha Concesion");
		
		for (int i = 0; i < a.size(); i++) {
			model.addRow(new Object[] {a.get(i).getSede(),a.get(i).getDireccion(),a.get(i).getCaracteristicas(),a.get(i).getFechasolicitud(),a.get(i).getFechaconcesion()});
		}

		table_2.setModel(model);
		
		scrollPane_2.setViewportView(table_2);
	}
	
	@Override
	public void setControlador(Controlador controlador) {
		this.controlador = (ControladorImpl) controlador;
	}

	@Override
	public void setModelo(Modelo modelo) {
		this.modelo = (ModeloImpl) modelo;
	}
}
