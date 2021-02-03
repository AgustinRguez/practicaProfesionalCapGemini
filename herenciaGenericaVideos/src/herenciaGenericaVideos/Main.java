package herenciaGenericaVideos;

public class Main {

	public static void main(String[] args) {
		/*Empleado administrativa = new Empleado("tita", 45, 1500);
		Jefe directora = new Jefe("Ana", 50, 3000);
		
		Empleado nuevoEmpleado = directora;*/
		
		Pareja<Empleado> administrativa = new Pareja<Empleado>();
		Pareja<Jefe> directora = new Pareja<Jefe>();
		
		//Pareja<Empleado> nuevoEmpleado = directora;
		
		Pareja.imprimirTrabajador(administrativa);
		//Pareja.imprimirTrabajador(directora); restriccion se resuelve con Pareja<? extends Empleado>(){}
		
		//le agrego el ? extends
		Pareja.imprimirTrabajador(directora);  
		
	}

}
