package Controlador;
import javax.swing.JTable;

import Modelo.Modelo;
import Modelo.ModeloImpl;
import Vista.Actividad1;
import Vista.Asociaciones1;
import Vista.EspacioMunicipal1;
import Vista.Login;
import Vista.MenuInicio;
import Vista.Subvenciones1;
import Vista.Vista;

public class ControladorImpl implements Controlador{
	ModeloImpl mod=new ModeloImpl();
	Actividad1 actividad1;
	Asociaciones1 asociaciones1;
	EspacioMunicipal1 espacioMunicipal1;
	Login login;
	MenuInicio menuInicio;
	Subvenciones1 subvenciones1;
	
	public void pasarMenuInicio(){
		menuInicio=new MenuInicio();
		menuInicio.setVisible(true);
	}
	public void pasarLogin(){
		login=new Login();
		login.setVisible(true);
	}
	public void pasarAsociaciones(){
		asociaciones1=new Asociaciones1();
		asociaciones1.setVisible(true);
	}
	public void pasarActividad(){
		actividad1=new Actividad1();
		actividad1.setVisible(true);
	}
	public void pasarEspacioMunicipal(){
		espacioMunicipal1=new EspacioMunicipal1();
		espacioMunicipal1.setVisible(true);
	}
	public void pasarSubvenciones(){
		subvenciones1=new Subvenciones1();
		subvenciones1.setVisible(true);
	}
	
	public JTable datos(){
		JTable a=mod.bajarDatosAsoci();
		return a;
	}
	@Override
	public void setVista(Vista vista) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setModelo(Modelo modelo) {
		// TODO Auto-generated method stub
		
	}
	
}
