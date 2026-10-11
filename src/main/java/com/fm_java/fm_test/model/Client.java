package com.fm_java.fm_test.model;

public class Client {
    private long id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;

    public Client() {}

    public Client(String nom, String prenom, String email, String telephone) {
        this.telephone = telephone;
        this.email = email;
        this.prenom = prenom;
        this.nom = nom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
