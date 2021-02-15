package clases;
import java.util.Date;

public class Prestamo {
	private Date fechaInicio;
	private Date fechaFin;
	private Copia copias;
	private int maxDias=30;
	private Date diaSacado = new Date();
	public Prestamo(Copia copias) {
		super();
		this.fechaInicio = diaSacado;
		this.copias = copias;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}
	@Override
	public String toString() {
		return "Prestamo [fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", copias=" + copias + ", maxDias="
				+ maxDias + ", DiaSacado=" + diaSacado + "]";
	}


}