package com.groupe5.SpringTestMicroservice.model;

public class Product {
    private int id;
    private String nom;

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    private int prix;

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }

    public Product(int id, String nom, int prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ",nom='" + nom + '\'' +
                ",prix=" + prix +
                '}';
    }
}
