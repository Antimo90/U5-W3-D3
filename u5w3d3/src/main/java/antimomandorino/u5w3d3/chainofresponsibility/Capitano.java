package antimomandorino.u5w3d3.chainofresponsibility;

public class Capitano extends Ufficiale {
    public Capitano() {
        this.grado = "Capitano";
        this.stipendio = 2000;
    }

    @Override
    public void eseguiFunzione() {
        System.out.println(grado + ": Comanda una compagnia e coordina le missioni.");
    }
}