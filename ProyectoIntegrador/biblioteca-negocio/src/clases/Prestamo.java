package clases;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Prestamo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="prestamoId")
	private long Id;
	@Column
	private Date fechaInicio;
	@Column
	private Date fechaFin;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "IdCopia", referencedColumnName="IdCopia")
	private Copia copias;
	@Column
	private int maxDias=30;
	@Column
	private Date diaSacado = new Date();
	@ManyToOne()
	@JoinColumn(name = "nSocio")
	private Lector lector;
	
	public Prestamo(Copia copias) {
		super();
		this.fechaInicio = diaSacado;
		this.copias = copias;
	}
	public Prestamo() {
		super();
	}
	
	
	public Date getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public Date getFechaFin() {
		return fechaFin;
	}


	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}


	public Copia getCopias() {
		return copias;
	}


	public void setCopias(Copia copias) {
		this.copias = copias;
	}


	public int getMaxDias() {
		return maxDias;
	}


	public void setMaxDias(int maxDias) {
		this.maxDias = maxDias;
	}


	public Date getDiaSacado() {
		return diaSacado;
	}


	public void setDiaSacado(Date diaSacado) {
		this.diaSacado = diaSacado;
	}


	public Lector getLectorDePrestamo() {
		return lector;
	}


	public void setLectorDePrestamo(Lector lectorDePrestamo) {
		this.lector = lectorDePrestamo;
	}


	@Override
	public String toString() {
		return "Prestamo [fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", copias=" + copias + ", maxDias="
				+ maxDias + ", diaSacado=" + diaSacado + ", lectorDePrestamo=" + lector + "]";
	}




}