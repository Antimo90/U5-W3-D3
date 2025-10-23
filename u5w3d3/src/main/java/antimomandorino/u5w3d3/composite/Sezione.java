package antimomandorino.u5w3d3.composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements ElementoLibro {

    private String titolo;

    private List<ElementoLibro> sottoElementi = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public void aggiungi(ElementoLibro elemento) {
        this.sottoElementi.add(elemento);
    }

    public void rimuovi(ElementoLibro elemento) {
        this.sottoElementi.remove(elemento);
    }

    @Override
    public int getNumeroPagine() {
        int totalePagine = 0;
        for (ElementoLibro elemento : sottoElementi) {

            totalePagine += elemento.getNumeroPagine();
        }
        return totalePagine;
    }

    @Override
    public void stampa() {
        System.out.println("\n Stampa Sezione: " + titolo);
        for (ElementoLibro elemento : sottoElementi) {

            elemento.stampa();
        }
    }

    public String getTitolo() {
        return this.titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public List<ElementoLibro> getSottoElementi() {
        return this.sottoElementi;
    }

    public void setSottoElementi(List<ElementoLibro> sottoElementi) {
        this.sottoElementi = sottoElementi;
    }
}
