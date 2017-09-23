# Laskin

1) Etsi projektisi kansio app/libs ja lataa sinne Githubin Laskin-kansiosta löytyvä exp4j-0.4.8.jar
2) Android Studiossa avaa navigaatio-valikko (vasemmalla ylhäällä, oletuksena siinä lukee Android) ja valitse Project
3) Navigoi projektisi app/libs kansioon, klikkaa oikealla hiiren näppäimellä lataamaasi jar-tiedostoa ja valitse Add as Library...
________________________________________________________________________________________________________________________________________
4) Palaa takaisin Androidiin navigaatio-valikosta (kts. kohta 4)
5) Luo uusi Utils-niminen java-tiedosto samaan kansioon MainActivity java-tiedoston kanssa
6) Poista Utilsista kaikki muu teksti paitsi ensimmäiseltä riviltä löytyvä paketin osoite
7) Kopioi Utils-luokkaan kaikki koodi Githubin Laskin/java kansiosta löytyvästä Utils.java tiedostosta, älä välitä virheistä
________________________________________________________________________________________________________________________________________
8) Aloitetaan koodi! Muokkaat tässä ainoastaan MainActivity-luokkaa ja kaikki ohjeet koskevat sitä.
________________________________________________________________________________________________________________________________________
9) Luo 2 TextView-tyyppistä muuttujaa tekstikenttiä varten
10) Luo Utils-tyyppinen muuttuja Utils-luokan käyttöä varten
11) Luo 2 HorizontalScrollView tyyppistä muuttujaa tekstikenttien scrollauksien käyttöä varten
________________________________________________________________________________________________________________________________________
12) OnCreate metodissa alusta Utils-luokka ja lähetä sinne parametrina this 
- Vinkki: utilsMuuttujanNimi = new Utils(this)
13) Alusta myös muut luomasi muuttujat käyttämällä metodia findViewById(R.id.antamasiId)
- Vinkki: Muista tyyppimuunnos, esim Pylly pyllyni = (Pylly) findViewById(R.id.munpylly);
14) Lisää onCreate metodiin myös lausekkeet: 
- ylemmänTekstikentänNimi.setMovementMethod(new ScrollingMovementMethod());
- alemmanTekstikentänNimi.setMovementMethod(new ScrollingMovementMethod());
________________________________________________________________________________________________________________________________________
15) Täytä Layoutin avulla luodut metodit
- kun käyttäjä painaa numeroa, lähetä utils-luokan numberClicked metodille painikkeesta saatava teksti String-muodossa
- kun käyttäjä painaa pilkkua, lähetä utils-luokan commaClicked metodille painikkeesta saatava teksti String-muodossa
- kun käyttäjä painaa +-*/ tai =-merkkiä, lähetä utils-luokan calculationClicked metodille painikkeesta saatava teksti String-muodossa
- kun käyttäjä painaa c-näppäintä, kutsu utils-luokan cClicked metodia

HUOM:
- Vinkki 1: Luo Button muuttuja ja alusta se käyttämällä findViewById(view.getId()) metodia.
- Vinkki 2: Luo String muuttuja ja etsi painikkeen teksti käyttämällä metodia buttonMuuttuja.getText(). Muista myös tyyppimuunnos Stringiksi toString() metodilla.
- Vinkki 3: Lähetä käyttämällä: utilsMuuttujasiNimi.utilsMuuttujanMetodi(painikkeenTeksti);
________________________________________________________________________________________________________________________________________
16) Luo metodi nimeltä createToast joka ottaa String muodossa vastaan näytettävän viestin
17) Näytä toast-viesti käyttäjälle kutsumalla Toast.makeText metodia. Metodi ottaa vastaan 3 parametria.
- Vinkki 1: Toastin ensimmäinen parametri on this, toinen on viesti ja kolmas on pituus, Toast.LENGTH_SHORT. 
- Vinkki 2: Muista lisätä loppuun .show() kutsu
________________________________________________________________________________________________________________________________________
18) Luo metodi getCalculationText joka palauttaa ylemmän tekstikentän tekstin String-muodossa
________________________________________________________________________________________________________________________________________
19) Luo metodi setResultText joka ottaa parametrina vastaan String-muodossa tekstin
20) Aseta parametrina saatu teksti toiseen tekstikenttään, joka näyttää laskun tuloksen. Käytä metodia setText()
21) Lisää metodiin myös lauseke: alempiScrollViewMuuttuja.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
________________________________________________________________________________________________________________________________________
22) Luo metodi setCalculationText joka ottaa parametreina String-muotoisen laskukaavan ja booleanina tiedon siitä, lisätäänkö tekstiä vai muutetaanko se kokonaan
23) Jos boolean arvo on tosi, lisää teksti ensimmäiseen tekstikenttään käyttämällä metodia append(laskukaava)
24) Jos boolean arvo on epätosi aseta teksti ensimmäiseen tekstikenttään käyttämällä metodia setText(laskukaava)
25) Lisää metodiin myös lauseke ylempiScrollViewMuuttuja.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
________________________________________________________________________________________________________________________________________
Olet nyt valmis! Lataa laskin kännykkääsi ja testaa.
