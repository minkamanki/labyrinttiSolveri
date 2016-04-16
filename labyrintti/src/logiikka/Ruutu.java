/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logiikka;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Luokassa on Ruutu olion tiedot.
 *
 * @author tminka
 */
public class Ruutu {

    private List<Ruutu> naapurit;
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
        naapurit = new ArrayList();
    }

    /**
     * Setteri.
     *
     * @param lahto
     */
    public void setLahto(boolean lahto) {
        this.valittu = lahto;
    }

    /**
     * Setteri.
     *
     * @param maali
     */
    public void setMaali(boolean maali) {
        this.maali = maali;
    }

    /**
     * Getteri.
     *
     * @return
     */
    public boolean isValittu() {
        return valittu;
    }

    /**
     * Getteri.
     *
     * @return
     */
    public boolean isMaali() {
        return maali;
    }

    /**
     * Lisätään uusi kultuyhteys.
     *
     * @param ruutu
     */
    public void addNaapurit(Ruutu ruutu) {
        naapurit.add(ruutu);
    }

    /**
     * Metodi kertoo, onko ruuduilla kulkuyhteys toisiinsa.
     *
     * @param ruutu
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
     * @param visited
     */
    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setReitti(boolean reitti) {
        this.reitti = reitti;
    }

    public boolean isReitti() {
        return reitti;
    }

    public List<Ruutu> getNaapurit() {
        return naapurit;
    }

}
