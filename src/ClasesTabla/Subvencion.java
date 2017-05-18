package ClasesTabla;

public class Subvencion {
	private int id;
	private String fecha;
	private int importe;
	private Actividad actividad;
	
	public Subvencion(int id, String fecha, int importe, Actividad actividad) {
		this.id = id;
		this.fecha = fecha;
		this.importe = importe;
		this.actividad = actividad;
	}

	public int getId() {
		return id;
	}

	public String getFecha() {
		return fecha;
	}

	public int getImporte() {
		return importe;
	}

	public Actividad getActividad() {
		return actividad;
	}
	
	
}
