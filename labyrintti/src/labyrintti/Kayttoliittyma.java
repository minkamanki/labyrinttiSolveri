/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrintti;

import logiikka.Labyrintti;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

/**
 *Käyttöliittymä luokka sisältää kaikki ohjelman framet ja implementtaa hiirikuuntelijan.
 * @author tminka
 */
public class Kayttoliittyma implements MouseListener {
    private JFrame frame;
    private JButton ok;
    private JButton ratkaise;
    private JTextArea kentta;
    private int koko;
    private Labyrintti labyrintti;

    /**
     *Luo framen, jossa on ok -nappi ja kentta -textArea.
     */
    public void run() {
        frame = new JFrame("Anna labyrintin koko");
        frame.setSize(400, 150);

        kentta = new JTextArea();
        ok = new JButton("OK");
        kentta.setFont(new Font("monospaced", Font.BOLD, 25));

        frame.add(kentta, BorderLayout.CENTER);
        frame.add(ok, BorderLayout.SOUTH);

        ok.addMouseListener(this);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
    
    /**
     *Poistetaan framelta nappi ja teksti alue. Kutsutaan Labyrintti luokan luoLabyrintti() metodia. Luodaan Piirtoalusta ja lisätään se framelle. 
     */
    public void kentanLuonti(){
        frame.remove(ok);
        frame.remove(kentta);
        frame.setVisible(false);
        labyrintti.luoLabyrintti();
        Piirtoalusta alusta = new Piirtoalusta(labyrintti);
        frame.add(alusta);
        
        frame.pack();
        frame.setTitle("Miinaharava");

        frame.setSize((koko * 20) + 42, (koko * 20) + 80);
        ratkaise = new JButton("Näytä ratkaisu");
        frame.add(ratkaise, BorderLayout.SOUTH);
        
        ratkaise.addMouseListener(this);
        frame.setVisible(true);
    }

    /**
     *Metodi, joka tarkistaa, että annettu koko on 10-40.
     * @param koko
     * @return boolean onko annettu koko sallittu
     */
    public boolean sallittu(int koko) {
        if (koko < 41 && koko > 4) {
            return true;
        }
        return false;
    }

    /**
     *ok -nappia klikatessa, tarkistetaan, että teksti alueella on ollut Integer. Jos integer vielä on sallitun kokoinen, niin luodaan uusi labyrintti ilmenytmä ja kutsutaan metodia kentanLuonti().
     * @param me
     */
    @Override
    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == ok) {
            try {
                koko = Integer.parseInt(kentta.getText());
                if (sallittu(koko)) {
                    labyrintti = new Labyrintti(koko);
                    kentanLuonti();
                } else {
                    kentta.setText("Anna koko 5 - 40");
                }
            } catch (NumberFormatException nfe) {
                kentta.setText("Vain numerot kelpaavat");
            }

        }
        
        if(me.getSource() == ratkaise){
            ratkaise.setText("Ei toimi vielä :D");
        }
    }

    /**
     *A
     * @param me
     */
    @Override
    public void mousePressed(MouseEvent me) {
    }

    /**
     *A
     * @param me
     */
    @Override
    public void mouseReleased(MouseEvent me) {
    }

    /**
     *A
     * @param me
     */
    @Override
    public void mouseEntered(MouseEvent me) {
    }

    /**
     *A
     * @param me
     */
    @Override
    public void mouseExited(MouseEvent me) {
    }

}
