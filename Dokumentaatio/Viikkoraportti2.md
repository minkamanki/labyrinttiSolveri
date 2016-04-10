<!-- font: brandon --> 
#3. Palautus  
Tällä viikolla aikaa meni erillaisten allgoritmien tutkimiseen todella paljon. Oli vaikea löytää hyvää esimerkkiä, joka sopisi aiemmin luomiini puitteisiin. Niinpä lopulta muutin hyvin paljon aiempaa toiminnalisuuttani Ruutu-luokassa. Esim. ruutu ei voi olla enään seinä vaan paint componentti piirtää seinän "ruutujen" välille, jos ne eivät ole naapureita. Tämän vuoksi myös Piirtoalusta -luokka muuttui paljon. Sain myös tehtyä toimivan labyrintti generoijan. Lisäsin jo valmiiksi "Näytä ratkaisu" napin, vaikka siirryn solveriin vasta ensi viikolla   
 
Labyrintin generointi tapahtuu rekursiolla, ja lisään siihen ensi viikolla labyrintin ratkaisu algoritmia varten ruutujen yhteyksiä kuvaavan puun luonnin. Tarkoituksena olisi käyttää A* algoritmia löytämään reitti lähdöstä maaliin, mutta saatan tarpeen vaatiessa vielä vaihtaa sen.   

Tällä viikolla tein vain oikeasti hyödyllisiä  testejä lisää, mutta myöhemmin kyllä lisäilen niitä. Tämän viikoisten muutosten takia useimmat testit hajoilivat ja niihin kului turhaa aikaa, kun piti koko ajan säädellä niitä. Sen takia en oikein nyt testaile vielä kaikkia metodeita, koska tässä vaiheessa koodiini saattaa tulla jatkossakin isoja muutoksia.   

Tällä viikolla opin paljon erillaisista Maxe generating algoritmeistä. Tutkin melko perinpohjaisesti miten mikäkin niistä toimii. Ja päädyin itse käyttämään backtrackingillä toimivaa algoritmia, koska se generoi minusta järkevimmän näköisiä algoritmeja.   

Paljon vaikeuksia oli ymmärtää "monimutkaista" koodia, ja välillä oli vaikea ymmärtää mitä omassa koodissani edes tapahtui, koska rekursio. Lisäksi drawLine() metodin kanssa sai säätää aika paljon, koska graaffista puolta on myös välillä vähän vaikea hahmottaa. Vaikeuksia on ollut myös tietorakenteiden suhteen, koska en oikein hahmota voisiko joitain ominaisuuksia korvats tietorakenteilla ja miten. Esim. taulukkoa tai Set:iä. Ainakin ensi viikolla kuitenkin tulee se puu.   

