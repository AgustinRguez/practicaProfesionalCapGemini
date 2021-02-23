package clases;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "copia")
public class Copia implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5949226747022537216L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column (name = "IdCopia")
	private long id;
	
	@Column (name = "EstadoCopia")
	private EstadoCopia estado;
	
	
	//private Libro libroCopia;
	
	public enum EstadoCopia{
		PRESTADO("P"), RETRASO("R"), BIBLIOTECA("B"), REPARACION("R");

		private EstadoCopia(String abreviatura) {
			this.abreviatura = abreviatura;
		}

		public String getAbreviatura() {
			return abreviatura;
		}

		private String abreviatura;
	}
	public Copia(EstadoCopia estado, Libro libroCopia) {
		super();
		//this.id = id;
		this.estado = estado;
		//this.libroCopia = libroCopia;
	}
	public Copia() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public EstadoCopia getEstado() {
		return estado;
	}
	public void setEstado(EstadoCopia estado) {
		this.estado = estado;
	}
	/*public Libro getLibroCopia() {
		return libroCopia;
	}
	public void setLibroCopia(Libro libroCopia) {
		this.libroCopia = libroCopia;
	}*/
	/*
	@Override
	public String toString() {
		return "Copia [id=" + id + ", estado=" + estado + ", libroCopia=" + libroCopia + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		//result = prime * result + id;
		result = prime * result + ((libroCopia == null) ? 0 : libroCopia.hashCode());
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
		Copia other = (Copia) obj;
		if (estado != other.estado)
			return false;
		if (id != other.id)
			return false;
		if (libroCopia == null) {
			if (other.libroCopia != null)
				return false;
		} else if (!libroCopia.equals(other.libroCopia))
			return false;
		return true;
	}*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Copia other = (Copia) obj;
		if (estado != other.estado)
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Copia [id=" + id + ", estado=" + estado + "]";
	}

	
	

}