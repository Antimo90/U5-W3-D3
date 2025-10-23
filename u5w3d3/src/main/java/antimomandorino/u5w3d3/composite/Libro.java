package antimomandorino.u5w3d3.composite;

import java.util.ArrayList;
import java.util.List;

public class Libro {

    private List<ElementoLibro> elementiPrincipali = new ArrayList<>();

    private List<String> autori = new ArrayList<>();
    private double prezzo;

    public Libro(double prezzo, List<String> autori) {
        this.prezzo = prezzo;
        this.autori = autori;
    }

    public void aggiungiElemento(ElementoLibro elemento) {
        this.elementiPrincipali.add(elemento);
    }

    public int getNumeroTotalePagine() {
        int totalePagine = 0;
        for (ElementoLibro elemento : elementiPrincipali) {

            totalePagine += elemento.getNumeroPagine();
        }
        return totalePagine;
    }

    public void stampaInteroLibro() {

        System.out.println("LIBRO - Autori: " + autori);
        System.out.println("Prezzo: " + prezzo + " €");
        System.out.println("Pagine Totali: " + getNumeroTotalePagine());
        System.out.println(" Contenuto ");

        for (ElementoLibro elemento : elementiPrincipali) {
            elemento.stampa();
        }

    }

    public List<ElementoLibro> getElementiPrincipali() {
        return elementiPrincipali;
    }

    public void setElementiPrincipali(List<ElementoLibro> elementiPrincipali) {
        this.elementiPrincipali = elementiPrincipali;
    }

    public List<String> getAutori() {
        return autori;
    }

    public void setAutori(List<String> autori) {
        this.autori = autori;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
