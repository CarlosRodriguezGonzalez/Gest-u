package baseDeDatos;

public class Inserts {
/*
 
 // ASOCIACIONES

PreparedStatement ps= conexion.prepareStatement("INSERT INTO asociacion (id_asociacion, nombre, cif, cp, direccion, telef_fijo, email, fax, fecha_solicitud) VALUES (?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, nombre);
			ps.setString(3, cif);
			ps.setInt(4, cp);
			ps.setString(5, direccion);
			ps.setInt(6, telefono);
			ps.setString(7, email);
			ps.setString(8, fax);
			ps.setString(9, fecha);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Asociacion p=new Asociacion(rs.getInt("id_asociacion"),rs.getString("nombre"),rs.getString("cif"),rs.getInt("cp"), rs.getString("direccion"),rs.getInt("telef_fijo"),rs.getString("email"),rs.getInt("fax"),rs.getString("fecha_solicitud"));
				sub.add(p);
			}

// SUBVENCIONES

PreparedStatement ps= conexion.prepareStatement("INSERT INTO subvencion (id_solicitud, fecha_solicitud, importe, id_actividad) VALUES (?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, fecha);
			ps.setInt(3, importe);
			ps.setInt(4, actividad); // ????
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Subvencion p=new Subvencion(rs.getInt("id_solicitud"),rs.getString("fecha_solicitud"),rs.getInt("importe"),null);
				sub.add(p);
			}

// ACTIVIDADES

PreparedStatement ps= conexion.prepareStatement("INSERT INTO actividad (id_actividad, fecha, tipo, nombre_actividad, lugar, destinatario, descripcion) VALUES (?,?,?,?,?,?,?)”);
			ps.setInt(1, id);
			ps.setString(2, fecha);
			ps.setString(3, tipo);
			ps.setString(4, nombre);
			ps.setString(5, lugar);
			ps.setInt(6, destinatario); // ?????
			ps.setString(7, descripción);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Actividad p= new Actividad(rs.getInt("id_actividad"), rs.getString("fecha"), rs.getString("tipo"), rs.getString("nombre_actividad"), rs.getString("lugar"), rs.getString("descripcion"));
				sub.add(p);
			}

// ESPACIOS MUNICIPALES

PreparedStatement ps= conexion.prepareStatement("INSERT INTO sede (id_sede, direccion, caracteristicas, fecha_solicitud, fecha_concesion) VALUES (?,?,?,?,?)”);
			ps.setInt(1, sede);
			ps.setString(2, direccion);
			ps.setString(3, caracteristicas);
			ps.setString(4, fechasolicitud);
			ps.setString(5, fechaconcesion);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Espacio p= new Espacio(rs.getInt("id_sede"), rs.getString("direccion"), rs.getString("caracteristicas"), rs.getString("fecha_solicitud"), rs.getString("fecha_concesion"));
				sub.add(p);
			}
 
 
 */
}
