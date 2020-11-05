package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void getNaziv() {
        Artikl prvi = new Artikl("TV", 100, "10");
        assertEquals("TV", prvi.getNaziv());
    }
}