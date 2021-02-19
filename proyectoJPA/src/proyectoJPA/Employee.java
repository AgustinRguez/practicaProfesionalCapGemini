package proyectoJPA;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "empleados")
public class Employee implements Serializable{
	
	@Column(name= "Id") @Id
	private long id;
	@Column(name = "Nombre")
	private String nombre;
	
	public Employee(String nombre) {
		this.nombre = nombre;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
