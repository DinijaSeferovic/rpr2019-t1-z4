package ba.unsa.etf.rpr;

public class Korpa {
    private final Artikl[] artikli = new Artikl[50];
    private int br=0;

    public int dajUkupnuCijenuArtikala() {
        int ukupno=0;
        for (int i=0; i<br; i++) ukupno+=artikli[i].getCijena();
        return ukupno;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {

        for (int i = 0; i < br; i++)  {
            if (artikli[i].getKod().equals(kod)) {
                Artikl novi = new Artikl( artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                artikli[i]=null;
                pomjeri(i);
                return novi;
            }
        }
        return null;
    }

    public void pomjeri(int pozicija) {
        for (int i = pozicija; i < br; i++) {
            artikli[i]=artikli[i+1];
        }
        artikli[br]=null;
        br--;
    }

    public Artikl[] getArtikli(){
        return artikli;
    }

    public boolean dodajArtikl(Artikl a){
        if (br<50) {
            artikli[br]=new Artikl(a.getNaziv(), a.getCijena(), a.getKod());
            br++;
            return true;
        }
        return false;
    }
}