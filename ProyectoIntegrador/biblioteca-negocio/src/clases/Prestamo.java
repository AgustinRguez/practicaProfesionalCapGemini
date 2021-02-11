package clases;

import java.util.Date;

public class Prestamo {
	private Lector lector;
	private Copia copia;
	private Date fechaInicio;
	private Date fechaFin;
	public Prestamo(Lector lector, Copia copia,Date fechaInicio) {
		this.lector = lector;
		this.copia = copia;
		this.fechaInicio = fechaInicio;
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
	public Lector getLector() {
		return lector;
	}
	public void setLector(Lector lector) {
		this.lector = lector;
	}
	public Copia getCopia() {
		return copia;
	}
	public void setCopia(Copia copia) {
		this.copia = copia;
	}


}