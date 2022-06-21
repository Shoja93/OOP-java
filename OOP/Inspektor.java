package OOP;


import java.util.ArrayList;

public class Inspektor extends Restoran {

    private ugostiteljskiObjekat objekat;

    public Inspektor(String naziv, double prosecnaOcena, int brMichelinZvezdica, ArrayList<String> recenzije, int brSlobodnihStolova, ugostiteljskiObjekat objekat) {
        super(naziv, prosecnaOcena, brMichelinZvezdica, recenzije, brSlobodnihStolova);
        this.objekat = objekat;
    }

    public ugostiteljskiObjekat getObjekat() {
        return objekat;
    }

    public void setObjekat(ugostiteljskiObjekat objekat) {
        this.objekat = objekat;
    }

    public void dodajOpis(String opis){
        dodajRecenziju(opis);
    }

    @Override
    public void dodajOcenu(double ocena) {
        dodajOcenu(ocena);
    }

    public void dodeliZvezdu(){
        azurirajZvezdu();
    }

    public String procitajRecenzije(){
        String s = "";
        for (int i = 0; i < getRecenzije().size(); i++) {
            s = (getRecenzije().get(i));
        }
        return s;
    }

    public String procitajRecenziju(int x){
        String s = "";
        for (int j = 0; j < getRecenzije().size() ; j++) {
            if(j == x){
                s = (getRecenzije().get(j));
            }
        }
        return s;
    }

    public boolean daLiSuIsti(ugostiteljskiObjekat a, ugostiteljskiObjekat b){
        if(a.getNaziv().equals(b.getNaziv()) && a.getRecenzije().equals(b.getRecenzije())
                && a.getBrMichelinZvezdica() == b.getBrMichelinZvezdica()
                && a.getProsecnaOcena() == b.getProsecnaOcena()){
            return true;
        }
        else
            return false;
    }

    public void zatvoriObjekat(){
        if (daLiSuIsti(objekat, this.objekat)){
            setBrMichelinZvezdica(0);
            setProsecnaOcena(1.0);
        }
    }
}
