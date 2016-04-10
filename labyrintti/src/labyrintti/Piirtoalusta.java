/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrintti;

import logiikka.Labyrintti;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Piirtoalusta luokka vastaa labyrintin graaffisesta ulkomuodosta.
 *
 * @author tminka
 */
public class Piirtoalusta extends JPanel {

    private Labyrintti labyrintti;

    /**
     * Konstruktori.
     *
     * @param l
     */
    public Piirtoalusta(Labyrintti l) {
        this.labyrintti = l;
    }

    /**
     * Overidetaan paintComponent metodi, kutsutaan piirraKenttaa.
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        super.setBackground(Color.lightGray);
        piirraKentta(g);
    }

    private void piirraKentta(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(20, 20, 2 + labyrintti.getKoko() * 20, 2 + labyrintti.getKoko() * 20);
        for (int i = 0; i < labyrintti.getKoko(); i++) {
            for (int j = 0; j < labyrintti.getKoko(); j++) {
                piirraLaatta(i, j, g);
            }
        }
    }

    private void piirraLaatta(int x, int y, Graphics g) {

        g.setColor(Color.LIGHT_GRAY);
        if (labyrintti.getRuutu(x, y).isValittu()) {
            g.setColor(Color.GREEN);
        } else if (labyrintti.getRuutu(x, y).isMaali()) {
            g.setColor(Color.yellow);
        }
        g.fillRect(22 + (x * 20), 22 + (y * 20), 20, 20);
        piirraSeinat(x, y, g);
    }

    private void piirraSeinat(int x, int y, Graphics g) {
        g.setColor(Color.black);
//        if (sallittu(x + 1, y)) {
//            labyrintti.onkoNaapuri(x, y, x + 1, y);
//        }

        if (sallittu(x - 1, y)) {
            if (!labyrintti.onkoNaapuri(x, y, x - 1, y)) {
                g.drawLine((x * 20) + 21, (y * 20) + 41, (x * 20) + 21, 21 + (y * 20));
            }

        }
//
//        if (sallittu(x, y + 1)) {
//            labyrintti.onkoNaapuri(x, y, x + 1, y);
//        }
//
        if (sallittu(x, y - 1)) {
            if (!labyrintti.onkoNaapuri(x, y, x, y - 1)) {
                g.drawLine((x * 20) + 41, (y * 20) + 21, (x * 20) + 21, 21 + (y * 20));
            }
        }

    }

    private boolean sallittu(int x, int y) {
        return x > -1 && y > -1 && x < labyrintti.getKoko() && y < labyrintti.getKoko();
    }

}
