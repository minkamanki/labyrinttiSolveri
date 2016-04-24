##Määrittely dokumentaatio
Tässä projektissa generoidaan labyrintti ja ratkaistaan reitti lähdöstä maliin.  
Käytän generoinnissa backtrackin algoritmia, mikä tapahtuu konkreettisesti rekursiolla. Aluksi luodaan taulukko ruuduista, joilla ei ole yhteyttä toisiinsa. Tiettyjä sääntöjä noudattaen ja osittain satunnaisesti rekursiivisesta poistetaan "seiniä" ruutujen väliltä, jolloin niistä tulee "naapureita".  
Näiden naapuruus yhteyksien avulla ruuduista luodaan puu, joka läpikäymällä löydetään maaliksi merkitty Ruutu. Tästä ruudusta lähtien kaikki sen vanhemmat merkitään "reitiksi".   



*Lähteet:*  
*https://en.wikipedia.org/wiki/Maze_generation_algorithm*  
*https://en.wikipedia.org/wiki/Maze_solving_algorithm*  



