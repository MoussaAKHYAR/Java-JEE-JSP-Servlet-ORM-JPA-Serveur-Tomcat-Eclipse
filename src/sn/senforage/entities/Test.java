package sn.senforage.entities;

import sn.senforage.model.IUser;
import sn.senforage.model.UserImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IUser iUtilisateur= new UserImpl();
		User u = new User();
		
		u.setEmail("amrane@simplon.com");
		u.setNom("AKHYAR");
		u.setPrenom("Moussa");
		u.setPassword("passer");
		iUtilisateur.add(u);
	}

}
