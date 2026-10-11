package com.fm_java.entity;

public class Client {
  private Long id;
  private String nom;
  private String prenom;
  private String email;
  private String telephone;

  public Client() {
    super();
  }

  public Client(Long id, String nom, String prenom, String email, String telephone) {
    super();
    this.id = id;
    this.nom = nom;
    this.prenom = prenom;
    this.email = email;
    this.telephone = telephone;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long newId) {
    this.id = newId;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String newNom) {
    this.nom = newNom;
  }

  public String getPrenom() {
    return this.prenom;
  }

  public void setPrenom(String newPrenom) {
    this.prenom = newPrenom;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String newEmail) {
    this.email = newEmail;
  }

  public String getTelephone() {
    return this.telephone;
  }

  public void setTelephone(String newTelephone) {
    this.telephone = newTelephone;
  }
}
