package sn.senforage.entities;

import sn.senforage.model.IVillage;
import sn.senforage.model.VillageImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IVillage iVillage = new VillageImpl();
		Village village = new Village();
		
		village.setNomVillage("Kakony");
		int ok = iVillage.add(village);
	}

}
