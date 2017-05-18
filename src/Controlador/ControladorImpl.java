package Controlador;
import Modelo.Modelo;
import Modelo.ModeloImpl;
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

public class ControladorImpl implements Controlador{
	private ModeloImpl modelo=new ModeloImpl();
	private Asociaciones1 asociaciones;
	private Actividad1 actividad;
	private EspacioMunicipal1 espacioMunicipal;
	private HistoricoActividades historicoActividades;
	private HistoricoAsociaciones historicoAsociaciones;
	private HistoricoEspaciosM historicoEspacios;
	private HistoricoSubvenciones historicoSubvenciones;
	private Login login;
	private MenuInicio menuInicio;
	private Subvenciones1 subvenciones;
	private DBConfig configuracion;
	
	public void pasarMenuInicio(){
		menuInicio=new MenuInicio();
		menuInicio.setControlador(this);
		menuInicio.setModelo(modelo);
		menuInicio.setVisible(true);
	}
	public void pasarLogin(){
		login=new Login();
		login.setModelo(modelo);
		login.setControlador(this);
		login.setVisible(true);
	}
	public void pasarAsociaciones(){
		asociaciones=new Asociaciones1();
		asociaciones.setControlador(this);
		asociaciones.setModelo(modelo);
		modelo.setAsociaciones(asociaciones);
		this.setAsociaciones(asociaciones);
		modelo.bajarDatosAsoci();
		asociaciones.setVisible(true);
	}
	public void pasarActividad(){
		actividad=new Actividad1();
		actividad.setModelo(modelo);
		actividad.setControlador(this);
		actividad.setVisible(true);
	}
	public void pasarEspacioMunicipal(){
		espacioMunicipal=new EspacioMunicipal1();
		espacioMunicipal.setControlador(this);
		espacioMunicipal.setModelo(modelo);
		espacioMunicipal.setVisible(true);
	}
	public void pasarSubvenciones(){
		subvenciones=new Subvenciones1();
		subvenciones.setModelo(modelo);
		subvenciones.setControlador(this);
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
	public void setEspacioMunicipal(EspacioMunicipal1 espacioMunicipal) {
		this.espacioMunicipal = espacioMunicipal;
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
	
}
