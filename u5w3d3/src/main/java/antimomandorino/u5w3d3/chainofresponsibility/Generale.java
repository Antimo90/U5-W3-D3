package antimomandorino.u5w3d3.chainofresponsibility;

public class Generale extends Ufficiale {
    public Generale() {
        this.grado = "Generale";
        this.stipendio = 5000;
    }

    @Override
    public void eseguiFunzione() {
        System.out.println(grado + ": Comanda intere divisioni e decide le politiche militari.");
    }
}