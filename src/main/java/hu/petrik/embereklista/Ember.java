package hu.petrik.embereklista;

public class Ember {


    private String nev;
    private int eletkor;

    @Override
    public String toString() {
        return String.format("%-30s %3d év", nev, eletkor);
    }

    public Ember(String nev, int eletkor) {
        this.nev = nev;
        this.eletkor = eletkor;
    }
}
