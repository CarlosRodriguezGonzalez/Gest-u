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
	private JPasswordField JPwd;
	private JTextField txtEmail;
	
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
		
		JSeparator sep1_left = new JSeparator();
		sep1_left.setForeground(new Color(255, 255, 255));
		sep1_left.setBounds(70, 374, 246, 12);
		panel.add(sep1_left);
		
		JSeparator sep2_left = new JSeparator();
		sep2_left.setForeground(Color.WHITE);
		sep2_left.setBounds(83, 398, 207, 12);
		panel.add(sep2_left);
		
		JLabel lblLogo = new JLabel("Gest-U");
		lblLogo.setForeground(Color.WHITE);
		lblLogo.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		lblLogo.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		lblLogo.setBounds(124, 39, 167, 46);
		panel.add(lblLogo);
		
		JLabel lblTitle = new JLabel("Identificate");
		lblTitle.setForeground(new Color(204, 204, 204));
		lblTitle.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblTitle.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		lblTitle.setBounds(626, 190, 84, 19);
		getContentPane().add(lblTitle);
		
		JLabel lblEmail = new JLabel("USUARIO/E-MAIL");
		lblEmail.setForeground(new Color(204, 204, 204));
		lblEmail.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblEmail.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		lblEmail.setBounds(540, 231, 117, 19);
		getContentPane().add(lblEmail);
		
		JLabel lblPwd = new JLabel("CLAVE DE ACCESO");
		lblPwd.setForeground(new Color(204, 204, 204));
		lblPwd.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblPwd.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		lblPwd.setBounds(540, 302, 134, 19);
		getContentPane().add(lblPwd);
		
		JSeparator sep1_right = new JSeparator();
		sep1_right.setForeground(Color.WHITE);
		sep1_right.setBounds(540, 274, 246, 12);
		getContentPane().add(sep1_right);
		
		JSeparator sep2_right = new JSeparator();
		sep2_right.setForeground(Color.WHITE);
		sep2_right.setBounds(540, 346, 246, 12);
		getContentPane().add(sep2_right);
		
		JPwd = new JPasswordField();
		JPwd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JPwd.setText("");
			}
		});
		JPwd.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		JPwd.setText("JPasswordField");
		JPwd.setBorder(null);
		JPwd.setToolTipText("");
		JPwd.setBackground(new Color(0,18,50));
		JPwd.setForeground(new Color(255, 255, 255));
		JPwd.setBounds(540, 321, 246, 26);
		getContentPane().add(JPwd);
		
		txtEmail = new JTextField();
		txtEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtEmail.setText("");
			}
		});
		txtEmail.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtEmail.setText("Escribe tu correo");
		txtEmail.setBorder(null);
		txtEmail.setBackground(new Color(0,18,50));
		txtEmail.setForeground(new Color(255, 255, 255));
		txtEmail.setDisabledTextColor(new Color(204, 204, 204));
		txtEmail.setBounds(540, 249, 246, 26);
		getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		JPanel btnSubmit = new JPanel();
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.pasarMenuInicio();
				dispose();
			}
		});
		btnSubmit.setBackground(new Color(32,47,90));
		btnSubmit.setBounds(540, 368, 139, 43);
		getContentPane().add(btnSubmit);
		btnSubmit.setLayout(null);
		
		JLabel lblSubmit = new JLabel("INICIAR SESION");
		lblSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controlador.pasarMenuInicio();
				dispose();
			}
		});
		lblSubmit.setBounds(25, 6, 86, 31);
		btnSubmit.add(lblSubmit);
		lblSubmit.setForeground(new Color(204, 204, 204));
		lblSubmit.setFont(new Font("Century Gothic", Font.BOLD, 12));
		
		JLabel lblForgotPwd = new JLabel("No puedo acceder");
		lblForgotPwd.setForeground(new Color(204, 204, 204));
		lblForgotPwd.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblForgotPwd.setBounds(691, 383, 131, 16);
		getContentPane().add(lblForgotPwd);
		
		JSeparator sep3_right = new JSeparator();
		sep3_right.setForeground(Color.WHITE);
		sep3_right.setBounds(691, 399, 117, 12);
		getContentPane().add(sep3_right);
		contentPane.add(panel);
		
		JLabel lblCouncilIMG = new JLabel("");
		lblCouncilIMG.setIcon(new ImageIcon("img/council.png"));
		lblCouncilIMG.setBounds(124, 243, 136, 128);
		panel.add(lblCouncilIMG);
		
		JLabel lblLightBulbIMG = new JLabel("");
		lblLightBulbIMG.setIcon(new ImageIcon("img/lightbulb.png"));
		lblLightBulbIMG.setBounds(156, 148, 72, 106);
		panel.add(lblLightBulbIMG);
		
		JLabel lblSlogan = new JLabel("Experts on management");
		lblSlogan.setForeground(Color.WHITE);
		lblSlogan.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblSlogan.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
		lblSlogan.setBounds(112, 79, 154, 46);
		panel.add(lblSlogan);
		
		JLabel lblUserIMG = new JLabel("");
		lblUserIMG.setBounds(603, 50, 131, 128);
		contentPane.add(lblUserIMG);
		lblUserIMG.setIcon(new ImageIcon("img/login.png"));
		lblUserIMG.setForeground(new Color(204, 204, 204));
		lblUserIMG.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblUserIMG.setBackground(UIManager.getColor("TabbedPane.selectedTabTitlePressedColor"));
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
