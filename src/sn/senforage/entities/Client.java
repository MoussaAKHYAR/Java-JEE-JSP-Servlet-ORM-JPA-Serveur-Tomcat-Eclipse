package sn.senforage.entities;

import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomDeFamille;
    private String telephone;
    @ManyToOne
    private Village village = new Village();
    @ManyToOne
    private User user = new User();
    
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private String adresse;

    public Client() {
    }

    public Client(int id, String nomDeFamille, String telephone, Village village, String adresse) {
        this.id = id;
        this.nomDeFamille = nomDeFamille;
        this.telephone = telephone;
        this.village = village;
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDeFamille() {
        return nomDeFamille;
    }

    public void setNomDeFamille(String nomDeFamille) {
        this.nomDeFamille = nomDeFamille;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Village getVillage() {
        return village;
    }

    public void setVillage(Village village) {
        this.village = village;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}