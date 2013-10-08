package com.sio;

public class Main {

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

        try{
            etagere1.ajouter(l1);
            etagere1.ajouter(l2);
            etagere1.ajouter(l3);
            etagere2.ajouter(l1);
            etagere2.ajouter(l4);
            etagere2.ajouter(l5);
        }catch(EtagerePleineException e){
            e.printStackTrace();
        }
    }
}
