package ClasesTabla;

public class Representante {
	private int id_respresentante;
	private String nombre;
	private String NIF_NIE;
	private String direccion;
	private String municipio;
	private int codigoPostal;
	private int tlfn_fijo;
	private int tlfn_movil;
	private int fax;
	private String email;
	public int getId_respresentante() {
		return id_respresentante;
	}
	public void setId_respresentante(int id_respresentante) {
		this.id_respresentante = id_respresentante;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNIF_NIE() {
		return NIF_NIE;
	}
	public void setNIF_NIE(String nIF_NIE) {
		NIF_NIE = nIF_NIE;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public int getTlfn_fijo() {
		return tlfn_fijo;
	}
	public void setTlfn_fijo(int tlfn_fijo) {
		this.tlfn_fijo = tlfn_fijo;
	}
	public int getTlfn_movil() {
		return tlfn_movil;
	}
	public void setTlfn_movil(int tlfn_movil) {
		this.tlfn_movil = tlfn_movil;
	}
	public int getFax() {
		return fax;
	}
	public void setFax(int fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Representante(int id_respresentante, String nombre, String nIF_NIE, String direccion, String municipio,
			int codigoPostal, int tlfn_fijo, int tlfn_movil, int fax, String email) {
		super();
		this.id_respresentante = id_respresentante;
		this.nombre = nombre;
		NIF_NIE = nIF_NIE;
		this.direccion = direccion;
		this.municipio = municipio;
		this.codigoPostal = codigoPostal;
		this.tlfn_fijo = tlfn_fijo;
		this.tlfn_movil = tlfn_movil;
		this.fax = fax;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Representante [id_respresentante=" + id_respresentante + ", nombre=" + nombre + ", NIF_NIE=" + NIF_NIE
				+ ", direccion=" + direccion + ", municipio=" + municipio + ", codigoPostal=" + codigoPostal
				+ ", tlfn_fijo=" + tlfn_fijo + ", tlfn_movil=" + tlfn_movil + ", fax=" + fax + ", email=" + email + "]";
	}
	
	
	
}
