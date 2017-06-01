package ClasesTabla;

public class Subvencion {
	private int id;
	private String fecha;
	private int importe;
	
	public Subvencion(int id, String fecha, int importe) {
		this.id = id;
		this.fecha = fecha;
		this.importe = importe;
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
	
}
