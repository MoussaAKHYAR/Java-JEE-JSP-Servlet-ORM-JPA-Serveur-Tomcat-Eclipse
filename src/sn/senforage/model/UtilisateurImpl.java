package sn.senforage.model;

import sn.senforage.entities.Utilisateur;

import java.util.List;

import javax.persistence.EntityManager;

public class UtilisateurImpl implements IUtilisateur {
	private EntityManager em;
    @Override
    public int add(Utilisateur utilisateur) {
        try {
			em.persist(utilisateur);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();		}
		return 0;
    }

    @Override
    public List<Utilisateur> utilisateurs() {
        return null;
    }

	@Override
	public Utilisateur getLogin(String email, String password) {
		// TODO Auto-generated method stub
		 try {
	            return (Utilisateur)em
	                    .createQuery("select u from Utilisateur u where u.email=:e and u.password=:p")
	                    .setParameter("e",email)
	                    .setParameter("p",password)
	                    .getSingleResult();

	        }catch (Exception e)
	        {
	            return null;
	        }
	}
	@Override
	public int delete(int id, Utilisateur utilisateur){
	      try {
	           em.getTransaction().begin();
	           utilisateur = em.find(Utilisateur.class,id);
	           em.remove(utilisateur);
	           em.getTransaction().commit();
	           return 1;
	        }catch (Exception ex)
	        {
	            ex.printStackTrace();
	        }
	        return 0;
	    }
}
