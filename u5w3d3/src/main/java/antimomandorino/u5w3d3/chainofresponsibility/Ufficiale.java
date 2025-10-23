package antimomandorino.u5w3d3.chainofresponsibility;

public abstract class Ufficiale {

    protected Ufficiale responsabile;
    protected String grado;
    protected int stipendio;

    // Metodo che gestisce la richiesta
    public void verificaStipendio(int importoRichiesto) {

        if (this.stipendio >= importoRichiesto) {

            System.out.println(this.grado + " percepisce " + this.stipendio);
        } else if (this.responsabile != null) {

            this.responsabile.verificaStipendio(importoRichiesto);
        } else {

            System.out.println("Nessun Ufficiale in catena percepisce almeno " + importoRichiesto + ".");
        }
    }

    public abstract void eseguiFunzione();

    public Ufficiale getResponsabile() {
        return responsabile;
    }

    // Metodo per impostare il prossimo elemento
    public Ufficiale setResponsabile(Ufficiale responsabile) {
        this.responsabile = responsabile;
        return responsabile;
    }

    public int getStipendio() {
        return stipendio;
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
}
