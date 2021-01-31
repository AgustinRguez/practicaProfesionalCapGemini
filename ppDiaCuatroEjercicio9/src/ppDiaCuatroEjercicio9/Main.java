package ppDiaCuatroEjercicio9;

//import java.util.Date;

public class Main {

	public static void main(String[] args) { 
		/*Date fecha = new Date(); //ej 9
		Employee objEmpleadoUno = new Employee(fecha, 150.5,"agustin");
		Employee objEmpleadoDos = new Employee(fecha, 150.5,"agustin");
	
		System.out.println(objEmpleadoUno.equals(objEmpleadoDos));
		
		int empleadoUno=objEmpleadoUno.hashCode();
		int empleadoDos=objEmpleadoDos.hashCode();
		System.out.println("empleado" + empleadoUno);
		System.out.println("empleado" + empleadoDos);*/
		
		//--------------------------------------------------------------
		
	 sistemaSolar m = sistemaSolar.MERCURIO; //eje 10 
	 sistemaSolar v = sistemaSolar.VENUS;
	 sistemaSolar t = sistemaSolar.TIERRA;
	 sistemaSolar mar = sistemaSolar.MARTE;
	 sistemaSolar j = sistemaSolar.JUPITER;
	 sistemaSolar s = sistemaSolar.SATURNO;
	 sistemaSolar u = sistemaSolar.URANO;
	 sistemaSolar n = sistemaSolar.NEPTUNO;
	 System.out.println("| NOMBRE: |" + m.getNombre() + " | MASA: |" + m.getMasa() + " | RADIO: | " + m.getRadio());
	 System.out.println("| NOMBRE: |" + v.getNombre() + " | MASA: |" + v.getMasa() + " | RADIO: | " + v.getRadio());
	 System.out.println("| NOMBRE: |" + t.getNombre() + " | MASA: |" + t.getMasa() + " | RADIO: | " + t.getRadio());
	 System.out.println("| NOMBRE: |" + mar.getNombre() + " | MASA: |" + mar.getMasa() + " | RADIO: |" + mar.getRadio());
	 System.out.println("| NOMBRE: |" + j.getNombre() + " | MASA: |" + j.getMasa() + " | RADIO: | " + j.getRadio());
	 System.out.println("| NOMBRE: | " + s.getNombre() + " | MASA: | " + s.getMasa() + " | RADIO: | " + s.getRadio());
	 System.out.println("| NOMBRE: | " + u.getNombre() + " | MASA: | " + u.getMasa() + " | RADIO: | " + u.getRadio());
	 System.out.println("| NOMBRE: | " + n.getNombre() + " | MASA: | " + n.getMasa() + " | RADIO: | " + n.getRadio());
	}

}
