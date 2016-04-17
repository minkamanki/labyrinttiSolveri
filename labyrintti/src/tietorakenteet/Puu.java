/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tietorakenteet;


import logiikka.Ruutu;

/**
 *Puun tietorakenne.
 * @author tminka
 */
public class Puu {

    private Solmu juuri;


    /**
     *Etsitääb solmu, johon kyseinen ruutu viittaa.
     * @param ruutu
     * @return etsitty solmu
     */
    public Solmu getSolmu(Ruutu ruutu) {
        if (juuri.getRuutu() == ruutu) {
            return juuri;
        }
        for (Object solmu : juuri.getLapset()) {
            return etsiSolmu((Solmu) solmu, ruutu);
        }
        return null;

    }

    /**
     *Asetetaan puulle juuri.
     * @param solmu
     */
    public void setjuuri(Solmu solmu) {
        this.juuri = solmu;
    }

    private Solmu etsiSolmu(Solmu solmu, Ruutu ruutu) {
        if (solmu.getLapset() != null) {
            if (solmu.getRuutu() == ruutu) {
                return solmu;
            } else {
                for (Object lapsi : solmu.getLapset()) {
                    return etsiSolmu((Solmu) lapsi, ruutu);
                }
            }
        }

        return null;
    }

}
