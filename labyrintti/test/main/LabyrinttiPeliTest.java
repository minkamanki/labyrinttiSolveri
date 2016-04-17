/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import labyrintti.Kayttoliittyma;
import logiikka.Labyrintti;
import logiikka.Ratkaisija;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tminka
 */
public class LabyrinttiPeliTest {

    private Labyrintti l;

    @Before
    public void setUp() {

    }

    @Test
    public void suurinLabyrintti() {
        int ajat = 0;
        for (int i = 0; i < 10; i++) {
          long aikaAlussa = System.currentTimeMillis();
        l = new Labyrintti(40);
        l.luoLabyrintti();

        Ratkaisija solveri = new Ratkaisija(l.getLabyrintti());
        solveri.luoPuu();
        
        long aikaLopussa = System.currentTimeMillis();  
        
        ajat += aikaLopussa - aikaAlussa;
        }
        
        System.out.println("Operaatioon kului keskiarvoisesti aikaa: " + (ajat/10) + "ms.");

    }

}
