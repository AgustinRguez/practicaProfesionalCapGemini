import java.util.ArrayList;

public class listasDeLaBiblioteca<T> {
	public String nombre;
	public ArrayList<Libro> librosB;
	public ArrayList<Prestamo> prestamosB;
	public listasDeLaBiblioteca(String nombre) {
		this.nombre = nombre;
		this.librosB = new ArrayList<>();
		this.prestamosB = new ArrayList<>();
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
	
}
