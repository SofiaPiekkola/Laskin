# Laskin

1) Luo uusi Utils-niminen java-tiedosto samaan kansioon MainActivity java-tiedoston kanssa
2) Poista Utilsista kaikki muu teksti paitsi ensimmäiseltä riviltä löytyvä paketin osoite
3) Kopioi Utils-luokkaan kaikki koodi Githubista löytyvästä Utils.java tiedostosta, älä välitä virheistä
________________________________________________________________________________________________________________________________________
4) Aloitetaan koodi! Muokkaat tässä ainoastaan MainActivity-luokkaa ja kaikki ohjeet koskevat sitä.
________________________________________________________________________________________________________________________________________
5) Luo 2 TextView-tyyppistä muuttujaa tekstikenttiä varten
6) Luo Utils-tyyppinen muuttuja Utils-luokan käyttöä varten
7) Luo 2 HorizontalScrollView tyyppistä muuttujaa tekstikenttien scrollauksien käyttöä varten
________________________________________________________________________________________________________________________________________
8) OnCreate metodissa alusta Utils-luokka ja lähetä sinne parametrina this 
- Vinkki: utilsMuuttujanNimi = new Utils(this)
9) Alusta myös muut luomasi muuttujat käyttämällä metodia findViewById(R.id.layoutissaAntamasiId)
- Vinkki: Muista tyyppimuunnos, esim Pylly pyllyni = (Pylly) findViewById(R.id.munpylly);
10) Lisää onCreate metodiin myös lausekkeet: 
- ylemmänTekstikentänNimi.setMovementMethod(new ScrollingMovementMethod());
- alemmanTekstikentänNimi.setMovementMethod(new ScrollingMovementMethod());
________________________________________________________________________________________________________________________________________
12) Täytä Layoutin avulla luodut metodit
- kun käyttäjä painaa numeroa, lähetä utils-luokan numberClicked metodille painikkeesta saatava teksti String-muodossa
- kun käyttäjä painaa pilkkua, lähetä utils-luokan commaClicked metodille painikkeesta saatava teksti String-muodossa
- kun käyttäjä painaa +-*/ tai =-merkkiä, lähetä utils-luokan calculationClicked metodille painikkeesta saatava teksti String-muodossa
- kun käyttäjä painaa c-näppäintä, kutsu utils-luokan cClicked metodia

HUOM:
- Vinkki 1: Luo Button muuttuja ja alusta se käyttämällä findViewById(view.getId()) metodia.
- Vinkki 2: Luo String muuttuja ja etsi painikkeen teksti käyttämällä metodia buttonMuuttuja.getText(). Muista myös tyyppimuunnos Stringiksi toString() metodilla.
- Vinkki 3: Lähetä käyttämällä: utilsMuuttujasiNimi.utilsMuuttujanMetodi(painikkeenTeksti);
________________________________________________________________________________________________________________________________________
13) Luo metodi nimeltä createToast joka ottaa String muodossa vastaan näytettävän viestin
14) Näytä toast-viesti käyttäjälle kutsumalla Toast.makeText metodia. Metodi ottaa vastaan 3 parametria.
- Vinkki 1: Toastin ensimmäinen parametri on this, toinen on viesti ja kolmas on pituus, Toast.LENGTH_SHORT. 
- Vinkki 2: Muista lisätä loppuun .show() kutsu
________________________________________________________________________________________________________________________________________
15) Luo metodi getCalculationText joka palauttaa ylemmän tekstikentän tekstin String-muodossa
________________________________________________________________________________________________________________________________________
16) Luo metodi setResultText joka ottaa parametrina vastaan String-muodossa tekstin
17) Aseta parametrina saatu teksti toiseen tekstikenttään, joka näyttää laskun tuloksen. Käytä metodia setText()
18) Lisää metodiin myös lauseke: alempiScrollViewMuuttuja.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
________________________________________________________________________________________________________________________________________
19) Luo metodi setCalculationText joka ottaa parametreina String-muotoisen laskukaavan ja booleanina tiedon siitä, lisätäänkö tekstiä vai muutetaanko se kokonaan
20) Jos boolean arvo on tosi, lisää teksti ensimmäiseen tekstikenttään käyttämällä metodia append(laskukaava)
21) Jos boolean arvo on epätosi aseta teksti ensimmäiseen tekstikenttään käyttämällä metodia setText(laskukaava)
22) Lisää metodiin myös lauseke ylempiScrollViewMuuttuja.fullScroll(HorizontalScrollView.FOCUS_RIGHT);
________________________________________________________________________________________________________________________________________
20) EXTRA: 
Luo metodi nimeltä createToast joka ottaa String muodossa vastaan näytettävän viestin
Näytä toast-viesti käyttäjälle kutsumalla Toast.makeText metodia. Metodi ottaa vastaan 3 parametria.

- Vinkki 1: Toastin ensimmäinen parametri on this, toinen on viesti ja kolmas on pituus: Toast.LENGTH_SHORT.
- Vinkki 2: Muista lisätä loppuun .show() kutsu
________________________________________________________________________________________________________________________________________
Olet nyt valmis! Lataa laskin kännykkääsi ja testaa.
