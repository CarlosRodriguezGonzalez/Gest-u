package ClasesTabla;

public class Actividad {
	private int id;
	private String fecha;
	private String tipo;
	private String nombre;
	private String lugar;
	private String descripcion;
	
	public Actividad(){
		
	}
	
	public Actividad(int id, String fecha, String tipo, String nombre, String lugar, String descripcion) {
	
		this.id = id;
		this.fecha = fecha;
		this.tipo = tipo;
		this.nombre = nombre;
		this.lugar = lugar;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public String getFecha() {
		return fecha;
	}

	public String getTipo() {
		return tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
}
