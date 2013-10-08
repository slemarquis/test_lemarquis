package com.sio;

public class Etagere {
  private Livre[] livres;
  private int nbLivres = 0; // nbre de livres qu'il y a dans l'�tag�re

  public Etagere(int nb) {
    livres = new Livre[nb];
  }

  public int getNbLivres() {
    return nbLivres;
  }

  public int getNbLivresMax() {
    return livres.length;
  }

  /**
   * Renvoie le livre plac� sur l'�tag�re dans la position indiqu�e.
   * La position du 1er livre est 1 (pas 0).
   * Renvoie <code>null</code> s'il n'y a pas de livre � cette position
   */
  public Livre getLivre(int position) {
    if (position > 0 && position <= nbLivres) {
      return livres[position - 1];
    }
    else {
      return null;
    }
  }

  public void ajouter(Livre l) throws EtagerePleineException{
    //if (nbLivres < livres.length) {
      try{
        livres[nbLivres] = l;
        nbLivres++;
      }catch(Exception e){
          throw new EtagerePleineException(this);
      }
    //}
    //else {
      //System.err.println("Etagere ("+this.getNbLivresMax()+" livres maxi) pleine pour le livre "+l.getTitre());
    //}
  }

  public Livre enlever(int position) {
    int indice = position - 1;
    if (indice >= 0 && indice < nbLivres) {
      Livre livreEnleve = livres[indice];
      nbLivres--;
      // On tasse les livres
      for ( ; indice < nbLivres; indice++) {
    	  livres[indice] = livres[indice + 1];
      }
      return livreEnleve;
    }
    else {
      return null;
    }
  }

  public Livre enlever(String titre, String auteur) {
    return enlever(cherche(titre, auteur));
  }

  /**
   * Renvoie la position du livre cherch� sur l'�tag�re
   * ou 0 si le livre n'y est pas.
   * La position du 1er livre est 1 (pas 0)
   */
  public int cherche(String titre, String auteur) {
    int indice = 0;
    boolean trouve = false;
    while (! trouve && indice < nbLivres) {
      if (livres[indice].getTitre().equals(titre)
	  && livres[indice].getAuteur().equals(auteur)) {
	return indice + 1;
      }
      else {
	indice++;
      }
    }
    return 0;
  }

  public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("Etagere avec " + nbLivres + " sur " + livres.length + "\n");
    for (int i = 0; i < nbLivres; i++) {
      sb.append("   " + livres[i] + "\n");
    }
    return new String(sb);
  }
/*
  public static void main(String[] args) {
    Livre l1 = new Livre("a1", "t1");
    l1.setNbPages(200);
    l1.setPrix(239.50);
    Livre l2 = new Livre("a2", "t2");
    l2.setNbPages(250);
    l2.setPrix(140);
    Livre l3 = new Livre("a3", "t3");    
    l1.setNbPages(300);
    l1.setPrix(159.50);
    Livre l4 = new Livre("a1", "t4");
    Livre l5 = new Livre("a1", "t1");
    Livre l6 = new Livre("a2", "t5");
    Etagere etagere1 = new Etagere(2);
    Etagere etagere2 = new Etagere(3);

	etagere1.ajouter(l1);
	etagere1.ajouter(l2);
	etagere1.ajouter(l3);
	etagere2.ajouter(l1);
	etagere2.ajouter(l4);
	etagere2.ajouter(l5);
  }
  */
}
    

    
    
