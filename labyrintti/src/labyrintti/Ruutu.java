/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrintti;

/**
 *Luokassa on Ruutu olion tiedot.
 * @author tminka
 */
public class Ruutu {
    private boolean seina;
    private boolean valittu;
    private boolean maali;
    
    /**
     *Konstruktori.
     * @param onkoSeina
     * @param onkoValittu
     * @param onkoMaali
     */
    public Ruutu(boolean onkoSeina, boolean onkoValittu, boolean onkoMaali){
        seina = onkoSeina;
        valittu = onkoValittu;
        maali = onkoMaali;
    }

    /**
     *Setteri.
     * @param lahto
     */
    public void setLahto(boolean lahto) {
        this.valittu = lahto;
    }
    
//ei ehkä tarvita näitä kahta

    /**
     *Setteri.
     * @param maali
     */
        public void setMaali(boolean maali) {
        this.maali = maali;
    }

    /**
     *Setteri.
     * @param seina
     */
    public void setSeina(boolean seina) {
        this.seina = seina;
    }
// ...
    
    /**
     *Getteri.
     * @return
     */
    public boolean isValittu() {
        return valittu;
    }

    /**
     *Getteri.
     * @return
     */
    public boolean isMaali() {
        return maali;
    }

    /**
     *Getteri.
     * @return
     */
    public boolean isSeina() {
        return seina;
    }
    
    
}
