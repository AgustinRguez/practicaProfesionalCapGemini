package pruebaJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet resultado = null;

		try {
			Class.forName("org.postgresql.Driver");
			
		   String url = "jdbc:postgresql://localhost:5432/postgres";
			conexion = DriverManager.getConnection(url, "java", "java");
			
			sentenciaSQL = conexion.createStatement();
			String sqlStringDos = "INSERT INTO contacto (nombre, telefono, email)" 
					+ "VALUES (“Juan José”, “999-99-99-99”, “juan@jose.com”)";

			String sqlString = "select * from contacto";
			resultado = sentenciaSQL.executeQuery(sqlString);
			
			while (resultado.next()) {
				System.out.println(resultado.getString("nombre"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
