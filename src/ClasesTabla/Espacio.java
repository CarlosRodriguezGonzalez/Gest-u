package ClasesTabla;

public class Espacio {
	private int sede;
	private String direccion;
	private String caracteristicas;
	private String fechasolicitud;
	private String fechaconcesion;
	
	public Espacio(int sede, String direccion, String caracteristicas, String fechasolicitud, String fechaconcesion) {
		this.sede = sede;
		this.direccion = direccion;
		this.caracteristicas = caracteristicas;
		this.fechasolicitud = fechasolicitud;
		this.fechaconcesion = fechaconcesion;
	}

	public int getSede() {
		return sede;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public String getFechasolicitud() {
		return fechasolicitud;
	}

	public String getFechaconcesion() {
		return fechaconcesion;
	}
	
	
}
