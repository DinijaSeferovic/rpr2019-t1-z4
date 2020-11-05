package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    private Korpa korpa = new Korpa();
    private Artikl a1 = new Artikl ("Brasno", 10, "1");
    private Artikl a2 = new Artikl ("Jaja", 15, "2");

    @BeforeEach
    public void setupTest() {

        korpa.dodajArtikl(a1);
        korpa.dodajArtikl(a2);
    }

    @Test
    void dajUkupnuCijenuArtikala() {

        assertEquals(25, korpa.dajUkupnuCijenuArtikala());
    }

    @Test
    void izbaciArtiklSaKodom() {

        korpa.izbaciArtiklSaKodom("1");
        String kodTest = a2.getKod();
        assertEquals(kodTest, korpa.getArtikli()[0].getKod());
    }


    @Test
    void dodajArtikl() {

        korpa.dodajArtikl(new Artikl("Mlijeko", 11, "3"));
        String kodTest = "3";
        assertEquals(kodTest, korpa.getArtikli()[2].getKod());

    }
}