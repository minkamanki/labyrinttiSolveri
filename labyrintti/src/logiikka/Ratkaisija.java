/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logiikka;

import tietorakenteet.Puu;
import tietorakenteet.Solmu;

/**
 * Luokka joka ratkaisee reitin ja luo myös puun.
 *
 * @author tminka
 */
public class Ratkaisija {

    Ruutu[][] ruudut;
    private Puu puu;

    /**
     *Konstruktori.
     * @param alue
     */
    public Ratkaisija(Ruutu[][] alue) {
        ruudut = alue;
        puu = new Puu();
    }

    /**
     *Metodi luo puun annetussta taulukosta.
     */
    public void luoPuu() {
        Solmu juuri = new Solmu(ruudut[0][0]);
        puu.setjuuri(juuri);
        
        for (int i = 0; i < juuri.getRuutu().getNaapurit().length; i++) {
            if(juuri.getRuutu().getNaapurit()[i] != null){
                Solmu lapsi = new Solmu((Ruutu) juuri.getRuutu().getNaapurit()[i]);
                juuri.setLapset(lapsi);
                lapsi.setParent(juuri);
                luoSolmu(lapsi);
            }
        }
        
    
    }

    /**
     *Luodaan puuhun solmuja rekursiolla.
     * @param solmu
     */
    public void luoSolmu(Solmu solmu) {
        for (int i = 0; i < solmu.getRuutu().getNaapurit().length; i++) {
            if(solmu.getRuutu().getNaapurit()[i] != null && !solmu.getRuutu().getNaapurit()[i].equals(solmu.getParent().getRuutu())){
                Solmu lapsi = new Solmu((Ruutu) solmu.getRuutu().getNaapurit()[i]);
                solmu.setLapset(lapsi);
                lapsi.setParent(solmu);
                luoSolmu(lapsi);
            }
        }

    }
    
 
}
