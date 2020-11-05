package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    private Supermarket supermarket = new Supermarket();
    private Artikl a1 = new Artikl ("Brasno", 10, "1");
    private Artikl a2 = new Artikl ("Jaja", 15, "2");
    private Artikl a3 = new Artikl ("Mlijeko", 11, "3");

    @BeforeEach
    public void setupTest() {

        supermarket.dodajArtikl(a1);
        supermarket.dodajArtikl(a2);
        supermarket.dodajArtikl(a3);
    }


    @Test
    void dodajArtikl() {

        supermarket.getArtikli();
        assertEquals("1", supermarket.getArtikli()[0].getKod() );
        assertEquals("2", supermarket.getArtikli()[1].getKod() );
    }

    @Test
    void ispisArtikala() {

        supermarket.getArtikli();
        assertEquals("Auto", supermarket.getArtikli()[0].getNaziv() );
        assertEquals("Motor", supermarket.getArtikli()[1].getNaziv() );
    }

    @Test
    void izbaciArtiklSaKodom() {
        supermarket.izbaciArtiklSaKodom("1");
        String kodTest = a2.getKod();
        assertEquals(kodTest, supermarket.getArtikli()[0].getKod());
    }

    @Test
    void pomjeri() {
        supermarket.pomjeri(1);
        String kodTest = a3.getKod();
        assertEquals(kodTest, supermarket.getArtikli()[1].getKod());

    }


}