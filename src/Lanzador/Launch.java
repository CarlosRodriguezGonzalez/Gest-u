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
