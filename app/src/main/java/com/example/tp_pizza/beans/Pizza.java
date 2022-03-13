package com.example.tp_pizza.beans;

public class Pizza {
    private  int id;
    private String nom;
    private int nbIngredients;
    private int photo;
    private String duree;
    private String detaisIngred;
    private String desc;
    private String preparation;

    private static int comp;

    public Pizza() {
    }

    public Pizza( String nom, int nbIngredients, int photo,String duree,String detaisIngred, String desc,String preparation) {
        this.id = ++comp;
        this.nom = nom;
        this.nbIngredients = nbIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detaisIngred = detaisIngred;
        this.desc = desc;
        this.preparation = preparation;

    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbIngredients() {
        return nbIngredients;
    }

    public void setNbIngredients(int nbIngredients) {
        this.nbIngredients = nbIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getDetaisIngred() {
        return detaisIngred;
    }

    public void setDetaisIngred(String detaisIngred) {
        this.detaisIngred = detaisIngred;
    }


    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public static int getComp() {
        return comp;
    }

    public static void setComp(int comp) {
        Pizza.comp = comp;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbIngredients=" + nbIngredients +
                ", photo=" + photo +
                ", desc='" + desc + '\'' +
                ", preparation='" + preparation + '\'' +
                '}';
    }
}
