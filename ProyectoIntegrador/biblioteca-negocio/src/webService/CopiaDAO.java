package webService;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import clases.Copia;

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
		
		public List<Copia> consultarCopias() {
			List<Copia> copia = manager.createQuery("FROM Copia").getResultList();
			for(Copia copiaList : copia) {
				System.out.println("\nEsta " + copia.toString());
			}
			return copia;
			/*List<Copia> copiaList = manager.createQuery("FROM Copia").getResultList(); //hacer un select
			for (Copia copias : copiaList) {
				System.out.println("\nEsta " +copias.toString()); 
				manager.close();*/
		}
	
}
