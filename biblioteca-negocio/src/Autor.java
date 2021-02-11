import java.util.ArrayList;
import java.util.Date;

public class Autor extends Persona{
	private String nacionalidad;
	private Date fechaNac;
	private ArrayList<Libro> libros;
	public Autor(String nombre, String nacionalidad, Date fechaNac) {
		super(nombre);
		this.nacionalidad = nacionalidad;
		this.fechaNac = fechaNac;
		this.libros = new ArrayList<>();
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public ArrayList<Libro> getLibros() {
		return libros;
	}
	public void setObras(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	
}
