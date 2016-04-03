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
public class LabyrinttiTest {

    private Labyrintti labyrintti;

    @Before
    public void setUp() {
        labyrintti = new Labyrintti(10);
    }

    @Test
    public void alueenKoko() {
        labyrintti.luoLabyrintti();
        assertEquals(10, labyrintti.getLabyrintti().length);
    }

    @Test
    public void getKoko() {
        assertEquals(10, labyrintti.getKoko());
    }

}
