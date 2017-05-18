package Vista;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import ClasesTabla.Asociacion;
import Controlador.Controlador;
import Controlador.ControladorImpl;
import Modelo.Modelo;
import Modelo.ModeloImpl;
public class MenuInicio extends JFrame implements Vista {

	private ControladorImpl controlador=new ControladorImpl();
	private ModeloImpl modelo=new ModeloImpl();

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtNifcif;
	private JTextField txtAltaDesde;
	private JTextField txtAltaHasta;
	private JTable table_1;
	private JScrollPane scrollPane;

	/**c
	 * Launch the application.
	 */

	/**
	 * Create the frame.t
	 */
	public MenuInicio() {
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
		panel_2.setBackground(new Color(32, 47, 90));
		panel_2.setBounds(81, 254, 829, 296);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(240, 240, 240));
		panel_3.setBounds(81, 59, 829, 196);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTorri = new JLabel("Gest-U v0.2");
		lblTorri.setBounds(627, 6, 181, 40);
		lblTorri.setFont(new Font("Segoe UI", Font.PLAIN, 37));
		panel_3.add(lblTorri);
		
		JLabel lblSloganTorrismart = new JLabel("Experts on management");
		lblSloganTorrismart.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblSloganTorrismart.setBounds(633, 39, 175, 26);
		panel_3.add(lblSloganTorrismart);
		
		txtNombre = new JTextField();
		txtNombre.setForeground(new Color(128,128,128));
		txtNombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNombre.setText("");
			}
		});
		txtNombre.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtNombre.setText("Asociación");
		txtNombre.setBackground(new Color(240, 240, 240));
		txtNombre.setBorder(null);
		txtNombre.setBounds(28, 103, 56, 16);
		panel_3.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtNifcif = new JTextField();
		txtNifcif.setForeground(new Color(128,128,128));
		txtNifcif.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtNifcif.setText("");
			}
		});
		txtNifcif.setText("Identificador");
		txtNifcif.setFont(new Font("Segoe UI", Font.BOLD, 12));
		txtNifcif.setColumns(10);
		txtNifcif.setBorder(null);
		txtNifcif.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		txtNifcif.setBounds(28, 75, 64, 16);
		panel_3.add(txtNifcif);
		
		
		
		txtAltaDesde = new JTextField();
		txtAltaDesde.setForeground(new Color(128,128,128));
		txtAltaDesde.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtAltaDesde.setText("");
			}
		});
		txtAltaDesde.setText("Alta desde");
		txtAltaDesde.setFont(new Font("Segoe UI", Font.BOLD, 12));
		txtAltaDesde.setColumns(10);
		txtAltaDesde.setBorder(null);
		txtAltaDesde.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		txtAltaDesde.setBounds(250, 75, 100, 16);
		panel_3.add(txtAltaDesde);
		
		txtAltaHasta = new JTextField();
		txtAltaHasta.setForeground(new Color(128,128,128));
		txtAltaHasta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtAltaHasta.setText("");
			}
		});
		txtAltaHasta.setText("Alta hasta");
		txtAltaHasta.setFont(new Font("Segoe UI", Font.BOLD, 12));
		txtAltaHasta.setColumns(10);
		txtAltaHasta.setBorder(null);
		txtAltaHasta.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		txtAltaHasta.setBounds(250, 104, 100, 16);
		panel_3.add(txtAltaHasta);
		


		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(new Color(189,195,199));
		panel_7.setBounds(640, 89, 159, 40);
		panel_3.add(panel_7);
		
		JLabel lblPreimpresos = new JLabel("PREIMPRESOS");
		lblPreimpresos.setIcon(new ImageIcon("img/Paper-30.png"));
		lblPreimpresos.setForeground(Color.WHITE);
		lblPreimpresos.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblPreimpresos.setBounds(6, 6, 169, 28);
		panel_7.add(lblPreimpresos);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(new Color(189,195,199));
		panel_9.setBounds(465, 141, 159, 40);
		panel_3.add(panel_9);
		
		JLabel lblNoticias = new JLabel("HISTÓRICO");
		lblNoticias.setIcon(new ImageIcon("img/News-30.png"));
		lblNoticias.setForeground(Color.WHITE);
		lblNoticias.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNoticias.setBounds(12, 0, 101, 40);
		panel_9.add(lblNoticias);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(189, 195, 199));
		panel_6.setBounds(465, 89, 159, 40);
		panel_3.add(panel_6);
		
		JLabel lblConfiguracin = new JLabel("CONFIGURACIÓN");
		lblConfiguracin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.pasarConfiguracion();
				dispose();
			}
		});
		lblConfiguracin.setIcon(new ImageIcon("img/Database-30.png"));
		lblConfiguracin.setForeground(Color.WHITE);
		lblConfiguracin.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblConfiguracin.setBounds(12, 0, 141, 40);
		panel_6.add(lblConfiguracin);
		
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(new Color(189, 195, 199));
		panel_8.setBounds(28, 139, 150, 40);
		panel_3.add(panel_8);
		
		JLabel label_2 = new JLabel("    CONSULTAR");
		label_2.setIcon(new ImageIcon("img/Search Property-30.png"));
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Century Gothic", Font.BOLD, 12));
		label_2.setBounds(13, 0, 131, 40);
		panel_8.add(label_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(352, 75, 28, 26);
		panel_3.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(352, 103, 28, 26);
		panel_3.add(dateChooser_1);
		
		JLabel lblBsqueda_1 = new JLabel("Filtros de búsqueda");
		lblBsqueda_1.setForeground(new Color(105,105,105));
		lblBsqueda_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblBsqueda_1.setBounds(28, 18, 121, 32);
		panel_3.add(lblBsqueda_1);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(410, 28, 21, 150);
		panel_3.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(new Color(128,128,128));
		separator_6.setBounds(28, 90, 194, 16);
		panel_3.add(separator_6);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.GRAY);
		separator_2.setBounds(250, 89, 100, 16);
		panel_3.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.GRAY);
		separator_3.setBounds(28, 117, 197, 16);
		panel_3.add(separator_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.GRAY);
		separator_1.setBounds(250, 117, 100, 16);
		panel_3.add(separator_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(81, 0, 829, 59);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(16, 6, 40, 40);
		lblNewLabel.setIcon(new ImageIcon("img/header-menu.png"));
		panel_4.add(lblNewLabel);
		
		JLabel lblBsqueda = new JLabel("Menú Principal");
		lblBsqueda.setBounds(61, 6, 131, 36);
		lblBsqueda.setForeground(new Color(128, 128, 128));
		lblBsqueda.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		panel_4.add(lblBsqueda);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(59, 34, 131, 12);
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
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.pasarLogin();
				dispose();
			}
		});
		lblNewLabel_2.setBounds(781, 6, 40, 40);
		lblNewLabel_2.setIcon(new ImageIcon("img/Exit-35.png"));
		panel_4.add(lblNewLabel_2);
		

		//headers for the table
      
         
        //create table model with data
        
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setFont(new Font("Century Gothic", Font.PLAIN, 13));
		scrollPane.setBounds(16, 21, 795, 243);
		panel_2.add(scrollPane);
		
        JTable table = new JTable();
        table.setForeground(new Color(255, 255, 255));
        table.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        table.setBackground(new Color(106, 116, 145));
        table.setShowGrid(false);
		
		table_1 = new JTable();
		table_1.setBounds(574, 89, 1, 1);
		contentPane.add(table_1);

	}
	public void actualizarTabla(){
		ArrayList<Asociacion> a=modelo.getA();
		DefaultTableModel model = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		model.addColumn("ID");
		model.addColumn("Nombre");
		model.addColumn("CIF");
		model.addColumn("Fecha");
		for (int i = 0; i < a.size(); i++) {
			model.addRow(new Object[] { a.get(i).getId(), a.get(i).getNombre(), a.get(i).getCif(),
					a.get(i).getFecha()});
		}

		table_1.setModel(model);
		
		scrollPane.setViewportView(table_1);
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
