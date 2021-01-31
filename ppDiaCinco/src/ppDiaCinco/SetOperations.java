package ppDiaCinco;


//import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetOperations {
		
		public static <T> Set<T> union(Set<T> setA, Set<T> setB){
			setA.addAll(setB);
			return setA;
			 //addAll agrega todos los que esten en B
		}

		public static <T> Set<T> interseccion(Set<T> setA, Set<T> setB){
			setA.retainAll(setB);
			setB.retainAll(setA);
			//A retiene o borra todo lo q este en b y b con A
			return setB;
			
		}

		public static <T> Set<T> diferencia(Set<T> setA, Set<T> setB){
			//borra lo q este en B
			setA.removeAll(setB);
			return setA;
			
		}

		public static <T> Set<T> difSimetrica(Set<T> setA, Set<T> setB){
			return null;
			
		}

		public Set<Integer> crearArbolA(){
			Set<Integer> setA = new TreeSet<Integer>(); //Las dos clases HashSet y TreeSet implementan la interfaz Set. Eso hace que estas dos colecciones sólo guarden objetos que no estén repetidos. 
														//Si se intenta añadir un elemento que ya está, no le añade, devolviendo false. 
			setA.add(20);
			setA.add(15);
			setA.add(10);
			return setA;
		}
		public Set<Integer> crearArbolB(){
			Set<Integer> setB = new TreeSet<Integer>();
			setB.add(70);
			setB.add(50);
			setB.add(5);
			setB.add(20);
			return setB;
		}
		
}
