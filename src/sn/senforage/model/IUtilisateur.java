package sn.senforage.model;

import sn.senforage.entities.Utilisateur;

import java.util.List;

public interface IUtilisateur {
    public int add(Utilisateur utilisateur);
    public List<Utilisateur> utilisateurs();
    public Utilisateur getLogin(String email, String password);
    public int delete(int id, Utilisateur utilisateur);
}
