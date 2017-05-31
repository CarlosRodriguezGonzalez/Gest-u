package Controlador;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.InputStream;

import Lanzador.Launch;
import Modelo.Modelo;
import Modelo.ModeloImpl;
import Vista.Actividad1;
import Vista.Asociaciones1;
import Vista.AssocOptions;
import Vista.DBConfig;
import Vista.EspacioMunicipal1;
import Vista.Login;
import Vista.MenuInicio;
import Vista.Subvenciones1;
import Vista.Vista;

public class ControladorImpl implements Controlador{
	private ModeloImpl modelo=new ModeloImpl();
	private Asociaciones1 asociaciones;
	private Actividad1 actividad;
	private EspacioMunicipal1 espacio;
	private Login login;
	private MenuInicio menuInicio;
	private Subvenciones1 subvenciones;
	private DBConfig configuracion;
	private AssocOptions asociacionesExtra;
	
	private Font font;
	private Font font2;
	
	public ControladorImpl(){
		InputStream is = Launch.class.getResourceAsStream("/fonts/segoeui.ttf");
		InputStream are = Launch.class.getResourceAsStream("/fonts/Century Gothic.ttf");
		try {
			font = Font.createFont(Font.TRUETYPE_FONT, is);
			font2 = Font.createFont(Font.TRUETYPE_FONT, are);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void pasarMenuInicio(){
		menuInicio=new MenuInicio();
		menuInicio.setControlador(this);
		menuInicio.setModelo(modelo);
		modelo.setMenuInicio(menuInicio);
		this.setMenuInicio(menuInicio);
		modelo.ActualizarTablaMenuPrincipal();
		menuInicio.setVisible(true);
	}
	public void pasarLogin(){
		login=new Login();
		login.setModelo(modelo);
		login.setControlador(this);
		login.setVisible(true);
	}
	public void pasarAsociaciones(){
		asociaciones=new Asociaciones1(this);
		asociaciones.setControlador(this);
		asociaciones.setModelo(modelo);
		modelo.setAsociaciones(asociaciones);
		this.setAsociaciones(asociaciones);
		modelo.bajarDatosAsoci();
		asociaciones.setVisible(true);
	}
	public void pasarActividad(){
		actividad=new Actividad1(this);
		actividad.setModelo(modelo);
		actividad.setControlador(this);
		modelo.setActividad(actividad);
		this.setActividad(actividad);
		modelo.actualizarActividadTabla();
		
		actividad.setVisible(true);
	}
	public void pasarEspacioMunicipal(){
		espacio=new EspacioMunicipal1();
		espacio.setControlador(this);
		espacio.setModelo(modelo);
		modelo.setEspacioMunicipal(espacio);
		this.setEspacioMunicipal(espacio);
		
		modelo.actualizarEspacioTabla();
		
		espacio.setVisible(true);
	}
	public void pasarSubvenciones(){
		subvenciones=new Subvenciones1();
		subvenciones.setModelo(modelo);
		subvenciones.setControlador(this);
		modelo.setSubvenciones(subvenciones);
		this.setSubvenciones(subvenciones);
		
		modelo.actualizarSubvencionTabla();
		
		subvenciones.setVisible(true);
	}
	public void pasarConfiguracion(){
		configuracion=new DBConfig();
		configuracion.setModelo(modelo);
		configuracion.setControlador(this);
		modelo.setConfiguracion(configuracion);
		this.setConfiguracion(configuracion);
		
		modelo.actualizarVistaConfiguracion();
		
		configuracion.setVisible(true);
	}
	
	public void pasarAssocOptions(){
		asociacionesExtra=new AssocOptions(this);
		asociacionesExtra.setModelo(modelo);
		asociacionesExtra.setControlador(this);
		modelo.setasociacionesExtra(asociacionesExtra);
		this.setasociacionesExtra(asociacionesExtra);
		modelo.cargarVistaAsociacionesExtra(asociaciones.getRowSelectedID());
		modelo.cargarActividadesAsociacionesExtra(asociaciones.getRowSelectedID());
		modelo.cargarEspaciosAsociacionesExtra(asociaciones.getRowSelectedID());
		asociacionesExtra.setVisible(true);
	}
	public void testConexion(){
		modelo.testConexion(configuracion.getTxtUsuario().getText(), configuracion.getPwdContrasea().getText(), configuracion.getTxtBaseDeDatos().getText(), configuracion.getTxtHost().getText(), configuracion.getTxtPuerto().getText());
	}
	
	@Override
	public void setVista(Vista vista) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setModelo(Modelo modelo) {
		// TODO Auto-generated method stub
		
	}
	public void setMod(ModeloImpl modelo) {
		this.modelo = modelo;
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
	public void setasociacionesExtra(AssocOptions asociacionesExtra){
		this.asociacionesExtra=asociacionesExtra;
	}
	public Font getSegoeui(){
		return font;
	}
	public Font getCentury(){
		return font2;
	}
	
}
