package baseDeDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ClasesTabla.Asociacion;

public class AsociacionBBDD {
	private static Connection conexion;
	
	
	public ArrayList<Asociacion> getAsociaciones(){
		ArrayList<Asociacion> asoc=new ArrayList<Asociacion>();
		try{
			Statement st= conexion.createStatement();
			ResultSet rs=st.executeQuery("Select * from asociacion");
			while(rs.next()){
				Asociacion p=new Asociacion(rs.getInt("id_asociacion"),rs.getString("nombre"),rs.getString("cif"),rs.getInt("cp"), rs.getString("direccion"),rs.getInt("telef_fijo"),rs.getString("email"),rs.getInt("fax"));
				asoc.add(p);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return asoc;
	}
	
	
	
	

	public static Connection getConexion() {
		return conexion;
	}

	public static void setConexion(Connection conexion) {
		AsociacionBBDD.conexion = conexion;
	}
}
