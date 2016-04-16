/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tietorakenteet;

import java.util.HashSet;
import java.util.Set;
import logiikka.Ruutu;

/**
 *
 * @author tminka
 */
public class Solmu {

    private Solmu parent;
    private Set<Solmu> lapset;
    private final Ruutu ruutu;

    public Solmu(Ruutu ruutu) {
        this.ruutu = ruutu;
        lapset = new HashSet();
    }

    public void setParent(Solmu parent) {
        this.parent = parent;
    }

    public Solmu getParent() {
        return parent;
    }

    public Set<Solmu> getLapset() {
        return lapset;
    }

    public Ruutu getRuutu() {
        return ruutu;
    }

    public void setLapset(Solmu lapsi) {
        this.lapset.add(lapsi);
    }
    
    

}
