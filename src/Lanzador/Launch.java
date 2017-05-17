package Lanzador;
import java.awt.EventQueue;

import Vista.Login;
import baseDeDatos.AsociacionBBDD;
import baseDeDatos.Conexion;

public class Launch {
	public static void main(String[] args) {
		Conexion conexion = new Conexion();
		AsociacionBBDD.setConexion(conexion.getConexion());
		
		Login frame = new Login();
		frame.setVisible(true);

	}
}
