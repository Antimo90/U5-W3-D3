package antimomandorino.u5w3d3.chainofresponsibility;

public class Tenente extends Ufficiale {
    public Tenente() {
        this.grado = "Tenente";
        this.stipendio = 1000;
    }

    @Override
    public void eseguiFunzione() {
        System.out.println(grado + ": Comanda un plotone e gestisce le operazioni sul campo.");
    }
}