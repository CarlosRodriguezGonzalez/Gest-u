package Vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.UIManager;
import com.toedter.calendar.JDateChooser;

import Controlador.Controlador;
import Controlador.ControladorImpl;
import Modelo.Modelo;
import Modelo.ModeloImpl;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;

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
	private JLabel lblDetalles;
	private JLabel lblRepresentante;
	private JTextField txtNombre_1;
	private JSeparator separator_1;
	private JTextField txtDniniepasaporte_1;
	private JSeparator separator_3;
	private JTextField txtEmail_1;
	private JSeparator separator_4;
	private JTextField txtTelfonoMvil;
	private JSeparator separator_5;
	private JLabel lblAsociacin;
	private JTextField txtNombre_2;
	private JSeparator separator_6;
	private JTextField txtDireccinSede;
	private JSeparator separator_7;
	private JTextField txtCif_1;
	private JSeparator separator_8;
	private JTextField txtFechaSolicitud;
	private JSeparator separator_9;
	private JButton btnConfirmar;
	private JLabel lblAContinuacinSe;
	private JLabel lblDeLaNueva;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public AssocOptions() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JLabel lbl_documentacion = new JLabel("Eliminar");
		JLabel lbl_modify = new JLabel("Histórico");
		JLabel lbl_data = new JLabel("Datos");
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
		edit_panel1.add(txtNombre);
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
		edit_panel1.add(txtApellidos);
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
		edit_panel1.add(txtDniniepasaporte);
		txtDniniepasaporte.setBorder(BorderFactory.createCompoundBorder(txtDniniepasaporte.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JLabel lblDatosDelRepresentante = new JLabel("Datos representante");
		lblDatosDelRepresentante.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblDatosDelRepresentante.setForeground(new Color(128, 128, 128));
		lblDatosDelRepresentante.setBounds(20, 20, 170, 30);
		edit_panel1.add(lblDatosDelRepresentante);
		
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
		edit_panel1.add(txtCorreoElectrnico);
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
		edit_panel1.add(txtDireccin);
		txtDireccin.setBorder(BorderFactory.createCompoundBorder(txtDireccin.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(UIManager.getColor("ComboBox.background"));
		separator_2.setBounds(6, 198, 637, 12);
		edit_panel1.add(separator_2);
		
		JLabel lblDatosAsociacin = new JLabel("Datos Asociación");
		lblDatosAsociacin.setForeground(Color.GRAY);
		lblDatosAsociacin.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblDatosAsociacin.setBounds(20, 203, 170, 30);
		edit_panel1.add(lblDatosAsociacin);
		
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
		edit_panel1.add(txtnombre);
		
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
		edit_panel1.add(txtSede);
		
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
		edit_panel1.add(txtFax_1);
		
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
		edit_panel1.add(txtEmail);
		
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
		edit_panel1.add(txtMunicipio);
		
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
		edit_panel1.add(txtCdigoPostal);
		
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
		edit_panel1.add(txtTelfono);
		
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
		edit_panel1.add(txtTelfonoMovil);
		
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
		edit_panel1.add(txtCif);
		
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
		edit_panel1.add(txtmunicipio);
		
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
		edit_panel1.add(txtcdigoPostal);
		
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
		edit_panel1.add(textField_5);
		
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
		edit_panel1.add(txttelfonoMovil);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(295, 288, 33, 33);
		edit_panel1.add(dateChooser);
		
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
		edit_panel1.add(txtFax);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("El cliente aporta la documentación necesaria para el registro de la nueva asociación");
		chckbxNewCheckBox.setForeground(new Color(128, 128, 128));
		chckbxNewCheckBox.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(22, 390, 443, 23);
		edit_panel1.add(chckbxNewCheckBox);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnRegistrar.setForeground(new Color(128, 128, 128));
		btnRegistrar.setBounds(20, 425, 140, 39);
		edit_panel1.add(btnRegistrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setForeground(new Color(128, 128, 128));
		btnCancelar.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnCancelar.setBounds(172, 425, 140, 39);
		edit_panel1.add(btnCancelar);
		
		lblLosCamposMarcados = new JLabel("Los campos marcados con * son obligatorios");
		lblLosCamposMarcados.setForeground(new Color(128, 128, 128));
		lblLosCamposMarcados.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblLosCamposMarcados.setBounds(387, 26, 226, 16);
		edit_panel1.add(lblLosCamposMarcados);
		
		comboBox = new JComboBox();
		comboBox.setForeground(Color.GRAY);
		comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		comboBox.setBorder(null);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"*Tipo", "Deporte", "Cultural", "Social", "Juvenil"}));
		comboBox.setBounds(20, 288, 140, 33);
		edit_panel1.add(comboBox);
		
		
		
		JPanel edit_panel2 = new JPanel();
		edit_panel2.setBackground(new Color(100, 149, 237));
		layeredPane.add(edit_panel2, "name_23357301890851");
		
		JPanel edit_panel3 = new JPanel();
		edit_panel3.setBackground(new Color(160, 82, 45));
		layeredPane.add(edit_panel3, "name_23382852103736");
		
		lbl_data.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_data.setForeground(java.awt.Color.black);
				lbl_modify.setForeground(java.awt.Color.lightGray);
				lbl_documentacion.setForeground(java.awt.Color.lightGray);
				edit_panel1.setVisible(true);
				edit_panel2.setVisible(false);
				edit_panel3.setVisible(false);
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
		
		lbl_modify.setBounds(179, 30, 69, 16);
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
			}
		});
		lbl_documentacion.setBounds(323, 30, 108, 16);
		lbl_documentacion.setFont(new Font("Segoe UI", Font.BOLD, 16));
		panel.add(lbl_documentacion);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 53, 637, 12);
		panel.add(separator);
		separator.setForeground(new Color(128, 128, 128));
		
		
		
		edit_panel1.setVisible(true);
		edit_panel2.setVisible(false);
		edit_panel3.setVisible(false);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(32, 47, 90));
		panel_1.setBounds(636, 0, 274, 550);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lblDetalles = new JLabel("Detalles");
		lblDetalles.setForeground(new Color(204, 204, 204));
		lblDetalles.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblDetalles.setBounds(19, 26, 105, 22);
		panel_1.add(lblDetalles);
		
		lblRepresentante = new JLabel("REPRESENTANTE");
		lblRepresentante.setForeground(new Color(204, 204, 204));
		lblRepresentante.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblRepresentante.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		lblRepresentante.setBounds(19, 123, 134, 19);
		panel_1.add(lblRepresentante);
		
		txtNombre_1 = new JTextField();
		txtNombre_1.setForeground(Color.WHITE);
		txtNombre_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtNombre_1.setDisabledTextColor(new Color(204, 204, 204));
		txtNombre_1.setColumns(10);
		txtNombre_1.setBorder(null);
		txtNombre_1.setBackground(new Color(32, 47, 90));
		txtNombre_1.setBounds(19, 141, 246, 26);
		panel_1.add(txtNombre_1);
		
		separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(19, 166, 246, 12);
		panel_1.add(separator_1);
		
		txtDniniepasaporte_1 = new JTextField();
		txtDniniepasaporte_1.setForeground(Color.WHITE);
		txtDniniepasaporte_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtDniniepasaporte_1.setDisabledTextColor(new Color(204, 204, 204));
		txtDniniepasaporte_1.setColumns(10);
		txtDniniepasaporte_1.setBorder(null);
		txtDniniepasaporte_1.setBackground(new Color(32, 47, 90));
		txtDniniepasaporte_1.setBounds(19, 179, 246, 26);
		panel_1.add(txtDniniepasaporte_1);
		
		separator_3 = new JSeparator();
		separator_3.setForeground(Color.WHITE);
		separator_3.setBounds(19, 204, 246, 12);
		panel_1.add(separator_3);
		
		txtEmail_1 = new JTextField();
		txtEmail_1.setForeground(Color.WHITE);
		txtEmail_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtEmail_1.setDisabledTextColor(new Color(204, 204, 204));
		txtEmail_1.setColumns(10);
		txtEmail_1.setBorder(null);
		txtEmail_1.setBackground(new Color(32, 47, 90));
		txtEmail_1.setBounds(19, 217, 246, 26);
		panel_1.add(txtEmail_1);
		
		separator_4 = new JSeparator();
		separator_4.setForeground(Color.WHITE);
		separator_4.setBounds(19, 242, 246, 12);
		panel_1.add(separator_4);
		
		txtTelfonoMvil = new JTextField();
		txtTelfonoMvil.setForeground(Color.WHITE);
		txtTelfonoMvil.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtTelfonoMvil.setDisabledTextColor(new Color(204, 204, 204));
		txtTelfonoMvil.setColumns(10);
		txtTelfonoMvil.setBorder(null);
		txtTelfonoMvil.setBackground(new Color(32, 47, 90));
		txtTelfonoMvil.setBounds(19, 256, 246, 26);
		panel_1.add(txtTelfonoMvil);
		
		separator_5 = new JSeparator();
		separator_5.setForeground(Color.WHITE);
		separator_5.setBounds(19, 281, 246, 12);
		panel_1.add(separator_5);
		
		lblAsociacin = new JLabel("ASOCIACIÓN");
		lblAsociacin.setForeground(new Color(204, 204, 204));
		lblAsociacin.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblAsociacin.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		lblAsociacin.setBounds(19, 305, 134, 19);
		panel_1.add(lblAsociacin);
		
		txtNombre_2 = new JTextField();
		txtNombre_2.setForeground(Color.WHITE);
		txtNombre_2.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtNombre_2.setDisabledTextColor(new Color(204, 204, 204));
		txtNombre_2.setColumns(10);
		txtNombre_2.setBorder(null);
		txtNombre_2.setBackground(new Color(32, 47, 90));
		txtNombre_2.setBounds(19, 323, 246, 26);
		panel_1.add(txtNombre_2);
		
		separator_6 = new JSeparator();
		separator_6.setForeground(Color.WHITE);
		separator_6.setBounds(19, 348, 246, 12);
		panel_1.add(separator_6);
		
		txtDireccinSede = new JTextField();
		txtDireccinSede.setForeground(Color.WHITE);
		txtDireccinSede.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtDireccinSede.setDisabledTextColor(new Color(204, 204, 204));
		txtDireccinSede.setColumns(10);
		txtDireccinSede.setBorder(null);
		txtDireccinSede.setBackground(new Color(32, 47, 90));
		txtDireccinSede.setBounds(19, 361, 246, 26);
		panel_1.add(txtDireccinSede);
		
		separator_7 = new JSeparator();
		separator_7.setForeground(Color.WHITE);
		separator_7.setBounds(19, 386, 246, 12);
		panel_1.add(separator_7);
		
		txtCif_1 = new JTextField();
		txtCif_1.setForeground(Color.WHITE);
		txtCif_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtCif_1.setDisabledTextColor(new Color(204, 204, 204));
		txtCif_1.setColumns(10);
		txtCif_1.setBorder(null);
		txtCif_1.setBackground(new Color(32, 47, 90));
		txtCif_1.setBounds(19, 399, 246, 26);
		panel_1.add(txtCif_1);
		
		separator_8 = new JSeparator();
		separator_8.setForeground(Color.WHITE);
		separator_8.setBounds(19, 424, 246, 12);
		panel_1.add(separator_8);
		
		txtFechaSolicitud = new JTextField();
		txtFechaSolicitud.setForeground(Color.WHITE);
		txtFechaSolicitud.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtFechaSolicitud.setDisabledTextColor(new Color(204, 204, 204));
		txtFechaSolicitud.setColumns(10);
		txtFechaSolicitud.setBorder(null);
		txtFechaSolicitud.setBackground(new Color(32, 47, 90));
		txtFechaSolicitud.setBounds(19, 438, 246, 26);
		panel_1.add(txtFechaSolicitud);
		
		separator_9 = new JSeparator();
		separator_9.setForeground(Color.WHITE);
		separator_9.setBounds(19, 463, 246, 12);
		panel_1.add(separator_9);
		
		btnConfirmar = new JButton("Confirmar solicitud");
		btnConfirmar.setForeground(Color.GRAY);
		btnConfirmar.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnConfirmar.setBounds(19, 487, 246, 39);
		panel_1.add(btnConfirmar);
		
		lblAContinuacinSe = new JLabel("A continuación se muestran los detalles");
		lblAContinuacinSe.setForeground(new Color(204, 204, 204));
		lblAContinuacinSe.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblAContinuacinSe.setBounds(19, 60, 246, 22);
		panel_1.add(lblAContinuacinSe);
		
		lblDeLaNueva = new JLabel("de la nueva asociación:");
		lblDeLaNueva.setForeground(new Color(204, 204, 204));
		lblDeLaNueva.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblDeLaNueva.setBounds(19, 82, 246, 22);
		panel_1.add(lblDeLaNueva);
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
