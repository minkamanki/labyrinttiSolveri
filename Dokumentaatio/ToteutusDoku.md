<!-- font: brandon --> 
#Toteutus

Ohjelman yleis rakenenne koostuu logiikka, käyttöliittymä ja tietorakenne pakkauksista.
Käyttöliittymällä on hallussaan kaikki grafiikka ja hiirikuuntelu.
Logiikkasta välitetään tietoa käyttöiittymään. Logiikassa tapahtuu kaikki varsinainen toiminnallisuus. 
Tietorakenne sisältää omat tekoisia tietorakenteitani, tällä hetkellä siis vain taulukkoLista (arraylistin tilalla) ja puu/solmut.   

Tilavaativuus ja aikavaativuus labyrinttia luodessa on O(2n), jos n on layrintin koko.
Puun luominen pitäisi onnistua myös ajassa O(n), kun n on solmujen määrä eli labyrintin koko.   

Ohjelma toimii siten, että aluksi luodaan halutun kokoinen labyrintti. Sen jälkeen luodaan puu labyrintin perusteella. Ja lopuksi ratkaistaan puun avulla reitti maalista loppuun.

Lähde: *http://www.cs.uku.fi/~hmayra/kurssit/tra/luku2.html*
