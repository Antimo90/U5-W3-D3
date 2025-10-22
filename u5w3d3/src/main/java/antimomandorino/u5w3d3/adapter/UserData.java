package antimomandorino.u5w3d3.adapter;

public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getUserData(DataSource ds) { // Ho corretto il nome del metodo in getUserData
        this.nomeCompleto = ds.getNomeCompleto();
        this.eta = ds.getEta();
    }

    // Metodi getter per verifica (opzionali)
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public int getEta() {
        return eta;
    }
}