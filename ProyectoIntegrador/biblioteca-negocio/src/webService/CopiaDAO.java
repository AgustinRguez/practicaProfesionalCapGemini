package webService;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import clases.Copia;
import clases.Lector;

public class CopiaDAO {
		EntityManagerFactory miFactory = Persistence.createEntityManagerFactory("ejsHibernate");
		EntityManager manager = miFactory.createEntityManager();
		EntityTransaction tran = manager.getTransaction();

		public void agregarCopia(Copia copias) {
			
			tran.begin();
			manager.persist(copias);

			tran.commit();
			manager.close();
		}
		public void agregarCopia(Lector lectores) {
					
			tran.begin();
			manager.persist(lectores);
		
			tran.commit();
			manager.close();
		}
		public ArrayList<Copia> consultarCopias() {
			ArrayList<Copia> copias = new ArrayList<Copia>();
			javax.persistence.Query query = manager.createNamedQuery("FROM Copia");
			List resultado = query.getResultList();
			copias.addAll(resultado);
			return copias;
			
			}
			/*List<Copia> copiaList = manager.createQuery("FROM Copia").getResultList(); //hacer un select
			for (Copia copias : copiaList) {
				System.out.println("\nEsta " +copias.toString()); 
				manager.close();*/
		
		public ArrayList<Lector> consultarLectores() {
			ArrayList<Lector> lector = new ArrayList<Lector>();
			javax.persistence.Query query = manager.createNamedQuery("FROM Lector");
			List resultado = query.getResultList();
			lector.addAll(resultado);
			return lector;
			
			}
}
