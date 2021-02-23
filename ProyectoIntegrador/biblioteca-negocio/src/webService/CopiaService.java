package webService;

import clases.Copia;
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
}
