package antimomandorino.u5w3d3.adapter;

import java.util.Calendar;
import java.util.Date;

public class InfoAdapter implements DataSource {
    private Info info;


    public InfoAdapter(Info info) {
        this.info = info;
    }


    @Override
    public String getNomeCompleto() {

        return info.getNome() + " " + info.getCognome();
    }


    @Override
    public int getEta() {
        Date dataDiNascitaDate = info.getDataDiNascita();

        // 1. Ottengo la data odierna
        Calendar dataOdierna = Calendar.getInstance();

        // 2. Ottengo la data di nascita
        Calendar dataNascita = Calendar.getInstance();
        dataNascita.setTime(dataDiNascitaDate);

        // 3. prendo solo l'anno dalle date
        int annoOdierno = dataOdierna.get(Calendar.YEAR);
        int annoNascita = dataNascita.get(Calendar.YEAR);

        int eta = annoOdierno - annoNascita;

        return (int) eta;
    }
}
