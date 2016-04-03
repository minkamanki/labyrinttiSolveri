/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrintti;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *Piirtoalusta luokka vastaa labyrintin graaffisesta ulkomuodosta.
 * @author tminka
 */
public class Piirtoalusta extends JPanel {

    private Labyrintti labyrintti;

    /**
     *Konstruktori.
     * @param l
     */
    public Piirtoalusta(Labyrintti l) {
        this.labyrintti = l;
    }

    /**
     *Overidetaan paintComponent metodi, kutsutaan piirraKenttaa.
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        super.setBackground(Color.lightGray);
        piirraKentta(g);
    }

    private void piirraKentta(Graphics g) {
        for (int i = 0; i < labyrintti.getKoko(); i++) {
            for (int j = 0; j < labyrintti.getKoko(); j++) {
                piirraLaatta(i, j, g);
            }
        }
    }

    private void piirraLaatta(int x, int y, Graphics g) {
        if (labyrintti.getRuutu(x, y).isValittu()) {
            g.setColor(Color.GREEN);
        } else if (labyrintti.getRuutu(x, y).isSeina()) {
            g.setColor(Color.DARK_GRAY);
        } else if (labyrintti.getRuutu(x, y).isMaali()) {
            g.setColor(Color.yellow);
        } else if (!labyrintti.getRuutu(x, y).isSeina()) {
            g.setColor(Color.LIGHT_GRAY);
        }

        g.fillRect(21 + (x * 20), 21 + (y * 20), 19, 19);

    }

}
