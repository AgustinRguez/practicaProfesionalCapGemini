package genericoVideos;

public class Main {

	public static void main(String[] args) {
		
		String nombres[] = {"YO", "NO", "SOY"};
		
		String elementos = MisMatrices.getElementos(nombres);
		
		System.out.println(elementos);
		System.out.println(MisMatrices.getElMasChico(nombres));
		
		
		/*Empleado listaEmpleados[] = {new Empleado("AGUS", 24, 2500), // con empleado no podria llamar "get el mas chico"
		  															   // xq no implementa la interfaz comparable, pero string si y por eso puedo imprimir.
									 new Empleado("JOSEFA", 27, 2000),
									 new Empleado("MARIA", 30, 5000),
									 new Empleado("MAM", 21, 10000),
									 new Empleado("YONO", 18, 9000)
				
		};
		System.out.println(MisMatrices.getElementos(listaEmpleados));*/
	}
}
	class MisMatrices{
		public static <T> String getElementos(T[]a) { //metodo que se adapta a diferentes tipos
													  //que le pases como parametro	
			return "El array tiene " + a.length + " elementos";
		}
		
		public static <T extends Comparable> T getElMasChico(T[]b) {
			T elementoMenor=b[0];
			if(b==null || b.length ==0) {
				
				return null;
			}
			for(int i=1;i<b.length;i++) {
				if(elementoMenor.compareTo(b[i])> 0) {
					elementoMenor= b[i];
				}
			}
			return elementoMenor;
		}
		
	}

