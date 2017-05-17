package baseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static Connection conexion;
	
	public Conexion(){
		
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		}catch(InstantiationException | IllegalAccessException | ClassNotFoundException e){
			System.out.println("error al buscar el driver mysql");
			e.printStackTrace();
		}
		try{
			conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/faisanPI", "root","");
			System.out.println("conexion realizada con exito");
		}catch(SQLException e){
			e.printStackTrace();
			
		}
	}

	public static Connection getConexion() {
		return conexion;
	}

	public static void setConexion(Connection conexion) {
		Conexion.conexion = conexion;
	}
	

}
