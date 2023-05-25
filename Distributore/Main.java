package Distributore;

public class Main {
    public static void main(String[] args) {

        DistributoreDiBevande d1 = new DistributoreDiBevande(10);

        Caffe c1 = new Caffe(1, 1.10);
        Cappuccino cap1 = new Cappuccino(2, 1.50);

        d1.caricaProdotto(c1);
        d1.caricaProdotto(cap1);
        d1.caricaProdotto(cap1);
        d1.caricaProdotto(cap1);
        d1.caricaProdotto(cap1);
        d1.caricaProdotto(cap1);
        d1.caricaProdotto(cap1);
        d1.caricaProdotto(cap1);
        d1.caricaProdotto(cap1);
        d1.caricaProdotto(cap1);
        d1.caricaProdotto(cap1);
        d1.caricaProdotto(cap1);
        d1.caricaProdotto(cap1);
        d1.caricaProdotto(cap1);
        d1.caricaProdotto(cap1);
        d1.caricaProdotto(cap1);

        System.out.println(d1.getNumeroProdottiCorrente());

        d1.inserisciImporto(3.00);
        d1.inserisciImporto(1.00);
        d1.scegliProdotto(1);
        d1.saldoAttuale();
        d1.getResto();
        d1.saldoAttuale();
        System.out.println(d1.getNumeroProdottiCorrente());
    }
}
