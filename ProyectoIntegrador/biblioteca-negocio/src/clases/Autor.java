package clases;

import java.util.ArrayList;
import java.util.Date;

public class Autor {
	private String nombre;
	private String nacionalidad;
	private Date fechaNac;
	private ArrayList<Libro> libros= new ArrayList<>();
	public Autor(String nombre, String nacionalidad, Date fechaNac) {
		
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.fechaNac = fechaNac;
	}
	

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", fechaNac=" + fechaNac + ", libros="
				+ libros + "]";
	}


}