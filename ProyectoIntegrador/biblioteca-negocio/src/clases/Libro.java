package clases;

import java.util.ArrayList;

import clases.Copia.EstadoCopia;

public class Libro {
	private String titulo;
	private tipoLibro tipo;
	private String editorial;
	private int anyo;
	private Autor autor;
	private ArrayList<Copia> copias;

	enum tipoLibro{
		NOVELA("N"), TEATRO("T"), POESIA("P"), ENSAYO("E");

		private tipoLibro(String abreviatura) {
			this.abreviatura = abreviatura;
		}

		public String getAbreviatura() {
			return abreviatura;
		}

		private String abreviatura;
	}
	public Libro(String titulo, tipoLibro tipo,String editorial,int anyo,Autor autor) {
		this.titulo = titulo;
		this.tipo = tipo;
		this.editorial = editorial;
		this.anyo = anyo;
		this.autor = autor;
		this.copias = new ArrayList<>();
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public tipoLibro getTipo() {
		return tipo;
	}
	public void setTipo(tipoLibro tipo) {
		this.tipo = tipo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public ArrayList<Copia> getCopias() {
		return copias;
	}
	public void setCopias(ArrayList<Copia> copias) {
		this.copias = copias;
	}
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", tipo=" + tipo + ", editorial=" + editorial + ", anyo=" + anyo + ", autor="
				+ autor + ", copias=" + copias + "]";
	}
	public void agregarCopias(Copia parametroCopias) {
		this.copias.add(parametroCopias);
	}

} 