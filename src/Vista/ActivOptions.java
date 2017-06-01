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
import javax.swing.JSpinner;
import javax.swing.JTextArea;

public class ActivOptions extends JFrame implements Vista{

	private ControladorImpl controlador;
	private ModeloImpl modelo;
	
	private JPanel contentPane;
	private JFrame frame;
	private JTextField txtName;
	private JTextField txtSurname;
	private JTextField txtEmail;
	private JLabel lblInfo;
	private JComboBox selectType;
	private JLabel lblNDestinatarios;

	public ActivOptions(ControladorImpl con) {
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
		lblAdd.setForeground(Color.BLACK);
		
		JLayeredPane MultPanel = new JLayeredPane();
		MultPanel.setBounds(0, 58, 637, 492);
		panel_left.add(MultPanel);
		MultPanel.setLayout(new CardLayout(0, 0));
		
		
		JPanel add_panel = new JPanel();
		add_panel.setBackground(Color.WHITE);
		MultPanel.add(add_panel, "name_23382852103736");
		
		JPanel doc_panel = new JPanel();
		doc_panel.setBackground(new Color(100, 149, 237));
		MultPanel.add(doc_panel, "name_23357301890851");
		
		
		
		
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
		txtSurname.setText("  *Lugar");
		txtSurname.setColumns(10);
		txtSurname.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtSurname.setBounds(224, 62, 237, 33);
		add_panel.add(txtSurname);
		txtSurname.setBorder(BorderFactory.createCompoundBorder(txtSurname.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JLabel lblRepTitle = new JLabel("Actividad");
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
		txtEmail.setText("  *Fecha");
		txtEmail.setForeground(Color.GRAY);
		//txtEmail.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtEmail.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtEmail.setDisabledTextColor(Color.WHITE);
		txtEmail.setColumns(10);
		txtEmail.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtEmail.setBounds(20, 108, 237, 33);
		add_panel.add(txtEmail);
		txtEmail.setBorder(BorderFactory.createCompoundBorder(txtEmail.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(UIManager.getColor("ComboBox.background"));
		separator_2.setBounds(6, 270, 637, 12);
		add_panel.add(separator_2);
		
		JCheckBox chckbxAgree = new JCheckBox("El cliente aporta la documentación necesaria para el registro de la nueva actividad");
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
		selectType.setBounds(473, 63, 140, 33);
		add_panel.add(selectType);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(259, 107, 33, 34);
		add_panel.add(dateChooser_1);
		
		lblNDestinatarios = new JLabel("Nº Destinatarios");
		lblNDestinatarios.setForeground(Color.GRAY);
		lblNDestinatarios.setFont(null);
		lblNDestinatarios.setBounds(303, 107, 126, 30);
		add_panel.add(lblNDestinatarios);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(413, 107, 48, 30);
		add_panel.add(spinner);
		
		JTextArea txtrDescripcin = new JTextArea();
		txtrDescripcin.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtrDescripcin.setForeground(Color.GRAY);
		txtrDescripcin.setBorder(BorderFactory.createCompoundBorder(txtName.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		txtrDescripcin.setText("Descripción");
		txtrDescripcin.setBounds(20, 159, 592, 99);
		add_panel.add(txtrDescripcin);
		
		
		
		lblAdd.setBounds(78, 30, 52, 16);
		//lblAdd.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblAdd.setFont(controlador.getSegoeui().deriveFont(Font.BOLD,14));
		panel_left.add(lblAdd);
		
		JSeparator sep_header = new JSeparator();
		sep_header.setBounds(0, 53, 637, 12);
		panel_left.add(sep_header);
		sep_header.setForeground(new Color(128, 128, 128));
		
		JPanel panel_right = new JPanel();
		panel_right.setBackground(new Color(32,47,90));
		panel_right.setBounds(637, 0, 273, 550);
		contentPane.add(panel_right);
		panel_right.setLayout(null);
		
		doc_panel.setVisible(false);
		add_panel.setVisible(false);
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


