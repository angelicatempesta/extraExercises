package Distributore;

import java.util.ArrayList;
import java.util.List;

public class DistributoreDiBevande {
    private final int numeroMaxProdotti;
    private double saldoPersonale;

    private List<Prodotto> prodottoList;
    private int numeroProdottiCorrente;

    public DistributoreDiBevande(int numeroMaxProdotti) {
        this.numeroMaxProdotti = numeroMaxProdotti;
        this.prodottoList = new ArrayList<>();
    }


    public List<Prodotto> getProdottoList() {
        return prodottoList;
    }

    public void setProdottoList(List<Prodotto> prodottoList) {
        this.prodottoList = prodottoList;
    }

    public double getSaldoPersonale() {
        return saldoPersonale;
    }

    public int getNumeroProdottiCorrente() {
        return prodottoList.size();
    }

    public int getNumeroMaxProdotti() {
        return numeroMaxProdotti;
    }

    public void setSaldoPersonale(double saldoPersonale) {
        this.saldoPersonale = saldoPersonale;
    }
    // --------------------------------------------------------------------------------------------------------

    public void caricaProdotto(Prodotto p) {
            if (prodottoList.size()< numeroMaxProdotti) {
                prodottoList.add(p);
            } else {
                System.out.println("Impossibile caricare il prodotto nel distributore!");
            }
    }


    public void inserisciImporto(double importo) {
        saldoPersonale += importo;
    }

    public void scegliProdotto(int codiceInserito) {
         for (Prodotto p : prodottoList) {
             if (p.getId() == codiceInserito && p.getPrezzo() <= saldoPersonale) {
                 try {
                     System.out.println("Prodotto in erogazione . . .");
                     Thread.sleep(1000);
                     System.out.println(". . .");
                     Thread.sleep(1000);
                     System.out.println("Prelevare il prodotto!");

                 } catch (Exception e) {
                     e.printStackTrace();
                     System.exit(0);
                 }
                 saldoPersonale -= p.getPrezzo();
                 prodottoList.remove(p);
                 break;
         }else { System.out.println("Prodotto non disponibile! Inserisci un codice valido!");
             }
             }

    }

    public void saldoAttuale() {
        System.out.println("Il saldo attuale è " + String.format("%.2f", saldoPersonale) + " €");
    }

   public void getResto() {
       System.out.println("Resto di " + String.format("%.2f", saldoPersonale) + " € in erogazione . . .");
        saldoPersonale -= saldoPersonale;
   }
}
