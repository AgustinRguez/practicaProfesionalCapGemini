package ppDiaDos;

import java.util.ArrayList;
import java.util.List;

public class Pila {
	
	private List<Object> arreglo = new ArrayList<Object>();
	
	public Pila(){
		arreglo.add(21);
		arreglo.add(10);
	}
	
	public void mostrar() {
		System.out.println("MOSTRAR: " + arreglo);
	}
	public Object peek(Object objetoParam) {
		objetoParam= arreglo.get(arreglo.size()-1);
		System.out.println("Devuelvo el ultimo ingresado hasta un nuevo ingreso: " + objetoParam);
		return objetoParam;
	}
	public Object push (Object objetoParam) {
			arreglo.add(objetoParam);
			System.out.println("muestro: " + arreglo);
			return objetoParam;
	}
	
	@SuppressWarnings("unused")
	public Object pop (Object objetoParam) {
			for(int i=0; i<arreglo.size(); i++)
			{
				objetoParam=arreglo.get(arreglo.size()-1);
				arreglo.remove(objetoParam);
				System.out.println("Saco el ultimo objeto de la Lista: " + objetoParam);
				i--;
				break;
			}
			return objetoParam;
	}
	public Object reverse (Object objetoParam ) {
		for(int i=0; i<arreglo.size(); i++){
			
		}
		return objetoParam; 
	}

}
