package ClasesTabla;

public class Asociacion {
	private int id;
	private String nombre;
	private String cif;
	private int cp;
	private String direccion;
	private int telefono;
	private String email;
	private int tipo;
	
	
	public Asociacion(int id, String nombre, String cif, int cp, String direccion, int telefono, String email,
			int tipo) {
		this.id = id;
		this.nombre = nombre;
		this.cif = cif;
		this.cp = cp;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.tipo = tipo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCif() {
		return cif;
	}
	public void setCif(String cif) {
		this.cif = cif;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Asociacion [id=" + id + ", nombre=" + nombre + ", cif=" + cif + ", cp=" + cp + ", direccion="
				+ direccion + ", telefono=" + telefono + ", email=" + email + ", tipo=" + tipo + "]";
	}
	
	
}
