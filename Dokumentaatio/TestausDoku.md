<!-- font: brandon --> 
#Testaus

Syorituskykytestini on muotoa @Test(timeout = 100), ja siinä luodaan labyrintti, ruudut ja puu sekä ratkaistaan labyrintti. Testissä testataan 40x40 kokoista talukkoa, eli siinä on 1600 Ruutua ja samankokoinen puu. Testailin sitä useaan kertaan ja aina meni läpi. Viimeisin ilmoitti "Time elapsed: 0.077 sec", kun suoritin vain tämän testin. Tein lisäksi kaksi vähän isompaa taulukkoa (vaikka 40x40 on isoin jonka käyttäjä voi antaa). Niiden koot ovat 80x80 ja 100x100 eli 6400 ja 10000 ruutua/solmua. Nekin menevät läpi tuolla @Test(timeout = 100).    

Muuten testit ovat yksikkötestejä. Pitin mukaan Line Coverage on 90% (130/145) ja Mutation Coverage 83% (96/115). Tässä on on mukana pelilogiikka ja tietorakenteet pakkaukset.

