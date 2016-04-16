/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tietorakenteet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import logiikka.Ruutu;

/**
 *
 * @author tminka
 */
public class Puu {

    private final List<Solmu> solmut;

    public Puu() {
        solmut = new ArrayList();
    }

    public Solmu getSolmu(Ruutu ruutu) {

        for (Solmu s : solmut) {
            if (s.getRuutu() == ruutu) {
                return s;
            }
        }
        
        //jälkimmäisen ei pitäisi ikinä tapahtua
        Solmu x = new Solmu(ruutu);
        return x;
    }

    public void setSolmu(Solmu solmu) {
        this.solmut.add(solmu);
    }

}
