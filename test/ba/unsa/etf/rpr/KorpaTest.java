package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    private Korpa korpa = new Korpa();
    private Artikl a1 = new Artikl ("Auto", 1000, "1");
    private Artikl a2 = new Artikl ("Motor", 1500, "2");

    @BeforeEach
    public void setupTest() {

        korpa.dodajArtikl(a1);
        korpa.dodajArtikl(a2);
    }

    @Test
    void dajUkupnuCijenuArtikala() {

        assertEquals(2500, korpa.dajUkupnuCijenuArtikala());
    }

    @Test
    void izbaciArtiklSaKodom() {

        korpa.izbaciArtiklSaKodom("1");
        String kodTest = a2.getKod();
        assertEquals(kodTest, korpa.getArtikli()[0].getKod());
    }

    @Test
    void pomjeri() {

    }

    @Test
    void dodajArtikl() {
    }
}