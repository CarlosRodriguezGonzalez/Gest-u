package Vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;
import Controlador.ControladorImpl;
import Modelo.Modelo;
import Modelo.ModeloImpl;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements Vista {

	private ControladorImpl controlador=new ControladorImpl();
	private ModeloImpl modelo=new ModeloImpl();
	
	private JPanel contentPane;
	private JPasswordField pwdJpassword;
	private JTextField txtEnterYourFull;
	/**ct
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.r
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 910, 572);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0,18,50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setBackground(new Color(36, 47, 65));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(32,47,90));
		panel.setBounds(0, 0, 430, 550);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		separator.setBounds(70, 374, 246, 12);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(83, 398, 207, 12);
		panel.add(separator_1);
		
		JLabel lblPlan = new JLabel("Gest-U");
		lblPlan.setForeground(Color.WHITE);
		lblPlan.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		lblPlan.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		lblPlan.setBounds(124, 39, 167, 46);
		panel.add(lblPlan);
		
		JLabel lblSignUpOr = new JLabel("Identificate");
		lblSignUpOr.setForeground(new Color(204, 204, 204));
		lblSignUpOr.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblSignUpOr.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		lblSignUpOr.setBounds(626, 190, 134, 19);
		getContentPane().add(lblSignUpOr);
		
		JLabel lblFullName = new JLabel("USUARIO/E-MAIL");
		lblFullName.setForeground(new Color(204, 204, 204));
		lblFullName.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblFullName.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		lblFullName.setBounds(540, 231, 134, 19);
		getContentPane().add(lblFullName);
		
		JLabel lblPassword = new JLabel("CLAVE DE ACCESO");
		lblPassword.setForeground(new Color(204, 204, 204));
		lblPassword.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblPassword.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		lblPassword.setBounds(540, 302, 134, 19);
		getContentPane().add(lblPassword);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(540, 274, 246, 12);
		getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.WHITE);
		separator_3.setBounds(540, 346, 246, 12);
		getContentPane().add(separator_3);
		
		pwdJpassword = new JPasswordField();
		pwdJpassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pwdJpassword.setText("");
			}
		});
		pwdJpassword.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		pwdJpassword.setText("JPasswordField");
		pwdJpassword.setBorder(null);
		pwdJpassword.setToolTipText("");
		pwdJpassword.setBackground(new Color(0,18,50));
		pwdJpassword.setForeground(new Color(255, 255, 255));
		pwdJpassword.setBounds(540, 321, 246, 26);
		getContentPane().add(pwdJpassword);
		
		txtEnterYourFull = new JTextField();
		txtEnterYourFull.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEnterYourFull.setText("");
			}
		});
		txtEnterYourFull.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtEnterYourFull.setText("Escribe tu correo");
		txtEnterYourFull.setBorder(null);
		txtEnterYourFull.setBackground(new Color(0,18,50));
		txtEnterYourFull.setForeground(new Color(255, 255, 255));
		txtEnterYourFull.setDisabledTextColor(new Color(204, 204, 204));
		txtEnterYourFull.setBounds(540, 249, 246, 26);
		getContentPane().add(txtEnterYourFull);
		txtEnterYourFull.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.pasarMenuInicio();
				dispose();
			}
		});
		panel_1.setBackground(new Color(32,47,90));
		panel_1.setBounds(540, 368, 139, 43);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("INICIAR SESION");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.pasarMenuInicio();
				dispose();
			}
		});
		lblNewLabel_1.setBounds(25, 6, 86, 31);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(204, 204, 204));
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		
		JLabel lblAlreadyAMember = new JLabel("No puedo acceder");
		lblAlreadyAMember.setForeground(new Color(204, 204, 204));
		lblAlreadyAMember.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblAlreadyAMember.setBounds(691, 383, 131, 16);
		getContentPane().add(lblAlreadyAMember);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.WHITE);
		separator_5.setBounds(691, 399, 117, 12);
		getContentPane().add(separator_5);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("img/council.png"));
		lblNewLabel_2.setBounds(124, 243, 136, 128);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("img/lightbulb.png"));
		lblNewLabel_3.setBounds(156, 148, 72, 106);
		panel.add(lblNewLabel_3);
		
		JLabel lblExpertsOnManagement = new JLabel("Experts on management");
		lblExpertsOnManagement.setForeground(Color.WHITE);
		lblExpertsOnManagement.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblExpertsOnManagement.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		lblExpertsOnManagement.setBounds(112, 79, 154, 46);
		panel.add(lblExpertsOnManagement);
		
		JLabel label = new JLabel("");
		label.setBounds(603, 50, 131, 128);
		contentPane.add(label);
		label.setIcon(new ImageIcon("img/login.png"));
		label.setForeground(new Color(204, 204, 204));
		label.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		label.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
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
