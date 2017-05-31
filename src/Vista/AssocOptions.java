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
import javax.swing.ImageIcon;

public class AssocOptions extends JFrame implements Vista{

	private ControladorImpl controlador;
	private ModeloImpl modelo;
	
	private JPanel contentPane;
	private JFrame frame;
	private JTextField txtName;
	private JTextField txtSurname;
	private JTextField txtDni;
	private JTextField txtEmail;
	private JTextField txtAddress;
	private JTextField txtName2;
	private JTextField txtAddress2;
	private JTextField txtFax;
	private JTextField txtEmail2;
	private JTextField txtCity;
	private JTextField txtCp;
	private JTextField txtFijo;
	private JTextField txtMobile;
	private JTextField txtCif;
	private JTextField txtCity2;
	private JTextField txtCp2;
	private JTextField txtFijo2;
	private JTextField txtMobile2;
	private JTextField txtDate;
	private JLabel lblInfo;
	private JComboBox selectType;
	private JScrollPane subv_scroll;
	private JPanel activ_panel;
	private JScrollPane activ_scroll;
	private JPanel esp_panel;
	private JScrollPane esp_scroll;
	private JTable subv_table;
	private JTable activ_table;
	private JTable esp_table;
	private JPanel hist_panel2;
	private JPanel doc_panel2;
	private JPanel add_panel2;
	private JTextField txtEjemplo;
	private JLabel lblDireccinSede;
	private JTextField txtCDeLa;
	private JLabel lblCif;
	private JTextField txtBf;
	private JLabel lblFechaSolicitud;
	private JTextField textField_2;
	private JLabel lblEmail;
	private JTextField txtTiroalplatogmailcom;
	private JLabel lblMunicipio;
	private JTextField txtMadrid;
	private JLabel lblCdigoPostal;
	private JTextField textField_5;
	private JLabel lblTelfonoFijo;
	private JTextField textField_6;
	private JLabel lblTitle;
	private JLabel btnSearchRep;
	private JTextField lblSearchRep;
	private JSeparator sep_add_panel2;

	public AssocOptions(ControladorImpl con) {
		this.controlador=con;
		setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 910, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_left = new JPanel();
		panel_left.setBackground(new Color(240, 240, 240));
		panel_left.setBounds(0, 0, 637, 550);
		contentPane.add(panel_left);
		panel_left.setLayout(null);
		
		JLabel lblAdd = new JLabel("Añadir");
		JLabel lblDoc = new JLabel("Documentación");
		JLabel lblHist = new JLabel("Histórico");
		lblDoc.setForeground(java.awt.Color.lightGray);
		lblAdd.setForeground(java.awt.Color.lightGray);
		
		JLayeredPane MultPanel = new JLayeredPane();
		MultPanel.setBounds(0, 58, 637, 492);
		panel_left.add(MultPanel);
		MultPanel.setLayout(new CardLayout(0, 0));
		
		JPanel hist_panel = new JPanel();
		hist_panel.setBackground(new Color(255, 255, 255));
		MultPanel.add(hist_panel, "name_23340656493830");
		hist_panel.setLayout(null);
		
		JPanel subv_panel = new JPanel();
		subv_panel.setLayout(null);
		subv_panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Subvenciones asociadas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128,128)));
		subv_panel.setBackground(Color.WHITE);
		subv_panel.setBounds(17, 17, 602, 152);
		hist_panel.add(subv_panel);
		
		subv_scroll = new JScrollPane();
		subv_scroll.setBounds(17, 25, 566, 104);
		subv_panel.add(subv_scroll);
		
		subv_table = new JTable();
		subv_scroll.setViewportView(subv_table);
		
		activ_panel = new JPanel();
		activ_panel.setLayout(null);
		activ_panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Actividades asociadas", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128,128)));
		activ_panel.setBackground(Color.WHITE);
		activ_panel.setBounds(17, 181, 602, 152);
		hist_panel.add(activ_panel);
		
		activ_scroll = new JScrollPane();
		activ_scroll.setBounds(17, 25, 566, 104);
		activ_panel.add(activ_scroll);
		
		activ_table = new JTable();
		activ_scroll.setViewportView(activ_table);
		
		esp_panel = new JPanel();
		esp_panel.setLayout(null);
		esp_panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Espacios asociados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128,128)));
		esp_panel.setBackground(Color.WHITE);
		esp_panel.setBounds(17, 334, 602, 152);
		hist_panel.add(esp_panel);
		
		esp_scroll = new JScrollPane();
		esp_scroll.setBounds(17, 25, 566, 104);
		esp_panel.add(esp_scroll);
		
		esp_table = new JTable();
		esp_scroll.setViewportView(esp_table);
		
		
		
		JPanel doc_panel = new JPanel();
		doc_panel.setBackground(new Color(100, 149, 237));
		MultPanel.add(doc_panel, "name_23357301890851");
		
		JPanel add_panel = new JPanel();
		add_panel.setBackground(Color.WHITE);
		MultPanel.add(add_panel, "name_23382852103736");
		add_panel.setLayout(null);
		txtName = new JTextField();
		txtName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtName.setText("");
			}
		});
		txtName.setForeground(UIManager.getColor("FormattedTextField.inactiveForeground"));
		txtName.setDisabledTextColor(new Color(255, 255, 255));
		//txtName.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtName.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtName.setText("  *Nombre");
		txtName.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtName.setBounds(20, 62, 182, 33);
		add_panel.add(txtName);
		txtName.setColumns(10);
		txtName.setBorder(BorderFactory.createCompoundBorder(txtName.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		txtSurname = new JTextField();
		txtSurname.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtSurname.setText("");
			}
		});
		txtSurname.setForeground(UIManager.getColor("FormattedTextField.inactiveForeground"));
		txtSurname.setDisabledTextColor(new Color(255, 255, 255));
		//txtSurname.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtSurname.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtSurname.setText("  Apellidos");
		txtSurname.setColumns(10);
		txtSurname.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtSurname.setBounds(224, 62, 237, 33);
		add_panel.add(txtSurname);
		txtSurname.setBorder(BorderFactory.createCompoundBorder(txtSurname.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		txtDni = new JTextField();
		txtDni.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtDni.setText("");
			}
		});
		txtDni.setForeground(UIManager.getColor("FormattedTextField.inactiveForeground"));
		txtDni.setDisabledTextColor(new Color(255, 255, 255));
		//txtDni.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtDni.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtDni.setText("  *DNI/NIE/Pasaporte");
		txtDni.setColumns(10);
		txtDni.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtDni.setBounds(483, 62, 130, 33);
		add_panel.add(txtDni);
		txtDni.setBorder(BorderFactory.createCompoundBorder(txtDni.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JLabel lblRepTitle = new JLabel("Datos representante");
		//lblRepTitle.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblRepTitle.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,18));
		lblRepTitle.setForeground(new Color(128, 128, 128));
		lblRepTitle.setBounds(20, 20, 170, 30);
		add_panel.add(lblRepTitle);
		
		txtEmail = new JTextField();
		txtEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEmail.setText("");
			}
		});
		txtEmail.setText("  *E-Mail");
		txtEmail.setForeground(Color.GRAY);
		//txtEmail.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtEmail.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtEmail.setDisabledTextColor(Color.WHITE);
		txtEmail.setColumns(10);
		txtEmail.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtEmail.setBounds(20, 108, 274, 33);
		add_panel.add(txtEmail);
		txtEmail.setBorder(BorderFactory.createCompoundBorder(txtEmail.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		txtAddress = new JTextField();
		txtAddress.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtAddress.setText("");
			}
		});
		txtAddress.setText("  Dirección");
		txtAddress.setForeground(Color.GRAY);
		//txtAddress.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtAddress.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtAddress.setDisabledTextColor(Color.WHITE);
		txtAddress.setColumns(10);
		txtAddress.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtAddress.setBounds(318, 107, 295, 33);
		add_panel.add(txtAddress);
		txtAddress.setBorder(BorderFactory.createCompoundBorder(txtAddress.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(UIManager.getColor("ComboBox.background"));
		separator_2.setBounds(6, 198, 637, 12);
		add_panel.add(separator_2);
		
		JLabel lblDatosAsociacin = new JLabel("Datos Asociación");
		lblDatosAsociacin.setForeground(Color.GRAY);
		//lblDatosAsociacin.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblDatosAsociacin.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,18));
		lblDatosAsociacin.setBounds(20, 203, 170, 30);
		add_panel.add(lblDatosAsociacin);
		
		txtName2 = new JTextField();
		txtName2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtName2.setText("");
			}
		});
		txtName2.setText("  *Nombre");
		txtName2.setForeground(Color.GRAY);
		//txtName2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtName2.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtName2.setDisabledTextColor(Color.WHITE);
		txtName2.setColumns(10);
		txtName2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtName2.setBounds(20, 240, 182, 33);
		add_panel.add(txtName2);
		
		txtAddress2 = new JTextField();
		txtAddress2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtAddress2.setText("");
			}
		});
		txtAddress2.setText("  *Dirección de la sede");
		txtAddress2.setForeground(Color.GRAY);
		//txtAddress2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtAddress2.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtAddress2.setDisabledTextColor(Color.WHITE);
		txtAddress2.setColumns(10);
		txtAddress2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtAddress2.setBounds(224, 240, 237, 33);
		add_panel.add(txtAddress2);
		
		txtFax = new JTextField();
		txtFax.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtFax.setText("");
			}
		});
		txtFax.setText("  Fax");
		txtFax.setForeground(Color.GRAY);
		//txtFax.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtFax.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtFax.setDisabledTextColor(Color.WHITE);
		txtFax.setColumns(10);
		txtFax.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtFax.setBounds(393, 337, 68, 33);
		add_panel.add(txtFax);
		
		txtEmail2 = new JTextField();
		txtEmail2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEmail2.setText("");
			}
		});
		txtEmail2.setText("  *E-mail");
		txtEmail2.setForeground(Color.GRAY);
		//txtEmail2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtEmail2.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtEmail2.setDisabledTextColor(Color.WHITE);
		txtEmail2.setColumns(10);
		txtEmail2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtEmail2.setBounds(339, 288, 274, 33);
		add_panel.add(txtEmail2);
		
		txtCity = new JTextField();
		txtCity.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtCity.setText("");
			}
		});
		txtCity.setText("   *Municipio");
		txtCity.setForeground(Color.GRAY);
		//txtCity.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtCity.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtCity.setDisabledTextColor(Color.WHITE);
		txtCity.setColumns(10);
		txtCity.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtCity.setBounds(20, 153, 156, 33);
		add_panel.add(txtCity);
		
		txtCp = new JTextField();
		txtCp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtCp.setText("");
			}
		});
		txtCp.setText("  *CP");
		txtCp.setForeground(Color.GRAY);
		//txtCp.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtCp.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtCp.setDisabledTextColor(Color.WHITE);
		txtCp.setColumns(10);
		txtCp.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtCp.setBounds(195, 153, 99, 33);
		add_panel.add(txtCp);
		
		txtFijo = new JTextField();
		txtFijo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtFijo.setText("");
			}
		});
		txtFijo.setText("  Teléfono fijo");
		txtFijo.setForeground(Color.GRAY);
		//txtFijo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtFijo.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtFijo.setDisabledTextColor(Color.WHITE);
		txtFijo.setColumns(10);
		txtFijo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtFijo.setBounds(321, 153, 126, 33);
		add_panel.add(txtFijo);
		
		txtMobile = new JTextField();
		txtMobile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtMobile.setText("");
			}
		});
		txtMobile.setText("  *Teléfono movil");
		txtMobile.setForeground(Color.GRAY);
		//txtMobile.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtMobile.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtMobile.setDisabledTextColor(Color.WHITE);
		txtMobile.setColumns(10);
		txtMobile.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtMobile.setBounds(473, 152, 140, 34);
		add_panel.add(txtMobile);
		
		txtCif = new JTextField();
		txtCif.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtCif.setText("");
			}
		});
		txtCif.setText("  *CIF");
		txtCif.setForeground(Color.GRAY);
		//txtCif.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtCif.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtCif.setDisabledTextColor(Color.WHITE);
		txtCif.setColumns(10);
		txtCif.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtCif.setBounds(483, 240, 130, 33);
		add_panel.add(txtCif);
		
		txtCity2 = new JTextField();
		txtCity2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtCity2.setText("");
			}
		});
		txtCity2.setText("   *Municipio");
		txtCity2.setForeground(Color.GRAY);
		//txtCity2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtCity2.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtCity2.setDisabledTextColor(Color.WHITE);
		txtCity2.setColumns(10);
		txtCity2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtCity2.setBounds(20, 337, 156, 33);
		add_panel.add(txtCity2);
		
		txtCp2 = new JTextField();
		txtCp2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtCp2.setText("");
			}
		});
		txtCp2.setText("  *CP");
		txtCp2.setForeground(Color.GRAY);
		//txtCp2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtCp2.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtCp2.setDisabledTextColor(Color.WHITE);
		txtCp2.setColumns(10);
		txtCp2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtCp2.setBounds(188, 337, 59, 33);
		add_panel.add(txtCp2);
		
		txtFijo2 = new JTextField();
		txtFijo2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtFijo2.setText("");
			}
		});
		txtFijo2.setText("  Teléfono fijo");
		txtFijo2.setForeground(Color.GRAY);
		//txtFijo2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtFijo2.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtFijo2.setDisabledTextColor(Color.WHITE);
		txtFijo2.setColumns(10);
		txtFijo2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtFijo2.setBounds(259, 337, 126, 33);
		add_panel.add(txtFijo2);
		
		txtMobile2 = new JTextField();
		txtMobile2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtMobile2.setText("");
			}
		});
		txtMobile2.setText("  *Teléfono movil");
		txtMobile2.setForeground(Color.GRAY);
		//txtMobile2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtMobile2.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtMobile2.setDisabledTextColor(Color.WHITE);
		txtMobile2.setColumns(10);
		txtMobile2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtMobile2.setBounds(473, 336, 140, 34);
		add_panel.add(txtMobile2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(295, 288, 33, 33);
		add_panel.add(dateChooser);
		
		txtDate = new JTextField();
		txtDate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtDate.setText("");
			}
		});
		txtDate.setText("  *Fecha solicitud");
		txtDate.setForeground(Color.GRAY);
		//txtDate.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtDate.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtDate.setDisabledTextColor(Color.WHITE);
		txtDate.setColumns(10);
		txtDate.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtDate.setBounds(164, 288, 130, 33);
		add_panel.add(txtDate);
		
		JCheckBox chckbxAgree = new JCheckBox("El cliente aporta la documentación necesaria para el registro de la nueva asociación");
		chckbxAgree.setForeground(new Color(128, 128, 128));
		//chckbxAgree.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chckbxAgree.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		chckbxAgree.setBounds(22, 390, 557, 23);
		add_panel.add(chckbxAgree);
		
		JButton btnRegister = new JButton("Registrar");
		//btnRegister.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnRegister.setFont(controlador.getCentury().deriveFont(Font.BOLD,13));
		btnRegister.setForeground(new Color(128, 128, 128));
		btnRegister.setBounds(20, 425, 140, 39);
		add_panel.add(btnRegister);
		
		JButton btnCancel = new JButton("Cancelar");
		btnCancel.setForeground(new Color(128, 128, 128));
		//btnCancel.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnCancel.setFont(controlador.getCentury().deriveFont(Font.BOLD,13));
		btnCancel.setBounds(172, 425, 140, 39);
		add_panel.add(btnCancel);
		
		lblInfo = new JLabel("Los campos marcados con * son obligatorios");
		lblInfo.setForeground(new Color(128, 128, 128));
		//lblInfo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblInfo.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		lblInfo.setBounds(330, 27, 284, 16);
		add_panel.add(lblInfo);
		
		selectType = new JComboBox();
		selectType.setForeground(Color.GRAY);
		//selectType.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		selectType.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		selectType.setBorder(null);
		selectType.setModel(new DefaultComboBoxModel(new String[] {"*Tipo", "Deporte", "Cultural", "Social", "Juvenil"}));
		selectType.setBounds(20, 288, 140, 33);
		add_panel.add(selectType);
		
		lblHist.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblHist.setForeground(java.awt.Color.black);
				lblDoc.setForeground(java.awt.Color.lightGray);
				lblAdd.setForeground(java.awt.Color.lightGray);
				hist_panel.setVisible(true);
				doc_panel.setVisible(false);
				add_panel.setVisible(false);
				hist_panel2.setVisible(true);
				doc_panel2.setVisible(false);
				add_panel2.setVisible(false);
			}
		});
		lblHist.setBounds(69, 27, 81, 22);
		lblHist.setFont(new Font("Dialog", Font.BOLD, 14));
		lblHist.setFont(controlador.getSegoeui().deriveFont(Font.BOLD,14));
		panel_left.add(lblHist);
		
		lblDoc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblDoc.setForeground(java.awt.Color.black);
				lblAdd.setForeground(java.awt.Color.lightGray);
				lblHist.setForeground(java.awt.Color.lightGray);
				hist_panel.setVisible(false);
				doc_panel.setVisible(true);
				add_panel.setVisible(false);
				hist_panel2.setVisible(false);
				doc_panel2.setVisible(true);
				add_panel2.setVisible(false);
			}
		});
		
		lblDoc.setBounds(179, 30, 112, 16);
		//lblDoc.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblDoc.setFont(controlador.getSegoeui().deriveFont(Font.BOLD,14));
		panel_left.add(lblDoc);
		
		
		lblAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblAdd.setForeground(java.awt.Color.black);
				lblHist.setForeground(java.awt.Color.lightGray);
				lblDoc.setForeground(java.awt.Color.lightGray);
				hist_panel.setVisible(false);
				doc_panel.setVisible(false);
				add_panel.setVisible(true);
				hist_panel2.setVisible(false);
				doc_panel2.setVisible(false);
				add_panel2.setVisible(true);
			}
		});
		lblAdd.setBounds(336, 30, 52, 16);
		//lblAdd.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblAdd.setFont(controlador.getSegoeui().deriveFont(Font.BOLD,14));
		panel_left.add(lblAdd);
		
		JSeparator sep_header = new JSeparator();
		sep_header.setBounds(0, 53, 637, 12);
		panel_left.add(sep_header);
		sep_header.setForeground(new Color(128, 128, 128));
		
		JPanel panel_right = new JPanel();
		panel_right.setBounds(637, 0, 273, 550);
		contentPane.add(panel_right);
		panel_right.setLayout(null);
		
		JLayeredPane MultPanel2 = new JLayeredPane();
		MultPanel2.setBounds(0, 0, 273, 550);
		panel_right.add(MultPanel2);
		MultPanel2.setLayout(new CardLayout(0, 0));
		
		hist_panel2 = new JPanel();
		hist_panel2.setBackground(new Color(32,47,90));
		MultPanel2.add(hist_panel2, "name_40223813435417");
		hist_panel2.setLayout(null);
		
		JLabel lblDetails = new JLabel(" Detalles de la Asociación");
		lblDetails.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		lblDetails.setForeground(Color.WHITE);
		//lblDetails.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblDetails.setFont(controlador.getSegoeui().deriveFont(Font.BOLD,15));
		lblDetails.setBounds(17, 18, 205, 36);
		hist_panel2.add(lblDetails);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(controlador.getSegoeui().deriveFont(Font.BOLD,13));
		lblNombre.setBounds(17, 76, 205, 16);
		hist_panel2.add(lblNombre);
		
		txtEjemplo = new JTextField();
		txtEjemplo.setForeground(Color.WHITE);
		txtEjemplo.setText("Tiro al plato");
		txtEjemplo.setBorder(null);
		txtEjemplo.setEditable(false);
		txtEjemplo.setBackground(new Color(32,47,90));
		txtEjemplo.setBounds(17, 92, 205, 30);
		hist_panel2.add(txtEjemplo);
		txtEjemplo.setColumns(10);
		
		lblDireccinSede = new JLabel("Dirección Sede:");
		lblDireccinSede.setForeground(Color.WHITE);
		lblDireccinSede.setFont(null);
		lblDireccinSede.setBounds(17, 126, 205, 16);
		hist_panel2.add(lblDireccinSede);
		
		txtCDeLa = new JTextField();
		txtCDeLa.setText("C/ De la piruleta");
		txtCDeLa.setForeground(Color.WHITE);
		txtCDeLa.setEditable(false);
		txtCDeLa.setColumns(10);
		txtCDeLa.setBorder(null);
		txtCDeLa.setBackground(new Color(32, 47, 90));
		txtCDeLa.setBounds(17, 142, 205, 30);
		hist_panel2.add(txtCDeLa);
		
		lblCif = new JLabel("CIF:");
		lblCif.setForeground(Color.WHITE);
		lblCif.setFont(null);
		lblCif.setBounds(17, 175, 205, 16);
		hist_panel2.add(lblCif);
		
		txtBf = new JTextField();
		txtBf.setText("B87354F");
		txtBf.setForeground(Color.WHITE);
		txtBf.setEditable(false);
		txtBf.setColumns(10);
		txtBf.setBorder(null);
		txtBf.setBackground(new Color(32, 47, 90));
		txtBf.setBounds(17, 191, 205, 30);
		hist_panel2.add(txtBf);
		
		lblFechaSolicitud = new JLabel("Fecha solicitud:");
		lblFechaSolicitud.setForeground(Color.WHITE);
		lblFechaSolicitud.setFont(null);
		lblFechaSolicitud.setBounds(17, 228, 205, 16);
		hist_panel2.add(lblFechaSolicitud);
		
		textField_2 = new JTextField();
		textField_2.setText("22/04/2017");
		textField_2.setForeground(Color.WHITE);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBackground(new Color(32, 47, 90));
		textField_2.setBounds(17, 244, 205, 30);
		hist_panel2.add(textField_2);
		
		lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(null);
		lblEmail.setBounds(17, 283, 205, 16);
		hist_panel2.add(lblEmail);
		
		txtTiroalplatogmailcom = new JTextField();
		txtTiroalplatogmailcom.setText("tiroalplato@gmail.com");
		txtTiroalplatogmailcom.setForeground(Color.WHITE);
		txtTiroalplatogmailcom.setEditable(false);
		txtTiroalplatogmailcom.setColumns(10);
		txtTiroalplatogmailcom.setBorder(null);
		txtTiroalplatogmailcom.setBackground(new Color(32, 47, 90));
		txtTiroalplatogmailcom.setBounds(17, 299, 205, 30);
		hist_panel2.add(txtTiroalplatogmailcom);
		
		lblMunicipio = new JLabel("Municipio:");
		lblMunicipio.setForeground(Color.WHITE);
		lblMunicipio.setFont(null);
		lblMunicipio.setBounds(17, 340, 205, 16);
		hist_panel2.add(lblMunicipio);
		
		txtMadrid = new JTextField();
		txtMadrid.setText("Madrid");
		txtMadrid.setForeground(Color.WHITE);
		txtMadrid.setEditable(false);
		txtMadrid.setColumns(10);
		txtMadrid.setBorder(null);
		txtMadrid.setBackground(new Color(32, 47, 90));
		txtMadrid.setBounds(17, 356, 205, 30);
		hist_panel2.add(txtMadrid);
		
		lblCdigoPostal = new JLabel("Código Postal:");
		lblCdigoPostal.setForeground(Color.WHITE);
		lblCdigoPostal.setFont(null);
		lblCdigoPostal.setBounds(17, 398, 205, 16);
		hist_panel2.add(lblCdigoPostal);
		
		textField_5 = new JTextField();
		textField_5.setText("28022");
		textField_5.setForeground(Color.WHITE);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBorder(null);
		textField_5.setBackground(new Color(32, 47, 90));
		textField_5.setBounds(17, 414, 205, 30);
		hist_panel2.add(textField_5);
		
		lblTelfonoFijo = new JLabel("Teléfono fijo:");
		lblTelfonoFijo.setForeground(Color.WHITE);
		lblTelfonoFijo.setFont(null);
		lblTelfonoFijo.setBounds(17, 456, 205, 16);
		hist_panel2.add(lblTelfonoFijo);
		
		textField_6 = new JTextField();
		textField_6.setText("918432123");
		textField_6.setForeground(Color.WHITE);
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBorder(null);
		textField_6.setBackground(new Color(32, 47, 90));
		textField_6.setBounds(17, 472, 205, 30);
		hist_panel2.add(textField_6);
		
		doc_panel2 = new JPanel();
		doc_panel2.setBackground(Color.PINK);
		MultPanel2.add(doc_panel2, "name_40282482298038");
		
		add_panel2 = new JPanel();
		add_panel2.setBackground(new Color(32,47,90));
		MultPanel2.add(add_panel2, "name_40289285423663");
		add_panel2.setLayout(null);
		
		lblTitle = new JLabel(" Buscar Representante");
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(null);
		lblTitle.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		lblTitle.setBounds(17, 16, 151, 36);
		add_panel2.add(lblTitle);
		
		btnSearchRep = new JLabel("");
		btnSearchRep.setIcon(new ImageIcon("/Users/sergio/git/FaisanPI/img/search.png"));
		btnSearchRep.setBounds(17, 64, 40, 40);
		add_panel2.add(btnSearchRep);
		
		lblSearchRep = new JTextField();
		lblSearchRep.setForeground(Color.WHITE);
		lblSearchRep.setText("B33474D");
		lblSearchRep.setBorder(null);
		lblSearchRep.setBackground(new Color(32,47,90));
		lblSearchRep.setBounds(55, 70, 113, 23);
		add_panel2.add(lblSearchRep);
		lblSearchRep.setColumns(10);
		
		sep_add_panel2 = new JSeparator();
		sep_add_panel2.setBounds(55, 92, 113, 12);
		add_panel2.add(sep_add_panel2);
		
		
		
		hist_panel.setVisible(true);
		doc_panel.setVisible(false);
		add_panel.setVisible(false);
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

		subv_table.setModel(model);
		
		subv_scroll.setViewportView(subv_table);
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

		activ_table.setModel(model);
		
		activ_scroll.setViewportView(activ_table);
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

		esp_table.setModel(model);
		
		esp_scroll.setViewportView(esp_table);
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
