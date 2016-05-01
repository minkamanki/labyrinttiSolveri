/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelilogiikka;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testi luokka.
 *
 * @author tminka
 */
public class RuutuTest {

    private Ruutu ruutu;

    /**
     *
     */
    @Before
    public void setUp() {
        ruutu = new Ruutu();
    }

    /**
     *
     */
    @Test
    public void luonti2() {
        assertEquals(false, ruutu.isValittu());
    }

    /**
     *
     */
    @Test
    public void luonti3() {
        ruutu.setMaali(true);
        assertEquals(true, ruutu.isMaali());
    }

    /**
     *
     */
    @Test
    public void luonti4() {
        ruutu.setLahto(true);
        assertEquals(true, ruutu.isValittu());
    }

    /**
     *
     */
    @Test
    public void luonti5() {
        ruutu.setMaali(true);
        ruutu.setMaali(false);
        assertEquals(false, ruutu.isMaali());
    }

    /**
     *
     */
    @Test
    public void vaihto() {
        assertEquals(false, ruutu.isMaali());
    }

    /**
     *
     */
    @Test
    public void vaihto2() {
        ruutu.setLahto(true);
        ruutu.setLahto(false);
        assertEquals(false, ruutu.isValittu());
    }

    @Test
    public void reitti() {
        ruutu.setReitti(true);
        assertEquals(true, ruutu.isReitti());
    }

    @Test
    public void reitti2() {
        assertEquals(false, ruutu.isReitti());
    }
}
