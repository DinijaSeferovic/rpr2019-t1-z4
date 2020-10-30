package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private int cijena;
    private String kod;

    public Artikl(String a, int i, String s) {
        naziv=a; cijena=i; kod=s;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getKod() {
        return kod;
    }

    public int getCijena() {
        return cijena;
    }


}