package antimomandorino.u5w3d3.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@Component
@Order(1)
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");

        LocalDate dataNascitaLocalDate = LocalDate.of(1990, 10, 15);

        Date dataNascita = Date.from(dataNascitaLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

        info.setDataDiNascita(dataNascita);

        //  Creazione dell'Adapter
        DataSource adapter = new InfoAdapter(info);

        //  Oggetto UserData
        UserData utente = new UserData();

        //  UserData utilizza l'oggetto Info tramite l'Adapter.
        utente.getUserData(adapter);

        System.out.println("Nome Completo: " + utente.getNomeCompleto());
        System.out.println("Età: " + utente.getEta());
    }
}
