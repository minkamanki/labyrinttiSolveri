/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelilogiikka;

import tietorakenteet.Puu;
import tietorakenteet.Solmu;

/**
 * Luokka joka ratkaisee reitin labyrintissä puun avulla.
 *
 * @author tminka
 */
public class Ratkaisija {

    private Puu puu;

    /**
     * Konstruktori.
     *
     * @param puu Solmuja sisältävä puu
     */
    public Ratkaisija(Puu puu) {
        this.puu = puu;
    }

    /**
     * Aloitetaan maalin etsintä juuresta.
     */
    public void ratkaiseLabyrintti() {
        etsiMaali(puu.getJuuri());

    }

    private void etsiMaali(Solmu solmu) {
        if (solmu != null) {
            if (solmu.getRuutu().isMaali()) {
                teeReitti(solmu);
            } else {
                for (Object lapsi : solmu.getLapset()) {
                    etsiMaali((Solmu) lapsi);
                }
            }
        }

    }

    private void teeReitti(Solmu solmu) {
        if (solmu != null) {
            solmu.getRuutu().setReitti(true);
            teeReitti(solmu.getParent());
        }
    }

}
