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
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SubvOptions extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtDniniepasaporte;
	private JTextField txtCorreoElectrnico;
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
	private JLabel lblAContinuacinSe;
	private JLabel lblDeLaNueva;
	private JButton btnImprimir;
	private JButton btnEnviarPorMail;
	private JLabel lblJustificacin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubvOptions frame = new SubvOptions();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SubvOptions() {
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
		
		JLabel lbl_documentacion = new JLabel("Modificar");
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
		txtNombre.setText("  *Actividad prevista");
		txtNombre.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtNombre.setBounds(21, 54, 257, 42);
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
		txtApellidos.setText("  *E-Mail");
		txtApellidos.setColumns(10);
		txtApellidos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtApellidos.setBounds(296, 54, 317, 42);
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
		txtDniniepasaporte.setText("  *Importe solicitado");
		txtDniniepasaporte.setColumns(10);
		txtDniniepasaporte.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtDniniepasaporte.setBounds(296, 116, 317, 39);
		edit_panel1.add(txtDniniepasaporte);
		txtDniniepasaporte.setBorder(BorderFactory.createCompoundBorder(txtDniniepasaporte.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JLabel lblDatosDelRepresentante = new JLabel("Nueva Subvención");
		lblDatosDelRepresentante.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblDatosDelRepresentante.setForeground(new Color(128, 128, 128));
		lblDatosDelRepresentante.setBounds(21, 12, 150, 30);
		edit_panel1.add(lblDatosDelRepresentante);
		
		txtCorreoElectrnico = new JTextField();
		txtCorreoElectrnico.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtCorreoElectrnico.setText("");
			}
		});
		txtCorreoElectrnico.setText("  Fecha solicitud");
		txtCorreoElectrnico.setForeground(Color.GRAY);
		txtCorreoElectrnico.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtCorreoElectrnico.setDisabledTextColor(Color.WHITE);
		txtCorreoElectrnico.setColumns(10);
		txtCorreoElectrnico.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtCorreoElectrnico.setBounds(20, 116, 226, 39);
		edit_panel1.add(txtCorreoElectrnico);
		txtCorreoElectrnico.setBorder(BorderFactory.createCompoundBorder(txtCorreoElectrnico.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(UIManager.getColor("ComboBox.background"));
		separator_2.setBounds(6, 167, 637, 12);
		edit_panel1.add(separator_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("El cliente aporta la documentación necesaria para el registro de la nueva subvención");
		chckbxNewCheckBox.setForeground(new Color(128, 128, 128));
		chckbxNewCheckBox.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(20, 390, 456, 23);
		edit_panel1.add(chckbxNewCheckBox);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Century Gothic", Font.BOLD, 13));
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
		lblLosCamposMarcados.setBounds(387, 22, 226, 16);
		edit_panel1.add(lblLosCamposMarcados);
		
		
		JTextArea txtrJustificacinDeLa = new JTextArea();
		txtrJustificacinDeLa.setForeground(Color.GRAY);
		txtrJustificacinDeLa.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		txtrJustificacinDeLa.setText("Justificación de la subvención");
		txtrJustificacinDeLa.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.LIGHT_GRAY, null));
		txtrJustificacinDeLa.setBounds(21, 221, 592, 126);
		edit_panel1.add(txtrJustificacinDeLa);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(246, 116, 32, 39);
		edit_panel1.add(dateChooser);
		
		lblJustificacin = new JLabel("Justificación");
		lblJustificacin.setForeground(Color.GRAY);
		lblJustificacin.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblJustificacin.setBounds(21, 179, 103, 30);
		edit_panel1.add(lblJustificacin);
		
		
		
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
		
		lblRepresentante = new JLabel("SUBVENCIÓN");
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
		
		btnImprimir = new JButton("Imprimir");
		btnImprimir.setForeground(Color.GRAY);
		btnImprimir.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnImprimir.setBounds(19, 482, 120, 39);
		panel_1.add(btnImprimir);
		
		btnEnviarPorMail = new JButton("Enviar E-mail");
		btnEnviarPorMail.setForeground(Color.GRAY);
		btnEnviarPorMail.setFont(new Font("Century Gothic", Font.BOLD, 13));
		btnEnviarPorMail.setBounds(145, 482, 120, 39);
		panel_1.add(btnEnviarPorMail);
	}
}
