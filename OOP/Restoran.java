package OOP;

import java.util.ArrayList;

public class Restoran extends ugostiteljskiObjekat{

    private int brSlobodnihStolova;

    public Restoran(String naziv, double prosecnaOcena, int brMichelinZvezdica, ArrayList<String> recenzije, int brSlobodnihStolova) {
        super(naziv, prosecnaOcena, brMichelinZvezdica, recenzije);
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    public Restoran(String naziv, double prosecnaOcena, int brMichelinZvezdica, int brSlobodnihStolova) {
        super(naziv, prosecnaOcena, brMichelinZvezdica);
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    public Restoran(String naziv, double prosecnaOcena, int brSlobodnihStolova) {
        super(naziv, prosecnaOcena);
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    public Restoran(String naziv, int brSlobodnihStolova) {
        super(naziv);
        this.brSlobodnihStolova = brSlobodnihStolova;
    }

    public Restoran(String naziv) {
        super(naziv);
        this.brSlobodnihStolova = 25;
    }

    public int getBrSlobodnihStolova() {
        return brSlobodnihStolova;
    }

    public void setBrSlobodnihStolova(int brSlobodnihStolova) {
        if(brSlobodnihStolova < 0){
            System.out.println("Broj stolova ne moze biti negativan");
        }
        else
            this.brSlobodnihStolova = brSlobodnihStolova;
    }

    public boolean imaLiSlobodnihStolova(){
        if(brSlobodnihStolova > 0){
            return true;
        }
        else
            return false;
    }

    public void oslobodiSto(){
        this.brSlobodnihStolova += 1;
    }

    public void oslobodiSto(int x){
        this.brSlobodnihStolova += x;
    }

    public void zaokupiSto(){
        if(brSlobodnihStolova < 1){
            System.out.println("Nema slobodnih stolova.");
        }
        else
            this.brSlobodnihStolova -= 1;
    }

    public void zaokupiSto(int x){
        if(brSlobodnihStolova < x){
            this.brSlobodnihStolova -= brSlobodnihStolova;
        }
        else
            this.brSlobodnihStolova -= x;
    }

    /*public double prosek(){
        double sum = 0;
        for (double d : ocena)
    }*/

    @Override
    public void dodajOcenu(double ocena) {
        if(ocena > 5 && ocena < 1){
            System.out.println("Ocena nije validna");
        }
        else if(ocena < getProsecnaOcena()){
            setProsecnaOcena(((getProsecnaOcena() + ocena) / 2));
        }
        else if(ocena >= getProsecnaOcena()){
            ocena -= 0.3;
            setProsecnaOcena(((getProsecnaOcena() + ocena) / 2));
        }
        else if(ocena >= 4.5 || ocena <= 2.0){
            setProsecnaOcena(((getProsecnaOcena() + ocena) / 2));
            setBrMichelinZvezdica((int) ((getProsecnaOcena() + ocena) / 2));
        }
    }

    @Override
    public void azurirajZvezdu() {
        if(getProsecnaOcena() > 4.5){
            setBrMichelinZvezdica(getBrMichelinZvezdica()+ 2);
        }
        else if(getProsecnaOcena() > 3.5 && getProsecnaOcena() < 4.5){
            setBrMichelinZvezdica(getBrMichelinZvezdica() + 1);
        }
        else if(getProsecnaOcena() > 3.0 && getProsecnaOcena() < 3.5){
            setBrMichelinZvezdica(getBrMichelinZvezdica() - 1);
        }
        else if(getProsecnaOcena() <= 3.0){
            setBrMichelinZvezdica(getBrMichelinZvezdica() - 2);
        }
    }

    @Override
    public String toString() {
         StringBuilder sb = new StringBuilder();
        sb.append("---------------").append("\n");
        sb.append("Restoran").append("\t").append("\n");
        sb.append("---------------").append("\n");
        sb.append("\t").append("-----").append(getNaziv()).append("-----\"").append("\n");
        sb.append("Prosecna ocena: ").append(getProsecnaOcena()).append("\n");
        sb.append("Recenzije: ").append("\n");
        for (int i = 0; i < getRecenzije().size() ; i++) {
            sb.append(getRecenzije().get(i)).append("\n");
        }
        return sb.toString();
    }
}
