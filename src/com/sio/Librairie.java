package com.sio;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Eric
 * Date: 30/09/13
 * Time: 20:25
 * To change this template use File | Settings | File Templates.
 */
public class Librairie {
    private ArrayList<Etagere> listeEtageres;
    public Librairie(){
        listeEtageres = new ArrayList<Etagere>();
        Etagere e = new Etagere(3);
        listeEtageres.add(e);
    }

    public void ajouterLivre(Livre l){
        try{
            Etagere e = this.listeEtageres.get(this.listeEtageres.size()-1);
            e.ajouter(l);
        }catch(EtagerePleineException ex){
            Etagere e = new Etagere(3);
            try{
                e.ajouter(l);
                this.listeEtageres.add(e);
            }catch(Exception exp){
                exp.printStackTrace();
            }
        }
    }

    public void afficherContenu(){
        for (int i = 0; i < this.listeEtageres.size(); i++){
            Etagere e = this.listeEtageres.get(i);
            System.out.print(e.toString());
        }
    }

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

        Librairie lib = new Librairie();
        lib.ajouterLivre(l1);
        lib.ajouterLivre(l2);
        lib.ajouterLivre(l3);
        lib.ajouterLivre(l4);
        lib.ajouterLivre(l5);
        lib.ajouterLivre(l6);

        lib.afficherContenu();
    }
}
