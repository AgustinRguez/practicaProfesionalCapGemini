package clases;


import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


public class Lector {
	private int nSocio;
	private String nombre;
	private String telefono;
	private String direccion;
	private Multa multas;
	private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
	
	public Lector(int nSocio,String nombre, String telefono,String direccion) {
		super();
		this.nSocio = nSocio;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.multas = null;

	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	/*public void devolver (Copia copiaADevolver) {
		Copia[] copiasTotales = null;
		Copia copiasADevolverAux = null;
		Prestamo prestamoActivo = null;
		for(int i=0; i<copiasTotales.length; i++) {
			if(copiasTotales[i] == copiaADevolver){
				copiasADevolverAux = copiasTotales[i];
				prestamoActivo = prestamos.get(i);
				copiasTotales = null;
				prestamoActivo = null;
			}
		}
	}*/
	public boolean prestar (int nSocioParam, Date fechaParaPrestar) {
		boolean verificar = false;
		if(multas == null && prestamos.size()<3) {
			verificar = true;
		}
		else if(multas == null || prestamos.size()>=4) {
			System.out.println("Error, mas de 3 copias cargadas");
			verificar = false;
		}
		return verificar;
	}
	@SuppressWarnings("unused")
	private void multar() {
		 this.multas = new Multa(new Date(),new Date(), null);  
	}

	public Multa getMultas() {
		return multas;
	}

	public void setMultas(Multa multas) {
		this.multas = multas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((multas == null) ? 0 : multas.hashCode());
		result = prime * result + nSocio;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((prestamos == null) ? 0 : prestamos.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
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
		Lector other = (Lector) obj;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (multas == null) {
			if (other.multas != null)
				return false;
		} else if (!multas.equals(other.multas))
			return false;
		if (nSocio != other.nSocio)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (prestamos == null) {
			if (other.prestamos != null)
				return false;
		} else if (!prestamos.equals(other.prestamos))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Lector [nSocio=" + nSocio + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion
				+ ", multas=" + multas + ", prestamos=" + prestamos + "]";
	}

	public int generarPrestamos() {
		
		    int contadorId=0;
		    if(contadorId <=3) {
		    	return contadorId++;	
		    }
		    else {
		    	return -1;
		    }
		}
	public void agregarPrestamos(Prestamo prestamoParam) {
		this.prestamos.add(prestamoParam);
	}
	
	public Prestamo tenerUnPrestamoPorIndice(int indice) {
		Prestamo prestamo = prestamos.get(indice);
		return prestamo;
	}
	
	public void borrarPrestamo(int indicePrestamo) {
		Prestamo auxiliarPrestamo = null;
		List<Prestamo> listaPrestamo = new ArrayList<Prestamo>();
		Iterator<Prestamo> iteradorPrestamo = prestamos.iterator();
		while(iteradorPrestamo.hasNext()) {
			auxiliarPrestamo = iteradorPrestamo.next();
			if(auxiliarPrestamo.equals(listaPrestamo.get(indicePrestamo))== false) {
				listaPrestamo.add(auxiliarPrestamo);
			}
		}
		this.prestamos.clear();
		this.prestamos.addAll(listaPrestamo);
	}

}