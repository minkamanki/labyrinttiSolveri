/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tietorakenteet;

/**
 *Luokka, jolla korvaan ArrayList tietorakenteet.
 * @author tminka
 */
public class TaulukkoLista {

    private Object[] lista;
    private int head = 0;

    /**
     * Konsruktori.
     */
    public TaulukkoLista() {
        lista = new Object[16];
    }

    /**
     * Arvoja ottava konstruktori.
     *
     * @param x listan koko
     */
    public TaulukkoLista(int x) {
        lista = new Object[x];
    }

    /**
     * Lisätään arvo taulkkoon, kutsutaan kasvataLstaa, jos ei mahdu.
     *
     * @param o uusi olio taulukkoon
     */
    public void lisaa(Object o) {

        if (head < lista.length) {
            lista[head] = o;
            head++;
        } else {
            kasvataListaa(lista.length * 2);
            lisaa(o);
        }

    }

    private void kasvataListaa(int length) {
        Object[] apu = new Object[length];
        for (int i = 0; i < lista.length; i++) {
            apu[i] = lista[i];
        }
        lista = apu;
    }

    /**
     * Sisältääkö taulkko kyseisen olion.
     *
     * @param o Etsittävä olio
     * @return boolean
     */
    public boolean contains(Object o) {
        for (Object lista1 : lista) {
            if (lista1 == o) {
                return true;
            }
        }
        return false;
    }

    /**
     * Palauttaa listan.
     *
     * @return lista
     */
    public Object[] getLista() {
        return lista;
    }

    /**
     *Palautetaan taulukon koko.
     * @return listan koko
     */
    public int koko() {
        return lista.length;
    }

//    /**
//     *Palautetaan olio halutusta listan kohdasta.
//     * @param i kohta
//     * @return olio kohdasta
//     */
//    public Object olio(int i) {
//        return lista[i];
//    }
}
