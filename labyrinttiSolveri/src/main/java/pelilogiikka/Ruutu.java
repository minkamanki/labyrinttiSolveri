/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelilogiikka;

import tietorakenteet.TaulukkoLista;

/**
 * Luokassa on Ruutu olion tiedot.
 *
 * @author tminka
 */
public class Ruutu {

    private TaulukkoLista naapurit;
    private boolean valittu;
    private boolean maali;
    private boolean visited;
    private boolean reitti;

    /**
     * Konstruktori.
     *
     */
    public Ruutu() {
        visited = false;
        reitti = false;
        naapurit = new TaulukkoLista(3);
    }

    /**
     * Setteri.
     *
     * @param lahto Alku kohta
     */
    public void setLahto(boolean lahto) {
        this.valittu = lahto;
    }

    /**
     * Setteri.
     *
     * @param maali loppu kohta
     */
    public void setMaali(boolean maali) {
        this.maali = maali;
    }

    /**
     * Getteri.
     *
     * @return onko lähtökohta
     */
    public boolean isValittu() {
        return valittu;
    }

    /**
     * Getteri.
     *
     * @return onko maali
     */
    public boolean isMaali() {
        return maali;
    }

    /**
     * Lisätään uusi kultuyhteys.
     *
     * @param ruutu uusi naapuri
     */
    public void addNaapurit(Ruutu ruutu) {
        naapurit.lisaa(ruutu);
    }

    /**
     * Metodi kertoo, onko ruuduilla kulkuyhteys toisiinsa.
     *
     * @param ruutu Ruutu
     * @return onko kulkuyhteys
     */
    public boolean isNaapuri(Ruutu ruutu) {
        return naapurit.contains(ruutu);
    }

    /**
     * Metodi kertoo onko tässä ruudussa jo käyty labyrintin luonnin aikana.
     *
     * @return onko käyty
     */
    public boolean isVisited() {
        return visited;
    }

    /**
     * Asetetaan ruutu käydyksi.
     *
     * @param visited käyty
     */
    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    /**
     *Setteri.
     * @param reitti asetetaan reitiksi
     */
    public void setReitti(boolean reitti) {
        this.reitti = reitti;
    }

    /**
     *Onko reitti.
     * @return boolean
     */
    public boolean isReitti() {
        return reitti;
    }

    /**
     *Metodi palauttaa kaikki naapurit.
     * @return kulkuyhteydet
     */
    public Object[] getNaapurit() {
        return naapurit.getLista();
    }

}
