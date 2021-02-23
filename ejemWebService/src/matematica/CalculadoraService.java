package matematica;

import jakarta.xml.ws.Endpoint;

public class CalculadoraService {

	public static void main(String[] args) {
		Endpoint endPoint = Endpoint.publish("http://localhost:8090/Calculadora", new Calculadora());

	}

}
