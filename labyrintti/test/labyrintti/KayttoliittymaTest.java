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
public class KayttoliittymaTest {

    Kayttoliittyma kl = new Kayttoliittyma();

    @Before
    public void setUp() {
    }

    @Test
    public void sallittu1() {
        assertEquals(kl.sallittu(41), false);
    }

    @Test
    public void sallittu2() {
        assertEquals(kl.sallittu(-30), false);
    }

    @Test
    public void sallittu3() {
        assertEquals(kl.sallittu(10), true);
    }

    @Test
    public void sallittu4() {
        assertEquals(kl.sallittu(4), false);
    }

}
