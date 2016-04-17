/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logiikka;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testi luokka.
 *
 * @author tminka
 */
public class LabyrinttiTest {

    private Labyrintti labyrintti;

    /**
     *
     */
    @Before
    public void setUp() {
        labyrintti = new Labyrintti(10);
    }

    /**
     *
     */
    @Test
    public void alueenKoko() {
        labyrintti.luoLabyrintti();
        assertEquals(10, labyrintti.getLabyrintti().length);
    }

    /**
     *
     */
    @Test
    public void getKoko() {
        assertEquals(10, labyrintti.getKoko());
    }

    /**
     *
     */
    @Test
    public void sallittu1() {
        assertEquals(true, labyrintti.sallittu(0, 0));
    }

    /**
     *
     */
    @Test
    public void sallittu2() {
        assertEquals(false, labyrintti.sallittu(-1, 1));
    }

    /**
     *
     */
    @Test
    public void sallittu3() {
        assertEquals(false, labyrintti.sallittu(1, -1));
    }

    /**
     *
     */
    @Test
    public void sallittu4() {
        assertEquals(false, labyrintti.sallittu(10, 1));
    }

    /**
     *
     */
    @Test
    public void sallittu5() {
        assertEquals(false, labyrintti.sallittu(1, 10));
    }

    /**
     *
     */
    @Test
    public void sallittu6() {
        assertEquals(false, labyrintti.sallittu(10, 1));
    }
    
}
