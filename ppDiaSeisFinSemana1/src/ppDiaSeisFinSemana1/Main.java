package ppDiaSeisFinSemana1;

import java.util.LinkedList;
import java.util.Map;

public class Main { //ej 13 y 14

	public static void main(String[] args) {
		Persona objPerUno = new Persona("yo", 1, 20);
		Persona objPerDos = new Persona("yo2", 10, 30);
		Persona objPerTres = new Persona("yo3", 2, 40);
		Persona objPerCuatro = new Persona("yo4", 5, 50);
		
		LinkedList<Persona> objLista = new LinkedList<Persona>();
		objLista.add(objPerUno);
		objLista.add(objPerDos);
		objLista.add(objPerTres);
		objLista.add(objPerCuatro);
		
		Map<Integer, Persona> mapPersonas = PersonasUtil.getPersonas(objLista);
		mapPersonas.forEach((clave, valor) -> System.out.println("Clave: " + clave + " | Valor: " + valor));
		
		PersonasUtil.ordenarPersonas(objLista);
	}

}
