package proyectoJDBC;

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
			
		   String url = "jdbc:postgresql://localhost:5432/CURSO";
			conexion = DriverManager.getConnection(url, "postgres", "root");
			
			sentenciaSQL = conexion.createStatement();
			
			/*String sqlString = "INSERT INTO contacto (nombre, telefono, email)\r\n" //1
					+ "VALUES ('lala', '200-20-20-20', 'lala@alla.com')\r\n";*/
			//resultado = sentenciaSQL.executeQuery(sqlString);
			String sqlStringDos = "select * from contacto";
			resultado = sentenciaSQL.executeQuery(sqlStringDos);
			
			while (resultado.next()) {
				System.out.println("nombre: "+resultado.getString(1)+" email: "+resultado.getString(2)); // 2
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
