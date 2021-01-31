package ppDiaSeisFinSemana1;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PersonasUtil {
	
	public static Map<Integer,Persona> getPersonas(List<Persona> listaPersona) { //recibe una lista de personas y devuelve un map
		/*se le pasa legajo como integer y claves y personas como valores*/
		Map<Integer, Persona> mapPersonas = new HashMap<>();
		for (Persona persona : listaPersona) { //recorre uno a uno la lista con foreach: tipo de dato q recorre, el nombre del tipo y la lista q se incluye
			mapPersonas.put(persona.getLegajo(), persona);
		}
		return mapPersonas;
		
	}
	@SuppressWarnings("unused")
	public static void ordenarPersonas(List<Persona> listaPersona) {
		Collections.sort(listaPersona, new Comparar());
		for (Persona persona : listaPersona) {
			System.out.println(listaPersona);
		}
	}
}
