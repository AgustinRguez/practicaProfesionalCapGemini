package clases;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import clases.Copia.EstadoCopia;
import clases.Libro.tipoLibro;


public class Main {

	public static void main(String[] args) throws ParseException {
		
		ListaDeLaBiblioteca<Lector> bibliotecaDeLectores = new ListaDeLaBiblioteca<Lector>("Biblioteca de Lectores");
		ListaDeLaBiblioteca<Libro> bibliotecaDeLibros = new ListaDeLaBiblioteca<Libro>("Biblioteca nueva");
		ListaDeLaBiblioteca<Copia> bibliotecaDeCopias = new ListaDeLaBiblioteca<Copia>("Biblioteca de Copias");
		
		/*Lector lectorUno = new Lector( "Tito", "42087402", "calle falsa 123");
		Lector lectorDos = new Lector( "Eugenio", "42097894", "calle falsa 10000");
		Lector lectorTres = new Lector( "Agustin", "42287691", "calle nose");
		
		
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
		
		Copia copiaLibroUno = new Copia(EstadoCopia.BIBLIOTECA, libroUno);
		
		Copia copiaLibroDos = new Copia(EstadoCopia.BIBLIOTECA, libroDos);
			
		Copia copiaLibroTres = new Copia(EstadoCopia.BIBLIOTECA, libroTres);
		
		Copia copiaLibroCuatro = new Copia(EstadoCopia.BIBLIOTECA, libroCuatro);
		
		Copia copiaLibroCinco = new Copia(EstadoCopia.BIBLIOTECA, libroCinco);
				
		Copia copiaLibroSeis = new Copia(EstadoCopia.BIBLIOTECA, libroSeis);
				
		Copia copiaLibroSiete = new Copia(EstadoCopia.BIBLIOTECA, libroSiete);
				
		Copia copiaLibroOcho = new Copia(EstadoCopia.BIBLIOTECA, libroOcho);	
		
		Copia copiaLibroNueve = new Copia(EstadoCopia.BIBLIOTECA, libroNueve);
			
		Copia copiaLibroDiez = new Copia(EstadoCopia.BIBLIOTECA, libroDiez);			
		Copia copiaDosLibroDiez = new Copia(EstadoCopia.PRESTADO, libroDiez); 
		
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
		bibliotecaDeCopias.obtenerPrestamosDeLectores();  */
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		Lector lectorUno = new Lector();
		
		Autor autorUno = new Autor();
		
		Libro libroUno = new Libro();
		
		Copia copiaUno = new Copia();
		
		Multa multa = new Multa();
		
		Prestamo prestamoUno = new Prestamo();
		
		Date fechaInicioMulta = dateFormat.parse("10-02-2009");
		Date fechaFinalMulta = dateFormat.parse("10-03-2009");
		Date nacimientoParaAutor = dateFormat.parse("19-06-1996");
		
		multa.setFechaInicio(fechaInicioMulta);
		multa.setFechaFinal(fechaFinalMulta);
		
		lectorUno.setNombre("Agustin");
		lectorUno.setTelefono("42087402");
		lectorUno.setDireccion("calle falsa 123");
		
		autorUno.setFechaNac(nacimientoParaAutor);
		autorUno.setNacionalidad("Argentina");
		autorUno.setNombre("Luis Alberto");
		autorUno.setLibros(libroUno);
		
		
		libroUno.setAnyo(2009);
		libroUno.setAutor(autorUno);
		libroUno.setEditorial("Editorial cualquiera");
		libroUno.setTipo(tipoLibro.ENSAYO);
		libroUno.setTitulo("El señor de los titulos");
		
		copiaUno.setEstado(EstadoCopia.BIBLIOTECA);
		//copiaUno.setLibroCopia(libroUno);
		
		prestamoUno.setCopias(copiaUno);
		prestamoUno.setFechaInicio(fechaInicioMulta);
		prestamoUno.setFechaFin(fechaFinalMulta);
		prestamoUno.setLectorDePrestamo(lectorUno);
		
		lectorUno.agregarPrestamos(prestamoUno);
		lectorUno.setMultas(multa);
		
		EntityManagerFactory miFactory = Persistence.createEntityManagerFactory("ejsHibernate");
		EntityManager manager = miFactory.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
		manager.persist(lectorUno);
		manager.persist(prestamoUno);
		manager.persist(multa);
		tran.commit();
		//manager.close();
		
		bibliotecaDeCopias.stockDeCopias();
		
		List<Copia> copiaList = manager.createQuery("FROM Copia").getResultList(); //hacer un select
		for (Copia copias : copiaList) {
			System.out.println("\nEsta " +copias.toString()); 
			manager.close();
			
	}
		
	}

}
