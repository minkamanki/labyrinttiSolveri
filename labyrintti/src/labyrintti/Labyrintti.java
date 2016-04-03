/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrintti;

/**
 *Luokassa luodaan labyrintti, ja se sisältää taulukon Ruutu oliosta.
 * @author tminka
 */
public class Labyrintti {

    private final int koko;
    private Ruutu[][] alue;

    /**
     *Konstruktori.
     * @param koko
     */
    public Labyrintti(int koko) {
        this.koko = koko;
    }

    /**
     *Algoritmi, joka luo labyrintin.
     */
    public void luoLabyrintti() {
        alue = new Ruutu[koko][koko];
      //Tähän tulee algoritmi labyrintin luomiseksi

        for (int i = 0; i < koko; i++) {
            for (int j = 0; j < koko; j++) {
                alue[i][j] = new Ruutu(false, false, false);
            }
        }
        alue[1][1].setLahto(true);
        alue[1][2].setSeina(true);
        alue[2][5].setSeina(true);
        alue[2][2].setSeina(true);
        alue[3][2].setSeina(true);
        alue[1][3].setMaali(true);
    }

    /**
     *Metodi palauttaa taulukon ruuduista.
     * @return taulukko Ruuduista
     */
    public Ruutu[][] getLabyrintti() {
        return alue;
    }

    /**
     *Palauttaa Ruudun kyseisestä sijainnista.
     * @param x
     * @param y
     * @return Ruutu
     */
    public Ruutu getRuutu(int x, int y) {
        return alue[x][y];
    }

    /**
     *Koko getteri.
     * @return koko
     */
    public int getKoko() {
        return koko;
    }

}
