package OOP;

import java.util.ArrayList;

public abstract class ugostiteljskiObjekat {

    private String naziv;
    private double prosecnaOcena;
    private int brMichelinZvezdica;
    private ArrayList<String> recenzije;

    public ugostiteljskiObjekat(String naziv, double prosecnaOcena, int brMichelinZvezdica, ArrayList<String> recenzije) {
        this.naziv = naziv;
        this.prosecnaOcena = prosecnaOcena;
        this.brMichelinZvezdica = brMichelinZvezdica;
        this.recenzije = recenzije;
    }

    public ugostiteljskiObjekat(String naziv, double prosecnaOcena, int brMichelinZvezdica) {
        this.naziv = naziv;
        this.prosecnaOcena = prosecnaOcena;
        this.brMichelinZvezdica = brMichelinZvezdica;
        this.recenzije = new ArrayList<>();
    }

    public ugostiteljskiObjekat(String naziv, double prosecnaOcena) {
        this.naziv = naziv;
        this.prosecnaOcena = prosecnaOcena;
        this.brMichelinZvezdica = 0;
        this.recenzije = new ArrayList<>();
    }

    public ugostiteljskiObjekat(String naziv) {
        this.naziv = naziv;
        this.prosecnaOcena = 3.0;
        this.brMichelinZvezdica = 0;
        this.recenzije = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getProsecnaOcena() {
        return prosecnaOcena;
    }

    public void setProsecnaOcena(double prosecnaOcena) {
        this.prosecnaOcena = prosecnaOcena;
    }

    public int getBrMichelinZvezdica() {
        return brMichelinZvezdica;
    }

    public void setBrMichelinZvezdica(int brMichelinZvezdica) {
        this.brMichelinZvezdica = brMichelinZvezdica;
    }

    public ArrayList<String> getRecenzije() {
        return recenzije;
    }

    public void setRecenzije(ArrayList<String> recenzije) {
        this.recenzije = recenzije;
    }

    public void dodajRecenziju(String s){
        recenzije.add(s);
    }

    public void dodajRecenziju(int i, String s){
        recenzije.add(i, s);
    }

    public void obrisiRecenziju(String s){
        recenzije.remove(s);
    }

    public void obrisiRecenziju(int i){
        recenzije.remove(i);
    }

    public void dodajViseOcena(ArrayList<Double> ocene){
        double sum = 0;
        double prosek = 0;
        double noviprosek;
        for (int i = 0; i < ocene.size() ; i++) {
            sum += i;

        }
            noviprosek = sum/ ocene.size();
        double prosecna = (prosek + noviprosek) / 2;
        this.brMichelinZvezdica = (int) prosecna;
    }

    public abstract void dodajOcenu(double ocena);

    public abstract void azurirajZvezdu();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t").append("-----").append(getNaziv()).append("-----");
        sb.append("\t").append("*****(").append(getBrMichelinZvezdica()).append(")*****").append("\n");
        sb.append("").append("\n");
        sb.append("Prosecna ocena: ").append(getProsecnaOcena()).append("\n");
        for (int i = 0; i < getRecenzije().size() ; i++) {
            sb.append(getRecenzije().get(i)).append("\n");
        }
        return sb.toString();
    }
}
