package clases;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import clases.Copia.EstadoCopia;

public class ListaDeLaBiblioteca<T> {
	public String nombre;
	public ArrayList<Copia> copiasB = new ArrayList<Copia>();
	public ArrayList<Libro> librosB = new ArrayList<Libro>();
	public ArrayList<Prestamo> prestamosB = new ArrayList<Prestamo>();
	public ArrayList<Lector> lectorB = new ArrayList<Lector>();
	
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
	
	public ArrayList<Copia> getCopiasB() {
		return copiasB;
	}
	public void setCopiasB(ArrayList<Copia> copiasB) {
		this.copiasB = copiasB;
	}
	public ArrayList<Lector> getLectorB() {
		return lectorB;
	}
	public void setLectorB(ArrayList<Lector> lectorB) {
		this.lectorB = lectorB;
	}
	public Lector buscarLectorPorId(ArrayList<Lector> lectores,int idABuscar) {
		Lector auxiliar = null;
		for (Lector lectoresABuscar : lectorB) {
			if(lectoresABuscar.getnSocio() == idABuscar) {
				auxiliar = lectoresABuscar;
			}
		}
		return auxiliar;
	}
	
	public Copia buscarCopiaPorId(ArrayList<Copia> copias,int idABuscar) {
		Copia auxiliar = null;
		for (Copia copiaABuscar : copiasB) {
			if(copiaABuscar.getId()==idABuscar) {
				auxiliar = copiaABuscar;
				
			}
		}
		return auxiliar;
	}
	
	public void modificarEstadoDeCopia(int id, EstadoCopia estado) {
		ArrayList<Copia> arrayCopia = new ArrayList<Copia>();
		Iterator<Copia> itCopia = copiasB.iterator();
		
		while(itCopia.hasNext()) {
			Copia auxCopia = itCopia.next();
			if(auxCopia.getId() == id && auxCopia.getEstado()== EstadoCopia.BIBLIOTECA) {
				auxCopia.setEstado(estado);
			}
			arrayCopia.add(auxCopia);
		}
		copiasB.clear();
		copiasB.addAll(arrayCopia);
	}
	public void alquilarLibro(int idLector, int id)  {
		Lector lectorAux = buscarLectorPorId(lectorB, idLector);
		if(lectorAux.prestar(idLector, new Date())) {
			lectorAux.agregarPrestamos(new Prestamo(buscarCopiaPorId(copiasB, id)));
			modificarEstadoDeCopia(id, EstadoCopia.PRESTADO);	
		}
		
	}
	public ArrayList<Copia> stockDeCopias() {
		Copia auxiliarCopia=null;
		ArrayList<Copia> arrayCopias = new ArrayList<Copia>();
		Iterator<Copia> iteradorCopias = copiasB.iterator();
		while(iteradorCopias.hasNext()) {
		auxiliarCopia = iteradorCopias.next();
		arrayCopias.add(auxiliarCopia);
		System.out.println("Stock de Copias: \n"+auxiliarCopia);
		}
		return arrayCopias;
	}
	public ArrayList<Libro> stockDeLibros() {
		Libro auxiliarLibro=null;
		ArrayList<Libro> arrayLibros = new ArrayList<Libro>();
		Iterator<Libro> iteradorLibros = librosB.iterator();
		while(iteradorLibros.hasNext()) {
		auxiliarLibro = iteradorLibros.next();
		arrayLibros.add(auxiliarLibro);
		System.out.println("Stock de Libros: \n"+auxiliarLibro);
		}
		return arrayLibros;
	}
	
	public ArrayList<Copia> obtenerPrestamosDeLectores(){
		Copia auxiliarCopia = null;
		ArrayList<Copia> arrayCopia = new ArrayList<Copia>();
		Iterator<Copia> iteradorCopia = copiasB.iterator();
		while(iteradorCopia.hasNext()) {
			auxiliarCopia = iteradorCopia.next();
			if(auxiliarCopia != null && auxiliarCopia.getEstado() == EstadoCopia.PRESTADO)
			{		
				arrayCopia.add(auxiliarCopia);
				System.out.println("Prestamos activos: \n" + auxiliarCopia);
			}		
		}
		return arrayCopia;
	}
	public void pushLectores (Lector e) {
		
		ArrayList<Lector> tmp = new ArrayList<Lector>();
		
		Iterator<Lector> it = lectorB.iterator();
		
		while (it.hasNext()) {
			Lector pe = it.next();
			tmp.add(pe);
		}
		tmp.add(e);
		this.lectorB.clear();
		this.lectorB.addAll(tmp);
	}
}