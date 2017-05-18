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
	//
	private JTextField txtHost;
	private JTextField txtPuerto;
	private JPasswordField pwdContrasea;
	private JTextField txtBaseDeDatos;
	private JTextField txtUsuario;
	private JTextField txtTestConexion;
	
	
	
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public DBConfig() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 910, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 910, 550);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 18, 50));
		panel_1.setBounds(0, 0, 83, 550);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.pasarAsociaciones();
				dispose();
			}
		});
		label_1.setBounds(18, 83, 45, 55);
		label_1.setIcon(new ImageIcon("img/header-assoc.png"));
		panel_1.add(label_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.pasarSubvenciones();
				dispose();
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon("img/Coins-40.png"));
		lblNewLabel_4.setBounds(18, 160, 45, 40);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.pasarActividad();
				dispose();
			}
		});
		lblNewLabel_5.setIcon(new ImageIcon("img/Activity Feed Filled-40.png"));
		lblNewLabel_5.setBounds(18, 231, 61, 40);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.pasarEspacioMunicipal();
				dispose();
			}
		});
		lblNewLabel_6.setIcon(new ImageIcon("img/Park Bench-40.png"));
		lblNewLabel_6.setBounds(18, 301, 61, 40);
		panel_1.add(lblNewLabel_6);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.pasarMenuInicio();
				dispose();
			}
		});
		label_3.setIcon(new ImageIcon("img/Top Menu-40.png"));
		label_3.setBounds(18, 16, 45, 55);
		panel_1.add(label_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(null);
		panel_2.setForeground(new Color(192, 192, 192));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(81, 254, 829, 296);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_10.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Detalles de conexi\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 128,128)));
		panel_10.setBounds(20, 6, 786, 284);
		panel_2.add(panel_10);
		panel_10.setLayout(null);
		
		txtHost = new JTextField();
		txtHost.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtHost.setText("");
			}
		});
		txtHost.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtHost.setForeground(Color.GRAY);
		txtHost.setText("Host / URL");
		txtHost.setBounds(21, 62, 205, 29);
		panel_10.add(txtHost);
		txtHost.setColumns(10);
		txtHost.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtHost.setBackground(Color.WHITE);
		txtHost.setBorder(BorderFactory.createCompoundBorder(txtHost.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setForeground(new Color(128,128,128));
		comboBox_1.setBounds(284, 105, 237, 27);
		panel_10.add(comboBox_1);
		comboBox_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"MySQL", "Asociación", "Subvención", "Actividades", "Espacio Municipal"}));
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblTipo.setForeground(new Color(128,128,128));
		lblTipo.setBounds(238, 109, 276, 16);
		panel_10.add(lblTipo);
		
		txtPuerto = new JTextField();
		txtPuerto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtPuerto.setText("");
			}
		});
		txtPuerto.setForeground(Color.GRAY);
		txtPuerto.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtPuerto.setText("Puerto");
		txtPuerto.setColumns(10);
		txtPuerto.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtPuerto.setBorder(BorderFactory.createCompoundBorder(txtPuerto.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		txtPuerto.setBackground(Color.WHITE);
		txtPuerto.setBounds(21, 103, 205, 29);
		panel_10.add(txtPuerto);
		
		txtChooseINI = new JTextField();
		
		txtChooseINI.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtChooseINI.setText("");
			}
		});
		txtChooseINI.setForeground(Color.GRAY);
		txtChooseINI.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtChooseINI.setText("Ruta archivo de configuración");
		txtChooseINI.setBounds(21, 145, 699, 29);
		panel_10.add(txtChooseINI);
		txtChooseINI.setBackground(Color.WHITE);
		txtChooseINI.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtChooseINI.setBorder(BorderFactory.createCompoundBorder(txtChooseINI.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		txtChooseINI.setColumns(10);
		
		pwdContrasea = new JPasswordField();
		pwdContrasea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pwdContrasea.setText("");
			}
		});
		pwdContrasea.setForeground(Color.GRAY);
		pwdContrasea.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		pwdContrasea.setText("Contraseña");
		pwdContrasea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		pwdContrasea.setBorder(BorderFactory.createCompoundBorder(pwdContrasea.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		pwdContrasea.setBounds(526, 104, 194, 26);
		panel_10.add(pwdContrasea);
		
		JButton btnNewButton = new JButton("Guardar cambios");
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(128,128,128));
		btnNewButton.setBounds(16, 215, 140, 43);
		panel_10.add(btnNewButton);
		
		JButton btnProbarConexin = new JButton("Probar conexión");
		btnProbarConexin.setForeground(new Color(128,128,128));
		btnProbarConexin.setFont(new Font("Century Gothic", Font.BOLD, 12));
		btnProbarConexin.setBounds(580, 215, 140, 43);
		panel_10.add(btnProbarConexin);
		
		JButton btnCargarDatos = new JButton("Cargar Datos");
		btnCargarDatos.setForeground(new Color(128,128,128));
		btnCargarDatos.setFont(new Font("Century Gothic", Font.BOLD, 12));
		btnCargarDatos.setBounds(168, 215, 132, 43);
		panel_10.add(btnCargarDatos);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("img/Accept Database Filled-35.png"));
		label_2.setBounds(733, 215, 40, 40);
		panel_10.add(label_2);
		
		txtBaseDeDatos = new JTextField();
		txtBaseDeDatos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtBaseDeDatos.setText("");
			}
		});
		txtBaseDeDatos.setForeground(Color.GRAY);
		txtBaseDeDatos.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtBaseDeDatos.setText("Base de datos");
		txtBaseDeDatos.setColumns(10);
		txtBaseDeDatos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtBaseDeDatos.setBorder(BorderFactory.createCompoundBorder(txtBaseDeDatos.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		txtBaseDeDatos.setBackground(Color.WHITE);
		txtBaseDeDatos.setBounds(238, 62, 276, 29);
		panel_10.add(txtBaseDeDatos);
		
		txtUsuario = new JTextField();
		txtUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtUsuario.setText("");
			}
		});
		txtUsuario.setForeground(Color.GRAY);
		txtUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtUsuario.setText("Usuario");
		txtUsuario.setColumns(10);
		txtUsuario.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtUsuario.setBorder(BorderFactory.createCompoundBorder(txtUsuario.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		txtUsuario.setBackground(Color.WHITE);
		txtUsuario.setBounds(526, 62, 194, 29);
		panel_10.add(txtUsuario);
		
		JLabel lblNewLabel_9 = new JLabel("En este apartado podrá configurar los parámetros de conexión a BBDD, además de probar la conexión instantaneamente.");
		lblNewLabel_9.setForeground(new Color(128,128,128));
		lblNewLabel_9.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblNewLabel_9.setBounds(22, 29, 751, 16);
		panel_10.add(lblNewLabel_9);
		
		txtTestConexion = new JTextField();
		txtTestConexion.setBounds(391, 222, 130, 26);
		panel_10.add(txtTestConexion);
		txtTestConexion.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 240, 240));
		panel_3.setBounds(81, 59, 829, 196);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTorri = new JLabel("Gest-U v0.2");
		lblTorri.setBounds(627, -12, 194, 73);
		lblTorri.setFont(new Font("Segoe UI", Font.PLAIN, 37));
		panel_3.add(lblTorri);
		
		JLabel lblSloganTorrismart = new JLabel("Experts on management");
		lblSloganTorrismart.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblSloganTorrismart.setBounds(627, 28, 145, 50);
		panel_3.add(lblSloganTorrismart);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(81, 0, 829, 59);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(16, 6, 40, 40);
		lblNewLabel.setIcon(new ImageIcon("img/Database Filled-35.png"));
		panel_4.add(lblNewLabel);
		
		JLabel lblBsqueda = new JLabel("Configuración Base de datos");
		lblBsqueda.setBounds(58, 10, 250, 36);
		lblBsqueda.setForeground(new Color(128, 128, 128));
		lblBsqueda.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel_4.add(lblBsqueda);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(55, 41, 241, 12);
		panel_4.add(separator);
		
		JLabel label = new JLabel("");
		label.setBounds(633, 6, 40, 40);
		label.setIcon(new ImageIcon("img/User-40 (2).png"));
		panel_4.add(label);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(675, 6, 76, 40);
		lblUsuario.setForeground(new Color(128, 128, 128));
		lblUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel_4.add(lblUsuario);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(781, 6, 40, 40);
		lblNewLabel_2.setIcon(new ImageIcon("img/Exit-35.png"));
		panel_4.add(lblNewLabel_2);
		
		//headers for the table
        String[] columns = new String[] {
            "Identificador", "Nombre", "CIF", "E-Mail", "Dirección", "Teléfono"
        };
         
        //actual data for the table in a 2d array
        Object[][] data = new Object[][] {
            {1, "Tiro al plato", "B37948858", "tiroplato-benavente@gmail.com", "C/Jacinto Benavente 33", "916345645" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {3, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {4, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {5, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {6, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
            {2, "Cacería Torrijos", "B3347885G", "caceria-torrijos@hotmail.es", "C/ Playa de Liencres 6 BIS", "916338765" },
        };
         
        //create table model with data
        DefaultTableModel model = new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column)
            {
                return false;
            }
            
        };
        
	}
	
	public void actualizarConfiguracion(){
		txtHost.setText(modelo.getHost());
		txtUsuario.setText(modelo.getUser());
		txtBaseDeDatos.setText(modelo.getDb());
		txtPuerto.setText(modelo.getPuerto());
		pwdContrasea.setText(modelo.getPwd());
		txtChooseINI.setText(modelo.getRuta());
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
