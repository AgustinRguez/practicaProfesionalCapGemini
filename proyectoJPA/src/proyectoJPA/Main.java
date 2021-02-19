package proyectoJPA;
import java.sql.*;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class Main {

	public static void main(String[] args) {
		Connection conexion = null;
		Statement sentenciaSQL = null;
		ResultSet resultado = null;
		
		try {
			
			Class.forName("org.postgresql.Driver"); 
			
			   String url = "jdbc:postgresql://localhost:5432/CURSO";
				conexion = DriverManager.getConnection(url, "postgres", "root");
				System.out.println("Conexion hecha");
				
		} catch (Exception e) {
			
		}
		EntityManagerFactory miFactory = Persistence.createEntityManagerFactory("ejsHibernate");
		EntityManager manager = miFactory.createEntityManager();
		Employee empleados = new Employee("AGUSTIN");
		Employee empleadosDos = new Employee("EZEQUIEL");
		Employee empleadosTres = new Employee("CLAUDIA");
		
		/*manager.getTransaction().begin();
		//manager.persist(empleados);
		manager.persist(empleadosDos);    //sin el EntityTransaction
		manager.persist(empleadosTres);
		manager.getTransaction().commit();*/
		
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
		//manager.persist(empleados);
		manager.persist(empleadosDos);
		manager.persist(empleadosTres);
		tran.commit();

		
		List<Employee> empleadoList = manager.createQuery("FROM Employee").getResultList(); //hacer un select
		for (Employee employee : empleadoList) {
			System.out.println("\nEsta " +employee.toString()); 
			manager.close();
		}
				
	
		
	}
		
}

