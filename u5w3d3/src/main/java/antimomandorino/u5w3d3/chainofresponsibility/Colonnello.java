package antimomandorino.u5w3d3.chainofresponsibility;

public class Colonnello extends Ufficiale {
    public Colonnello() {
        this.grado = "Colonnello";
        this.stipendio = 4000;
    }

    @Override
    public void eseguiFunzione() {
        System.out.println(grado + ": Comanda un reggimento e pianifica la strategia a lungo termine.");
    }
}