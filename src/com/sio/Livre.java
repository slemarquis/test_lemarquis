package com.sio;

public class Livre {
  // Variables
  private String titre, auteur;
  private int nbPages;
  private double prix;

  // Constructeurs
  public Livre(String unAuteur, String unTitre) {
    auteur = unAuteur;
    titre = unTitre;
  }

  // Accesseur
  public String getAuteur() {
    return auteur;
  }
  public String getTitre() {
    return titre;
  }
  public int getNbPages() {
    return nbPages;
  }

  public double getPrix() {
    return prix;
  }
        
  // Modificateur
  public void setAuteur(String unAuteur) {
    auteur = unAuteur;
  }
  public void setTitre(String unTitre) {
    titre = unTitre;
  }
  public void setNbPages(int n) {
    if (n > 0) {
      nbPages = n;
    }
    else {
      System.err.println("Erreur : nombre de pages n�gatif !");
    }
  }

  public void setPrix(double unPrix) {
    if (unPrix >= 0.0) {
      prix = unPrix;
    }
    else {
      System.err.println("Erreur : prix n�gatif !");
    }
  }

  public String toString() {
    return "Livre de titre " + getTitre() + ", ecrit par "
      + getAuteur() + "\n   " + getNbPages() + " pages et de prix "
      + getPrix() + " F";
  }
   /*
  public static void main(String[] args) {
    Livre l1 = new Livre("Victor Hugo", "Notre Dame de Paris");
    l1.setNbPages(150);
    l1.setPrix(80.0);
    Livre l2 = new Livre("Emile Zola", "La b�te humaine");
    l2.setNbPages(170);
    l2.setPrix(150.0);
    System.out.print("Livre de " + l1.getAuteur());
    System.out.println(" avec " + l1.getNbPages() + " pages.");
    System.out.print("Livre de " + l2.getAuteur());
    System.out.println(" avec " + l2.getNbPages() + " pages.");
    System.out.println(l1);
    System.out.println(l2);
  }
  */
}
