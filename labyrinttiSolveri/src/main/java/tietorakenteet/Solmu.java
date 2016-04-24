/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tietorakenteet;

import pelilogiikka.Ruutu;

/**
 * Puun solmua kuvaava luokka.
 *
 * @author tminka
 */
public class Solmu {

    private Solmu parent;
    private TaulukkoLista lapset;
    private final Ruutu ruutu;

    /**
     * Konstruktoriin annetaan ruutu, jota solmu kuvaa.
     *
     * @param ruutu solmua vastaava ruutu
     */
    public Solmu(Ruutu ruutu) {
        this.ruutu = ruutu;
        lapset = new TaulukkoLista(3);
    }

    /**
     * Asettetaan solmun parent solmu.
     *
     * @param parent solmun vanhempi
     */
    public void setParent(Solmu parent) {
        this.parent = parent;
    }

    /**
     * Getteri.
     *
     * @return parent
     */
    public Solmu getParent() {
        return parent;
    }

    /**
     * Palautettaan lapset.
     *
     * @return solmun lapset
     */
    public Object[] getLapset() {
        return lapset.getLista();
    }

    /**
     * Palautettaan solmun ruutu.
     *
     * @return oma ruutu
     */
    public Ruutu getRuutu() {
        return ruutu;
    }

    /**
     * Asetetaan uusi lapsi.
     *
     * @param lapsi uusi lapsi
     */
    public void setLapset(Solmu lapsi) {
        this.lapset.lisaa(lapsi);
    }

}
