/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelilogiikka;

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
     * @param koko saatu koko
     */
    public Labyrintti(int koko) {
        this.koko = koko;
    }

    /**
     * Metodissa luodaan Ruudut ja kursutaan poistaSeinat metodia. Aseteaan myös
     * lähtö ja maali.
     */
    public void luoLabyrintti() {
        alue = new Ruutu[koko][koko];

        for (int i = 0; i < koko; i++) {
            for (int j = 0; j < koko; j++) {
                alue[i][j] = new Ruutu();
            }
        }

        poistaSeinia(0, 0); //TÄMÄ LUO TAULUKOSTA LABYRINTIN

        alue[0][0].setLahto(true);
        alue[koko - 1][koko - 1].setMaali(true);
    }

    /**
     * Metodi toimii rekursiivisesti ja se luo yhteyksiä Ruutujen välille.
     *
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
            if (r == 1) {
                n = x + 1;
                m = y;
            } else if (r == 2) {
                n = x - 1;
                m = y;
            } else if (r == 3) {
                n = x;
                m = y + 1;
            } else if (r == 4) {
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
     * @param x sijainti
     * @param y sijainti
     * @return Ruutu
     */
    public Ruutu getRuutu(int x, int y) {
        return alue[x][y];
    }

    /**
     * Palaututeaan tietoa eteenpäin, onko kahden ruudun välillä yhteyttä.
     *
     * @param x sijainti
     * @param y sijainti
     * @param n sijainti
     * @param m sijainti
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
     * Metodi tarkistaa, onko sijainti sallittu.
     *
     * @param x sijainti
     * @param y sijainti
     * @return onko sallittu
     */
    public boolean sallittu(int x, int y) {
        return x > -1 && y > -1 && x < koko && y < koko;
    }

    /**
     * Metodi kertoo labyrintin luojalle, onko se joutunut "umpikujaan".
     *
     * @param x sijainti
     * @param y sijainti
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
