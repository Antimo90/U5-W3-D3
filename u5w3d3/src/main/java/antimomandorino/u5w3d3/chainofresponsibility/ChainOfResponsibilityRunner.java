package antimomandorino.u5w3d3.chainofresponsibility;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ChainOfResponsibilityRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Ufficiale tenente = new Tenente();
        Ufficiale capitano = new Capitano();
        Ufficiale maggiore = new Maggiore();
        Ufficiale colonnello = new Colonnello();
        Ufficiale generale = new Generale();

        tenente.setResponsabile(capitano);
        capitano.setResponsabile(maggiore);
        maggiore.setResponsabile(colonnello);
        colonnello.setResponsabile(generale);

        Ufficiale catenaIniziale = tenente;

        int richiesta1 = 1000;
        catenaIniziale.verificaStipendio(richiesta1);

        int richiesta2 = 2500;
        catenaIniziale.verificaStipendio(richiesta2);

        int richiesta3 = 4500;
        catenaIniziale.verificaStipendio(richiesta3);

        int richiesta4 = 6000;
        catenaIniziale.verificaStipendio(richiesta4);
    }
}
