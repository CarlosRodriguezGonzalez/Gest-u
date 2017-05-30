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
	private JLabel lblName;
	private JTable subv_table;
	private JTable activ_table;
	private JTable esp_table;
	private JPanel hist_panel2;
	private JPanel doc_panel2;
	private JPanel add_panel2;

	public AssocOptions() {
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
		txtName.setFont(new Font("Segoe UI", Font.PLAIN, 12));
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
		txtSurname.setFont(new Font("Segoe UI", Font.PLAIN, 12));
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
		txtDni.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtDni.setText("  *DNI/NIE/Pasaporte");
		txtDni.setColumns(10);
		txtDni.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtDni.setBounds(483, 62, 130, 33);
		add_panel.add(txtDni);
		txtDni.setBorder(BorderFactory.createCompoundBorder(txtDni.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JLabel lblRepTitle = new JLabel("Datos representante");
		lblRepTitle.setFont(new Font("Segoe UI", Font.PLAIN, 18));
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
		txtEmail.setFont(new Font("Segoe UI", Font.PLAIN, 12));
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
		txtAddress.setFont(new Font("Segoe UI", Font.PLAIN, 12));
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
		lblDatosAsociacin.setFont(new Font("Segoe UI", Font.PLAIN, 18));
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
		txtName2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
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
		txtAddress2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
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
		txtFax.setFont(new Font("Segoe UI", Font.PLAIN, 12));
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
		txtEmail2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
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
		txtCity.setFont(new Font("Segoe UI", Font.PLAIN, 12));
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
		txtCp.setText("  *Código Postal");
		txtCp.setForeground(Color.GRAY);
		txtCp.setFont(new Font("Segoe UI", Font.PLAIN, 12));
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
		txtFijo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
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
		txtMobile.setFont(new Font("Segoe UI", Font.PLAIN, 12));
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
		txtCif.setFont(new Font("Segoe UI", Font.PLAIN, 12));
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
		txtCity2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
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
		txtCp2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
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
		txtFijo2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
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
		txtMobile2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
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
		txtDate.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtDate.setDisabledTextColor(Color.WHITE);
		txtDate.setColumns(10);
		txtDate.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtDate.setBounds(164, 288, 130, 33);
		add_panel.add(txtDate);
		
		JCheckBox chckbxAgree = new JCheckBox("El cliente aporta la documentación necesaria para el registro de la nueva asociación");
		chckbxAgree.setForeground(new Color(128, 128, 128));
		chckbxAgree.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chckbxAgree.setBounds(22, 390, 443, 23);
		add_panel.add(chckbxAgree);
		
		JButton btnRegister = new JButton("Registrar");
		btnRegister.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnRegister.setForeground(new Color(128, 128, 128));
		btnRegister.setBounds(20, 425, 140, 39);
		add_panel.add(btnRegister);
		
		JButton btnCancel = new JButton("Cancelar");
		btnCancel.setForeground(new Color(128, 128, 128));
		btnCancel.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnCancel.setBounds(172, 425, 140, 39);
		add_panel.add(btnCancel);
		
		lblInfo = new JLabel("Los campos marcados con * son obligatorios");
		lblInfo.setForeground(new Color(128, 128, 128));
		lblInfo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblInfo.setBounds(387, 26, 226, 16);
		add_panel.add(lblInfo);
		
		selectType = new JComboBox();
		selectType.setForeground(Color.GRAY);
		selectType.setFont(new Font("Segoe UI", Font.PLAIN, 12));
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
		lblHist.setBounds(69, 27, 61, 22);
		lblHist.setFont(new Font("Segoe UI", Font.BOLD, 16));
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
			}
		});
		
		lblDoc.setBounds(179, 30, 112, 16);
		lblDoc.setFont(new Font("Segoe UI", Font.BOLD, 16));
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
		lblAdd.setFont(new Font("Segoe UI", Font.BOLD, 16));
		panel_left.add(lblAdd);
		
		JSeparator sep_header = new JSeparator();
		sep_header.setBounds(0, 53, 637, 12);
		panel_left.add(sep_header);
		sep_header.setForeground(new Color(128, 128, 128));
		
		lblName = new JLabel("Asociacion #001");
		lblName.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblName.setBounds(478, 24, 137, 22);
		panel_left.add(lblName);
		
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
		
		JLabel lblDetails = new JLabel("Detalles completos");
		lblDetails.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblDetails.setBounds(17, 28, 111, 16);
		hist_panel2.add(lblDetails);
		
		doc_panel2 = new JPanel();
		doc_panel2.setBackground(Color.PINK);
		MultPanel2.add(doc_panel2, "name_40282482298038");
		
		add_panel2 = new JPanel();
		add_panel2.setBackground(Color.MAGENTA);
		MultPanel2.add(add_panel2, "name_40289285423663");
		
		
		
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
