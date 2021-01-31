package ppDiaCinco;

import java.util.Iterator;
import java.util.Set;

//import java.util.Date;

public class Main { //ej 11 y 12

	public static void main(String[] args) {
		/*CalendarPrint calendarioMain = new CalendarPrint(); //11
		calendarioMain.imprimirCalendario();*/
		
		/*eje12*/	
		SetOperations coleccionA = new SetOperations(); // creo objeto de clase
		SetOperations coleccionB = new SetOperations();
		Set<Integer> setAMain = coleccionA.crearArbolA(); //creo un objeto de la interfaz set y le asigno la coleccion llamando a la funcion de SetOperations
		Set<Integer> setBMain = coleccionB.crearArbolB(); // en la funcion treeset implementa la interfaz set y guardara objetos q no esten repetidos
		
		setAMain = SetOperations.union(setAMain, setBMain);
		iterador(setAMain);
		setAMain = SetOperations.interseccion(setAMain, setBMain);
		iterador(setAMain);
		setAMain = SetOperations.diferencia(setAMain, setBMain);
		iterador(setAMain);
		
		
		
	}
	private static void iterador(Set<Integer> coleccion) {
		Iterator<Integer> it = coleccion.iterator();
		//hashnext (DEVUELVE TRUE SI ENCUENTRA UN ELEMENTO PARA ITERAR DENTRO DE LA COLECCION)
		while(it.hasNext()) {
			System.out.println("numero: " + it.next());
		}
	}

}
