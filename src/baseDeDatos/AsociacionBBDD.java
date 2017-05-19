package baseDeDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ClasesTabla.Actividad;
import ClasesTabla.Asociacion;
import ClasesTabla.Espacio;
import ClasesTabla.Subvencion;

public class AsociacionBBDD {
	private static Connection conexion;
	
	
	public ArrayList<Asociacion> getAsociaciones(){
		ArrayList<Asociacion> asoc=new ArrayList<Asociacion>();
		try{
			Statement st= conexion.createStatement();
			ResultSet rs=st.executeQuery("Select * from asociacion");
			while(rs.next()){
				Asociacion p=new Asociacion(rs.getInt("id_asociacion"),rs.getString("nombre"),rs.getString("cif"),rs.getInt("cp"), rs.getString("direccion"),rs.getInt("telef_fijo"),rs.getString("email"),rs.getInt("fax"),rs.getString("fecha_solicitud"));
				asoc.add(p);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return asoc;
	}
	public ArrayList<Subvencion> getSubvenciones(){
		ArrayList<Subvencion> sub=new ArrayList<Subvencion>();
		try{
			Statement st= conexion.createStatement();
			ResultSet rs=st.executeQuery("Select * from subvencion");
			while(rs.next()){
				Subvencion p=new Subvencion(rs.getInt("id_solicitud"),rs.getString("fecha_solicitud"),rs.getInt("importe"),null);
				sub.add(p);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return sub;
	}
	
	public ArrayList<Actividad> getActividades(){
		ArrayList<Actividad> act=new ArrayList<Actividad>();
		try{
			Statement st= conexion.createStatement();
			ResultSet rs=st.executeQuery("Select * from actividad");
			while(rs.next()){
				Actividad p=new Actividad(rs.getInt("id_actividad"), rs.getString("fecha"), rs.getString("tipo"), rs.getString("nombre_actividad"), rs.getString("lugar"), rs.getString("descripcion"));
				act.add(p);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return act;
	}
	
	public ArrayList<Espacio> getEspacios(){
		ArrayList<Espacio> esp=new ArrayList<Espacio>();
		try{
			Statement st= conexion.createStatement();
			ResultSet rs=st.executeQuery("Select * from sede");
			while(rs.next()){
				Espacio p=new Espacio(rs.getInt("id_sede"), rs.getString("direccion"), rs.getString("caracteristicas"), rs.getString("fecha_solicitud"), rs.getString("fecha_concesion"));
				esp.add(p);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return esp;
	}
	public ArrayList<Subvencion> getSubvencionesPorId(int id){
		ArrayList<Subvencion> sub=new ArrayList<Subvencion>();

		try{
			PreparedStatement ps= conexion.prepareStatement("select subvencion.id_solicitud,subvencion.fecha_solicitud,subvencion.importe from subvencion inner JOIN asociacion_actividad_organiza on asociacion_actividad_organiza.id_actividad=subvencion.id_actividad INNER JOIN asociacion on asociacion.id_asociacion=asociacion_actividad_organiza.id_asociacion WHERE asociacion.id_asociacion=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Subvencion p=new Subvencion(rs.getInt("id_solicitud"),rs.getString("fecha_solicitud"),rs.getInt("importe"),null);
				sub.add(p);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return sub;
	}
	public ArrayList<Actividad> getActividadesPorId(int id){
		ArrayList<Actividad> sub=new ArrayList<Actividad>();

		try{
			PreparedStatement ps= conexion.prepareStatement("SELECT actividad.id_actividad,actividad.fecha,actividad.tipo,actividad.nombre_actividad,actividad.lugar,actividad.descripcion from actividad INNER JOIN asociacion_actividad_organiza on asociacion_actividad_organiza.id_actividad=actividad.id_actividad INNER JOIN asociacion on asociacion.id_asociacion=asociacion_actividad_organiza.id_asociacion WHERE asociacion.id_asociacion=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Actividad p= new Actividad(rs.getInt("id_actividad"), rs.getString("fecha"), rs.getString("tipo"), rs.getString("nombre_actividad"), rs.getString("lugar"), rs.getString("descripcion"));
				sub.add(p);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return sub;
	}
	public ArrayList<Espacio> getEspacioPorId(int id){
		ArrayList<Espacio> sub=new ArrayList<Espacio>();

		try{
			PreparedStatement ps= conexion.prepareStatement("SELECT sede.id_sede,sede.direccion,sede.caracteristicas,sede.fecha_solicitud,sede.fecha_concesion from sede INNER join sede_asociacion on sede.id_sede=sede_asociacion.id_sede INNER JOIN asociacion on asociacion.id_asociacion=sede_asociacion.id_asociacion where asociacion.id_asociacion=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Espacio p= new Espacio(rs.getInt("id_sede"), rs.getString("direccion"), rs.getString("caracteristicas"), rs.getString("fecha_solicitud"), rs.getString("fecha_concesion"));
				sub.add(p);
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return sub;
	}
	
	//select subvencion.id_solicitud,subvencion.fecha_solicitud,subvencion.importe from subvencion inner JOIN asociacion_actividad_organiza on asociacion_actividad_organiza.id_actividad=subvencion.id_actividad INNER JOIN asociacion on asociacion.id_asociacion=asociacion_actividad_organiza.id_asociacion WHERE asociacion.id_asociacion=?
	
	
	
	

	public static Connection getConexion() {
		return conexion;
	}

	public static void setConexion(Connection conexion) {
		AsociacionBBDD.conexion = conexion;
	}
}
