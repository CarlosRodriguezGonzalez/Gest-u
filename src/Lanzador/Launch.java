package Lanzador;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import Controlador.ControladorImpl;
import Modelo.ModeloImpl;
import Vista.Login;
import baseDeDatos.AsociacionBBDD;
import baseDeDatos.Conexion;

public class Launch {
	
	
	public static void main(String[] args) {
		InputStream is = Launch.class.getResourceAsStream("/fonts/segoeui.ttf");
		InputStream are = Launch.class.getResourceAsStream("/fonts/Century Gothic.ttf");
		try {
			Font font = Font.createFont(Font.TRUETYPE_FONT, is);
			Font font2 = Font.createFont(Font.TRUETYPE_FONT, are);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Conexion conexion = new Conexion();
		AsociacionBBDD.setConexion(conexion.getConexion());
		ModeloImpl modelo=new ModeloImpl();
		
		modelo.cargarConfiguracion(conexion.getUser(), conexion.getPwd(), conexion.getDb(), conexion.getHost(), conexion.getPuerto(),conexion.getRuta());
		
		ControladorImpl controlador=new ControladorImpl();
		Login frame = new Login();
		
		frame.setModelo(modelo);
		frame.setControlador(controlador);
		
		controlador.setMod(modelo);
		controlador.setLogin(frame);
		
		modelo.setLogin(frame);
		
		frame.setVisible(true);

	}
}
