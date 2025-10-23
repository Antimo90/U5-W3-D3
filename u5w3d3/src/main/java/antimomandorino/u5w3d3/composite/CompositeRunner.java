package antimomandorino.u5w3d3.composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(2)
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Pagina p1 = new Pagina("Introduzione e concetti base...");
        Pagina p2 = new Pagina("Dettaglio del pattern Composite.");
        Pagina p3 = new Pagina("Esercizio finale.");

        // Creazione di una Sottosezione
        Sezione sottosezione1 = new Sezione("1.1. Basi");
        sottosezione1.aggiungi(p1);

        // Creazione di una Sezione principale
        Sezione sezione1 = new Sezione("1. Introduzione ai Design Patterns");
        sezione1.aggiungi(sottosezione1);

        // Creazione di un'altra Sezione
        Sezione sezione2 = new Sezione("2. Applicazione del Composite");
        sezione2.aggiungi(p2);
        sezione2.aggiungi(p3);

        // Creazione del Libro
        Libro libro = new Libro(29.99, Arrays.asList("Gamma", "Gemini"));
        libro.aggiungiElemento(sezione1);
        libro.aggiungiElemento(sezione2);

        System.out.println("Numero di pagine totale del libro: " + libro.getNumeroTotalePagine());

        p1.stampa();

        sezione2.stampa();

        libro.stampaInteroLibro();
    }
}
