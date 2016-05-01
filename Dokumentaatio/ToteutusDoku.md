<!-- font: brandon --> 
#Toteutus

Ohjelman yleis rakenenne koostuu logiikka, käyttöliittymä ja tietorakenne pakkauksista.
Käyttöliittymällä on hallussaan kaikki grafiikka ja hiirikuuntelu.
Logiikkasta välitetään tietoa käyttöiittymään. Logiikassa tapahtuu kaikki varsinainen toiminnallisuus. 
Tietorakenne sisältää omat tekoisia tietorakenteitani, tällä hetkellä siis vain taulukkoLista (arraylistin tilalla) ja puu/solmut.   

Ohjelma toimii siten, että aluksi luodaan halutun kokoinen labyrintti. Sen jälkeen luodaan puu labyrintin perusteella. Ja lopuksi ratkaistaan puun avulla reitti maalista loppuun.   

Labyrintin luonti:  
Tilavaativuus ja aikavaativuus labyrinttia luodessa* on O(2n), jos n on layrintin koko. Tämä tehdään niin, että aluksi luodaan taulukko Ruuduista, ja sen jälkeen ruvetaan rekursiivisesti luomaan yhteyksiä ruutujen välille.   

Puun luonti:  
Luodaan puu rekursiolla Ruutujen yhteyksien (eli naapuruuksien) mukaisesti. Aika vaativuus 0(n), jos n on edelleen ruutujen määrä.   


Labyrintin ratkaisu:  
Ratkaisijaa komennetaan ratkaiseLabyrintti(), jolloin se etsii rekursiolla syvyyssuuntaisesti puusta "maaliksi" asetetun ruudun. Kun maali on löydetty laitetaan kaikki maalista lähtöön reitiksi. Koska käytössä on puu ratkaisu on aina nopein ja ainoa olemassa oleva. Taulukon läpikäynti loppuu kun maali löytyy, ja reittiin tulee vain maalista lähtöön käydyt solmu. Aikavaativuus on O(n)   

Toteutin itse TaulukkoListan, jonka suorituskykyä paransin. Parannus tulee, siitä ettei tarvitse joka kerta etsiä seuraavaa tyhjää kohtaa käymällä lista läpi, vaan muistissa pidetään aina seuraavaa tyhjää paikkaa. Tämä tarkoittaa, että aikavaativuus laski O(n):stä** O(1):teen, jos listaa ei tarvitse kasvattaa. Olen lisäksi tehnyt niin, että listaa tarvitsee kasvattaa vain harvoin, koska joka kerta kun lista tulee liian pieneksi sen koko tuplataan.   


*ei pelkkä taulukon luonti vaan myös poistaSeinia() rekursio   
**n on listan koko

Lähde: *http://www.cs.uku.fi/~hmayra/kurssit/tra/luku2.html*
