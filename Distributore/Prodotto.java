package Distributore;

abstract public class Prodotto {
   final private int id;
   final private double prezzo;

    public Prodotto(int id, double prezzo) {
        this.id = id;
        this.prezzo = prezzo;
    }

    public int getId() {
        return id;
    }

    public double getPrezzo() {
        return prezzo;
    }








}
