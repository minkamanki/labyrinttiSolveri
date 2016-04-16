/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logiikka;

import java.util.Set;
import tietorakenteet.Puu;
import tietorakenteet.Solmu;

/**
 * Luokka joka ratkaisee reitin
 *
 * @author tminka
 */
public class Ratkaisija {

    Ruutu[][] ruudut;
    private Puu puu;

    public Ratkaisija(Ruutu[][] alue) {
        ruudut = alue;
    }

    public void luoPuu() {
        Solmu juuri = new Solmu(ruudut[0][0]);
        puu.setSolmu(juuri);
        for (Ruutu ruutu : ruudut[0][0].getNaapurit()) {
            Solmu lapsi = new Solmu(ruutu);
            juuri.setLapset(lapsi);
            lapsi.setParent(juuri);
            luoSolmu(lapsi);
        }
    }

    public void luoSolmu(Solmu solmu) {
        for (Ruutu ruutu : ruudut[0][0].getNaapurit()) {
            if (solmu.getParent().getRuutu() != ruutu) {
                Solmu lapsi = new Solmu(ruutu);
                solmu.setLapset(lapsi);
                lapsi.setParent(solmu);
                luoSolmu(lapsi);
            }

        }
    }
}
