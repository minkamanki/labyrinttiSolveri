<!-- font: brandon --> 
#5. Palautus 

Jouduin tällä viikolla tekemään uuden projektin jonne siirsin kaiken tekemäni. Siltikin pitin generoinnissa oli ongelmia, ja useita tunteja meni sen kanssa pelleilyyn, kunnes googlettamalla virheraportin löysin ratkaisun (yritin käyttää väärä versiota mavenista tai jotain.. copy paste Java labroista)  
Suurempana ongelmana tuli vastaan netbeansin täydellinen jumittuminen. Olen asentanut sen uudestaan ja testaillut kaikkia versioita jdk ja itse netbanisita, mutta ongelma ei lopu. Ongelma tulee kun avaan netbeansin niin se jumittuu scannaamaan projektia. Tämän takia en nyt sunnuntaina pystynyt yhtään jatkamaan projektiani, ja tänään aioin tehdä lisää testejä. Pitää katsoa ensiviikolla jos saisin projektin toimimaan koululla.  
Muuten projekti on edinnyt aika mukavasti. Labyrintin ratkaisija toimii nyt ja tein TaulukkoListasta hiukan tehokkaamman.  
Ongelmia oli ratkaisijan kanssa, koska olisin tahtonut, että reitti lähdöstä maaliin luodaan samalla kun maalia etsitään, mutta siinä tuli jatkuvasti virheitä. Enkä ihan hahmottanut miten se olisi pitänyt toteuttaa. Työstin sitä melko pitkälle, kunne sitten vaihdoin nykyiseen malliin, jossa siis etsin maalin juuresta eli lähdöstä ja sitten kaikki maalin ja lähdön välillä laitetaan reitiksi.  
Toinen ongelma on aikavaativuudet. Olen joitain hyviä veikkauksia laittanut Toteutus dokumenttiin, mutta en ole niistä täysin varma. Lisäksi muokkasin suorituskyky testin muotoon: @Test(timeout = 100), jolla koko ohjelman suorittaminen menee läpi (ilman graaffisia ominaisuuksia). Tämä testi luo labyrintin ruutuineen ja puineen ja ratkaisee reitin. Time elapsed on yleensä tällä testillä noin 80 millisekuntia. Pitäisikö olla vähemmän? Pitäisikö tehdä enemmän saman tapaisia testejä (ainakin TaulukkoListaan olen ajatellut niitä tehdä, mutta muualle)?  
Tunnit n. 11h koska sunnuntain tunnit menivät kokonaan vain netbeansin kanssa pelleilyyn.

