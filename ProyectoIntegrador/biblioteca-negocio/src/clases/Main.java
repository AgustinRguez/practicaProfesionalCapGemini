package clases;


import java.util.Date;

import clases.Copia.EstadoCopia;
import clases.Libro.tipoLibro;

public class Main {

	public static void main(String[] args) {
		
		ListaDeLaBiblioteca<Lector> bibliotecaDeLectores = new ListaDeLaBiblioteca<Lector>("Biblioteca de Lectores");
		ListaDeLaBiblioteca<Libro> bibliotecaDeLibros = new ListaDeLaBiblioteca<Libro>("Biblioteca nueva");
		ListaDeLaBiblioteca<Copia> bibliotecaDeCopias = new ListaDeLaBiblioteca<Copia>("Biblioteca de Copias");
		
		Lector lectorUno = new Lector(10, "Tito", "42087402", "calle falsa 123");
		Lector lectorDos = new Lector(20, "Eugenio", "42097894", "calle falsa 10000");
		Lector lectorTres = new Lector(15, "Agustin", "42287691", "calle nose");
		
		
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
		
		Copia copiaLibroDos = new Copia(2, EstadoCopia.BIBLIOTECA, libroDos);
			
		Copia copiaLibroTres = new Copia(3, EstadoCopia.BIBLIOTECA, libroTres);
		
		Copia copiaLibroCuatro = new Copia(4, EstadoCopia.BIBLIOTECA, libroCuatro);
		
		Copia copiaLibroCinco = new Copia(5, EstadoCopia.BIBLIOTECA, libroCinco);
				
		Copia copiaLibroSeis = new Copia(6, EstadoCopia.BIBLIOTECA, libroSeis);
				
		Copia copiaLibroSiete = new Copia(7, EstadoCopia.BIBLIOTECA, libroSiete);
				
		Copia copiaLibroOcho = new Copia(8, EstadoCopia.BIBLIOTECA, libroOcho);	
		
		Copia copiaLibroNueve = new Copia(9, EstadoCopia.BIBLIOTECA, libroNueve);
			
		Copia copiaLibroDiez = new Copia(10, EstadoCopia.BIBLIOTECA, libroDiez);			
		Copia copiaDosLibroDiez = new Copia(10, EstadoCopia.PRESTADO, libroDiez); 
		
		bibliotecaDeLibros.librosB.add(libroUno);
		bibliotecaDeCopias.copiasB.add(copiaLibroUno);	
		bibliotecaDeCopias.copiasB.add(copiaLibroUno);
		
		bibliotecaDeLibros.librosB.add(libroDos);
		bibliotecaDeCopias.copiasB.add(copiaLibroDos);
		
		bibliotecaDeLibros.librosB.add(libroTres);
		bibliotecaDeCopias.copiasB.add(copiaLibroTres);
			
		bibliotecaDeLibros.librosB.add(libroCuatro);
		bibliotecaDeCopias.copiasB.add(copiaLibroCuatro);
		
		bibliotecaDeLibros.librosB.add(libroCinco);
		bibliotecaDeCopias.copiasB.add(copiaLibroCinco);	
		
		bibliotecaDeLibros.librosB.add(libroSeis);
		bibliotecaDeCopias.copiasB.add(copiaLibroSeis);
		
		bibliotecaDeLibros.librosB.add(libroSiete);
		bibliotecaDeCopias.copiasB.add(copiaLibroSiete);
		
		bibliotecaDeLibros.librosB.add(libroOcho);
		bibliotecaDeCopias.copiasB.add(copiaLibroOcho);

		bibliotecaDeLibros.librosB.add(libroNueve);
		bibliotecaDeCopias.copiasB.add(copiaLibroNueve);
		
		bibliotecaDeLibros.librosB.add(libroDiez);
		bibliotecaDeCopias.copiasB.add(copiaLibroDiez);
		bibliotecaDeCopias.copiasB.add(copiaDosLibroDiez);
	
		
		bibliotecaDeLectores.lectorB.add(lectorUno);
		bibliotecaDeLectores.lectorB.add(lectorDos);
		bibliotecaDeLectores.lectorB.add(lectorTres);
		//System.out.println(biblioteca.librosB);
		//System.out.println(biblioteca.copiasB);
		
		//System.out.println(bibliotecaDeCopias.buscarCopiaPorId(bibliotecaDeCopias.copiasB, 3));
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		bibliotecaDeLectores.alquilarLibro(lectorTres.getnSocio(), 3);
		bibliotecaDeLectores.alquilarLibro(lectorTres.getnSocio(), 2);
		bibliotecaDeLectores.alquilarLibro(lectorTres.getnSocio(), 1);

		
		bibliotecaDeLectores.alquilarLibro(lectorDos.getnSocio(), 5);
		bibliotecaDeLectores.alquilarLibro(lectorDos.getnSocio(), 6);
		
		System.out.println(bibliotecaDeLectores.buscarLectorPorId(bibliotecaDeLectores.lectorB,15));
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		System.out.println(bibliotecaDeLectores.buscarLectorPorId(bibliotecaDeLectores.lectorB,20));
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		bibliotecaDeCopias.stockDeCopias();
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		
		bibliotecaDeLectores.alquilarLibro(lectorTres.getnSocio(), 8);
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		bibliotecaDeLibros.stockDeLibros();
		System.out.println("-------------------------------------------------------------------------------------------------------------");
		bibliotecaDeCopias.obtenerPrestamosDeLectores();
	}

}
