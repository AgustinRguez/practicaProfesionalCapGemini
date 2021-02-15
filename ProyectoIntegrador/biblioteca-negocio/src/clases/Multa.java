package clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Multa {
	private Date fechaInicio;
	private Date fechaFinal;
	private Lector lectorDeMulta;
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	
	public Multa(Date fechaInicio,Date fechaFinal,Lector multaLector) {
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.lectorDeMulta = multaLector;
	}
	public Multa(Date fInicio, int dias) throws ParseException {
		this.fechaInicio = fInicio;
		this.fechaFinal = sumarDiasFecha(fInicio, dias);
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
		return lectorDeMulta;
	}

	public void setLectorDeMulta(Lector lectorDeMulta) {
		this.lectorDeMulta = lectorDeMulta;
	}
	
	public int diasDif(Date inicio, Date fin) {
	    long startTime = inicio.getTime();
	    long endTime = fin.getTime();
	    long diffTime = endTime - startTime;
	    return (int)TimeUnit.DAYS.convert(diffTime, TimeUnit.MILLISECONDS);
	}
	
	 public Date sumarDiasFecha(Date fecha, int dias) throws ParseException{

	      Calendar calendar = Calendar.getInstance();

	      calendar.setTime(fecha); // Configuramos la fecha que se recibe

	      calendar.add(Calendar.DAY_OF_YEAR, dias);  // numero de días a añadir, o restar en caso de días<0

	      String tmp = dateFormat.format(calendar.getTime());  
	      return dateFormat.parse(tmp);
	 }
}