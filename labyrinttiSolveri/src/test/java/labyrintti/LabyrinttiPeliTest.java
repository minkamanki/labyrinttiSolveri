/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrintti;

import org.junit.Test;
import pelilogiikka.Labyrintti;
import pelilogiikka.Ratkaisija;
import tietorakenteet.Puu;

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
        Puu puu = new Puu(l.getLabyrintti());
        puu.luoPuu();
        Ratkaisija solveri = new Ratkaisija(puu);
        solveri.ratkaiseLabyrintti();
    }

    @Test(timeout = 100)
    public void kokoHoitoIsompi() {
        l = new Labyrintti(80);
        l.luoLabyrintti();
        Puu puu = new Puu(l.getLabyrintti());
        puu.luoPuu();
        Ratkaisija solveri = new Ratkaisija(puu);
        solveri.ratkaiseLabyrintti();
    }

    @Test(timeout = 100)
    public void kokoHoitoIsoin() {
        l = new Labyrintti(100);
        l.luoLabyrintti();
        Puu puu = new Puu(l.getLabyrintti());
        puu.luoPuu();
        Ratkaisija solveri = new Ratkaisija(puu);
        solveri.ratkaiseLabyrintti();
    }

}
