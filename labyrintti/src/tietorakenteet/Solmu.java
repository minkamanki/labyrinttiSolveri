/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tietorakenteet;

import logiikka.Ruutu;

/**
 *Puun solmua kuvaava luokka.
 * @author tminka
 */
public class Solmu {

    private Solmu parent;
    private taulukkoLista lapset;
    private final Ruutu ruutu;

    /**
     *Konstruktoriin annetaan ruutu, jota solmu kuvaa.
     * @param ruutu
     */
    public Solmu(Ruutu ruutu) {
        this.ruutu = ruutu;
        lapset = new taulukkoLista(3);
    }

    /**
     *Asettetaan solmun parent solmu.
     * @param parent
     */
    public void setParent(Solmu parent) {
        this.parent = parent;
    }

    /**
     *getteri
     * @return parent
     */
    public Solmu getParent() {
        return parent;
    }

    /**
     *palautettaan lapset.
     * @return
     */
    public Object[] getLapset() {
        return lapset.getLista();
    }

    /**
     *Palautettaan solmun ruutu.
     * @return
     */
    public Ruutu getRuutu() {
        return ruutu;
    }

    /**
     *Asetetaan uusi lapsi.
     * @param lapsi
     */
    public void setLapset(Solmu lapsi) {
        this.lapset.lisaa(lapsi);
    }

    

}
