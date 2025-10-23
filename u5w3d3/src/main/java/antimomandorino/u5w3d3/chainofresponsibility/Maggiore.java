package antimomandorino.u5w3d3.chainofresponsibility;

public class Maggiore extends Ufficiale {
    public Maggiore() {
        this.grado = "Maggiore";
        this.stipendio = 3000;
    }

    @Override
    public void eseguiFunzione() {
        System.out.println(grado + ": Dirige lo staff di battaglione e supervisiona la logistica.");
    }
}