package Modelo;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ClasesTabla.Asociacion;
import Vista.Actividad1;
import Vista.Asociaciones1;
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
	private EspacioMunicipal1 espacioMunicipal;
	private HistoricoActividades historicoActividades;
	private HistoricoAsociaciones historicoAsociaciones;
	private HistoricoEspaciosM historicoEspacios;
	private HistoricoSubvenciones historicoSubvenciones;
	private Login login;
	private MenuInicio menuInicio;
	private Subvenciones1 subvenciones;
	private ArrayList<Asociacion> a;

	public void bajarDatosAsoci() {
		a = as.getAsociaciones();
		asociaciones.actualizarTabla();
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

	public ArrayList<Asociacion> getA() {
		return a;
	}

}
