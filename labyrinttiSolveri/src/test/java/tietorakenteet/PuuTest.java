/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tietorakenteet;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import pelilogiikka.Ruutu;

/**
 *
 * @author tminka
 */
public class PuuTest {

    private Puu puu;
    private Ruutu[][] alue;

    @Before
    public void setUp() {
        alue = new Ruutu[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                alue[i][j] = new Ruutu();
            }
        }

        alue[0][0].addNaapurit(alue[1][0]);
        alue[1][0].addNaapurit(alue[1][1]);
        alue[1][0].addNaapurit(alue[0][1]);

        alue[1][0].addNaapurit(alue[0][0]);
        alue[1][1].addNaapurit(alue[1][0]);
        alue[0][1].addNaapurit(alue[1][0]);
        alue[0][0].setMaali(true);
        puu = new Puu(alue);
    }

    /**
     * Test of luoPuu method, of class Puu.
     */
    @Test
    public void testLuoPuu() {
        puu.luoPuu();
        assertThat(puu.getJuuri().getLapset()[0], not(equalTo(null)));
    }

    /**
     * Test of getJuuri method, of class Puu.
     */
    @Test
    public void testGetJuuri() {
        puu.luoPuu();
        assertEquals(puu.getJuuri().getRuutu().isMaali(), true);
    }

}
