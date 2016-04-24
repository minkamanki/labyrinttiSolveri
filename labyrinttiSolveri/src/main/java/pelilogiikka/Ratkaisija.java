/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelilogiikka;

import tietorakenteet.Solmu;

/**
 * Luokka joka ratkaisee reitin ja luo myös puun.
 *
 * @author tminka
 */
public class Ratkaisija {

    Ruutu[][] ruudut;
    private Solmu juuri;

    /**
     * Konstruktori.
     *
     * @param alue ruudut labyrintista
     */
    public Ratkaisija(Ruutu[][] alue) {
        ruudut = alue;
    }

    /**
     * Metodi luo puun annetussta taulukosta.
     */
    public void luoPuu() {
        juuri = new Solmu(ruudut[0][0]);


        for (Object naapurit : juuri.getRuutu().getNaapurit()) {
            if (naapurit != null) {
                Solmu lapsi = new Solmu((Ruutu) naapurit);
                juuri.setLapset(lapsi);
                lapsi.setParent(juuri);
                luoSolmu(lapsi);
            }
        }

//        puu.tulosta(puu.getJuuri(), 1);
    }

    /**
     * Luodaan puuhun solmuja rekursiolla.
     *
     * @param solmu saatu solmu
     */
    public void luoSolmu(Solmu solmu) {
        for (Object naapurit : solmu.getRuutu().getNaapurit()) {
            if (naapurit != null && !naapurit.equals(solmu.getParent().getRuutu())) {
                Solmu lapsi = new Solmu((Ruutu) naapurit);
                solmu.setLapset(lapsi);
                lapsi.setParent(solmu);
                luoSolmu(lapsi);
            }
        }

    }

    /**
     *Aloitetaan maalin etsintä juuresta.
     */
    public void ratkaiseLabyrintti() {
        etsiMaali(juuri);

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
