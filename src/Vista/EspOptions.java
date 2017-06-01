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
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EspOptions extends JFrame implements Vista{

	private ControladorImpl controlador;
	private ModeloImpl modelo;
	
	private JPanel contentPane;
	private JFrame frame;
	private JTextField txtName;
	private JLabel lblInfo;
	private JTextArea textArea;
	private JTextField txtfechaDeSolicitud;
	private JTextField txtfechaDeConcesin;
	private JTextField textField;
	private JTextField txtprueba;

	public EspOptions(ControladorImpl con) {
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
		txtName.setText("  *Dirección");
		txtName.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtName.setBounds(20, 62, 182, 33);
		add_panel.add(txtName);
		txtName.setColumns(10);
		txtName.setBorder(BorderFactory.createCompoundBorder(txtName.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JLabel lblRepTitle = new JLabel("Solicitar Espacio Municipal");
		//lblRepTitle.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblRepTitle.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,16));
		lblRepTitle.setForeground(new Color(128, 128, 128));
		lblRepTitle.setBounds(20, 20, 194, 30);
		add_panel.add(lblRepTitle);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(UIManager.getColor("ComboBox.background"));
		separator_2.setBounds(0, 211, 637, 12);
		add_panel.add(separator_2);
		
		JCheckBox chckbxAgree = new JCheckBox("El cliente aporta la documentación necesaria para el registro del nuevo espacio municipal");
		chckbxAgree.setForeground(new Color(128, 128, 128));
		//chckbxAgree.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chckbxAgree.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		chckbxAgree.setBounds(20, 390, 609, 23);
		add_panel.add(chckbxAgree);
		
		JButton btnRegister = new JButton("Registrar");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.insertarEspacios();
				txtprueba.setForeground(new Color(42, 239, 35));
				txtprueba.setText("El espacio municipal para la asociación con CIF: "+ getTextField() + " ha sido registrado.");
			}
		});
		//btnRegister.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnRegister.setFont(controlador.getCentury().deriveFont(Font.BOLD,13));
		btnRegister.setForeground(new Color(128, 128, 128));
		btnRegister.setBounds(20, 425, 140, 39);
		add_panel.add(btnRegister);
		
		JButton btnCancel = new JButton("Cancelar");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
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
		
		textArea = new JTextArea();
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textArea.setText("");
			}
		});
		textArea.setText("Características");
		textArea.setForeground(Color.GRAY);
		textArea.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		textArea.setBorder(BorderFactory.createCompoundBorder(txtName.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		textArea.setBounds(20, 107, 592, 99);
		add_panel.add(textArea);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(376, 62, 31, 33);
		add_panel.add(dateChooser);
		
		
		txtfechaDeSolicitud = new JTextField();
		txtfechaDeSolicitud.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtfechaDeSolicitud.setText("");
			}
		});
		txtfechaDeSolicitud.setText("  *Fecha de solicitud");
		txtfechaDeSolicitud.setForeground(Color.GRAY);
		txtfechaDeSolicitud.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtfechaDeSolicitud.setDisabledTextColor(Color.WHITE);
		txtfechaDeSolicitud.setColumns(10);
		txtfechaDeSolicitud.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtfechaDeSolicitud.setBounds(214, 62, 162, 33);
		add_panel.add(txtfechaDeSolicitud);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(584, 62, 30, 33);
		add_panel.add(dateChooser_1);
		
		txtfechaDeConcesin = new JTextField();
		txtfechaDeConcesin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtfechaDeConcesin.setText("");
			}
		});
		txtfechaDeConcesin.setText("  *Fecha de concesión");
		txtfechaDeConcesin.setForeground(Color.GRAY);
		txtfechaDeConcesin.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		txtfechaDeConcesin.setDisabledTextColor(Color.WHITE);
		txtfechaDeConcesin.setColumns(10);
		txtfechaDeConcesin.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtfechaDeConcesin.setBounds(419, 62, 162, 33);
		add_panel.add(txtfechaDeConcesin);
		
		JLabel label = new JLabel("Buscar Asociación");
		label.setForeground(Color.GRAY);
		label.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,16));
		label.setBounds(20, 223, 170, 30);
		add_panel.add(label);
		
		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
			}
		});
		textField.setText("  *Introduzca CIF");
		textField.setForeground(Color.GRAY);
		textField.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		textField.setDisabledTextColor(Color.WHITE);
		textField.setColumns(10);
		textField.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		textField.setBounds(20, 255, 117, 41);
		add_panel.add(textField);
		
		JLabel lblparaDarDe = new JLabel("*Para dar de alta el nuevo espacio municipal es obligatorio que esté vinculado a una asociación");
		lblparaDarDe.setForeground(Color.GRAY);
		lblparaDarDe.setFont(controlador.getSegoeui().deriveFont(Font.PLAIN,12));
		lblparaDarDe.setBounds(20, 322, 611, 16);
		add_panel.add(lblparaDarDe);
		
		txtprueba = new JTextField();
		txtprueba.setBorder(null);
		txtprueba.setFont(controlador.getSegoeui().deriveFont(Font.BOLD,13));
		txtprueba.setBounds(20, 466, 594, 26);
		add_panel.add(txtprueba);
		txtprueba.setColumns(10);
		
		
		
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
	
	public void setTxtfechaDeSolicitud(String txtfechaDeSolicitud) {
		this.txtfechaDeSolicitud.setText(txtfechaDeSolicitud);
	}

	@Override
	public void setControlador(Controlador controlador) {
		this.controlador = (ControladorImpl) controlador;
	}

	@Override
	public void setModelo(Modelo modelo) {
		this.modelo = (ModeloImpl) modelo;
	}

	public String getTxtName() {
		return txtName.getText();
	}

	public String getTextArea() {
		return textArea.getText();
	}

	public String getTxtfechaDeSolicitud() {
		return txtfechaDeSolicitud.getText();
	}

	public String getTxtfechaDeConcesin() {
		return txtfechaDeConcesin.getText();
	}

	public String getTextField() {
		return textField.getText();
	}
}


