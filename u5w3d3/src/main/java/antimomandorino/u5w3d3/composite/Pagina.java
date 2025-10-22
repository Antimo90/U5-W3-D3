package antimomandorino.u5w3d3.composite;

public class Pagina implements ElementoLibro {
    private String contenuto;

    public Pagina(String contenuto) {
        this.contenuto = contenuto;
    }

    @Override
    public int getNumeroPagine() {
        // Una pagina singola conta come 1
        return 1;
    }

    @Override
    public void stampa() {
        System.out.println("Stampa Pagina: " + contenuto.substring(0, Math.min(contenuto.length(), 20)) + "...");
    }
}