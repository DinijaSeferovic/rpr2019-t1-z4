package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {



    @Test
    void dodajArtikl() {
        Supermarket supermarket = new Supermarket();
        Artikl a1 = new Artikl ("Auto", 1000, "1");
        Artikl a2 = new Artikl ("Motor", 1500, "2");
        supermarket.dodajArtikl(a1);
        supermarket.dodajArtikl(a2);
        supermarket.getArtikli();
        assertEquals("1", supermarket.getArtikli()[0].getKod() );
        assertEquals("2", supermarket.getArtikli()[1].getKod() );
    }

    @Test
    void ispisArtikala() {
        Supermarket supermarket = new Supermarket();
        Artikl a1 = new Artikl ("Auto", 1000, "1");
        Artikl a2 = new Artikl ("Motor", 1500, "2");
        supermarket.dodajArtikl(a1);
        supermarket.dodajArtikl(a2);
        supermarket.getArtikli();
        assertEquals("Auto", supermarket.getArtikli()[0].getNaziv() );
        assertEquals("Motor", supermarket.getArtikli()[1].getNaziv() );
    }

    @Test
    void izbaciArtiklSaKodom() {
    }

    @Test
    void pomjeri() {
    }
}