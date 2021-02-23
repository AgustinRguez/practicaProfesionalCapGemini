package webService;

import java.util.ArrayList;

import clases.Copia;
import clases.Lector;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class CopiaService {

	@WebMethod(operationName = "agregarCopiasWS")
	public boolean agregarCopias(@WebParam(name = "copias")Copia copiasParam) {
		CopiaDAO copiaDaoAtr = new CopiaDAO();
		try {
			copiaDaoAtr.agregarCopia(copiasParam);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
	}
	@WebMethod(operationName = "agregarLectorWS")
	public boolean agregarLector(@WebParam(name = "lector")Lector lectorParam) {
		CopiaDAO lectorDaoAtr = new CopiaDAO();
		try {
			lectorDaoAtr.agregarCopia(lectorParam);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
	}

	@WebMethod(operationName = "obtenerCopiasWS")
	public ArrayList<Copia> obtenerCopias(){
		CopiaDAO copiaDaoAtr = new CopiaDAO();
		ArrayList<Copia> copias = new ArrayList<Copia>();
		try {
			copias = copiaDaoAtr.consultarCopias();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return copias;
	}
	
	@WebMethod(operationName = "obtenerLectoresWS")
	public ArrayList<Lector> obtenerLectores(){
		CopiaDAO lectorDaoAtr = new CopiaDAO();
		ArrayList<Lector> arrayLector = new ArrayList<Lector>();
		try {
			arrayLector = lectorDaoAtr.consultarLectores();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return arrayLector;
	}
}
