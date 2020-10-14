package sn.senforage.model;

import sn.senforage.entities.Village;

import java.util.List;

public interface IVillage {
    public int add(Village village);
    public List<Village> villages();
}
