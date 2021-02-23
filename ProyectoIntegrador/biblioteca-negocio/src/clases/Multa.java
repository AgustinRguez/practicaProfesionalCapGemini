package clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


import javax.persistence.Id;


public class Multa {
	private long Id;
	private Date fechaInicio;
	private Date fechaFinal;
	private Lector lector;
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	
	public Multa(Date fechaInicio,Date fechaFinal,Lector multaLector) {
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.lector = multaLector;
	}
	
	public Multa(Date fInicio, int dias) throws ParseException {
		this.fechaInicio = fInicio;
		this.fechaFinal = sumarDiasFecha(fInicio, dias);
	}
	
	public Multa() {
		super();
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Lector getLectorDeMulta() {
		return lector;
	}

	public void setLectorDeMulta(Lector lectorDeMulta) {
		this.lector= lectorDeMulta;
	}
	public int diasDif(Date inicio, Date fin) {
	    long startTime = inicio.getTime();
	    long endTime = fin.getTime();
	    long diffTime = endTime - startTime;
	    return (int)TimeUnit.DAYS.convert(diffTime, TimeUnit.MILLISECONDS);
	}
	
	 public Date sumarDiasFecha(Date fecha, int dias) throws ParseException{

	      Calendar calendar = Calendar.getInstance();

	      calendar.setTime(fecha); 

	      calendar.add(Calendar.DAY_OF_YEAR, dias); 

	      String tmp = dateFormat.format(calendar.getTime());  
	      return dateFormat.parse(tmp);
	 }	
}