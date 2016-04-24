<!-- font: brandon --> 
#Testaus
**17.4.**   
Tällä hetkellä ohjelmassa on vasta yksikkötestausta, ohjelmien toimivuuden testausta varten. 

Tein myös suorituskyky testin, joka testaa suurinta taulukkoa, minkä käyttäjä voi syöttää. Eli 40x40 kokoinen taulukko, tämä tarkoittaa 1600 Ruutua ja puuta jossa on 1600 solmua.

Testit voidaan toistaa ihan normaalisti esim netbeansin avulla, koska olen tehnyt JUnit testäjä tähän asti.

**23.4.**   
Vaihdoin suorituskykytestiä ohjeiden mukaisesti, ja nyt se on muotoa @Test(timeout = 100), ja siinä luodaan labyrintti, ruudut ja puu sekä ratkaistaan labyrintti. Testailin sitä useaan kertaan ja aina meni läpi. Viimeisin ilmoitti "Time elapsed: 0.077 sec", kun suoritin vain tämän testin.


