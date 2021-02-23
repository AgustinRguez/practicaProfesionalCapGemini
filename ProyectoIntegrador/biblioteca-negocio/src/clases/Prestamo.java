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


public class Prestamo {
	private long Id;
	private Date fechaInicio;
	private Date fechaFin;
	private Copia copias;
	private int maxDias=30;
	private Date diaSacado = new Date();
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