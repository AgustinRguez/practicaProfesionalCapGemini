package matematica;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class Calculadora {

	@WebMethod (operationName =  "sumaWS")
	public int suma (@WebParam( name = "primero") int numeroUno, @WebParam( name = "segundo") int numeroDos) {
		int resultado;
		resultado = numeroUno + numeroDos;
		return resultado;
	}
	@WebMethod (operationName =  "restaWS")
	public int resta (@WebParam( name = "primero") int numeroUno, @WebParam( name = "segundo") int numeroDos) {
		int resultado;
		resultado = numeroUno - numeroDos;
		return resultado;
	}
	@WebMethod (operationName =  "multiplicacionWS")
	public int multiplicacion (@WebParam( name = "primero") int numeroUno, @WebParam( name = "segundo") int numeroDos) {
		int resultado;
		resultado = numeroUno * numeroDos;
		return resultado;
	}
	@WebMethod (operationName =  "divisionWS")
	public int division (@WebParam( name = "primero") int numeroUno, @WebParam( name = "segundo") int numeroDos) {
		int resultado;
		resultado = numeroUno / numeroDos;
		if(numeroDos == 0) {
			resultado = 0;
		}
		return resultado;
	}
}
