package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controlador.Controlador;
import Controlador.ControladorImpl;
import Modelo.Modelo;
import Modelo.ModeloImpl;

import javax.swing.JFileChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JPasswordField;

public class DBConfig extends JFrame implements Vista{
	
	private ControladorImpl controlador;
	private ModeloImpl modelo;

	private JPanel contentPane;
	private JTextField txtChooseINI;
	private JTextField txtHost;
	private JTextField txtPort;
	private JPasswordField JPwd;
	private JTextField txtDBName;
	private JTextField txtUser;
	private JTextField txtTestConexion;
	
	public DBConfig() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 910, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel container = new JPanel();
		container.setBounds(0, 0, 910, 550);
		contentPane.add(container);
		container.setLayout(null);
		
		JPanel menu = new JPanel();
		menu.setBackground(new Color(0, 18, 50));
		menu.setBounds(0, 0, 83, 550);
		container.add(menu);
		menu.setLayout(null);
		
		JLabel lblAssoc = new JLabel("");
		lblAssoc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.pasarAsociaciones();
				dispose();
			}
		});
		lblAssoc.setBounds(18, 83, 45, 55);
		lblAssoc.setIcon(new ImageIcon("img/header-assoc.png"));
		menu.add(lblAssoc);
		
		JLabel lblSubv = new JLabel("");
		lblSubv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.pasarSubvenciones();
				dispose();
			}
		});
		lblSubv.setIcon(new ImageIcon("img/Coins-40.png"));
		lblSubv.setBounds(18, 160, 45, 40);
		menu.add(lblSubv);
		
		JLabel lblActiv = new JLabel("");
		lblActiv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.pasarActividad();
				dispose();
			}
		});
		lblActiv.setIcon(new ImageIcon("img/Activity Feed Filled-40.png"));
		lblActiv.setBounds(18, 231, 61, 40);
		menu.add(lblActiv);
		
		JLabel lblEsp = new JLabel("");
		lblEsp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.pasarEspacioMunicipal();
				dispose();
			}
		});
		lblEsp.setIcon(new ImageIcon("img/Park Bench-40.png"));
		lblEsp.setBounds(18, 301, 61, 40);
		menu.add(lblEsp);
		
		JLabel lblHome = new JLabel("");
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.pasarMenuInicio();
				dispose();
			}
		});
		lblHome.setIcon(new ImageIcon("img/Top Menu-40.png"));
		lblHome.setBounds(18, 16, 45, 55);
		menu.add(lblHome);
		
		JPanel tableContainer = new JPanel();
		tableContainer.setBorder(null);
		tableContainer.setForeground(new Color(192, 192, 192));
		tableContainer.setBackground(Color.WHITE);
		tableContainer.setBounds(81, 254, 829, 296);
		container.add(tableContainer);
		tableContainer.setLayout(null);
		
		JPanel detailsContainer = new JPanel();
		detailsContainer.setBackground(Color.WHITE);
		detailsContainer.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Detalles de conexi\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128,128)));
		detailsContainer.setBounds(19, 19, 786, 271);
		tableContainer.add(detailsContainer);
		detailsContainer.setLayout(null);
		
		txtHost = new JTextField();
		
		txtHost.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtHost.setForeground(Color.GRAY);
		txtHost.setText("Host / URL");
		txtHost.setBounds(21, 107, 205, 29);
		detailsContainer.add(txtHost);
		txtHost.setColumns(10);
		txtHost.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtHost.setBackground(Color.WHITE);
		txtHost.setBorder(BorderFactory.createCompoundBorder(txtHost.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JComboBox selectConn = new JComboBox();
		selectConn.setForeground(new Color(128,128,128));
		selectConn.setBounds(284, 150, 237, 27);
		detailsContainer.add(selectConn);
		selectConn.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		selectConn.setModel(new DefaultComboBoxModel(new String[] {"MySQL", "MongoDB", "Oracle Database", "PostgreSQL"}));
		
		JLabel lblConn = new JLabel("Tipo");
		lblConn.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblConn.setForeground(new Color(128,128,128));
		lblConn.setBounds(238, 154, 34, 16);
		detailsContainer.add(lblConn);
		
		txtPort = new JTextField();
		
		txtPort.setForeground(Color.GRAY);
		txtPort.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtPort.setText("Puerto");
		txtPort.setColumns(10);
		txtPort.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtPort.setBorder(BorderFactory.createCompoundBorder(txtPort.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		txtPort.setBackground(Color.WHITE);
		txtPort.setBounds(21, 148, 205, 29);
		detailsContainer.add(txtPort);
		
		JPwd = new JPasswordField();
		
		JPwd.setForeground(Color.GRAY);
		JPwd.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		JPwd.setText("Contraseña");
		JPwd.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		JPwd.setBorder(BorderFactory.createCompoundBorder(JPwd.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		JPwd.setBounds(526, 149, 194, 26);
		detailsContainer.add(JPwd);
		
		JButton btnSave = new JButton("Guardar cambios");
		btnSave.setFont(new Font("Century Gothic", Font.BOLD, 12));
		btnSave.setForeground(new Color(128,128,128));
		btnSave.setBounds(16, 215, 140, 43);
		detailsContainer.add(btnSave);
		
		JButton btnTest = new JButton("Probar conexión");
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.testConexion();
			}
		});
		btnTest.setForeground(new Color(128,128,128));
		btnTest.setFont(new Font("Century Gothic", Font.BOLD, 12));
		btnTest.setBounds(580, 215, 140, 43);
		detailsContainer.add(btnTest);
		
		JButton btnLoad = new JButton("Cargar Datos");
		btnLoad.setForeground(new Color(128,128,128));
		btnLoad.setFont(new Font("Century Gothic", Font.BOLD, 12));
		btnLoad.setBounds(168, 215, 132, 43);
		detailsContainer.add(btnLoad);
		
		JLabel lblTestIMG = new JLabel("");
		lblTestIMG.setIcon(new ImageIcon("img/Accept Database Filled-35.png"));
		lblTestIMG.setBounds(733, 215, 40, 40);
		detailsContainer.add(lblTestIMG);
		
		txtDBName = new JTextField();
		
		txtDBName.setForeground(Color.GRAY);
		txtDBName.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtDBName.setText("Base de datos");
		txtDBName.setColumns(10);
		txtDBName.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtDBName.setBorder(BorderFactory.createCompoundBorder(txtDBName.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		txtDBName.setBackground(Color.WHITE);
		txtDBName.setBounds(238, 107, 276, 29);
		detailsContainer.add(txtDBName);
		
		txtUser = new JTextField();
		
		txtUser.setForeground(Color.GRAY);
		txtUser.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtUser.setText("Usuario");
		txtUser.setColumns(10);
		txtUser.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtUser.setBorder(BorderFactory.createCompoundBorder(txtUser.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		txtUser.setBackground(Color.WHITE);
		txtUser.setBounds(526, 107, 194, 29);
		detailsContainer.add(txtUser);
		
		JLabel lblInfo = new JLabel("En este apartado podrá configurar los parámetros de conexión a BBDD de forma avanzada, además de tener la opción de probar una");
		lblInfo.setForeground(new Color(128,128,128));
		lblInfo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblInfo.setBounds(22, 34, 751, 16);
		detailsContainer.add(lblInfo);
		
		txtTestConexion = new JTextField();
		txtTestConexion.setBorder(null);
		txtTestConexion.setBounds(409, 222, 163, 26);
		detailsContainer.add(txtTestConexion);
		txtTestConexion.setColumns(10);
		
		JLabel lblInfo2 = new JLabel("nueva conexión en vivo con otros parámetros.");
		lblInfo2.setForeground(Color.GRAY);
		lblInfo2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblInfo2.setBounds(21, 57, 751, 16);
		detailsContainer.add(lblInfo2);
		
		JPanel pathContainer = new JPanel();
		pathContainer.setBackground(new Color(240, 240, 240));
		pathContainer.setBounds(81, 59, 829, 196);
		container.add(pathContainer);
		pathContainer.setLayout(null);
		
		JLabel lblLogo = new JLabel("Gest-U");
		lblLogo.setBounds(691, 6, 108, 37);
		lblLogo.setFont(new Font("Segoe UI", Font.PLAIN, 37));
		pathContainer.add(lblLogo);
		
		JLabel lblSlogan = new JLabel("Experts on management");
		lblSlogan.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblSlogan.setBounds(654, 41, 145, 20);
		pathContainer.add(lblSlogan);
		
		JPanel PathDetails = new JPanel();
		PathDetails.setLayout(null);
		PathDetails.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Ruta archivo Config.INI", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128,128)));
		PathDetails.setBackground(new Color(240,240,240));
		PathDetails.setBounds(22, 73, 782, 107);
		pathContainer.add(PathDetails);
		
		JLabel lblInfo3 = new JLabel("En la siguiente ruta relativa se encuentra su archivo principal de configuración:");
		lblInfo3.setForeground(Color.GRAY);
		lblInfo3.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblInfo3.setBounds(22, 29, 717, 16);
		PathDetails.add(lblInfo3);
		
		txtChooseINI = new JTextField();
		txtChooseINI.setBounds(22, 57, 699, 29);
		PathDetails.add(txtChooseINI);
		
		
		txtChooseINI.setForeground(Color.GRAY);
		txtChooseINI.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtChooseINI.setText("Ruta archivo de configuración");
		txtChooseINI.setBackground(Color.WHITE);
		txtChooseINI.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtChooseINI.setBorder(BorderFactory.createCompoundBorder(txtChooseINI.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		txtChooseINI.setColumns(10);
		
		JPanel headerContainer = new JPanel();
		headerContainer.setBackground(Color.WHITE);
		headerContainer.setBounds(81, 0, 829, 59);
		container.add(headerContainer);
		headerContainer.setLayout(null);
		
		JLabel lblSectionIMG = new JLabel("");
		lblSectionIMG.setBounds(16, 6, 40, 40);
		lblSectionIMG.setIcon(new ImageIcon("img/Database Filled-35.png"));
		headerContainer.add(lblSectionIMG);
		
		JLabel lblTitle = new JLabel("Configuración Base de datos");
		lblTitle.setBounds(58, 10, 250, 36);
		lblTitle.setForeground(new Color(128, 128, 128));
		lblTitle.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		headerContainer.add(lblTitle);
		
		JSeparator sep_header = new JSeparator();
		sep_header.setBounds(55, 41, 241, 12);
		headerContainer.add(sep_header);
		
		JLabel lblUserIMG = new JLabel("");
		lblUserIMG.setBounds(633, 6, 40, 40);
		lblUserIMG.setIcon(new ImageIcon("img/User-40 (2).png"));
		headerContainer.add(lblUserIMG);
		
		JLabel lblUser = new JLabel("Usuario");
		lblUser.setBounds(675, 6, 76, 40);
		lblUser.setForeground(new Color(128, 128, 128));
		lblUser.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		headerContainer.add(lblUser);
		
		JLabel lblLogOut = new JLabel("");
		lblLogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.pasarLogin();
				dispose();
			}
		});
		lblLogOut.setBounds(781, 6, 40, 40);
		lblLogOut.setIcon(new ImageIcon("img/Exit-35.png"));
		headerContainer.add(lblLogOut);
		
		
        
	}
	
	public void actualizarConfiguracion(){
		txtHost.setText(modelo.getHost());
		txtUser.setText(modelo.getUser());
		txtDBName.setText(modelo.getDb());
		txtPort.setText(modelo.getPuerto());
		JPwd.setText(modelo.getPwd());
		txtChooseINI.setText(modelo.getRuta());
	}
	public void actualizarTest(){
		if(modelo.getTest()){
			txtTestConexion.setForeground(new Color(42, 239, 35));
			txtTestConexion.setText("¡¡Conexión satisfactoria!!");
		}else{
			txtTestConexion.setForeground(new Color(239, 35, 35));
			txtTestConexion.setText("¡¡Conexión fallida!!");
		}
	}

	@Override
	public void setControlador(Controlador controlador) {
		this.controlador = (ControladorImpl) controlador;
	}

	@Override
	public void setModelo(Modelo modelo) {
		this.modelo = (ModeloImpl) modelo;
	}

	public JTextField getTxtHost() {
		return txtHost;
	}

	public JTextField getTxtPuerto() {
		return txtPort;
	}

	public JPasswordField getPwdContrasea() {
		return JPwd;
	}

	public JTextField getTxtBaseDeDatos() {
		return txtDBName;
	}

	public JTextField getTxtUsuario() {
		return txtUser;
	}
}
