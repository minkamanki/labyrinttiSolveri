/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tietorakenteet;

import pelilogiikka.Ruutu;

/**
 * Luokassa luodaan Solmu olioista labyrintin mukainen puu.
 *
 * @author tminka
 */
public class Puu {

    private Ruutu[][] ruudut;
    private Solmu juuri;

    /**
     * Konstruktori.
     *
     * @param alue Labyrintin ruudut
     */
    public Puu(Ruutu[][] alue) {
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
     * Puun juuri.
     *
     * @return Solmu juuri
     */
    public Solmu getJuuri() {
        return juuri;
    }

}
