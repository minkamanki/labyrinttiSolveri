/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrintti;

import kayttoliittyma.Kayttoliittyma;

/**
 * Mainin sisältävä luokka.
 *
 * @author tminka
 */
public class LabyrinttiPeli {

    /**
     * Main metodi, kutsuu Kayttoliittymaluokan run() metodia.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kayttoliittyma kl = new Kayttoliittyma();
        kl.run();
    }

}
