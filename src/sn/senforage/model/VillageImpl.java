package sn.senforage.model;

import sn.senforage.entities.User;
import sn.senforage.entities.Village;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class VillageImpl implements IVillage {
	private EntityManager em;

	public VillageImpl() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("senforagePU");

		em = emf.createEntityManager();
	}
	@Override
	public int add(Village village) {
		try {
			em.getTransaction().begin();
			em.persist(village);
			em.getTransaction().commit();
			return 1;
		}catch (Exception ex){
			ex.printStackTrace();
			return  0;
		}
	}

	@Override
	public List<Village> villages() {
		return em.createQuery("SELECT v FROM Village v").getResultList();
	}

	@Override
	public Village getVillageByName(String nomVillage) {
		// TODO Auto-generated method stub
		try {

			Village village = (Village) em
					.createQuery("select v from Village v where v.nomVillage=:n")
					.setParameter("n",nomVillage)
					.getSingleResult();
			return village;

		}catch (Exception e)
		{
			return null;
		}
	}
}
