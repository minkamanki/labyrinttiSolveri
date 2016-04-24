/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrintti;

import org.junit.Test;
import pelilogiikka.Labyrintti;
import pelilogiikka.Ratkaisija;

/**
 *
 * @author tminka
 */
public class LabyrinttiPeliTest {

    private Labyrintti l;


    @Test(timeout = 100)
    public void kokoHoito() {
        l = new Labyrintti(40);
        l.luoLabyrintti();
        Ratkaisija solveri = new Ratkaisija(l.getLabyrintti());
        solveri.luoPuu();
        solveri.ratkaiseLabyrintti();
    }

}
