/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrintti;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *Testi luokka.
 * @author tminka
 */
public class RuutuTest {

    private Ruutu ruutu;

    @Before
    public void setUp() {
    }

    @Test
    public void luonti1() {
        ruutu = new Ruutu(true, false, true);
        assertEquals(true, ruutu.isSeina());
    }

    @Test
    public void luonti2() {
        ruutu = new Ruutu(true, false, true);
        assertEquals(false, ruutu.isValittu());
    }

    @Test
    public void luonti3() {
        ruutu = new Ruutu(true, false, true);
        assertEquals(true, ruutu.isMaali());
    }

    @Test
    public void luonti4() {
        ruutu = new Ruutu(false, true, false);
        assertEquals(true, ruutu.isValittu());
    }

    @Test
    public void luonti5() {
        ruutu = new Ruutu(false, true, false);
        assertEquals(false, ruutu.isMaali());
    }

    @Test
    public void luonti6() {
        ruutu = new Ruutu(false, true, false);
        assertEquals(false, ruutu.isSeina());
    }

    @Test
    public void vaihto() {
        ruutu = new Ruutu(false, false, false);
        ruutu.setLahto(true);
        assertEquals(true, ruutu.isValittu());
    }
    
    @Test
    public void vaihto2() {
        ruutu = new Ruutu(false, true, false);
        ruutu.setLahto(false);
        assertEquals(false, ruutu.isValittu());
    }
}
