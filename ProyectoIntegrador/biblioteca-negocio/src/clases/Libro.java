package clases;

import java.util.*;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


public class Libro {
	private long Id;
	private String titulo;
	private tipoLibro tipo;
	private String editorial;
	private int anyo;
	private Autor autor;
	private ArrayList<Copia> copias = new ArrayList<Copia>();
	
	public enum tipoLibro{
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
		//this.autor = autor;
	}
	public Libro() {
		super();
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (Id ^ (Id >>> 32));
		result = prime * result + anyo;
		result = prime * result + ((copias == null) ? 0 : copias.hashCode());
		result = prime * result + ((editorial == null) ? 0 : editorial.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (Id != other.Id)
			return false;
		if (anyo != other.anyo)
			return false;
		if (copias == null) {
			if (other.copias != null)
				return false;
		} else if (!copias.equals(other.copias))
			return false;
		if (editorial == null) {
			if (other.editorial != null)
				return false;
		} else if (!editorial.equals(other.editorial))
			return false;
		if (tipo != other.tipo)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Libro [Id=" + Id + ", titulo=" + titulo + ", tipo=" + tipo + ", editorial=" + editorial + ", anyo="
				+ anyo + ", copias=" + copias + "]";
	}
	
	/*@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", tipo=" + tipo + ", editorial=" + editorial + ", anyo=" + anyo + ", autor="
				+ autor + ", copias=" + copias + "]";
	}
	public void agregarCopias(Copia parametroCopias) {
		this.copias.add(parametroCopias);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anyo;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((copias == null) ? 0 : copias.hashCode());
		result = prime * result + ((editorial == null) ? 0 : editorial.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (anyo != other.anyo)
			return false;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (copias == null) {
			if (other.copias != null)
				return false;
		} else if (!copias.equals(other.copias))
			return false;
		if (editorial == null) {
			if (other.editorial != null)
				return false;
		} else if (!editorial.equals(other.editorial))
			return false;
		if (tipo != other.tipo)
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}*/
	
	

} 