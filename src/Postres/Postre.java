/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author Jorge
 */
public class Postre {
    protected String sabor;
    protected double precioParcial;
    protected ArrayList<Aderezo> aderezos;
    
    public Postre(String sabor){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
    }
    
    public double getPrecioParcial(){
        return this.precioParcial;
    }
    
    
    public void addAderezos(Aderezo aderezo){
        this.aderezos.add(aderezo);
    }
    
    public void removeAderezos(Aderezo aderezo){
        this.aderezos.remove(aderezo);
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    
}
