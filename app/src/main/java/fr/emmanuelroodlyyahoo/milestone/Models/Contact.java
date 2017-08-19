package fr.emmanuelroodlyyahoo.milestone.Models;

/**
 * Created by Emmanuel Roodly on 19/08/2017.
 */

public class Contact {

    private String nom;
    private String prenom;
    private int tel;
    private String email;


    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }



    public Contact(String nom, String prenom, int tel, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.email = email;
    }

    //constructeur test
    public Contact() {
        this.nom = "Roodly";
        this.prenom = "Emmanuel";
        this.tel = 37396810;
        this.email = "emmanuelroodly@yahoo.fr";
    }
}
