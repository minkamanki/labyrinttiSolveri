/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logiikka;

/**
 * Luokassa luodaan labyrintti, ja se sisältää taulukon Ruutu oliosta.
 *
 * @author tminka
 */
public class Labyrintti {

    private final int koko;
    private Ruutu[][] alue;

    /**
     * Konstruktori.
     *
     * @param koko
     */
    public Labyrintti(int koko) {
        this.koko = koko;
    }

    /**
     * Metodissa luodaan Ruudut ja kursutaan poistaSeinat metodia.
     * Aseteaan myös lähtö ja maali.
     */
    public void luoLabyrintti() {
        alue = new Ruutu[koko][koko];
        //Tähän tulee algoritmi labyrintin luomiseksi

        for (int i = 0; i < koko; i++) {
            for (int j = 0; j < koko; j++) {
                alue[i][j] = new Ruutu();
            }
        }

        poistaSeinia(0, 0);
        alue[0][0].setLahto(true);
        alue[koko - 1][koko - 1].setMaali(true);
    }

    /**
     *Metodi toimii rekursiivisesti ja se luo yhteyksiä Ruutujen välille.
     * @param x Ruudun koordinaatti
     * @param y Ruudun koordinaatti
     */
    public void poistaSeinia(int x, int y) {
        alue[x][y].setVisited(true);

        if (umpikuja(x, y)) {
            return;
        }

        boolean arvottu = false;
        int n = -1;
        int m = -1;

        while (!arvottu) {
            double r = Math.ceil(Math.random() * 4);
            if (r == 1) {//x+1,y
                n = x + 1;
                m = y;
            } else if (r == 2) {//x-1,y
                n = x - 1;
                m = y;
            } else if (r == 3) {//x,y+1
                n = x;
                m = y + 1;
            } else if (r == 4) {//x,y-1
                n = x;
                m = y - 1;
            }
            if (sallittu(n, m) && !alue[n][m].isVisited()) {
                alue[x][y].addNaapurit(alue[n][m]);
                alue[n][m].addNaapurit(alue[x][y]);
                arvottu = true;

            }
        }
        
        poistaSeinia(n, m);
        if (!umpikuja(x, y)) {
            poistaSeinia(x, y);
        }

    }

    /**
     * Metodi palauttaa taulukon ruuduista.
     *
     * @return taulukko Ruuduista
     */
    public Ruutu[][] getLabyrintti() {
        return alue;
    }

    /**
     * Palauttaa Ruudun kyseisestä sijainnista.
     *
     * @param x
     * @param y
     * @return Ruutu
     */
    public Ruutu getRuutu(int x, int y) {
        return alue[x][y];
    }

    /**
     *Palaututeaan tietoa eteenpäin, onko kahden ruudun välillä yhteyttä.
     * @param x
     * @param y
     * @param n
     * @param m
     * @return onko yhteys
     */
    public boolean onkoNaapuri(int x, int y, int n, int m) {
        return alue[x][y].isNaapuri(alue[n][m]);

    }

    /**
     * Koko getteri.
     *
     * @return koko
     */
    public int getKoko() {
        return koko;
    }

    /**
     *Metodi tarkistaa, onko sijainti sallittu.
     * @param x
     * @param y
     * @return onko sallittu
     */
    public boolean sallittu(int x, int y) {
        return x > -1 && y > -1 && x < koko && y < koko;
    }

    /**
     *Metodi kertoo labyrintin luojalle, onko se joutunut "umpikujaan".
     * @param x
     * @param y
     * @return onko umpikuja
     */
    public boolean umpikuja(int x, int y) {
        boolean u = true;
        if (sallittu(x + 1, y) && !alue[x + 1][y].isVisited()) {
            u = false;

        }

        if (sallittu(x - 1, y) && !alue[x - 1][y].isVisited()) {
            u = false;

        }

        if (sallittu(x, y + 1) && !alue[x][y + 1].isVisited()) {
            u = false;

        }

        if (sallittu(x, y - 1) && !alue[x][y - 1].isVisited()) {
            u = false;
        }

        return u;
    }
}