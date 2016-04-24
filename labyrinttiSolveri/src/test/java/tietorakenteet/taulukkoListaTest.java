/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tietorakenteet;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import pelilogiikka.Ruutu;

/**
 *
 * @author tminka
 */
public class taulukkoListaTest {

    private TaulukkoLista lista;
    private Ruutu a;
    private Ruutu b;
    private Ruutu c;

    /**
     *
     */
    @Before
    public void setUp() {
        lista = new TaulukkoLista(2);
        a = new Ruutu();
        b = new Ruutu();
        c = new Ruutu();
    }

    /**
     * Test of lisaa method, of class TaulukkoLista.
     */
    @Test
    public void testLisaa() {
        lista.lisaa(a);
        assertEquals(lista.contains(a), true);
    }

    /**
     * Test of contains method, of class TaulukkoLista.
     */
    @Test
    public void testContains() {
        lista.lisaa(a);
        lista.lisaa(b);
        assertEquals(lista.contains(b), true);
    }

    /**
     * Test of getLista method, of class TaulukkoLista.
     */
    @Test
    public void lisaaLiikaa() {
        lista.lisaa(a);
        lista.lisaa(b);
        lista.lisaa(a);
        lista.lisaa(b);
        lista.lisaa(c);

        assertEquals(lista.contains(c), true);
    }

}
