package clases;

import java.util.ArrayList;

public class ListaDeLaBiblioteca<T> {
	public String nombre;
	public ArrayList<Copia> copiasB = new ArrayList<Copia>();
	public ArrayList<Libro> librosB = new ArrayList<Libro>();
	public ArrayList<Prestamo> prestamosB = new ArrayList<Prestamo>();
	public ListaDeLaBiblioteca(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Libro> getLibrosB() {
		return librosB;
	}
	public void setLibrosB(ArrayList<Libro> librosB) {
		this.librosB = librosB;
	}
	public ArrayList<Prestamo> getPrestamosB() {
		return prestamosB;
	}
	public void setPrestamosB(ArrayList<Prestamo> prestamosB) {
		this.prestamosB = prestamosB;
	}
	/*public void prestarLibro(Lector lector, String nombreLibro) {
		
	}*/

}