package Vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import ClasesTabla.Asociacion;
import ClasesTabla.Espacio;
import Controlador.Controlador;
import Controlador.ControladorImpl;
import Modelo.Modelo;
import Modelo.ModeloImpl;

import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class EspacioMunicipal1 extends JFrame implements Vista {

	private ControladorImpl controlador=new ControladorImpl();
	private ModeloImpl modelo=new ModeloImpl();


	private JPanel contentPane;
	
	private JTable table;

	private JScrollPane scrollPane;
	private JTextField txtFeatures;
	private JTextField txtAddress;
	private JTextField txtDateFrom;
	private JTextField txtDateTo;

	public EspacioMunicipal1() {
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
		tableContainer.setBackground(new Color(32, 47, 90));
		tableContainer.setBounds(81, 254, 829, 296);
		container.add(tableContainer);
		tableContainer.setLayout(null);
		
				scrollPane = new JScrollPane();
				scrollPane.setBounds(22, 20, 771, 258);
				tableContainer.add(scrollPane);
		
		JPanel filterContainer = new JPanel();
		filterContainer.setBackground(new Color(240, 240, 240));
		filterContainer.setBounds(81, 59, 829, 196);
		container.add(filterContainer);
		filterContainer.setLayout(null);
		
		JLabel lblLogo = new JLabel("Gest-U");
		lblLogo.setBounds(700, 6, 108, 40);
		lblLogo.setFont(new Font("Segoe UI", Font.PLAIN, 37));
		filterContainer.add(lblLogo);
		
		JLabel lblSlogan = new JLabel("Experts on management");
		lblSlogan.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblSlogan.setBounds(665, 38, 143, 26);
		filterContainer.add(lblSlogan);
		
		txtFeatures = new JTextField();
		txtFeatures.setForeground(new Color(128,128,128));
		txtFeatures.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtFeatures.setText("");
			}
		});
		txtFeatures.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtFeatures.setText("Características");
		txtFeatures.setBackground(new Color(240, 240, 240));
		txtFeatures.setBorder(null);
		txtFeatures.setBounds(28, 103, 80, 16);
		filterContainer.add(txtFeatures);
		txtFeatures.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setForeground(new Color(128,128,128));
		txtAddress.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtAddress.setText("");
			}
		});
		txtAddress.setText("Dirección");
		txtAddress.setFont(new Font("Segoe UI", Font.BOLD, 12));
		txtAddress.setColumns(10);
		txtAddress.setBorder(null);
		txtAddress.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		txtAddress.setBounds(28, 75, 80, 16);
		filterContainer.add(txtAddress);
		
		
		
		txtDateFrom = new JTextField();
		txtDateFrom.setForeground(new Color(128,128,128));
		txtDateFrom.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtDateFrom.setText("");
			}
		});
		txtDateFrom.setText("Fecha solicitud");
		txtDateFrom.setFont(new Font("Segoe UI", Font.BOLD, 12));
		txtDateFrom.setColumns(10);
		txtDateFrom.setBorder(null);
		txtDateFrom.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		txtDateFrom.setBounds(250, 75, 100, 16);
		filterContainer.add(txtDateFrom);
		
		txtDateTo = new JTextField();
		txtDateTo.setForeground(new Color(128,128,128));
		txtDateTo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtDateTo.setText("");
			}
		});
		txtDateTo.setText("Fecha concesión");
		txtDateTo.setFont(new Font("Segoe UI", Font.BOLD, 12));
		txtDateTo.setColumns(10);
		txtDateTo.setBorder(null);
		txtDateTo.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		txtDateTo.setBounds(250, 104, 100, 16);
		filterContainer.add(txtDateTo);
		


		
		JPanel btnPreimp = new JPanel();
		btnPreimp.setLayout(null);
		btnPreimp.setBackground(new Color(189,195,199));
		btnPreimp.setBounds(683, 89, 125, 40);
		filterContainer.add(btnPreimp);
		
		JLabel lblPreimp = new JLabel("PREIMPRESOS");
		lblPreimp.setIcon(new ImageIcon("img/Paper-30.png"));
		lblPreimp.setForeground(Color.WHITE);
		lblPreimp.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblPreimp.setBounds(6, 6, 122, 28);
		btnPreimp.add(lblPreimp);
		
		JPanel btnAdd = new JPanel();
		btnAdd.setLayout(null);
		btnAdd.setBackground(new Color(189, 195, 199));
		btnAdd.setBounds(546, 89, 125, 40);
		filterContainer.add(btnAdd);
		
		JLabel lblAdd = new JLabel("AÑADIR");
		lblAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//TODO
				dispose();
			}
		});
		lblAdd.setIcon(new ImageIcon("img/Add Property-30.png"));
		lblAdd.setForeground(Color.WHITE);
		lblAdd.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblAdd.setBounds(17, 0, 88, 40);
		btnAdd.add(lblAdd);
		
		
		JPanel btnFilter = new JPanel();
		btnFilter.setLayout(null);
		btnFilter.setBackground(new Color(189, 195, 199));
		btnFilter.setBounds(28, 139, 150, 40);
		filterContainer.add(btnFilter);
		
		JLabel lblFilter = new JLabel("    CONSULTAR");
		lblFilter.setIcon(new ImageIcon("img/Search Property-30.png"));
		lblFilter.setForeground(Color.WHITE);
		lblFilter.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblFilter.setBounds(13, 0, 131, 40);
		btnFilter.add(lblFilter);
		
		JDateChooser DateCFrom = new JDateChooser();
		DateCFrom.setBounds(352, 75, 28, 26);
		filterContainer.add(DateCFrom);
		
		JDateChooser DateCTo = new JDateChooser();
		DateCTo.setBounds(352, 103, 28, 26);
		filterContainer.add(DateCTo);
		
		JSeparator sepfilter_1 = new JSeparator();
		sepfilter_1.setOrientation(SwingConstants.VERTICAL);
		sepfilter_1.setBounds(410, 28, 21, 150);
		filterContainer.add(sepfilter_1);
		
		JSeparator sepfilter_2 = new JSeparator();
		sepfilter_2.setForeground(new Color(128,128,128));
		sepfilter_2.setBounds(28, 90, 194, 16);
		filterContainer.add(sepfilter_2);
		
		JSeparator sepfilter_3 = new JSeparator();
		sepfilter_3.setForeground(Color.GRAY);
		sepfilter_3.setBounds(250, 89, 100, 16);
		filterContainer.add(sepfilter_3);
		
		JSeparator sepfilter_4 = new JSeparator();
		sepfilter_4.setForeground(Color.GRAY);
		sepfilter_4.setBounds(28, 117, 197, 16);
		filterContainer.add(sepfilter_4);
		
		JSeparator sepfilter_5 = new JSeparator();
		sepfilter_5.setForeground(Color.GRAY);
		sepfilter_5.setBounds(250, 117, 100, 16);
		filterContainer.add(sepfilter_5);
		
		JPanel btnDel = new JPanel();
		btnDel.setLayout(null);
		btnDel.setBackground(new Color(189, 195, 199));
		btnDel.setBounds(546, 141, 125, 40);
		filterContainer.add(btnDel);
		
		JLabel lblDel = new JLabel("BORRAR");
		lblDel.setIcon(new ImageIcon("img/Delete Property-30 (1).png"));
		lblDel.setForeground(Color.WHITE);
		lblDel.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblDel.setBounds(16, 0, 87, 40);
		btnDel.add(lblDel);
		
		JPanel btnHist = new JPanel();
		btnHist.setLayout(null);
		btnHist.setBackground(new Color(189, 195, 199));
		btnHist.setBounds(683, 141, 125, 40);
		filterContainer.add(btnHist);
		
		JLabel lblHist = new JLabel("HISTÓRICO");
		lblHist.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//TODO
			}
		});
		lblHist.setIcon(new ImageIcon("img/News-30.png"));
		lblHist.setForeground(Color.WHITE);
		lblHist.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblHist.setBounds(6, 0, 102, 40);
		btnHist.add(lblHist);
		
		JLabel lblFilterTitle = new JLabel("Filtros de búsqueda");
		lblFilterTitle.setForeground(new Color(105, 105, 105));
		lblFilterTitle.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblFilterTitle.setBounds(28, 6, 121, 32);
		filterContainer.add(lblFilterTitle);
		
		JPanel headerContainer = new JPanel();
		headerContainer.setBackground(Color.WHITE);
		headerContainer.setBounds(81, 0, 829, 59);
		container.add(headerContainer);
		headerContainer.setLayout(null);
		
		JLabel lblSectionIMG = new JLabel("");
		lblSectionIMG.setBounds(16, 6, 40, 40);
		lblSectionIMG.setIcon(new ImageIcon("img/espacioheader.png"));
		headerContainer.add(lblSectionIMG);
		
		JLabel lblTitle = new JLabel("Espacios Municipales");
		lblTitle.setBounds(65, 6, 182, 36);
		lblTitle.setForeground(new Color(128, 128, 128));
		lblTitle.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		headerContainer.add(lblTitle);
		
		JSeparator sep_header = new JSeparator();
		sep_header.setBounds(63, 34, 184, 12);
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

		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()>=2){
					System.out.println("MIAU:3");
					
					int x=(int)(table.getModel().getValueAt(table.getSelectedRow(), 0));
					ArrayList<Asociacion> a=modelo.getA();
					Asociacion u=null;
					for(int i=0;i<a.size();i++){
						if(a.get(i).getId()==x)
							u=a.get(i);
					}
					System.out.println(u);
				}
				
			}
			
		});
		
		
		scrollPane.setViewportView(table);
		// tabla
//		table_1 = controlador.datos();
		//scrollPane.setViewportView(table_1);
	}

	public void actualizarTabla(){
		ArrayList<Espacio> a=modelo.getD();
		DefaultTableModel model = new DefaultTableModel(){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		model.addColumn("IDENTIFICADOR");
		model.addColumn("DIRECCION");
		model.addColumn("CARACTERISTICAS");
		model.addColumn("FECHA SOLICITUD");
		model.addColumn("FECHA CONCESION");
		for (int i = 0; i < a.size(); i++) {
			model.addRow(new Object[] { a.get(i).getSede(), a.get(i).getDireccion(), a.get(i).getCaracteristicas(),
					a.get(i).getFechasolicitud(), a.get(i).getFechaconcesion() });
		}

		table.setModel(model);
		table.setBackground(new Color(106, 116, 145));
		table.setShowGrid(false);
		
		scrollPane.setViewportView(table);
		
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
