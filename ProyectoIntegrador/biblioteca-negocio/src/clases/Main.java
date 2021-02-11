package clases;

import java.util.Date;

import clases.Copia.EstadoCopia;
import clases.Libro.tipoLibro;

public class Main {

	public static void main(String[] args) {
		Lector lectorUno = new Lector(10, "Tito", "42087402", "calle falsa 123");
		Lector lectorDos = new Lector(20, "Eugenio", "42097894", "calle falsa 10000");
		
		Autor autorUno = new Autor("Luis", "Argentina", new Date());
		Autor autorDos = new Autor("Alberto", "Brasil", new Date());
		
		Libro libroUno = new Libro("Titulo1", tipoLibro.NOVELA, "EditorialUno" , 2020, autorUno);
		Libro libroDos = new Libro("Titulo2", tipoLibro.ENSAYO, "EditorialDos" , 2020, autorDos);
		Libro libroTres = new Libro("Titulo3", tipoLibro.POESIA, "EditorialTres" , 2020, autorUno);
		Libro libroCuatro = new Libro("Titulo4", tipoLibro.TEATRO, "EditorialCuatro" , 2020, autorUno);
		Libro libroCinco = new Libro("Titulo5", tipoLibro.ENSAYO, "EditorialCinco" , 2020, autorDos);
		Libro libroSeis = new Libro("Titulo6", tipoLibro.NOVELA, "EditorialSeis" , 2020, autorDos);
		Libro libroSiete = new Libro("Titulo7", tipoLibro.NOVELA, "EditorialSiete" , 2020, autorUno);
		Libro libroOcho = new Libro("Titulo8", tipoLibro.POESIA, "EditorialOcho" , 2020, autorDos);
		Libro libroNueve = new Libro("Titulo9", tipoLibro.POESIA, "EditorialNueve" , 2020, autorUno);
		Libro libroDiez = new Libro("Titulo10", tipoLibro.TEATRO, "EditorialDiez" , 2020, autorUno);
		
		Copia copiaLibroUno = new Copia(1, EstadoCopia.BIBLIOTECA, libroUno);
		Copia copiaDosLibroUno = new Copia(1, EstadoCopia.BIBLIOTECA, libroUno);
		Copia copiaTresLibroUno = new Copia(1, EstadoCopia.BIBLIOTECA, libroUno);
		
		Copia copiaLibroDos = new Copia(2, EstadoCopia.BIBLIOTECA, libroDos);
		Copia copiaDosLibroDos = new Copia(2, EstadoCopia.BIBLIOTECA, libroDos);
		Copia copiaTresLibroDos = new Copia(2, EstadoCopia.BIBLIOTECA, libroDos);
		
		ListaDeLaBiblioteca<Libro> biblioteca = new ListaDeLaBiblioteca<>("Biblioteca nueva");
		biblioteca.librosB.add(libroUno);
		biblioteca.copiasB.add(copiaLibroUno);
		biblioteca.copiasB.add(copiaDosLibroUno);
		biblioteca.copiasB.add(copiaTresLibroUno);
		
		biblioteca.librosB.add(libroDos);
		biblioteca.copiasB.add(copiaLibroDos);
		biblioteca.copiasB.add(copiaDosLibroDos);
		biblioteca.copiasB.add(copiaTresLibroDos);
	}

}
