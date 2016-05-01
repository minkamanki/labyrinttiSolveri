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

    private TaulukkoLista toinenLista;
    private TaulukkoLista lista;
    private Ruutu a;
    private Ruutu b;
    private Ruutu c;

    /**
     *
     */
    @Before
    public void setUp() {
        lista = new TaulukkoLista(1);
        a = new Ruutu();
        b = new Ruutu();
        c = new Ruutu();
        toinenLista = new TaulukkoLista();
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

    @Test
    public void listanKasvatus() {
        lista.lisaa(a);
        lista.lisaa(b);
        lista.lisaa(c);
        assertEquals(lista.koko(), 4);
    }

    @Test
    public void contains() {
        lista.lisaa(a);
        lista.lisaa(b);
        assertEquals(true, lista.contains(a));
    }

    @Test
    public void contains2() {
        lista.lisaa(a);
        lista.lisaa(b);
        assertEquals(true, lista.contains(b));
    }

    @Test
    public void contains3() {
        assertEquals(false, lista.contains(b));
    }

    @Test
    public void koko() {
        assertEquals(1, lista.koko());
    }

    @Test
    public void automaattiKoko() {
        assertEquals(16, toinenLista.koko());
    }

}
