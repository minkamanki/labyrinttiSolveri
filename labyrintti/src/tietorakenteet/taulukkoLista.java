/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tietorakenteet;


/**
 * Luokka joka korvaa arraylistit.
 *
 * @author tminka
 */
public class taulukkoLista {

    private Object[] lista;

    /**
     *Konsruktori.
     */
    public taulukkoLista() {
        lista = new Object[10];
    }

    /**
     *Arvoja ottava konstruktori.
     * @param x
     */
    public taulukkoLista(int x) {
        lista = new Object[x];
    }

    /**
     *Lisätään arvo taulkkoon, kutsutaan kasvataLstaa, jos ei mahdu.
     * @param o
     */
    public void lisaa(Object o) {
        boolean lisatty = false;
        for (int i = 0; i < lista.length; i++) {
            if (!lisatty && lista[i] == null) {
                lisatty = true;
                lista[i] = o;
                break;
            }
        }

        if (!lisatty) {
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
     *Sisältääkö taulkko kyseisen olion.
     * @param o
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
     *Palauttaa listan.
     * @return
     */
    public Object[] getLista() {
        return lista;
    }

}
