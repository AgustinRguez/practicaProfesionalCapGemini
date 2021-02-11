
import java.util.Date;

public class Lector extends Persona {
	private int nSocio;
	private String telefono;
	private String direccion;
	
	public Lector(int nSocio, String nombre, String telefono,String direccion) {
		super(nombre);
		this.nSocio = nSocio;
		this.telefono = telefono;
		this.direccion = direccion;
	
	}

	public int getnSocio() {
		return nSocio;
	}

	public void setnSocio(int nSocio) {
		this.nSocio = nSocio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void devolver (int nSocioParam, Date fechaParaDevolver) {
		
	}
	public void prestar (int nSocioParam, Date fechaParaPrestar) {
		
	}
	@SuppressWarnings("unused")
	private int multar(int dias) {
		return dias;
	}
	
}
