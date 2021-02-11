package clases;

public class Copia {
	private int id;
	private EstadoCopia estado;
	private Libro libroCopia;
	enum EstadoCopia{
		PRESTADO("P"), RETRASO("R"), BIBLIOTECA("B"), REPARACION("R");

		private EstadoCopia(String abreviatura) {
			this.abreviatura = abreviatura;
		}

		public String getAbreviatura() {
			return abreviatura;
		}

		private String abreviatura;
	}
	public Copia(int id, EstadoCopia estado, Libro libroCopia) {
		this.id = id;
		this.estado = estado;
		this.libroCopia = libroCopia;
	}
	public int getId() {
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
	public Libro getLibroCopia() {
		return libroCopia;
	}
	public void setLibroCopia(Libro libroCopia) {
		this.libroCopia = libroCopia;
	}
	@Override
	public String toString() {
		return "Copia [id=" + id + ", estado=" + estado + ", libroCopia=" + libroCopia + "]";
	}
	

}