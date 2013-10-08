package com.sio;

/**
 * Created with IntelliJ IDEA.
 * User: Eric
 * Date: 30/09/13
 * Time: 20:22
 * To change this template use File | Settings | File Templates.
 */
public class EtagerePleineException extends Exception {
    private Etagere etag;
    public EtagerePleineException(Etagere e){
        super("L'étagère est pleine, elle ne peut contenir que " + e.getNbLivresMax() + " livres");
        this.etag = e;
    }
}
