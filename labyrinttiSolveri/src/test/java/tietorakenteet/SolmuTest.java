/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tietorakenteet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pelilogiikka.Ruutu;

/**
 *
 * @author tminka
 */
public class SolmuTest {

    private Solmu apuSolmu;
    private Solmu solmu;
    private Ruutu ruutu;
    private Ruutu ruutu2;

    @Before
    public void setUp() {
        solmu = new Solmu(ruutu);
        apuSolmu = new Solmu(ruutu2);
    }

    /**
     * Test of setParent method, of class Solmu.
     */
    @Test
    public void testParent() {
        solmu.setParent(apuSolmu);
        assertEquals(solmu.getParent(), apuSolmu);
    }



    /**
     * Test of getLapset method, of class Solmu.
     */
    @Test
    public void testLapset() {
        solmu.setLapset(apuSolmu);
        assertEquals(solmu.getLapset()[0].equals(apuSolmu) ,true);
    }

    /**
     * Test of getRuutu method, of class Solmu.
     */
    @Test
    public void testGetRuutu() {
        assertEquals(ruutu, solmu.getRuutu());
    }



}
