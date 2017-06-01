package ClasesTabla;

public class Asociacion {
	private int id;
	private String nombre;
	private String cif;
	private int cp;
	private String direccion;
	private String municipio;
	private int telefono;
	private int movil;
	private int fax;
	private String email;
	private int tipo;
	private String fecha;
	private boolean baja;
	private boolean estatutos;
	private boolean num_registro;
	private boolean acta_junta;
	private boolean cert_domicilio;

	public Asociacion(int id, String nombre, String cif, int cp, String direccion, String municipio, int telefono,
			int movil, int fax, String email, int tipo, String fecha, boolean baja, boolean estatutos,
			boolean num_registro, boolean acta_junta, boolean cert_domicilio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cif = cif;
		this.cp = cp;
		this.direccion = direccion;
		this.municipio = municipio;
		this.telefono = telefono;
		this.movil = movil;
		this.fax = fax;
		this.email = email;
		this.tipo = tipo;
		this.fecha = fecha;
		this.baja = baja;
		this.estatutos = estatutos;
		this.num_registro = num_registro;
		this.acta_junta = acta_junta;
		this.cert_domicilio = cert_domicilio;
	}

	public Asociacion(int id, String nombre, String cif, int cp, String direccion, int telefono, String email, int tipo,
			String fecha) {
		this.id = id;
		this.nombre = nombre;
		this.cif = cif;
		this.cp = cp;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.tipo = tipo;
		this.fecha = fecha;
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Asociacion [id=" + id + ", nombre=" + nombre + ", cif=" + cif + ", cp=" + cp + ", direccion="
				+ direccion + ", telefono=" + telefono + ", email=" + email + ", tipo=" + tipo + "]";
	}

	public boolean isBaja() {
		return baja;
	}

	public void setBaja(boolean baja) {
		this.baja = baja;
	}

	public boolean isEstatutos() {
		return estatutos;
	}

	public void setEstatutos(boolean estatutos) {
		this.estatutos = estatutos;
	}

	public boolean isNum_registro() {
		return num_registro;
	}

	public void setNum_registro(boolean num_registro) {
		this.num_registro = num_registro;
	}

	public boolean isActa_junta() {
		return acta_junta;
	}

	public void setActa_junta(boolean acta_junta) {
		this.acta_junta = acta_junta;
	}

	public boolean isCert_domicilio() {
		return cert_domicilio;
	}

	public void setCert_domicilio(boolean cert_domicilio) {
		this.cert_domicilio = cert_domicilio;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public int getMovil() {
		return movil;
	}

	public void setMovil(int movil) {
		this.movil = movil;
	}

	public int getFax() {
		return fax;
	}

	public void setFax(int fax) {
		this.fax = fax;
	}

}
