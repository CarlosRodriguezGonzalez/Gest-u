package Modelo;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ClasesTabla.Asociacion;
import Vista.Asociaciones1;
import Vista.Vista;
import baseDeDatos.AsociacionBBDD;

public class ModeloImpl implements Modelo{
	
	private AsociacionBBDD as=new AsociacionBBDD();
	private Asociaciones1 asociaciones;
	
	public JTable bajarDatosAsoci(){
		
		ArrayList<Asociacion> a=as.getAsociaciones();		
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Nombre");
		model.addColumn("CIF");
		model.addColumn("Direccion");
		model.addColumn("CP");
		model.addColumn("email");
		model.addColumn("telefono");
		for(int i=0;i<a.size();i++){
			model.addRow(new Object[]{a.get(i).getId(),a.get(i).getNombre(),a.get(i).getCif(),a.get(i).getDireccion(),a.get(i).getCp(),a.get(i).getEmail(),a.get(i).getTelefono()});	
		}
	    
	    JTable tablita=new JTable(model);
	    return tablita;
	    
	}
	

	
	@Override
	public void setVista(Vista vista) {
		// TODO Auto-generated method stub
		
	}

}
