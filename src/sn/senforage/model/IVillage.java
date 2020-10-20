package sn.senforage.model;

import sn.senforage.entities.Village;

import java.util.List;

public interface IVillage {
    public int add(Village village);
    public List<Village> villages();
    public int delete(int id, Village village);
    public Village getVillageByName(String nomVillage);
    public Village get(int id);
}
