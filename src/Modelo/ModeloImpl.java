package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import ClasesTabla.Actividad;
import ClasesTabla.Asociacion;
import ClasesTabla.Espacio;
import ClasesTabla.Subvencion;
import Vista.Actividad1;
import Vista.Asociaciones1;
import Vista.DBConfig;
import Vista.EspacioMunicipal1;
import Vista.HistoricoActividades;
import Vista.HistoricoAsociaciones;
import Vista.HistoricoEspaciosM;
import Vista.HistoricoSubvenciones;
import Vista.Login;
import Vista.MenuInicio;
import Vista.Subvenciones1;
import Vista.Vista;
import baseDeDatos.AsociacionBBDD;

public class ModeloImpl implements Modelo {

	private AsociacionBBDD as = new AsociacionBBDD();
	private Asociaciones1 asociaciones;
	private Actividad1 actividad;
	private HistoricoActividades historicoActividades;
	private HistoricoAsociaciones historicoAsociaciones;
	private HistoricoEspaciosM historicoEspacios;
	private HistoricoSubvenciones historicoSubvenciones;
	private Login login;
	private MenuInicio menuInicio;
	private Subvenciones1 subvenciones;
	private EspacioMunicipal1 espacio;
	private DBConfig configuracion;
	
	private ArrayList<Asociacion> a;
	private ArrayList<Subvencion> b;
	private ArrayList<Actividad> c;
	private ArrayList<Espacio> d;
	private String user;
	private String pwd;
	private String db;
	private String host;
	private String puerto;
	private String ruta;
	private boolean test;

	public void bajarDatosAsoci(){
		a=new ArrayList<>();
		try{
		a = as.getAsociaciones();
		}catch (Exception e) {
			// TODO: handle exception
		}
		asociaciones.actualizarTabla();
	}
	
	public void ActualizarTablaMenuPrincipal(){
		a=new ArrayList<>();
		try{
		a = as.getAsociaciones();
		}catch (Exception e) {
			// TODO: handle exception
		}
		menuInicio.actualizarTabla();
	}
	public void actualizarSubvencionTabla(){
		b=new ArrayList<>();
		try{
		b = as.getSubvenciones();
		}catch (Exception e) {
			// TODO: handle exception
		}
		subvenciones.actualizarTabla();
	}
	public void actualizarActividadTabla(){
		c=new ArrayList<>();
		try{
		c = as.getActividades();
		}catch (Exception e) {
			// TODO: handle exception
		}
		actividad.actualizarTabla();
	}
	
	public void actualizarEspacioTabla(){
		d=new ArrayList<>();
		try{
		d = as.getEspacios();
		}catch (Exception e) {
			// TODO: handle exception
		}
		espacio.actualizarTabla();
	}
	
	public void cargarConfiguracion(String user,String pwd,String db,String host,String puerto,String ruta){
		this.user=user;
		this.pwd=pwd;
		this.db=db;
		this.host=host;
		this.puerto=puerto;
		this.ruta=ruta;
	}
	
	public void actualizarVistaConfiguracion(){
		configuracion.actualizarConfiguracion();
	}
	
	public void testConexion(String user,String pwd,String db,String host,String puerto){
		test=false;
		try{
			Connection cone= DriverManager.getConnection("jdbc:mysql://"+host+":"+puerto+"/"+db, user,pwd);
			test=true;
		}catch(SQLException e){
		}
		configuracion.actualizarTest();
	}
	

	@Override
	public void setVista(Vista vista) {
		// TODO Auto-generated method stub

	}

	public void setAs(AsociacionBBDD as) {
		this.as = as;
	}

	public void setAsociaciones(Asociaciones1 asociaciones) {
		this.asociaciones = asociaciones;
	}

	public void setActividad(Actividad1 actividad) {
		this.actividad = actividad;
	}

	public void setEspacioMunicipal(EspacioMunicipal1 espacio) {
		this.espacio = espacio;
	}

	public void setHistoricoActividades(HistoricoActividades historicoActividades) {
		this.historicoActividades = historicoActividades;
	}

	public void setHistoricoAsociaciones(HistoricoAsociaciones historicoAsociaciones) {
		this.historicoAsociaciones = historicoAsociaciones;
	}

	public void setHistoricoEspacios(HistoricoEspaciosM historicoEspacios) {
		this.historicoEspacios = historicoEspacios;
	}

	public void setHistoricoSubvenciones(HistoricoSubvenciones historicoSubvenciones) {
		this.historicoSubvenciones = historicoSubvenciones;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public void setMenuInicio(MenuInicio menuInicio) {
		this.menuInicio = menuInicio;
	}

	public void setSubvenciones(Subvenciones1 subvenciones) {
		this.subvenciones = subvenciones;
	}
	
	public void setConfiguracion(DBConfig configuracion){
		this.configuracion=configuracion;
	}

	public ArrayList<Asociacion> getA() {
		return a;
	}
	public ArrayList<Subvencion> getB() {
		return b;
	}
	public ArrayList<Actividad> getC() {
		return c;
	}
	public ArrayList<Espacio> getD() {
		return d;
	}

	public String getUser() {
		return user;
	}

	public String getPwd() {
		return pwd;
	}

	public String getDb() {
		return db;
	}

	public String getHost() {
		return host;
	}

	public String getPuerto() {
		return puerto;
	}
	public String getRuta(){
		return ruta;
	}
	public boolean getTest(){
		return test;
	}
}
