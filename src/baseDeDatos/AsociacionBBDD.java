package baseDeDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ClasesTabla.Actividad;
import ClasesTabla.Asociacion;
import ClasesTabla.Espacio;
import ClasesTabla.Representante;
import ClasesTabla.Subvencion;

public class AsociacionBBDD {
	private static Connection conexion;

	public boolean comprobarLogin(String user, String password) {

		try {
			PreparedStatement ps = conexion.prepareStatement("select pass from usuario where user=?");
			ps.setString(1, user);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				if (rs.getString("pass").equals(MD5(password))) {
					return true;
				}
				;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	public ArrayList<Asociacion> getAsociaciones() {
		ArrayList<Asociacion> asoc = new ArrayList<Asociacion>();
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("Select * from asociacion");
			while (rs.next()) {
				Asociacion p = new Asociacion(rs.getInt("id_asociacion"), rs.getString("nombre"), rs.getString("cif"),
						rs.getInt("cp"), rs.getString("direccion"), rs.getInt("telef_fijo"), rs.getString("email"),
						rs.getInt("fax"), rs.getString("fecha_solicitud"));
				asoc.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return asoc;
	}

	public ArrayList<Subvencion> getSubvenciones() {
		ArrayList<Subvencion> sub = new ArrayList<Subvencion>();
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("Select * from subvencion");
			while (rs.next()) {
				Subvencion p = new Subvencion(rs.getInt("id_solicitud"), rs.getString("fecha_solicitud"),
						rs.getInt("importe"), null);
				sub.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sub;
	}

	public ArrayList<Actividad> getActividades() {
		ArrayList<Actividad> act = new ArrayList<Actividad>();
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("Select * from actividad");
			while (rs.next()) {
				Actividad p = new Actividad(rs.getInt("id_actividad"), rs.getString("fecha"), rs.getString("tipo"),
						rs.getString("nombre_actividad"), rs.getString("lugar"), rs.getString("descripcion"));
				act.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return act;
	}

	public ArrayList<Espacio> getEspacios() {
		ArrayList<Espacio> esp = new ArrayList<Espacio>();
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("Select * from sede");
			while (rs.next()) {
				Espacio p = new Espacio(rs.getInt("id_sede"), rs.getString("direccion"),
						rs.getString("caracteristicas"), rs.getString("fecha_solicitud"),
						rs.getString("fecha_concesion"));
				esp.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return esp;
	}

	public ArrayList<Subvencion> getSubvencionesPorId(int id) {
		ArrayList<Subvencion> sub = new ArrayList<Subvencion>();

		try {
			PreparedStatement ps = conexion.prepareStatement(
					"select subvencion.id_solicitud,subvencion.fecha_solicitud,subvencion.importe from subvencion INNER JOIN asociacion on asociacion.id_asociacion=subvencion.id_asociacion WHERE asociacion.id_asociacion=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Subvencion p = new Subvencion(rs.getInt("id_solicitud"), rs.getString("fecha_solicitud"),
						rs.getInt("importe"), null);
				sub.add(p);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sub;
	}

	public ArrayList<Actividad> getActividadesPorId(int id) {
		ArrayList<Actividad> sub = new ArrayList<Actividad>();

		try {
			PreparedStatement ps = conexion.prepareStatement(
					"SELECT actividad.id_actividad,actividad.fecha,actividad.tipo,actividad.nombre_actividad,actividad.lugar,actividad.descripcion from actividad INNER JOIN asociacion_actividad_organiza on asociacion_actividad_organiza.id_actividad=actividad.id_actividad INNER JOIN asociacion on asociacion.id_asociacion=asociacion_actividad_organiza.id_asociacion WHERE asociacion.id_asociacion=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Actividad p = new Actividad(rs.getInt("id_actividad"), rs.getString("fecha"), rs.getString("tipo"),
						rs.getString("nombre_actividad"), rs.getString("lugar"), rs.getString("descripcion"));
				sub.add(p);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sub;
	}

	public ArrayList<Espacio> getEspacioPorId(int id) {
		ArrayList<Espacio> sub = new ArrayList<Espacio>();

		try {
			PreparedStatement ps = conexion.prepareStatement(
					"SELECT sede.id_sede,sede.direccion,sede.caracteristicas,sede.fecha_solicitud,sede.fecha_concesion from sede INNER join sede_asociacion on sede.id_sede=sede_asociacion.id_sede INNER JOIN asociacion on asociacion.id_asociacion=sede_asociacion.id_asociacion where asociacion.id_asociacion=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Espacio p = new Espacio(rs.getInt("id_sede"), rs.getString("direccion"),
						rs.getString("caracteristicas"), rs.getString("fecha_solicitud"),
						rs.getString("fecha_concesion"));
				sub.add(p);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sub;
	}

	public Representante getRepresentantePorDni(String dni) {
		Representante r = null;
		try {
			PreparedStatement ps = conexion.prepareStatement("SELECT * from representante WHERE NIF_NIE=?");
			ps.setString(1, dni);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				do {
					r = new Representante(rs.getInt("id_representante"), rs.getString("nombre"),
							rs.getString("NIF_NIE"), rs.getString("direccion"), rs.getString("municipio"),
							rs.getInt("codigo_postal"), rs.getInt("tfn_fijo"), rs.getInt("tfn_movil"), rs.getInt("fax"),
							rs.getString("email"));
				} while (rs.next());
			} else
				System.out.println("adios");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("hola" + r.getId_respresentante());
		return r;
	}

	public void insertarAssoc(Asociacion a, Representante r) {
		int rep = -1;
		try {

			PreparedStatement ps = conexion.prepareStatement("SELECT * from representante WHERE NIF_NIE=?");
			ps.setString(1, r.getNIF_NIE());
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				do {
					rep = rs.getInt("id_representante");
				} while (rs.next());

			} else {
				// 9 ?
				PreparedStatement psIns = conexion.prepareStatement(
						"INSERT INTO `representante` (`nombre`, `NIF_NIE`, `direccion`, `municipio`, `codigo_postal`, `tfn_fijo`, `tfn_movil`, `fax`, `email`) VALUES (?,?,?, ?, ?,?, ?,?,?);");
				psIns.setString(1, r.getNombre());
				psIns.setString(2, r.getNIF_NIE());
				psIns.setString(3, r.getDireccion());
				psIns.setString(4, r.getMunicipio());
				psIns.setInt(5, r.getCodigoPostal());
				psIns.setInt(6, r.getTlfn_fijo());
				psIns.setInt(7, r.getTlfn_movil());
				psIns.setInt(8, r.getFax());
				psIns.setString(9, r.getEmail());


				if (psIns.executeUpdate() == 1) {
					ResultSet rsIns = ps.getGeneratedKeys();
					if (rs.next()) {
						rep=rsIns.getInt(1);
					}
				}

				// INSERT INTO `representante` (`nombre`, `NIF_NIE`,
				// `direccion`, `municipio`, `codigo_postal`, `tfn_fijo`,
				// `tfn_movil`, `fax`, `email`) VALUES ('asdf', 'afd', 'asf',
				// 'afd', '123', '13', '321', '123', 'asdf');
			}
			// 16 ?

			PreparedStatement psAs = conexion.prepareStatement(
					"INSERT INTO `asociacion` (`nombre`, `cif`, `direccion`, `municipio`, `cp`, `telef_fijo`, `telef_movil`, `fax`, `email`, `baja`, `estatutos`, `num_registro`, `acta_junta`, `cert_domicilio`, `fecha_solicitud`, `id_representante`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			psAs.setString(1, a.getNombre());
			psAs.setString(2, a.getCif());
			psAs.setString(3, a.getDireccion());
			psAs.setString(4, a.getMunicipio());
			psAs.setInt(5, a.getCp());
			psAs.setInt(6, a.getTelefono());
			psAs.setInt(7, a.getMovil());
			psAs.setInt(8, a.getFax());
			psAs.setString(9, a.getEmail());
			psAs.setBoolean(10, a.isBaja());
			psAs.setBoolean(11, a.isEstatutos());
			psAs.setBoolean(12, a.isNum_registro());
			psAs.setBoolean(13, a.isActa_junta());
			psAs.setBoolean(14, a.isCert_domicilio());
			psAs.setString(15, a.getFecha());
			psAs.setInt(16, rep);

			psAs.executeUpdate();
			System.err.println("asd");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	//
	public String MD5(String md5) {
		try {
			java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
			byte[] array = md.digest(md5.getBytes());
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < array.length; ++i) {
				sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
			}
			return sb.toString();
		} catch (java.security.NoSuchAlgorithmException e) {
		}
		return null;
	}

	public static Connection getConexion() {
		return conexion;
	}

	public static void setConexion(Connection conexion) {
		AsociacionBBDD.conexion = conexion;
	}
}
