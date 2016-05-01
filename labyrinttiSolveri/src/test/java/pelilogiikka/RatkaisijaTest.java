/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelilogiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tietorakenteet.Puu;
import tietorakenteet.Solmu;

/**
 *
 * @author tminka
 */
public class RatkaisijaTest {

    private Labyrintti l;
    private Puu puu;
    private Ratkaisija solveri;

    @Before
    public void setUp() {
        l = new Labyrintti(5);
        l.luoLabyrintti();
        puu = new Puu(l.getLabyrintti());
        puu.luoPuu();
        solveri = new Ratkaisija(puu);
        solveri.ratkaiseLabyrintti();

    }



}
