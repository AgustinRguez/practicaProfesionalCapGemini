package ppDiaSeisFinSemana1;

public class Persona {
	private String nombre;
	private int legajo;
	private int edad;
	
	public Persona(String nombre, int legajo, int edad){
		this.nombre = nombre;
		this.legajo = legajo;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	//tostring transforma a string cualquier objeto

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", legajo=" + legajo + ", edad=" + edad + "]";
	}
	
}
