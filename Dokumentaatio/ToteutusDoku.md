<!-- font: brandon --> 
#Toteutus

Ohjelman yleis rakenenne koostuu logiikka, käyttöliittymä ja tietorakenne pakkauksista.
Käyttöliittymällä on hallussaan kaikki grafiikka ja hiirikuuntelu.
Logiikkasta välitetään tietoa käyttöiittymään. Logiikassa tapahtuu kaikki varsinainen toiminnallisuus. 
Tietorakenne sisältää omat tekoisia tietorakenteitani, tällä hetkellä siis vain taulukkoLista (arraylistin tilalla) ja puu/solmut.   

Tilavaativuus ja aikavaativuus labyrinttia luodessa* on O(2n), jos n on layrintin koko.
Puun luominen pitäisi onnistua myös ajassa O(n), kun n on solmujen määrä eli labyrintin koko.   

Ohjelma toimii siten, että aluksi luodaan halutun kokoinen labyrintti. Sen jälkeen luodaan puu labyrintin perusteella. Ja lopuksi ratkaistaan puun avulla reitti maalista loppuun.   


*ei pelkkä taulukon luonti vaan myös poistaSeinia() rekursio   

Lähde: *http://www.cs.uku.fi/~hmayra/kurssit/tra/luku2.html*

**23.4.**   
Uuta toteutusta: labyrintin ratkaiseminen.
Ratkaisija luo aluksi puun rekursiolla Ruutujen yhteyksien (eli naapuruus) mukaisesti. Aika vaativuus 0(n), jos n on edelleen ruutujen määrä. Tämän jälkeen Ratkaisijaa komennetaan ratkaiseLabyrintti(), rekursiolla se etsii maalin lähdöstä. Kun maali on löydetty laitetaan kaikki maalista lähtöön reitiksi. Koska käytössä on puu ratkaisu on aina nopein ja ainoa olemassa oleva. Pahimmassa tapauksessa tämä vie aikaa O(n²), eli jos maali on aivan siellä viimeisimmässä lehessä, joka tutkitaan, ja kaikki solmut olisivat päätyneet reittiin. Tämä ei kuitenkaan vastaa todellisuutta, mikä lienee jotain alle 0((n/2)²). Vaikea sanoa, koska kyse on satunnaisista asioista. Taulukon läpikäynti loppuu kun maali löytyy, ja reittiin tulee vain maalista lähtöön käydyt solmu.   

Toteutin itse TaulukkoListan, jonka suorituskykyä paransin. Parannus tulee, siitä ettei tarvitse joka kerta etsiä seuraavaa tyhjää kohtaa käymällä lista läpi, vaan muistissa pidetään aina seuraavaa tyhjää paikkaa. Tämä tarkoittaa, että aikavaativuus laski O(n):stä** O(1):teen, jos listaa ei tarvitse kasvattaa. Olen lisäksi tehnyt niin, että listaa tarvitsee kasvattaa vain harvoin, koska joka kerta kun lista tulee liian pieneksi sen koko tuplataan.   

**n on listan koko
